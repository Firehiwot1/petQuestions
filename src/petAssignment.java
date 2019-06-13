import java.util.Scanner;

public class petAssignment {

    public static void main( String[] args ){
    String name;
    String breed;
    int age;
    Scanner fre = new Scanner(System.in);
    System.out.print( "Greetings. What is your pet's name? " );
    name = fre.next();

        System.out.print( "What kind of animal is " + name + "? " );
    breed =fre.next();
        System.out.print( "How old is " + name + "? ");
    age=fre.nextInt();

        System.out.println( name + " is your " + breed + " and it is " + age );
}
}


