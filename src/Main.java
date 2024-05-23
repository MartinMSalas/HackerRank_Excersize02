import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        List<Integer> list = Arrays.asList(769082435,210437958,673982045,375809214,380564127);
        miniMaxSum(list);

        // 1000000000 1000000000 1000000000 1000000000 1000000000
       // 1640793344 2199437821
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = 0l;

        long min = Long.MAX_VALUE;
        long max = 0;

        for(long e: arr){
            sum+=e;
            if(e<min){
                min=e;
            }
            if(e>max){
                max=e;
            }

        }
        String prueba= "hola";
        prueba.substring(0,2);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println(sum);
        System.out.println(1640793344+max);
        System.out.println(sum - max);
        System.out.println( (sum - max) + " " + (sum - min));

        System.out.println(timeConversion("12:45:54PM"));

    }
    public static String hourShift(String s){


        // Write your code here
        String result = "";
        String hours = s.substring(0,2);


        Integer hoursNumber = 0;

        if(s.charAt(-2)=='P'){

            hoursNumber = Integer.parseInt(s.substring(0,2)) + 12;
            result = hoursNumber.toString(hoursNumber)+ s.substring(2,s.length());
        }
            else{
            result = s.substring(0,s.length());
        }

            return result;
    }

    public static String timeConversion(String s) {
        // Write your code here
        String result = "";
        String hours = "";

        Integer hoursNumber = 0;

        if(s.charAt(s.length()-2)=='P'){
            hoursNumber = Integer.parseInt(s.substring(0,2));
            if ( hoursNumber < 12) {
                hoursNumber += 12;
            }
            hours =  hoursNumber.toString(hoursNumber);
        }
        else{
            hoursNumber = Integer.parseInt(s.substring(0,2));
            if(hoursNumber <10){
                hours = "0" + hoursNumber.toString(hoursNumber);
            } else if (hoursNumber < 12){
                hours =  hoursNumber.toString(hoursNumber);
            } else {
                hours = "00";
            }


            if(hoursNumber == 12)
                hours = "00";

        }

        result = hours + s.substring(2,s.length()-2);

        return result;
    }
}