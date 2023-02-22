package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FilterSub implements Filters{

    @Override
    public Blueprint filter(Blueprint blueprint) {
        List<Point> points = blueprint.getPoints();
        List<Point> filter = new ArrayList<>();

        for(int i = 0; i < points.size(); i = i + 2){
            filter.add(points.get(i));
        }
        blueprint.setPoints(filter);
        return blueprint;
    }

    @Override
    public Set<Blueprint> filters(Set<Blueprint> blueprints) {
        for (Blueprint bluePrint : blueprints){
            filter(bluePrint);
        }
        return blueprints;
    }

}