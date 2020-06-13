package Practices;

public class DYNAMICarray {



    public static void main(String[] args) {

        //declare the String dynamic array variables

        String[] Locations, Countries;



        //define the length of the dynamic array variables


        Locations = new String[3];
        Locations[0]= "dhaka";
        Locations[1]= "Khulna";
        Locations[2]= "Rajshahi";

        Countries = new String[2] ;
        Countries[0] = "Bangladesh";
        Countries[1] = "india";

        System.out.println( "I Love " + Countries[0] + " and I was born in " + Locations[1] + ".");


    }//end of the main method
}// end of the project