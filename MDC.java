import java.util.*;
public class MDC {
    public static void main(String[] args) {
        int mdc(int n1, int n2) {
            int maxdc = 1;
            for (int i = 1; i <= n1 && i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
    return maxdc;
}
