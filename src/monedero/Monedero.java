package monedero;

public class Monedero {
		int Monedero=0,sacarDinero,cantidadDinero=0;

	public static void main(String[] args) {
		int cantidadDinero = 100;
		int Monedero = cantidadDinero;
		int sacarDinero= 50;
		int dineroDisponible = Monedero - sacarDinero;
         
       
        if(Monedero > sacarDinero ) {
           
            System.out.println("El resultado es : " + dineroDisponible);
        }  else   {
             System.out.println("Error");
        }
		
	
}

}
