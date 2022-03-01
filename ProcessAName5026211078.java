import java.util.Scanner;

public class ProcessAName5026211078 {
    public static void main (String[] args){
        String FullName, LastName;
        int SpaceId;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        FullName = sc.nextLine();
        SpaceId = FullName.indexOf(" ");
        LastName = FullName.substring(SpaceId+1);
        System.out.println("Your name is: " +LastName+ ", " +FullName.charAt(0)+ ".");


    }
}
