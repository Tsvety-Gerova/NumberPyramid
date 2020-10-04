package numberPyramid;
import java.util.Scanner;
public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		  System.out.println("Enter a number from 1 to 15");
		int num = sc.nextInt();
		for (int j = 0; j < 15; j++){ 
		   for (int i = 0; i <= 2*num; i++){
			if (num - i > 0){
				System.out.print(num - i);
			}else if(num - i == 0) {
				System.out.print("");
			}else if(num - i < 0){
				if (i - num == 1) {
					System.out.print("");
				}else{
					System.out.print(i - num);
				}
				}
			}
		
		num -= 1;
		   System.out.print("\n");   
	}
		}
	}





