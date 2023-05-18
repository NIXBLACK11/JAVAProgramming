package unit01;

public class string {
    public static void main(String[] args) {
        String s = "jfdgdfg";
        String ans = "";
        s = s.toLowerCase();
        for(char ch = 'a';ch<='z';ch++)
        {
            for (int i = 0; i < s.length(); i++)
            {
                if(ch==s.charAt(i))
                {
                    ans = ans + ch;
                }
            }
        }
        System.out.println(ans);
    }
}
