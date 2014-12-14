package menon.cs6100.program1;

import java.util.Comparator;

public class TerrainPointComparator implements Comparator<PointOnTerrain> {
	
	private static final int BEFORE = -1;
	private static final int EQUAL = 0;
	private static final int AFTER = 1;
	
	@Override
	public int compare(PointOnTerrain point1, PointOnTerrain point2) {
		
		if (point1 == null || point2 == null) {
			throw new NullPointerException();
		} else if (point1.getfScore() < point2.getfScore()) {
			return BEFORE;
		} else if (point1.getfScore() > point2.getfScore()) {
			return AFTER;
		} else {
			return EQUAL;
		}
	}

}
