import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++){
			if (array[i] > max){
				max = array[i];
				idx = i+1;
			}
		}
        System.out.println(max);
        System.out.println(idx);
	}
}