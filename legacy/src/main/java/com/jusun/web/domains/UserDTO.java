package com.jusun.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserDTO {

	public int seq;
	public String userid,passwd,email,addr;

}
