
import java.util.Scanner;

public class abn {
    public static boolean isABN(int num){
        String numstr = "";
 
        int index;
        int number;
        int i;
        int j;
        int count;
 
        numstr = Integer.toString(num);
 
        for (i = 0; i < numstr.length(); i++){
            index = Integer.parseInt(numstr.charAt(i) + "");
            count = 0;
 
            for (j = 0; j < numstr.length(); j++){
                number = Integer.parseInt(numstr.charAt(j) + "");
                if (number == i){
                    count++;
                }
            }
            
            if (count != index){
                return false;
            }
        }
 
        return true;
    }

    public static void findABN(double digits){
        double min = Math.pow(10.0, digits - 1);
        double max = Math.pow(10.0, digits) - 1.0;
 
        for (int i = (int) min; i<=max; i++){
            if (isABN(i)){
                String temp = String.valueOf(i);
                String abn = temp.substring(0,1);
                temp = temp.substring(1);
                
                for(int j = temp.length()-1; j>=0; j--){
                    abn += temp.charAt(j);
                }
                
                System.out.println(abn);
            }
        }
    }
 
    public static void main(String[] args){
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter Number of Digits: ");
        int digits = kboard.nextInt();
        abn.findABN(digits);
    }
}
