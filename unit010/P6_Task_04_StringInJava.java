package unit01;

public class P6_Task_04_StringInJava {

	public static void main(String[] args) {
		int s = 234;
		String ans = "";
        while(s>0)
        {
        if(s>=1000)
        {
            ans += "M";
            s = s-1000;
        }
        else if(s>=900)
        {
            ans += "CM";
            s = s-900;
        }
        else if(s>=500)
        {
            ans += "D";
            s = s-500;
        }
        else if(s>=400)
        {
            ans += "CD";
            s = s-400;
        }
        else if(s>=100)
        {
            ans += "C";
            s = s-100;
        }
        else if(s>=90)
        {
            ans += "XC";
            s = s-90;
        }
        else if(s>=50)
        {
            ans += "L";
            s = s-50;
        }
        else if(s>=40)
        {
            ans += "XL";
            s = s-40;
        }
        else if(s>=10)
        {
            ans += "X";
            s = s-10;
        }
        else if(s>=9)
        {
            ans += "IX";
            s = s-9;
        }
        else if(s>=5)
        {
            ans += "V";
            s = s-5;
        }
        else if(s>=4)
        {
            ans += "IV";
            s = s-50;
        }
        else
        {
            ans += "I";
            s = s-1;
        }
        }
        System.out.println(ans);

	}

}
