package Zadania;

public class zadanie05 {
	public static void main(String[] args){
        
        // liczby ca³kowite
        
        byte byteSmall = -128;
        byte byteLong = 127;
        
        short shortSmall = -32768;
        short shortLong = 32767;
        
        int intSmall = -2147483648;
        int intLong = 2147483647;
        
        long longSmall = -9223372036854775808L;
        long longLong = 9223372036854775807L;
        
        //liczby rzeczywiste
        
        float floatSmall = 10.f;
       //float floatLong = 10.f;
        
        double doubleSmall = 10.d;
        //double doubleLong = 10.d;
        
        // znaki
        char charSmall = 'a';
        char charLong = 'z';
        
        //logiczne 
        boolean  booleanT = true;
        boolean  booleanF = false; 
       
        System.out.println("Wartosci Calkowite");
        System.out.println("Byte posiada wartosci z przedzialow od: " +byteSmall+ " do: " +byteLong);
        System.out.println("Short posiada wartosci z przedzialow od: "+shortSmall+" do: "+shortLong);
        System.out.println("Int posiada wartosci z przedzialow od: "+intSmall+" do: "+intLong);
        System.out.println("Long posiada wartosci z przedzialow od: "+longSmall+" do: "+longLong);
        
        System.out.println("Wartosci rzeczywiste takie jak float mog¹ przybieraæ wartosci o pojedynczej prezycji jak: "+floatSmall+ 
                "lub wartosci o podwojnej precyzji takie jak double: "+doubleSmall+ " w tym przypadku dla inta = 10");
        System.out.println("Char mo¿e przybierac rozne wartosci liczbowe dla przykladu: "+charSmall+" do: np: "+charLong);
        System.out.println("Boolean to wartosc logiczna wiec mozemy miec albo: "+booleanT+" lub "+booleanF);
    }
}
