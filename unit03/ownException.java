
public class ownException {
    void test()
    {
        try{
        throw new MyException("my type");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        ownException ob = new ownException();
        ob.test();
    }
}
class MyException extends Exception
{
    private String mess;
    MyException(String mess)
    {
        this.mess = mess;
    }
    public String getMessage()
    {
        return mess;
    }
}
