import java.time.LocalDateTime;

public class Practical23
{
    public static void main(String[] args)
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107118 Param Radadiya 4CEB2");
        System.out.println("Practical - 23\n");

        Integer[][] list = new Integer[10][10];
        int value = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                list[i][j] = value++;
            }
        }
        System.out.println("Min = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E max = list[0][0];
        for (E[] elements : list)
        {
            for (E element : elements)
            {
                if (element.compareTo(max) > 0)
                {
                    max = element;
                }
            }
        }
        return max;
    }
}