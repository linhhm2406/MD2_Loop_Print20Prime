import java.util.Scanner;

public class Print20Prime {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Nhap so luong so nguyen to can in ra : ");
        int N = inputNumber.nextInt();
        int count = 0;
        int number = 2;
        boolean check = true;
        while (count < N){
            check = true;
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if (number%i ==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
    }
}
