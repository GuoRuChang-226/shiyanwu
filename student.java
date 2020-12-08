package imitate;
import java.util.Scanner;

public class student {
	    int number;
	    String sex;
	    String name;
	    int age;

		 public static void main1(String args[]) {
		        student xuesheng = new student();
		        System.out.println("输入姓名，性别，年龄，学号");
		        Scanner s = new Scanner(System.in);
		        int age = s.nextInt();
		        int number = s.nextInt();
		        String name = s.nextLine();
		        String sex = s.nextLine();
		    

		         xuesheng.setGraduate(name, sex, age, number);
		        
	}
		  public String toString () {
		        return "姓名:  "  +  name  +  "  性别:  "  +  sex  +  "  年龄:  "  +  age  +  "  学号:  "  +  number + "\n";
		    }
		
		private void setGraduate(String name, String sex, int age, int number) {
			// TODO Auto-generated method stub
			
		}

}
