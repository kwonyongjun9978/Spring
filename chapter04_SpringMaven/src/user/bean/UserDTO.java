package user.bean;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
public class UserDTO {
	private String name;
	private String id;
	private String pwd;
	
}
