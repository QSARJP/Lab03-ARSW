package edu.eci.arsw.blueprints.filters;

import java.util.Set;

import org.springframework.stereotype.Component;

import edu.eci.arsw.blueprints.model.Blueprint;


@Component("subsamplingFiltering")
public class SubsamplingFiltering implements Filter {

	@Override
	public Set<Blueprint> filter(Set<Blueprint> setBlue) {
		return null;
	}




}