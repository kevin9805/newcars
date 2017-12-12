import java.util.Scanner;


import javax.net.ssl.ExtendedSSLSession;
public class zo1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        double d;
        String m;
        String nombre;
        
        System.out.println("ingrezar nombre");
        nombre = in.nextLine();

        System.out.println("Zignos del zodiaco ");
        System.out.println("Ingresa tu dia de nacimiento ");
        d = in.nextDouble();
        in.nextLine(); //This is needed to pick up the new line

        System.out.println("Ingresa tu mes de nacimiento ");
        m = in.nextLine();        
    
        in.close(); 
        
        System.out.println( nombre );
        System.out.println( d );
        System.out.println( m );

	}
}	