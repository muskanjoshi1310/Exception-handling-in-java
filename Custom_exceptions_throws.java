
// throw keyword helps to throw link between user defined  and inbuild exception classes
import java.util.Scanner;
class ownException{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);// scanner
        System.out.println("enter the age");
try{
        int age= sc.nextInt();
        if(age>100){
            System.out.println("this is throwns");
            throw new createException();// throw createException from Exception
            
        }
    }catch(Exception e){
        System.out.println(e);
    }

    }
}
class createException extends Exception{
// extends user defined to inbuild exception class
}

