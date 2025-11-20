
/**
 * Write a description of class week3_WS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week3_WS
{
    int age; // instance variable
    static int qty; // static variable
    public static void main(String[]args){
        int agr=10; // local variable
        System.out.println(agr);
        
        // <classname> <vairable>= new <classname>();
        week3_WS wl=new week3_WS();
        
        System.out.println(wl.age);
        System.out.println(qty);
    }
}