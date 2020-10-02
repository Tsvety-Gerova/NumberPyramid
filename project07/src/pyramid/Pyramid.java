package pyramid;

import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

  System.out.println("Enter a number from 1 to 15");
int num = sc.nextInt();
for (int j = 0; j < num; j++){ 
   for (int i = 0; i < num; i++){
	if (num - i > 0){
		System.out.print(num - i);
	}else{
		System.out.print(num + i);
	}
}
   System.out.print("\n");
  
	
}


}

}
