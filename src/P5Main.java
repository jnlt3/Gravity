import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import processing.core.*;

@SuppressWarnings("serial")
public class P5Main extends PApplet {

    ArrayList<Star> a = new ArrayList<>();
    ArrayList<Star> b = new ArrayList<>();
    ArrayList<Star> c = new ArrayList<>();
    ArrayList<Spark> d = new ArrayList<>();
    ArrayList<Laser> e = new ArrayList<>();
    ArrayList<Laser> f = new ArrayList<>();
    NeutrinoShip r = new NeutrinoShip();
    double g = 6.67 * Math.pow(10, -11);
    double m = 232321;
    boolean con = true;

    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {
        size(600, 600);
//        for (int i = 0; i < 15; i++) {
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.RED, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.BLUE, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.CYAN, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.GREEN, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.ORANGE, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.GRAY, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.WHITE, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.PINK, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.YELLOW, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.MAGENTA, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
//            a.add(new Star(Math.random() * 10 + 2, 0.1, Color.DARK_GRAY, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 1));
        //e.add(new AntiRocket(r, 1000, 1000));
        for (int i = 0; i < 15; i++) {
            createRandomSystem();
        }
        //System.out.println(Math.PI * 4 / 3);
//G = 667 * 10^-11
        //M = m;
        //GM
        // r = dist + r1 + r2
        //Math.sqrt(GM / r);
//                a.add(new Star(4, 10, Color.RED, 300, 300, 0, 0));
//                a.add(new Star(2, 10, Color.GREEN, 500, 300, Math.PI, 3));
//                a.add(new Star(0.1, 1, Color.WHITE, 525, 300, Math.PI, 42 / 7.8));
//                a.add(new Star(5, 1, Color.YELLOW, 300, 300, 0, 0));
//                a.add(new Star(0.5, 0.1, Color.RED, 325, 300, Math.PI, 4.2));
//                a.add(new Star(1.8, 1, Color.YELLOW.darker().darker(), 400, 300, 0, 2.2));
//                a.add(new Star(2, 1, Color.GREEN, 500, 300, Math.PI, 1.5));
        //        //force of grav = (125 / 200 / 200) = 1.5

        //        //pfg = 1 / 500^2 * x;
        //        a.add(new Star(0.1, 1, Color.WHITE, 515, 300, Math.PI, 2.7));
        //a.add(new Star(2, 1, Color.CYAN, 600, 600, Math.PI, 0));
        //        a.add(new Star(5, 1, Color.CYAN, 320, 300, Math.PI, 3));
        //        a.add(new Star(5, 1, Color.CYAN, 280, 300, 0, 3));
        //// x = 480.0;
        //        System.out.println(1.5 / Math.sqrt((g * 125 / 200)));
//        a.add(new Star(5, 1, Color.YELLOW, 300, 300, 0, 0));
//        a.add(new Star(3, 1, Color.RED, 500, 300, Math.PI, Math.sqrt(g * 125 / (200)) * m));
//        a.add(new Star(1, 0.1, Color.GRAY, 525, 300, Math.PI, Math.sqrt(g * 125 / (225)) * m + Math.sqrt(g * 27 / (25)) * m));
        //1 / 100^2 * 1000 / 166.66666666666666;
    }

    public void createRandomSystem() {
        Star systemCenter = new Star(Math.random() * 5 + 5, 1, (Math.random() < Math.random() ? Color.CYAN : Color.RED), Math.random() * 120000 - 60000, Math.random() * 120000 - 60000, Math.random() * Math.PI * 2, 0);
        double startDist = Math.random() * 100 + 50;
        int planets = (int) (Math.random() * 7 + 1);
        double distJump = (Math.random() + 1.5);
        double weight = systemCenter.radius * systemCenter.radius * systemCenter.radius;
        a.add(systemCenter);
        for (int i = 0; i < planets; i++) {
            double dist = startDist * Math.pow(distJump, i);
            double planetSpeed = Math.sqrt(g * weight / dist) * m;
            double planetRad = Math.random() + 2;
            double x;
            double y;
            a.add(new Star(planetRad, Math.random(), (Math.random() < Math.random() ? Color.GRAY : Color.GREEN), systemCenter.x + dist, systemCenter.y, Math.random() < Math.random() ? Math.PI : 0, planetSpeed));
        }
    }

    public void keyPressed() {
        if (keyCode == UP) {
            if (r.speed < 10) {
                r.speed = Math.min(10, r.speed + 0.4);
            }
        } else if (keyCode == LEFT) {
            r.angle += 0.1;
        } else if (keyCode == RIGHT) {
            r.angle -= 0.1;
        } else if (keyCode == DOWN) {
            if (r.speed > -10) {
                r.speed = Math.max(r.speed - 0.4, -10);
            }
        } else if (key == 'l') {
            if ((int) r.speed != 20) {
                r.speed = 20;
            }
        } else if (key == 'g') {
            r.antiGravityMotorsOn = !r.antiGravityMotorsOn;
        } else if (key == ' ') {
            e.add(new Laser(r.x, r.y, r.angle));
        }
    }

    @Override
    public void draw() {
////        r.x = e.get(0).x;
////        r.y = e.get(0).y;
        clear();
        if (con) {
            textSize(10);
            fill(0, 0, 0);
            stroke(0, 0, 0);
            rect(0, 0, 600, 600);
            for (Star s : a) {
                stroke(0, 0, 0);
                fill(255, 255, 255);
                text(("x:" + (int) s.x + " y:" + (int) s.y), (float) (s.x - r.x + 100) * 3, (float) (s.y - r.y + 100) * 3);
                if (s.moveD(a) == -1) {
                    break;
                }
                double mx = s.x - r.x + 6000;
                double my = s.y - r.y + 6000;
                mx /= 60;
                my /= 60;
                if (mx > 0 && mx < 200 && my > 0 && my < 200) {
                    if (s.radius > 5) {
                        fill(255, 255, 255);
                        stroke(255, 255, 255, 0);
                        ellipse((float) mx, (float) my, 3, 3);
                    } else {
                        Color c = s.color;
                        fill(c.getRed(), c.getGreen(), c.getBlue());
                        stroke(c.getRed(), c.getGreen(), c.getBlue(), 0);
                        ellipse((float) mx, (float) my, 3, 3);
                    }
                }
                mx = s.x - r.x + 24000;
                my = s.y - r.y + 24000;
                mx /= 240;
                my /= 240;
                mx += 400;
                if (mx > 400 && mx < 600 && my > 0 && my < 200) {
                    fill(255, 255, 255);
                    stroke(255, 255, 255, 0);
                    ellipse((float) mx, (float) my, 2, 2);
                }
                mx = s.x - r.x + 120000;
                my = s.y - r.y + 120000;
                mx /= 1200;
                my /= 1200;
                my += 400;
                if (mx > 0 && mx < 200 && my > 400 && my < 600) {
                    fill(255, 255, 255);
                    stroke(255, 255, 255, 0);
                    ellipse((float) mx, (float) my, 1, 1);
                }
            }
            fill(255, 0, 0);
            stroke(255, 0, 0, 0);
            ellipse((float) 100, (float) 100, 3, 3);
            ellipse(500, 100, 3, 3);
            ellipse(100, 500, 2, 2);
            for (Spark s : d) {
                s.drawThis();
            }
            if (d.size() > 150) {
                d.remove(0);
            }
            if (r.update(a) == -1) {
                con = false;
            }
            a.removeAll(b);
            b.clear();
            a.addAll(c);
            c.clear();
            for (Star s : a) {
                if (Math.abs(s.x - r.x) + Math.abs(s.y - r.y) < 600) {
                    s.drawThis();
                }
            }
            text(("x:" + (int) r.x + " y:" + (int) r.y), 300, 300);
            text(a.size(), 50, 50);
            r.drawThis();
            for (Laser l : e) {
                l.update(a);
                l.drawThis();
            }
            e.removeAll(f);
            f.clear();
//        if (Math.random() < 0.001) {
//            a.add(new Star(Math.random(), 1, Color.RED, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.BLUE, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.CYAN, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.GREEN, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.ORANGE, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.GRAY, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.WHITE, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.PINK, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.YELLOW, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.MAGENTA, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//            a.add(new Star(Math.random(), 1, Color.DARK_GRAY, Math.random() * 6000 - 3000, Math.random() * 6000 - 3000, Math.random() * 2 * Math.PI, Math.random() * 0.1));
//        }
        }
    }

    /**
     * @param passedArgs the command line arguments
     */
    static public void main(String[] passedArgs) {
        String[] appletArgs = new String[]{P5Main.class.getName()};
        if (passedArgs != null) {
            PApplet.main(concat(appletArgs, passedArgs));
        } else {
            PApplet.main(appletArgs);
        }
    }

    public double angle(double x1, double y1, double x2, double y2) {
        return Math.atan2(x2 - x1, y2 - y1);
    }

    public double dist(double x1, double y1, double x2, double y2) {
        return new Point2D.Double(x1, y1).distance(x2, y2);
    }

    public class Star {

        double radius;
        double density;
        double weight;
        double speed;
        double angle;
        double x;
        double y;
        Color color;

        public Star(double rad, double den, Color c, double x, double y, double angle, double speed) {
            radius = rad;
            density = den;
            weight = 4 / 3 * Math.PI * radius * radius * radius * den;
            this.color = c;
            this.x = x;
            this.y = y;
            this.angle = angle;
            this.speed = speed;
        }

        public void drawThis() {
            fill(color.getRed(), color.getGreen(), color.getBlue());
            color.brighter().brighter();
            stroke(color.getRed(), color.getGreen(), color.getBlue());
            ellipse((float) (x - r.x + 100) * 3, (float) (y - r.y + 100) * 3, (float) radius * 3, (float) radius * 3);
        }

        public double getGravPower(double dist) {
            return weight / dist / dist;
        }

        public int moveD(ArrayList<Star> a) {
            double xForce = 0;
            double yForce = 0;
            double oldX = x;
            double oldY = y;
            for (int i = 0; i < a.size(); i++) {
                Star s = a.get(i);
                if (s != this) {
                    double ang = angle(x, y, s.x, s.y);
                    double dist = dist(x, y, s.x, s.y);
                    if (dist < (s.radius + radius) / 2) {
                        b.add(s);
                        b.add(this);
                        c.add(new Star(Math.cbrt(Math.pow(s.radius, 3) + Math.pow(radius, 3)), (density + s.density) / 2, (Math.random() < Math.random() ? s.color : color), (x + s.x) / 2, (y + s.y) / 2, (angle + s.angle) / 2, (speed + s.speed) / 2));
                        return -1;
                    }
                    xForce += Math.sin(ang) * s.getGravPower(dist);
                    yForce -= Math.cos(ang) * s.getGravPower(dist);
                }
            }
            xForce += Math.sin(angle) * speed;
            yForce -= Math.cos(angle) * speed;
            speed = Math.sqrt(Math.pow(xForce, 2) + Math.pow(yForce, 2));
            x += xForce;
            y -= yForce;
            angle = angle(oldX, oldY, x, y);
            return 1;
        }

    }

    public class Laser {

        double x;
        double y;
        double sx;
        double sy;
        double angle;
        double speed = 20;
        double time = 0;

        public Laser(double x, double y, double angle) {
            this.x = x;
            this.y = y;
            sx = x;
            sy = y;
            this.angle = angle;
        }

        public void update(ArrayList<Star> a) {
            if (time > 100) {
                f.add(this);
            }
            time++;
            for (int z = 0; z < 8; z++) {
                x += Math.sin(angle) * speed / 8;
                y += Math.cos(angle) * speed / 8;
                for (int i = 0; i < a.size(); i++) {
                    Star s = a.get(i);
                    double dist = dist(x, y, s.x, s.y);
                    if (dist < (s.radius + 1) / 2) {
                        s.radius = Math.max(Math.cbrt(Math.pow(s.radius, 3) - 3), 0);
                        if (s.radius == 0) {
                            b.add(s);
                        }
                        s.weight = 4 / 3 * Math.pow(s.radius, 3) * s.density;
                        f.add(this);
                    }
                }
            }
        }

        public void drawThis() {
            fill(255, 0, 0);
            stroke(255, 0, 0);
            strokeWeight(3);
            line((float) (sx - r.x + 100) * 3, (float) (sy - r.y + 100) * 3, (float) (x - r.x + 100) * 3, (float) (y - r.y + 100) * 3);
        }
    }

    public class GalaxyGuard {

        double radius = 5;

        public GalaxyGuard(double x, double y) {

        }

        public void update() {

        }
    }

    public class NeutrinoShip {

        double x = 450;
        double y = 450;
        double speed = 0;
        double angle = Math.PI;
        boolean antiGravityMotorsOn = false;

        public NeutrinoShip() {

        }

        public int update(ArrayList<Star> a) {
            double xForce = 0;
            double yForce = 0;
            double oldX = x;
            double oldY = y;
            d.add(new Spark(x, y));
            for (int i = 0; i < a.size(); i++) {
                Star s = a.get(i);
                double ang = angle(x, y, s.x, s.y);
                double dist = dist(x, y, s.x, s.y);
                if (dist < (s.radius + 10) / 2) {
                    return -1;
                }
                xForce += Math.sin(ang) * s.getGravPower(dist);
                yForce -= Math.cos(ang) * s.getGravPower(dist);
            }
            if (antiGravityMotorsOn) {
                xForce /= 100;
                yForce /= 100;
            }
            xForce += Math.sin(angle) * speed;
            yForce -= Math.cos(angle) * speed;
            double oldAngle = angle;
            angle = Math.atan2(xForce, -yForce);
            if (Math.abs(Math.atan(Math.tan(angle - oldAngle))) > Math.PI) {
                angle -= Math.PI;
            }
            speed = Math.max(Math.sqrt(Math.pow(xForce, 2) + Math.pow(yForce, 2)) * Math.signum(speed), speed);
            x += xForce;
            y -= yForce;
            return 1;

        }

        public void drawThis() {
            fill(200, 200, 200);
            stroke(0, 0, 0, 0);
            ellipse((float) 300, (float) 300, 10, 10);
            fill(0, 0, 0);
            stroke(0, 0, 0);
            ellipse((float) (300 + Math.sin(angle) * 2), (float) (300 + Math.cos(angle) * 2), 6, 6);
            fill(255, 0, 0);
            stroke(255, 0, 0);
            if (antiGravityMotorsOn) {
                fill(255, 255, 255);
                stroke(255, 255, 255);
            }
            ellipse((float) (300 + Math.sin(angle) * 5), (float) (300 + Math.cos(angle) * 5), 3, 3);
        }
    }

    public class Spark {

        double x;
        double y;

        public Spark(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void drawThis() {
            fill(0, 255, 255);
            stroke(0, 255, 255);
            ellipse((float) (x - r.x + 100) * 3, (float) (y - r.y + 100) * 3, 2, 2);
        }
    }

}
