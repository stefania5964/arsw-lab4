package edu.eci.arsw.blueprints;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class FilterR implements Filters {

    @Override
    public Blueprint filter(Blueprint blueprint) {
        List<Point> points = blueprint.getPoints();
        List<Point> filter = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            Point punto = points.get(i);
            Point sigPunto = points.get(i + 1);
            if (punto.getX() != sigPunto.getX() && punto.getY() != sigPunto.getY()) {
                filter.add(punto);
            }
            if ( i ==  points.size() - 2) {
                filter.add(points.get(points.size() - 1));
            }
        }
        blueprint.setPoints(filter);
        return blueprint;
    }
    @Override
    public Set<Blueprint> filters(Set<Blueprint> blueprints) {
        for (Blueprint bluePrint : blueprints) {
            filter(bluePrint);
        }
        return blueprints;
    }

}