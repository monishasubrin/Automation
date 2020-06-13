package Action_Item;

public class First_AI {    public static void main(String[] args) {


    //declare String dynamic array

    String[] streetnumber;


    String[] Zipcode;

    streetnumber = new String[4];
    streetnumber [0] = "170";
    streetnumber [1] = "171";
    streetnumber [2] = "172";
    streetnumber [3] = "173";

    Zipcode = new String[4];
    Zipcode [0] = "11434";
    Zipcode [1] = "11432";
    Zipcode [2] = "11431";
    Zipcode [3] = "11430";


    for(int a = 0; a < Zipcode.length; a++) {
        System.out.println("The street number is " + streetnumber[a] + " and the zipcode is " + Zipcode[a]);
    }// end of the for loop and the 1st assignment




    //while loop is more of broken down into statements
    int i = 0;
    while(i < streetnumber.length) {
        //print all value
        System.out.println("The street number is " + streetnumber[i] + " and the zipcode is " + Zipcode[i]);
        i = i + 1;//incrementation and you put this at the end of your statements


    }//end of the while loop
}//end of the main method
}//end of assignment

