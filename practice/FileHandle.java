package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandle
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s = buff.readLine();
        FileReader obj = null;
        FileWriter obj2 = null;
        try{
            obj = new FileReader(s);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            obj2 = new FileWriter("second.txt");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        int ch;
        while((ch=obj.read())!=-1)
        {
            System.out.println(ch);
            if(ch%2==0)
                obj2.write(ch);
        }
        obj.close();
        obj2.close();
    }    
}
