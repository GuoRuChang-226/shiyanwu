package imitate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class Read {
    

	private static char[] xuesheng;

	public static void main11(String argv[]){
        try {
            FileReader fileReader1 = new FileReader("D:\\Download\\chg.txt");//��ȡD���ļ�
            BufferedReader bufferedReader = new BufferedReader(fileReader1);//���ļ��浽������
            Writer writer = new FileWriter(new File("D:\\Download\\shiyan.txt"));//���������ļ�д��shiyan�ļ���
            String str = bufferedReader.readLine();
            String regex = "(.{7})";
            str = str.replaceAll(regex, "$1��");
            StringBuffer x = new StringBuffer(str);
            for (int  i = 15; i <289; i = i + 17) {
                x.replace(i, i + 1, "��\n");
            }
            System.out.println(x);
            writer.write(String.valueOf(xuesheng));
            writer.write("\n");
            writer.write(String.valueOf(x));
            bufferedReader.close();
            fileReader1.close();
            writer.close();
            a:
            while (true) {
                System.out.println("����1����2ѡ���ѯ�ֺʹʻ����˳�");
                Scanner in = new Scanner(System.in);
                int z = in.nextInt();
                switch (z) {
                    case 1:
                        Scanner y = new Scanner(System.in);
                        System.out.println("��������Ҫ��ѯ����:");
                        String c = y.nextLine();
                        int count = (str.length() - str.replace(c, "").length()) / c.length(); //ʹ��replace�������ַ����滻Ϊ�գ�Ȼ���󳤶�
                        System.out.println(count);
                        break;
                    case 2:
                        System.out.println("�˳�");
                        break a;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("���ִ���!");
        }
    }
}


        