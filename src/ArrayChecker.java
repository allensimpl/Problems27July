public class ArrayChecker {
    public static boolean arraySortCheck(int[] a,int n){
        if(n==0){
            return true;
        }
        if(a[n]<a[n-1]){
            return false;
        }
        return arraySortCheck(a,n-1);
    }
    public static void main(String[] args){
        int[] a= {0,1,2,3,4,5,6};
//        boolean sorted = arraySortCheck(a);
        System.out.println(arraySortCheck(a,6));
    }
}
