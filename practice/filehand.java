package practice;

import java.io.*;

public class filehand {
    public static void main(String[] args) throws IOException {
    FileWriter fuff = null;
    try
    {
        fuff = new FileWriter("test.txt");
        String s = "Java\n bawa ree\n";
        fuff.write(s);
    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
        fuff.close();
    }
    FileReader obj = null;
        try{
            obj = new FileReader("test.txt");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        int ch;
        int countChar = 0, countWord = 0, countLine = 0;
        while((ch=obj.read())!=-1)
        {
            if(ch==' ')
            {
                countWord++;
            }
            if(ch=='\n')
            {
                countLine++;
                countWord++;
            }
            countChar++;
        }
        obj.close();
}
}