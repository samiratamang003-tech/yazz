
/**
 * Write a description of class DataTypeInspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeInspector
{
    public static void main(String[]args){
        int a=11;
        byte b=17;
        short c=29;
        long d=23343L;
        float e=2344542f;
        double f=11.11;
        char g='S';
        System.out.println(a);
        //Finding min, max, size, and bytes of doubleint
        System.out.println("Integer max value = " +Integer.MAX_VALUE);
        System.out.println("Integer min value = " +Integer.MIN_VALUE);
        System.out.println("Integer size = " +Integer.SIZE);
        System.out.println("Integer byte = " +Integer.BYTES);
        System.out.println(b);
        //Finding min, max, size, and bytes of byte
        System.out.println("Byte max value = " +Byte.MAX_VALUE); // returns max value
        System.out.println("Byte min value = " +Byte.MIN_VALUE); // returns min value
        System.out.println("Byte size = " +Byte.SIZE); // returns bits
        System.out.println("Byte datatype byte = " +Byte.BYTES); // returns bytes
        System.out.println(c);
        //Finding min, max, size, and bytes of short
        System.out.println("Short max value = " +Short.MAX_VALUE);
        System.out.println("Short min value = " +Short.MIN_VALUE);
        System.out.println("Short size = " +Short.SIZE);
        System.out.println("Short byte = " +Short.BYTES);
        System.out.println(d);
        //Finding min, max, size, and bytes of long
        System.out.println("Long max value = " +Long.MAX_VALUE);
        System.out.println("Long min value = " +Long.MIN_VALUE);
        System.out.println("Long size = " +Long.SIZE);
        System.out.println("longr byte = " +Long.BYTES);
        System.out.println(e);
        //Finding min, max, size, and bytes of float
        System.out.println("Float max value = " +Float.MAX_VALUE);
        System.out.println("Float min value = " +Float.MIN_VALUE);
        System.out.println("Float size = " +Float.SIZE);
        System.out.println("Float byte = " +Float.BYTES);
        System.out.println(f);
        //Finding min, max, size, and bytes of double
        System.out.println("Double max value = " +Double.MAX_VALUE);
        System.out.println("Double min value = " +Double.MIN_VALUE);
        System.out.println("Double size = " +Double.SIZE);
        System.out.println("Double byte = " +Double.BYTES);
        System.out.println(g);
        //Finding min, max, size, and bytes of char
        System.out.println("Char max value = " +Character.MAX_VALUE);
        System.out.println("Char min value = " +Character.MIN_VALUE);
        System.out.println("Char size = " +Character.SIZE);
        System.out.println("Char byte+ = " +Character.BYTES);
    
    }
    }
