package com.jusun.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jusun.web.domains.PokemonDTO;

@Repository
public interface PokemonMapper {
	public List<PokemonDTO> selectAll();
}
