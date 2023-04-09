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
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제 할 이름 입력 : ");
		String name= scan.next();
		
		Iterator<SungJukDTO2> it = list.iterator();
		int sw=0;
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next(); //it가 가리키는 곳의 항목의 데이터를 꺼내서 buffer안에 보관한 후 it은 다음 항목의 데이터로 이동
			
			if(sungJukDTO2.getName().equals(name)) {
				sw=1;
				it.remove(); //it.next()가 반환하는 항목을 지운다(아까 따로 보관한 항목을 제거)
				System.out.print("삭제하였습니다");
			}//if
		}//while
		
		if(sw == 0){
			System.out.print("삭제하고자하는 이름이 없습니다");
		}//if
	}
}
