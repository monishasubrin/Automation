package Day2_04122020;

public class dynamic_array {

    public static void main(String[] args) {


     //declare String dynamic array variables

     String[] locations, countries;

     //declare integer dynamic array varriable
        int[] number, houseAddress;

        //define the dynamic array with the length(size) of that variable
        countries = new String[6];
        countries[0] = "USA";
        countries[1] = "Bangladesh";
        countries[2] = "India";
        countries[3] = "Canada";
        countries[4] = "China";
        countries[5] = "Russia";

                System.out.println( "The countries I visited are " + countries[1] + " and " + countries[0] + " and " + countries[2] + ".");

                //define the int dynamic array
        number = new int[5];
        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;

       // System.out.println( "My address is " + number[1] + number[2]);

    }//end of main method


}//End of java class
