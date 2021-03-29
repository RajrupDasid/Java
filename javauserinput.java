import java.util.*;
public class javauserinput {
    public static void main(String args [])
    {
        Scanner userio = new Scanner(System.in);
        System.out.println("Enter user input ");
        String input = userio.nextLine();
        System.out.println(input);
        userio.close();
    }
    
}
