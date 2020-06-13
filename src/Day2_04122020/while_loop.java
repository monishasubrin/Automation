package Day2_04122020;

public class while_loop {


    public static void main(String[] args) {
        //declare the String dynamic variables

        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "California";
        states[2] = "Ohio";
        states[3] = "Arizona";

        //while loop is more of broken down into statements
        int i = 0;
       while(i < states.length){
            //print all value for states
            System.out.println( "My state is " + states[i]);

            i = i +1;//incrementation and you put this at the end of your statements
        }//end of 1st while loop

        String[] cities = new String[3];
        cities[0] = "bronx";
        cities[1] = "queens";
        cities[2] = "brooklyn";

        //while loop is more of broken down into statements
        int a = 0;
        while(a < cities.length){
            //print all values for cities
            System.out.println( "My city is " + cities[a]);

            a = a+1;//incrementation and you put this at the end of your statements
        }//end of 2nd while loop
    }//end of main method
}// end of java class
