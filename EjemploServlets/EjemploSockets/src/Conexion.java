import java.net.*;
import java.io.*;

public class Conexion {
	
	final int PUERTO=5000;
	ServerSocket sc;
	Socket so;
	DataOutputStream salida;
	String mensajeRecibido;
	
	//SERVIDOR
	public void initServer()
	{
		BufferedReader entrada;
		try
		{
			sc = new ServerSocket(PUERTO);//crea socket servidor que escuchara en puerto 5000
			so = new Socket();
			System.out.println("Esperando una conexión:");
			so = sc.accept();//Inicia el socket, ahora esta esperando una conexión por parte del cliente.
			
			System.out.println("Un cliente se ha conectado.");
			
			//Canales de entrada y salida de datos
			entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
			salida = new DataOutputStream(so.getOutputStream());
			System.out.println("Confirmando conexion al cliente....");
			salida.writeUTF("Conexion exitosa... envia un mensaje al servidor: ");
			
			//Recepcion de mensaje
			mensajeRecibido = entrada.readLine();
			//esto lo estamos escribiendo en nuestro server
			System.out.println(mensajeRecibido);
			//otra vez le estoy hablando al cliente.
			salida.writeUTF("Se recibio tu mensaje. Terminando conexion...");
			salida.writeUTF("Gracias por conectarte.");
			
			//de nuestro lado otra vez
			System.out.println("Cerrando conexión...");
			
			sc.close();//Aqui se cierra la conexión con el cliente
			
		}catch(Exception e )
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

}
