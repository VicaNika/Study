package HomeWork1;
import java.util.Arrays;

public class Task6
{
    public static void main(String[] args)
    {
        System.out.print(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] arr)
    {
        // (XXX) XXX-XXXX

        String result = String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                arr[0], arr[1], arr[2],arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);

        return result;
    }
}


