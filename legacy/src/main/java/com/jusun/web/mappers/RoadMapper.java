package com.jusun.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jusun.web.domains.RoadDTO;

@Repository
public interface RoadMapper {
	public List<RoadDTO> selectAll();

}
