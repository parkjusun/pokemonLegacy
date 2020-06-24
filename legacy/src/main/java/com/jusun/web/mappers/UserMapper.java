package com.jusun.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jusun.web.domains.UserDTO;

@Repository
public interface UserMapper {
	public List<UserDTO> selectAll();
}
