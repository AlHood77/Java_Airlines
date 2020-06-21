import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.CESSNA);
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(4, plane.getPlaneCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(200, plane.getWeight());
    }


}
