//Try and Catch block
import java.util.Scanner;
class NumformatException{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Spelling or Number");
		String str=sc.nextLine();
		try{
			int a=Integer.parseInt(str);
			System.out.println(a);
		}
		catch(NumberFormatException n){
			System.out.println("String"+str+"can't be converted to integer");
		}
		System.out.println("Main method ended");
	}
}