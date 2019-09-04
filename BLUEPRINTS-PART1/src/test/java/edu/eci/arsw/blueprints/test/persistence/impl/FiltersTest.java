package edu.eci.arsw.blueprints.test.persistence.impl;

import edu.eci.arsw.blueprints.filters.Filter;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


public class FiltersTest {
    
    @Test
    public void testFilter() throws BlueprintPersistenceException, BlueprintNotFoundException{
        /**
         * El filtro se encuentra cuando se intenta acceder en blue print services por lo cual si es necesario se pude cambiar el estilo del filtro
         */

        Point[] pts0=new Point[]{new Point(40, 40),new Point(15, 15),new Point(15,15),new Point(16,15),new Point(40,15),new Point(40,50)};

        List<Point> puntosE = new ArrayList<>();
        puntosE.add(new Point(15,15));
        puntosE.add(new Point(16,15));
        puntosE.add(new Point(40,50));

        int putnosAntes = pts0.length;
        Blueprint blueprint = new Blueprint("mark","paintTest",pts0);
        assertTrue(putnosAntes >= blueprint.getPoints().size());

    }

    @Test
    public void testFilter2() throws BlueprintPersistenceException, BlueprintNotFoundException{
        /**
         * Correr con redundancy
         */

        Point[] pts0=new Point[]{new Point(40, 40),new Point(15, 15),new Point(15,15),new Point(16,15),new Point(40,15),new Point(40,50)};

        List<Point> puntosE = new ArrayList<>();
        puntosE.add(new Point(15,15));
        puntosE.add(new Point(16,15));
        puntosE.add(new Point(40,50));

        int putnosAntes = pts0.length;
        Blueprint blueprint = new Blueprint("mark","paintTest",pts0);
        assertTrue(putnosAntes >= blueprint.getPoints().size());
        assertTrue(putnosAntes >= 5);

    }
    


    
}
