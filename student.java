package imitate;
import java.util.Scanner;

public class student {
	    int number;
	    String sex;
	    String name;
	    int age;

		 public static void main1(String args[]) {
		        student xuesheng = new student();
		        System.out.println("�����������Ա����䣬ѧ��");
		        Scanner s = new Scanner(System.in);
		        int age = s.nextInt();
		        int number = s.nextInt();
		        String name = s.nextLine();
		        String sex = s.nextLine();
		    

		         xuesheng.setGraduate(name, sex, age, number);
		        
	}
		  public String toString () {
		        return "����:  "  +  name  +  "  �Ա�:  "  +  sex  +  "  ����:  "  +  age  +  "  ѧ��:  "  +  number + "\n";
		    }
		
		private void setGraduate(String name, String sex, int age, int number) {
			// TODO Auto-generated method stub
			
		}

}
