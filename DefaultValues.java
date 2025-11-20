
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{
    // Member variables - not initialized
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();

        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.i);
        System.out.println(obj.l);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(obj.c);   // prints empty (null character)
        System.out.println(obj.bool);

        // This wouldn't work for local variables because:
        // Local variables do NOT get default values in Java.
        // They must be initialized before use, otherwise you get a compile-time error.
    }
}

