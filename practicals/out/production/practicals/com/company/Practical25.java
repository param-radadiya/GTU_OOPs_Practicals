import java.io.*;
import java.security.InvalidParameterException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Iterator;

public class Practical25
{
    public static void main(String[] args) throws FileNotFoundException
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 25\n");

        if (args.length != 1)
            throw new InvalidParameterException("Usage: fullFilePathName");

        File file = new File(args[0]);

        if (!file.isFile())
            throw new FileNotFoundException(file + " is not a file.");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 10000))
        {
            String inputS;
            StringBuilder sb = new StringBuilder(10000);
            while ((inputS = in.readLine()) != null)
                sb.append(inputS);

            String[] words = sb.toString().split("\\s+");

            TreeSet<String> ndWords = new TreeSet<>(Arrays.asList(words));

            Iterator<String> itr = ndWords.descendingIterator();
            String s;
            while (itr.hasNext())
            {
                s = itr.next();
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(0);
        }

    }
}