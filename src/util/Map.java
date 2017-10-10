package util;

import java.util.ArrayList;

public class Map {

	public static Vector3[] map = null;

	public Map(int SizeX, int SizeY) {
		map = new Vector3[SizeX * SizeY];
		for (Vector3 m : map) {
			m.X = 0.0;
			m.Y = 0.0;
			m.Z = 0.0;
		}
	}

	public static Vector3[] getVector3() {
		return map;
	}

	public static void setMap(Vector3[] m) {
		map = m;
	}

	public static void setMap(Map m) {
		map = m.getVector3();
	}

	public static void smooth() {
		for (int i = 0; i < map.length; i++) {
			if (map[i - 1] != map[i] && map[i + 1] == map[i]) {
				map[i].Z -= 1;
			} else if (map[i + 1] != map[i] && map[i - 1] == map[i]) {
				map[i].Z += 1;
			}
		}
	}

	// BlockID-System:
	// -1 = Block mit Ecke links
	// +-0 = Block normal
	// +1 = * Block mit Ecke rechts
	//
	// Man kann nor einen Block im normal stadium setzen der rest geht
	// automatisch!!

}
