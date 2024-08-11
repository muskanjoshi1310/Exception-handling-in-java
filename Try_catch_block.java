// this is my first program on exception handling with try and catch block//

class E{
    public static void main(String[]args){
        int a[]= new int[6];//array
        
    try{
            int divide= 10/0;//divide
            
            System.out.println(a[9]);
        }
         
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("muskan");
        }
        catch(ArithmeticException e){
        
            System.out.println(e.fillInStackTrace());
            System.out.println("i reached at arthimetic exception");
        }
        System.out.println("joshi");
       // catch(ArrayIndexOutOfBoundsException| ArithmeticException){
           // System.out.println("there are both exceptions present");
        }
    }






