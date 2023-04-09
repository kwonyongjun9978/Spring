package user.service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService {
	@Setter
	private UserDTO userDTO = null;
	@Setter
	private UserDAO userDAO = null; 
	
	@Override
	public void execute() {
		List<UserDTO> list = userDAO.getUserList();
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 할 아이디 입력 : ");
		String id = scan.next();
		
		Iterator<UserDTO> it = list.iterator();
		int sw=0;
		while(it.hasNext()) {
			UserDTO userDTO = it.next(); //it가 가리키는 곳의 항목의 데이터를 꺼내서 buffer안에 보관한 후 it는 다음 항목의 데이터로 이동
			
			if(userDTO.getId().equals(id)) {
				sw=1;
				it.remove(); //it.next()가 반환하는 항목을 지운다(아까 따로 보관한 항목을 제거)
				userDAO.delete(userDTO);
				System.out.print("삭제하였습니다");
			}//if
		}//while
		
		if(sw == 0){
			System.out.print("삭제하고자하는 이름이 없습니다");
		}//if
		
	}

}
