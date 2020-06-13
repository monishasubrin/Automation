package Day2_04122020;

public class for_loop {

    public static void main(String[] args) {

        //defining the string dynamic array
        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "California";
        states[2] = "Ohio";
        states[3] = "Arizona";

                //print all the states from 0 to 3
        for(int i = 0; i <= 3; i++){
            System.out.println( "My state is " + states[i]);
        }// end of for loop

        String[] States = new String[5];
        States[0] = "New York";
        States[1] = "California";
        States[2] = "Ohio";
        States[3] = "Arizona";
        States[4] = "Texas";

        //print all the states from 0 to last value in sequence
        //i++ each time is adding +1 to 1
        //i represents your initial/starting point of your index
        for(int i = 0; i < states.length; i++){
            System.out.println(" My State is " + States[i]);
        }//end of 2nd for loop
    }// end of main method



} //end of java class
