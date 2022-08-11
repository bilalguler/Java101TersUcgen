public class Main {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int k = 10 ; k > i-1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-3); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
