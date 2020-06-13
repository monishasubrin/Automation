package Day3_041820;

public class Custom_method_execution {

    public static void main(String[] args) {

        //call the method to be executed

      Custom_methods.voidAdd( 100,  200);

      //call the return add method
        int c = Custom_methods.returnAdd(200,300);
        //add the value with the result below
        System.out.println("new result is " + (c-25));


    }//end of main method
}//end of java class