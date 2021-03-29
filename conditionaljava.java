import java.util.Scanner;
//Taking user input in java
public class conditionaljava {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something here   ");
        String input = scan.nextLine();
        System.out.println(input);
        
        scan.close(); // we have to close the scan to prevent system leak warning    
        

    }
}

