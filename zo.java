import java.util.Scanner;
public class zo{
	public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		double d;
		String m;
		String nombre;
		System.out.println("ingrezar nombre");
		nombre = in.nextLine();
		System.out.println("Zignos del zodiaco ");
		System.out.println("Ingresa tu dia de nacimiento ");
		d = in.nextDouble();
		in.nextLine();
		System.out.println("Ingresa tu mes de nacimiento ");
		m = in.nextLine();
		
		
		if ((d>=22 && m== "marzo") || (d<=21 && m == "abril")) {
			System.out.println(" Aries");
				System.out.println(nombre);
			System.out.println(" Somos dueños de nuestro destino. Somos capitanes de nuestra alma.");
		}
		if ((d>=22 && m=="abril") || (d<=21 && m=="mayo")) {
			System.out.println(" Tauro");
			System.out.println(nombre);
			System.out.println(" Para triunfar simplemente hay que llegar, levantándose cada vez que se cae en el camino.");
		}
		if ((d>=22 && m=="mayo") || (d<=21 && m=="junio")) {
			System.out.println(" Geminis");
				System.out.println(nombre);
			System.out.println(" Somos dueños de nuestro destino. Somos capitanes de nuestra alma.");
		}
		if ((d>=22 && m=="junio") || (d<=21 && m=="julio")) {
			System.out.println(" Cancer");
				System.out.println(nombre);
			System.out.println(" Nuestra gloria más grande no consiste en no haberse caido nunca, sino en haberse levantado después de cada caída. ");
		}
		if ((d>=22 && m=="julio") || (d<=21 && m=="agosto")) {
			System.out.println(" Leo");
				System.out.println(nombre);
			System.out.println(" Las oportunidades no son producto de la casualidad, mas bien son resultado del trabajo.");
		}
		if ((d>=22 && m=="agosto") || (d<=21 && m=="septiembre")) {
			System.out.println(" Virgo");
				System.out.println(nombre);
			System.out.println(" No existe la casualidad solo lo inevitable.");
		}
		if ((d>=22 && m=="septiembre") || (d<=21 && m=="octubre")) {
			System.out.println(" Libra");
				System.out.println(nombre);
			System.out.println(" Los sueños no tienen fecha de caducidad.");
		}
		if ((d>=22 && m=="octubre") || (d<=21 && m=="noviembre")) {
			System.out.println(" Escorpion");
				System.out.println(nombre);
			System.out.println(" Mientras tu dices que es imposible alguien ya lo esta haciendo.");
		}
		if ((d>=22 && m=="noviembre") || (d<=21 && m=="diciembre")) {
			System.out.println(" Sagitario");
				System.out.println(nombre);
			System.out.println(" Sonríe hoy, puede que mañana tengas los dientes sucios.");
		}
		if ((d>=22 && m=="diciembre") || (d<=21 && m=="enero")) {
			System.out.println(" Capricornio");
			System.out.println(nombre);
			System.out.println(" Nunca es demasiado tarde para luchar por aquello que es importante en tu vida.");
		}
		if ((d>=22 && m=="enero") || (d<=21 && m=="febrero")) {
			System.out.println(" Acuario");
				System.out.println(nombre);
			System.out.println(" Las mentiras mas grandes son: Nunca y Siempre.");
		}
		if ((d>=22 && m=="febrero") || (d<=21 && m== "marzo"))
			{
			System.out.println(" Piscis");
				System.out.println(nombre);
			System.out.println(" El pasado es experiencia, que el presente aprovecha y el futuro perfecciona.");
		}
		System.out.println("****Gracias por tu consulta****");
	in.close();
	}


}


		
	
