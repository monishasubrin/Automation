package Day4_04192020;

public class splitCommand_2 {
    public static void main(String[] args) {

        //create a string message first and store it as a single string variable
        String message = "Welcome to_Selenium Automation class";

        //I want to only print the keyword 'Selenium' from my message variable
        //we need to define String array variable in order to split the message
        String[] ArrayResult = message.split(" ");

        ArrayResult[0] = "Welcome";
        ArrayResult[1] = "to_Selenium";
        ArrayResult[2] = " Class ";

        //print the result
       // System.out.println( "My final message is " + ArrayResult[1]);

        String[] array2 = ArrayResult[1].split("_");
        //System.out.println(" My new message is " + array2[1]);

        //you want to print out "to" and "class"
        System.out.println("My first keyword is "+ array2[0] + " and my second keyword is" +ArrayResult[2]);


    }//end of main method
}//end of java class
