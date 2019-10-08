package day13;/* *
@author Lea
@date 2019/10/8 
*/

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        String fileName = "hello.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.write("Hello!");
        out.newLine();
        out.write("this is another line.");
        out.newLine();
        out.close();

    }
}
