 package day6;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Date;

public class file {
	private static char[] createfiles;
	private static File tempFile;

	public static void main(String[] args) throws IOException {
		File file = new File("."+File.separator+"demo.txt");
		String name = file.getName();
		long length = file.length();
		System.out.println(name+length);
		String Path = file.getPath();//������·��
		String absoulutpath = file.getAbsolutePath();//��þ���·��
		String parentdir = file.getParent();//��ø�Ŀ¼��
		System.out.println(Path);
		System.out.println(absoulutpath);
		System.out.println(parentdir);
//		boolean issucced = renameTo(file ("."+File.separator+"d.txt"));
		//�����ļ�
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isAbsolute());
		//��������޸ĵ�ʱ��
		long lasttime = file.lastModified();
		Date filelastdate = new Date(lasttime);
		System.out.println(filelastdate);
		//�����ļ�����
//		try {
//			boolean createfiles = file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(createfiles);
//		������ʱ�ļ�
		try {
			File tempFile = File.createTempFile("aaa",".txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		tempFile.delete();
		file.mkdir();
		File[] roots = File.listRoots();
		for(File root : roots)
		{
			System.out.println(root);
		}
//		File[] pwdAll = file.listFiles();
//		for(File pwd : pwdAll)
//		{
//			System.out.println(pwd);
//		}
		
//		�����ļ�
		File file1 = new File("test.txt");
		file1.createNewFile();
		File file2 =new File("abc");
		file2.mkdir();
		String[] allFiles = file.list();
		file1.delete();//ɾ���ļ�
		System.out.println(allFiles);
	
	}
}
