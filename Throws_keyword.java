// Java program to demonstrate 
// control flow of try-catch-finally clause
// when exception occur in try block
// and handled in catch block
//throws keywords used to aware to programmer for proper understanding of code to prevent the code for unexcepted errors.


public class Throws_keyword {
    public static void main(String[]args){
        int a[]=new int[5];// array
        // this statement will never execute
			// as exception is raised by above statement
        try{
        EC(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static int EC(int a[])throws ArrayIndexOutOfBoundsException{
        // we are using this exception handler for handling the code by using try and catch for aware we
        // are using the throws keywords for futher development process.
        return a[9];

    }
}

