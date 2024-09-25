import java.util.Scanner;

public class SumOfNaturalNos {
    public static void main(String[] args){
        int num;
        int sum = 0;
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i=0; i<=num;i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
