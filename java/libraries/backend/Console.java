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

    public static void addEffect(String currentEffect) {
        switch (currentEffect) {
            case "Reset"           -> {output("\033[0m");  break;}
            case "Bold"            -> {output("\033[1m");  break;}
            case "Italize"         -> {output("\033[3m");  break;}
            case "Underline"       -> {output("\033[4m");  break;}
            case "Conceal"         -> {output("\033[8m");  break;}
            case "Strikethrough"   -> {output("\033[9m");  break;}
            case "Reveal"          -> {output("\033[28m"); break;}
            case "Frame"           -> {output("\033[51m"); break;}
            case "Encircle"        -> {output("\033[52m"); break;}
            case "Overline"        -> {output("\033[53m"); break;}
        }
    }
    
    public static void setFGColor(int[] rgb) {output("\033[38;2;" + rgb[0] + ";" + rgb[1] + ";" + rgb[2] + "m");}
    public static void setFGColor(int r, int g, int b) {output("\033[38;2;" + r + ";" + g + ";" + b + "m");}
    
}
