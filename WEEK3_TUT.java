
/**
 * Write a description of class WEEK3_TUT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WEEK3_TUT
{
    double age; // instance variable
    static int qty; // static variable
    public static void main(String[]args){
        
        // explicit typecasting
        double db= 10.01;
        System.out.println(db);
        int itr= (int)db;
        System.out.println(itr);
        
        // Finding min, max, size, and bytes
        System.out.println(Byte.MAX_VALUE); // returns max value
        System.out.println(Byte.MIN_VALUE); // returns min value
        System.out.println(Byte.SIZE); // returns bits
        System.out.println(Byte.BYTES); // returns bytes
        
        // find of all others: int, float all 8
        
        // escape sequence
        System.out.println("Hello\nWorld"); // new line
        System.out.println("Hamro\tNepal"); // tab
        System.out.println("He said \"Hello Doma\" "); //Quotation
        // unicode escape
        System.out.println("\u2764");
        
        // Finding min, max, size, and bytes of short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);
        
        //Finding min, max, size, and bytes of int
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        
        //Finding min, max, size, and bytes of long
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Long.BYTES);
        
        //Finding min, max, size, and bytes of float
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.SIZE);
        System.out.println(Float.BYTES);
        
        // Finding min, max, size, and bytes of double
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.SIZE);
        System.out.println(Double.BYTES);
        
        //Finding min, max, size, and bytes of boolean
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        
        //Finding min, max, size, and bytes of char
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.SIZE);
        System.out.println(Character.BYTES);
        
        
        
        
        
        
        
        
    }
}