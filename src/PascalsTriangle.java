import java.util.Scanner;
public class PascalsTriangle {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int combination(int n, int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows to be printed: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }
//        System.out.println(factorial(3));
//        System.out.println(combination(6,1));
    }
}
