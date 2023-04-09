package user.service;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserUpdateService implements UserService {
	@Setter
	private UserDTO userDTO = null;
	@Setter
	private UserDAO userDAO = null; 

	@Override
	public void execute() {
		List<UserDTO> list = userDAO.getUserList();
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 아이디 입력 : ");
		String id = scan.next();
		
		int sw=0;
		for(UserDTO userDTO : list) {
			if(userDTO.getId().equals(id)) {
				sw=1;
				
				//데이터
				System.out.print("변경할 이름 입력 : ");
				String name = scan.next();
				System.out.print("변경할 비밀번호 입력 : ");
				String pwd = scan.next();
				
				userDTO.setName(name);
				userDTO.setPwd(pwd);
				
				//DB
				userDAO.update(userDTO);
				
				System.out.println(name + "님의 데이터를 수정 하였습니다.");
				
				break;
			}//if
		}//for
		
		if(sw == 0){
			System.out.println("찾고자하는 아이디가 없습니다");
	}

}
}
