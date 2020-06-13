package Day4_04192020;

public class split_command {
    public static void main(String[] args) {

        //create a string message first and store it as a single string variable
        String message = "Welcome to Selenium Automation class";

        //I want to only print the keyword 'Selenium' from my message variable
        //we need to define String array variable in order to split the message
        String[] arrayResult = message.split(" ");

        arrayResult[0] = "Welcome";
        arrayResult[1] = "to";
        arrayResult[2] = "Selenium";

        //print the result
        System.out.println( "My final message is " + arrayResult[2]);


    }//end of main method
}//end of java class
