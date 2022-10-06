package serializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.txurdi.persistencia.pojo.Persona;

/**
 * Programa que escribe 3 objetos de tipo persona en el fichero
 * personas-serializadas.dat
 * 
 * @author ik_jav
 *
 */
public class Serial1 {
	public static void main(String[] args) {
	
		
		try(
				FileOutputStream fos = new FileOutputStream("personas-serializadas.dat");
				ObjectOutputStream salida = new ObjectOutputStream(fos);
				)
		
		{
			
//Se crea el fichero
			
//Se crea el primer objeto Persona
			Persona p = new Persona("Lucas González", 30);
			
//Se escribe el objeto en el fichero
			salida.writeObject(p);
			
//Se crea el segundo objeto Persona
			p = new Persona("Anacleto Jiménez", 28);
			
//Se escribe el objeto en el fichero
			salida.writeObject(p);
//Se crea el tercer objeto Persona
			p = new Persona("María Zapata", 35);
//Se escribe el objeto en el fichero
			salida.writeObject(p);
		} catch (FileNotFoundException e) {
			System.out.println("1" + e.getMessage());
		} catch (IOException e) {
			System.out.println("2" + e.getMessage());
		}
	}
}
