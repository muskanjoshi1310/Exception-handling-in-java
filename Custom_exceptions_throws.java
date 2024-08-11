import java.util.Scanner;
class ownException{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
try{
        int age= sc.nextInt();
        if(age>100){
            System.out.println("this is throwns");
            throw new createException();
            
        }
    }catch(Exception e){
        System.out.println(e);
    }

    }
}
class createException extends Exception{


}

