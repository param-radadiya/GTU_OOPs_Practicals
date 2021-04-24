package sample;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
public class Practical21
{
public static void main(String[] args)
{
LocalDateTime t1 = LocalDateTime.now();
System.out.println(t1);
System.out.println("190130107118 Param Radadiya 4CEB2");
System.out.println("Practical - 21\n");
try (
PrintWriter pw = new PrintWriter(new FileOutputStream(new 
File("123.txt"), true));
) {
for (int i = 0; i < 150; i++)
{
pw.print((int)(Math.random() * 150) + " ");
}
System.out.println("File is Created");
}
catch (FileNotFoundException fnfe)
{
System.out.println("Cannot create the file.");
fnfe.printStackTrace();
}
}
}
