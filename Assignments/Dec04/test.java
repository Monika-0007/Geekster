package objects;

public class Test1
{
    public static void talk()
    {
    	System.out.println("hello there!");
    }
    //Function talk is overloaded
    public static void talk(String name)
    {
    	System.out.println("Hello "+name+"!");
    }
    public static void main(String[] args)
    {
    	talk("Matthew");
    }
}

