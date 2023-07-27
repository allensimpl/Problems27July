public class PermutationsOfString {
    public static String removeCharAt(String input,int n){
        int size = input.length();
        char[]a = new char[size-1];
        int i=0;
        while(i<=n-1){
            a[i] = input.charAt(i);
            i++;
        }
        while(i<=input.length()-2){
            a[i] = input.charAt(i+1);
            i++;
        }
        String finalString  = new String(a);
        return finalString;
    }
    public static void printAllPermutations(String input,String output){
        if(input.isEmpty()){
            System.out.println(output);
        }
        for(int i=0;i<=input.length()-1;i++){
            printAllPermutations(removeCharAt(input,i),output+input.charAt(i));
        }
    }
    public static void main(String[] args) {
        printAllPermutations("ABC","");
    }
}