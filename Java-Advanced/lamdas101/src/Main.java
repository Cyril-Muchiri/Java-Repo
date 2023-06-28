public class Main {
    public static void main(String[] args) {
        String name="Jane";
        char symbol='@';

       MyInterface myInterface =(x,y)-> {
           System.out.println("How are you " + y + " " + x);
           System.out.println("Good evening " + y + " " + x);
       };
       myInterface.message(name,symbol);
    }

}