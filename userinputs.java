// User input and string concatination java
import java.util.*;
public class userinputs {
    public static void main(String args[])
    {
        Scanner concat= new Scanner(System.in);
        System.out.println("Enter user input ");
        String input = concat.nextLine();
        System.out.println(input+ "I have no life");
        concat.close();
    }
}
