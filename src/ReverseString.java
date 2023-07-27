import java.util.Scanner;

public class ReverseString {
    private static void revString(char[] input,int start,int end) {
        if(start>=end){
            return;
        }
        char tmp = input[start];
        input[start] = input[end];
        input[end] = tmp;
        revString(input,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] inputStringArray = input.toCharArray();
        revString(inputStringArray,0,input.length()-1);
        String reversedString = new String(inputStringArray);
        System.out.println(reversedString);
    }
}
