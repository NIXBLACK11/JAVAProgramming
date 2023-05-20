// package unit03;

// Complete given tasks using file and exception handling:
// 1- Create two text files input.txt and output.txt
// 2- input.txt, contains given text
// Java is a cool Language
// Java provides multithreading concept
// With Java we can build web applications
// 3- Initially output.txt would be empty
// 4- Write java program which would read from input.txt and write in output.txt with total number of characters, words and lines in input file
// 5- output file would look like this:
// Total number of characters : X
// Total number of words : Y
// Total number of lines : Z
// 6- make sure to close the files when needed!

import java.io.*;

public class P15_Task01_FileHandlignInJava 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file to read:");
        String s = buff.readLine();
        FileReader obj = null;
        try{
            obj = new FileReader(s);
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
        System.out.println("Enter the file to write:");
        s = buff.readLine();
        FileWriter objW = null;
        try{
            objW = new FileWriter(s);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        objW.write("The number of characters : "+countChar+"\nThe number of words : "+countWord+"\nThe number of lines : "+countLine);
        objW.close();
    }
}