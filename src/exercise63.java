/**
 * Created by opilane on 17.11.2016.
 */
public class exercise63 {
    public static void main(String[] args) {
        System.out.println(isTriangle(5, 3, 1));
    }
    public static boolean isTriangle(int a, int b, int c) {
        if(a + b > c && c + a > b && c + b > a) {
            return true;
        } else {
            return false;
        }
    }
}
