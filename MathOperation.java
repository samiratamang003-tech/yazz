import java.util.Scanner;

/**
 * Write a description of class MathOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperation
{
    public static void main(String[] args){ 
    int a= 10;
    int b= 20;
    
    int c= a+b; // arthimetic (add)
    System.out.println(c);
    
    int d= 10;
    int e= 3;
    
    int f= d-e; // arthimetic (sub)
    int g= d*e; // arthimetic ( multiply)
    int h= d/e; // arthimetic (divide)
    System.out.println(f);
    System.out.println(g);
    System.out.println(h);
     
    
    // unary operators
    int i=1;
    System.out.println(i); // i=1
    System.out.println(++i); // i=2, ++i=2
    
    System.out.println(i); // i=2
    System.out.println(i++); // i=3, i++ = 2
    System.out.println(i); // i=3
    
    
    // Assignment Operators
    int x=10; // x is 10
    x += 3; // x becomes 13
    System.out.println(x); 
    x -= 2; // x becomes 11
    System.out.println(x); 
    x *= 4; // x becomes 44
    System.out.println(x); 
    x /= 2; // x becomes 22
    System.out.println(x); 
    x %= 5; // x becomes 2
    System.out.println(x); 
    
    // Relational operators
    
    int j= 10;
    int k= 3;
    System.out.println(j == k);
    System.out.println(j != k);
    System.out.println(j > k);
    System.out.println(j < k);
    System.out.println(j >= k);
    System.out.println(j <= k);
    
    
    // Logical Operators
    boolean isAdult = true;
    boolean hasID = false;
    
    boolean andResult = isAdult && hasID;
    boolean orResult = isAdult || hasID;
    boolean notResult = !isAdult;
    
    System.out.println(" AND Result: " +andResult);
    System.out.println(" OR Result: " +orResult);
    System.out.println(" NOT Result: " +notResult);
    
    
    // Ternery Operators
        int age = 18;
        String canVote= (age >=18)? "Yes" : "No";
        System.out.println(canVote); // prints yes
    
    
    
    
}
    }
