package sample04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukDelete implements SungJuk {
	@Setter
	private List<SungJukDTO2> list = null;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제 할 이름 입력 : ");
		String name= scan.next();
		
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next(); //데이터를 꺼내서 buffer안에 보관
			
			if(sungJukDTO2.getName().equals(name)) {
				it.remove(); //it.next()가 반환하는 항목을 지운다
				System.out.println("삭제하였습니다");
			}else {
				System.out.println("삭제하고자하는 이름이 없습니다");
			}
		}
	}
}
