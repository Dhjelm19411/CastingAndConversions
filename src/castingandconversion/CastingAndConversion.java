/*
 * Name: David Hjelm
 * Period: 2
 * Program: CastingAndConversions
 */
package castingandconversion;

/**
 *
 * @author 19411
 */
public class CastingAndConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int anInt = 12;
    double aDoubleWithDecimal = -3.95;
    double aDoubleWithoutDecimal = 4;
    char aChar = 'a';
    
    
    System.out.println("Printing the vars our regularly");
    System.out.println(anInt);
    System.out.println(aDoubleWithDecimal);
    System.out.println(aDoubleWithoutDecimal);
    System.out.println(aChar);
    System.out.println();
    
    
    
    
    System.out.println("Printing the vars casted as ints:");
    System.out.println( (int)anInt);
    System.out.println( (int)aDoubleWithDecimal);
    System.out.println( (int)aDoubleWithoutDecimal);
    System.out.println( (int)aChar);
    System.out.println();
    
    System.out.println("Printing the vars casted as doubles:");
    System.out.println( (double)anInt);
    System.out.println( (double)aDoubleWithDecimal);
    System.out.println( (double)aDoubleWithoutDecimal);
    System.out.println( (double)aChar);
    System.out.println();
    
    System.out.println("Printing the vars casted as char:");
    System.out.println( (char)anInt);
    System.out.println( (char)aDoubleWithDecimal);
    System.out.println( (char)aDoubleWithoutDecimal);
    System.out.println( (char)aChar);
    System.out.println();
    
    
    
    }
   
    
    
}
