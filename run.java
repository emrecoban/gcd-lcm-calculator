import java.util.Scanner;

/**
 * @author emrecoban
 */
 
public class Run {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String rawNumbers = read.nextLine(); // e.g.:2365,3,26,369,56,20,225
        String[] numbers = rawNumbers.split(",");
        System.out.println("GCD: " + resultofGCD(numbers) + " LCM: " + resultofLCM(numbers));
    }
    
    static int calculaterGCD(int a, int b){
        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int calculateLCM(int a, int b){
        return a * (b / calculaterGCD(a, b));
    }
    static int resultofGCD(String[] input){
        int result = Integer.parseInt(input[0]);
        for(int i = 1; i < input.length; i++) result = calculaterGCD(result, Integer.parseInt(input[i]));
        return result;
    }
    static int resultofLCM(String[] input){
        int result = Integer.parseInt(input[0]);
        for(int i = 1; i < input.length; i++) result = calculateLCM(result, Integer.parseInt(input[i]));
        return result;
    }  
}
