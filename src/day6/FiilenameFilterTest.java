package day6;

import java.io.File;

public class FiilenameFilterTest {
	
	
		public static void main(String[] args)
		{
			File file = new File(".");
			// ʹ��Lambda���ʽ��Ŀ������ΪFilenameFilter��ʵ���ļ���������
			// ����ļ�����.java��β�������ļ���Ӧһ��·��������true
			String[] nameList = file.list((dir, name) -> name.endsWith(".java")
				|| new File(name).isDirectory());
			for(String name : nameList)
			{
				System.out.println(name);
			}
		}
	
}
