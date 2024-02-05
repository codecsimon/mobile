import java.io.*;
import java.net.*;
import java.util.ArrayList;
public class Catcher extends IOException{
    public static void main(String[] args) {
        
        ArrayList<String> ere =new ArrayList<String>();
        ere.add("Login");
        ere.add("Register");
        ere.add("Cancel");
        try{
        System.out.println("[*************************]");
        ServerSocket ss=new ServerSocket(4999);
        Socket s=ss.accept();
        System.out.println("Client connected"); 
           //read message
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader br =new BufferedReader(in);
        String str=br.readLine();
        System.out.println("Client:"+str);
            //send message
            for(String qw:ere){
                int n=1;
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println(n+":"+qw);
        pr.flush();
        n=n+1;
            }
        
    }
        catch(Exception e)
        {
            System.out.println("The error is:"+e);
        }
    }
}