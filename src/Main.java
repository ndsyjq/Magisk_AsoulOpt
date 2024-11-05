public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                b++;
                System.out.print(b);
            }
        }

    }
}
