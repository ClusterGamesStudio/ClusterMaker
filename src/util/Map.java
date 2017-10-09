package util;

import java.util.ArrayList;

public class Map {
	
	public static Vector3[] map = null;
	
	public Map(int SizeX, int SizeY) {
		map = new Vector3[SizeX*SizeY]SizeX;
		for(Vector3 m : map){
			m.X = 0.0;
			m.Y = 0.0;
			m.Z = 0.0;
		}
	}
	
	public static Vector3[] getVector3(){
		return map;
	}
	
	public static void setMap(Vector3[] m){
		map = m;
	}
	
	public static void setMap(Map m){
		map = m.getVector3();
	}

	public static void smooth(){
		for(int i = 0; i < map.length; i++){
			if(map[i].equals(new Vector3())){
				
			}
		}
	}
	/* BlockID-System:
	 *  0 = Block nach links gedreht
	 *  1 = Block mit Ecke links
	 *  2 = Block normal
	 *  3 = Block mit Ecke rechts
	 *  4 = Block nach links gedreht
	 *  
	 *  Man kann nor einen Block im normal stadium setzen der rest geht automatisch!!
	 */
}
