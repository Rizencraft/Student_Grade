import java.util.Collections;
import java.util.Scanner;
public class StudentGrade   {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of students:");
        Scanner sc = new Scanner(System.in);
        int number_of_students =sc.nextInt();
        //int student_number = 0;
        int[] arr = new int[number_of_students];
        for(int i=0; i<number_of_students; i++) {
            System.out.println("Enter the "+(i+1)+" student marks:");
            arr[i] = sc.nextInt();
        }
        int[] sorted_std_arr=sort(arr);
        System.out.println("-------------------------------");
        System.out.printf("|%10s  | %10s     | ","Marks","Grade");
        System.out.println();
        System.out.println("-------------------------------");
        for(int j =0; j<sorted_std_arr.length; j++) {
            String grade=Calculate_grade(arr[j]);

            System.out.format("| %7d    | %10s     | ", arr[j],grade);
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    public static int[] sort(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    int swap;
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;

                }

            }
        }
        return arr;

    }
    public static String Calculate_grade(int num)
    {
        if(num>=40 && num<=50)
        {
            return "Pass";
        }
        else if(num>=51 && num<=75)
        {
            return "Merit";
        }
        else if(num>=76)
        {
            return "Distnction";
        }
        else {
            return "Fail";
        }
    }
}


