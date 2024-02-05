import java.util.Scanner;
import java.net.*;
import java.io.*;
public class Strema extends IOException{
    public static void main(String[] args) {
        Scanner ik=new Scanner(System.in);
        try{
        System.out.println("[----------------------------------------]");
        Socket s=new Socket("localhost",4999);
            //send meassge
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("SuccessFul infiltration!");
        pr.flush();
            //read message
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader br =new BufferedReader(in);
        String str=br.readLine();
        System.out.println("Client:"+str);
        }
        catch(Exception e)
        {
            System.out.println("The error is:"+e);
        }

    }
}