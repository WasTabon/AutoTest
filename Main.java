
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) {
       String str = "pls cut me";

        // Create a StringTokenizer object
        StringTokenizer tokenizer = new StringTokenizer(str);

        // Print the tokens to the console
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
