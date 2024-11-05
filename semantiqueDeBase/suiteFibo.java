public class suiteFibo {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int rang) {
        if (rang == 0 || rang == 1){
            return rang;
        }
        return fibonacci(rang-1) + fibonacci(rang-2);
    }
}
