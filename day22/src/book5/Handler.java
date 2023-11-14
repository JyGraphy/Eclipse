package book5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

//	데이터 저장소를 (배열 -> 리스트 -> 파일 -> DB) 를 직접 참조하거나, 연결할 수 있음

//	프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {

//	Book[] arr = new Book[26];
	ArrayList<Book> list = new ArrayList<>();

	private File f = new File("bookList.csv");

	public Handler() {
		if (f.exists() == false) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("\t 파일을 생성하는데에 문제가 발생했습니다 : " + e);
				e.printStackTrace();
			}
		}
	}

//	저장
	public void save() {
//		프로그램의 데이터를 파일로 내보내는 스트림 (데이터의 이동 통로)
		try {

			FileOutputStream fos = new FileOutputStream(f);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

			for (Book ob : list) {
				String name = ob.getName();
				String author = ob.getAuthor();
				String publisher = ob.getPublisher();
				String price = String.valueOf(ob.getPrice());

				String data = String.format("%s %s %s %s", name, author, publisher, price);
				osw.write(data);
				osw.write('\n');
			}
			osw.flush();
			osw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void showList() {
		list.forEach(ob -> System.out.println(ob));
	}

	public int insertBook(Book ob) {
		int row = 0;
		boolean flag = list.add(ob); // 추가 성공시 true
		row = flag ? 1 : 0;
		return row;
	}

	public int deleteBook(String name) {
		int row = 0;
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1 : 0;

		return row;
	}

}
