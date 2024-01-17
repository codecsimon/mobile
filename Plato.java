import java.util.Scanner;
class Plato{
public static void main(String []args){
System.out.println("We call it");
Scanner miko=new Scanner(System.in);
System.out.println("Enter Your username?");
String name=miko.next();
System.out.println("Enter your password?");
String pass=miko.next();
System.out.println("\n----------------------------------\n");
System.out.println("Username:"+name+"\nPassword:"+pass);
add();
}
public static void add()
{
    System.out.println("Access Granted");
}
}