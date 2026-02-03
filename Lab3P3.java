class X {
    int i, j;

    X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    final int sum() {
        return i + j;
    }
}

class Y extends X {
    Y(int i, int j) {
        super(i, j);
    }

    int product() {
        return i * j;
    }
}

class Z extends Y {
    Z(int i, int j) {
        super(i, j);
    }

    int difference() {
        return i - j;
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Z obj = new Z(10, 5);

        System.out.println("Sum = " + obj.sum());
        System.out.println("Product = " + obj.product());
        System.out.println("Difference = " + obj.difference());
    }
}
