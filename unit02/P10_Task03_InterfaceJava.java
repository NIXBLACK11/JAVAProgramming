package unit02;

interface mammal
{
	abstract void runMammal();
	abstract String soundMammal(String s);
}

interface human
{
	abstract void runHuman();
	abstract String soundHuman(String s);
}

class indian implements mammal, human
{
	public void runMammal()
	{
		System.out.println("running mammal");
	}
	public String soundMammal(String s)
	{
		return s;
	}
	public void runHuman()
	{
		System.out.println("running human");
	}
	public String soundHuman(String s)
	{
		return s;
	}
}

public class P10_Task03_InterfaceJava
{
	public static void main(String[] args)
	{
		indian joe  = new indian();
		joe.runMammal();
		joe.runHuman();
		System.out.println(joe.soundMammal("roar"));
		System.out.println(joe.soundHuman("talk"));
	}
}
