package backend;

public class Console {
    private static void output(String m) {System.out.print(m);}
    
    public static void Write(String m)  {output(m);}
    public static void Write(boolean m) {output("" + m);}
    public static void Write(int m)     {output("" + m);}
    public static void Write(char m)    {output("" + m);}
    public static void Write(float m)   {output("" + m);}
    public static void Write(double m)  {output("" + m);}
    public static void Write(byte m)    {output("" + m);}
    
    public static void WriteLine(String m)  {output("" + m + "\n");}
    public static void WriteLine(boolean m) {output("" + m + "\n");}
    public static void WriteLine(int m)     {output("" + m + "\n");}
    public static void WriteLine(char m)    {output("" + m + "\n");}
    public static void WriteLine(float m)   {output("" + m + "\n");}
    public static void WriteLine(double m)  {output("" + m + "\n");}
    public static void WriteLine(byte m)    {output("" + m + "\n");}  
}
