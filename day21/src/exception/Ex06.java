package exception;

import java.io.File;			// 파일 혹은 디렉토리(폴더)를 활용하기 위한 클래스
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		File f1 = new File("a.txt");
		File f2 = new File("C:\\windows");
		File f3 = new File(f2,"notepad.exe");
		
		
		System.out.println("f1이 실제로 존재하는가 :" + f1.exists());
		System.out.println("f2이 실제로 존재하는가 : " + f2.exists());
		System.out.println("f3이 실제로 존재하는가 : " + f3.exists());
		System.out.println();
		
		System.out.println("f1이 파일인가 :" + f1.isFile());
		System.out.println("f2이 파일인가 :" + f2.isFile());
		System.out.println("f3이 파일인가 :" + f3.isFile());
		System.out.println(); // 텍스트 혹은 실행파일 등을 말한다
		
		System.out.println("f1이 디렉토리인가 :" + f1.isDirectory());
		System.out.println("f2이 디렉토리인가 :" + f2.isDirectory());
		System.out.println("f3이 디렉토리인가 :" + f3.isDirectory());
		System.out.println();	// 폴더를 말한다
		
		
		if (f1.exists() == false) {
			f1.createNewFile();
//			Unhandled exception type IOException
		}
		
		FileWriter fw = new FileWriter(f1);
		fw.append("Hello");
		fw.append("world\n");
		fw.flush();
		fw.close();
		
		
		Runtime rt = Runtime.getRuntime();
		Process pro = rt.exec("notepad " + f1.getName());
		Thread.sleep(2000);
		pro.destroy();
		
		if (f1.exists()) {
			f1.delete();
		}
	}

}
