abstract class Figure {
    double r, a, v;
    final double pi = 3.1420;

    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void dispArea();
    public abstract void dispVol();
}

class Cone extends Figure {
    double h, s;

    Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea() {
        a = (pi * r * s) + (pi * r * r);
    }

    public void calcVol() {
        v = (pi * r * r * h) / 3;
    }

    public void dispArea() { System.out.println("Cone Area = " + a); }
    public void dispVol() { System.out.println("Cone Volume = " + v); }
}

class Sphere extends Figure {
    Sphere(double r) { this.r = r; }

    public void calcArea() { a = 4 * pi * r * r; }
    public void calcVol() { v = (4 * pi * r * r * r) / 3; }

    public void dispArea() { System.out.println("Sphere Area = " + a); }
    public void dispVol() { System.out.println("Sphere Volume = " + v); }
}

class Cylinder extends Figure {
    double h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = (2 * pi * r * r) + (2 * pi * r * h);
    }

    public void calcVol() {
        v = pi * r * r * h;
    }

    public void dispArea() { System.out.println("Cylinder Area = " + a); }
    public void dispVol() { System.out.println("Cylinder Volume = " + v); }
}

public class Demo {
    public static void main(String[] args) {
        Cone c = new Cone(3, 7, 5);
        Sphere s = new Sphere(4);
        Cylinder cy = new Cylinder(3, 10);

        c.calcArea(); c.calcVol(); c.dispArea(); c.dispVol();
        s.calcArea(); s.calcVol(); s.dispArea(); s.dispVol();
        cy.calcArea(); cy.calcVol(); cy.dispArea(); cy.dispVol();
    }
}
