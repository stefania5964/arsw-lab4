package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.Blueprint;

import java.util.Set;

public interface Filters {
    public Blueprint filter(Blueprint blueprint);

    public Set<Blueprint> filters(Set<Blueprint> blueprints);
}
