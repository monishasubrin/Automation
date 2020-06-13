package Day3_041820;

public class Custom_methods {
    //purpose of these user defined custom methods so that i can reuse it again and again
    //and call it on my main method when I need to use them

    //user defined custom methods will be created here

    //let's create one for void first
    public static void voidAdd(int a, int b){
        int result = a+b;

        System.out.println("My additional result is " + result);

    }//end of void method

    //create same method as return method
    public static int returnAdd(int a, int b) {
        int result = a+b;
        System.out.println("My addition result is " + result);
        return result;//will return the result c
    }//end of void method


}//end of java class
