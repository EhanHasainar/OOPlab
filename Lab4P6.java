interface Function {
    int evaluate(int x);
}

class Half implements Function {
    public int evaluate(int x) {
        return x / 2;
    }
}

class Client {
    static int[] process(int[] arr) {
        Function f = new Half();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = f.evaluate(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        int[] res = process(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
