package edu.eci.arsw.blueprints.filters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;

@Component("redundancyFiltering")
public class RedundancyFiltering implements Filter {

	@Override
	public Set<Blueprint> filter(Set<Blueprint> setBlue) {
        List<Integer> pointsIn = new ArrayList<>();
        Set<Blueprint> blue = new HashSet<>();
		for ( Blueprint e : setBlue) {
            List<Point> points = e.getPoints();
            Point[] ptsNuevos = new Point[points.size()];
            int i = 0 ;
            for ( Point p : points){
                if (!pointsIn.contains(p.getX()) && !pointsIn.contains(p.getY())){
                    pointsIn.add(p.getX());
                    pointsIn.add(p.getY());
                    ptsNuevos[i] = new Point(p.getX(),p.getY());
                    i++;
                } 
            }
            blue.add(new Blueprint(e.getAuthor(),e.getName(),ptsNuevos));

        }
        return blue;
	}

}