
public class Practice5 {
    public static void main(String[] args) {

        // Practice 1 ----->
        // int n=4;
        // for(int i=n;i>0;i--){
        // for(int j=0;j<i;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // Practice 2-------->

        int n1 = 5;
        int k = 0;
        while (k <= n1) {
            k = k + (k + 1);
            k++;
        }
        System.out.println("Ans. : " + k);
    }
}
