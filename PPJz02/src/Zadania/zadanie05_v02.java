package Zadania;

public class zadanie05_v02 {
	public static void main(String[] args) {
		
		// Skrypt podpatrzony w necie, z za³o¿enia wystarczy³a Max_Value
		
		pokazRozmiar(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		pokazRozmiar(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		pokazRozmiar(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		pokazRozmiar(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		pokazRozmiar(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		pokazRozmiar(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		pokazRozmiar(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
	}
    
    public static void pokazRozmiar(Class<?> type, int size, Number min, Number max) {
		System.out.printf("TYP :%-6s Rozmiar:%-2s min:%-20s max:%s\n", type, size, min, max);
	}
}
