package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class checkExceptionEx {
    public static void main(String[] args) {
        PrintWriter pw;


        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.println("saved");

    }
}