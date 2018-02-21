package day7;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws IOException
	{
		// �����ֽ�������
		int i=0;
		FileInputStream fis = new FileInputStream(
			"FileInputStreamTest.java");
		// ����һ������Ϊ1024�ġ���Ͳ��
		byte[] bbuf = new byte[1024];
		// ���ڱ���ʵ�ʶ�ȡ���ֽ���
		int hasRead = 0;
		// ʹ��ѭ�����ظ���ȡˮ������
		while ((hasRead = fis.read(bbuf)) > 0 )
		{
			// ȡ������Ͳ����ˮ�Σ��ֽڣ������ֽ�����ת�����ַ������룡
			System.out.print(new String(bbuf , 0 , hasRead ));
			 i++;
		}
		// �ر��ļ�������������finally�������ȫ
		fis.close();
		System.out.println(i);
	}
}
