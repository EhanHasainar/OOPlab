class Figure {
    double r, a, v;

    void dispArea() {
        System.out.println("Area = " + a);
    }

    void dispVolume() {
        System.out.println("Volume = " + v);
    }
}

class Cone extends Figure {
    double h, s;

    Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    void calcArea() {
        a = (3.142 * r * s) + (3.142 * r * r);
    }

    void calcVolume() {
        v = (3.142 * r * r * h) / 3;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Cone c = new Cone(3, 7, 5);

        c.calcArea();
        c.calcVolume();

        c.dispArea();
        c.dispVolume();
    }
}
