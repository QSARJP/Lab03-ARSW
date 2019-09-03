package edu.eci.arsw.blueprints.filters;

import java.util.Set;

import edu.eci.arsw.blueprints.model.Blueprint;

public interface Filter {

    Set<Blueprint> filter(Set<Blueprint> setBlue);
    
}