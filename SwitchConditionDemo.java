import java.util.Scanner;

public class SwitchConditionDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Please Enter Second number : ");
		int num2 = sc.nextInt();
		System.out.println("Please enter the operation to perform :");
		int num3 = sc.nextInt();
		
		switch(num3) {
		case 1:{
			System.out.println(num1+num2);
			break;
		}
		case 2:{
			System.out.println(num1-num2);
			break;
		}
		case 3:{
			System.out.println(num1*num2);
			break;
		}
		case 4:{
			if(num2==0) {
				System.out.println("Cannot be Divided");
			}else {
				System.out.println(num1/num2);
			}
			break;
		}
		}
		
	}
}
