import java.util.Locale;

public class MainApplication {
    public static void main(String[] args) {
        //given: an array of number as string { "1", "5", "15", "9", "4"}
        //return an array of string numbers in proper order 1,4,5,9,15

    }
    public String[] sortArray(String[] input){
        //check each element
        //compare one to teh next via ACSII table
        //set smallest variablw to first elemt
                //compare 2nd and swap if 2nd is smaller (bubble sort)

        String smallestValue = input[0];

        //wrap in a while loop
        //while boolean !sorted

        Boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for (int i = 1; i < input.length; i++) {
                //if second num is smaller than the 1st num
//                if ((input[i].length() == input[i - 1].length()
//                        && input[i].compareTo(input[i - 1]) < 0)
//                    || input[i].length() < input[i - 1].length()) {
                if (currentIsLessThanPrevious(input[i], input[i-1])) {
                    String temp = input[i];
                    input[i] = input[i-1];
                    input[i - 1] = temp;
                    sorted = false;
                }
//                if (input[i].length() < input[i - 1].length()) {
//                    String temp = input[i];
//                    input[i] = input[i-1];
//                    input[i - 1] = temp;
//                    sorted = false;
//                }
            }
        }
        return input;
    }

    //Sub methods
    public Boolean currentIsLessThanPrevious(String current, String previous) {
       if (current.length() < previous.length()){
           return true;
       } else if (current.length() > previous.length()){
           return false;
       } else if (current.compareTo(previous) < 0){
           return  true;
        }
        return false;
    }
}
