package botserver.client;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import botserver.client.message.structure.JSONmessage;

public class Main {

	 public static void main(String args[]) {
		 ClientBotserver cliente = null;
		 boolean activo = false;
	 	 int opcion;
	 	 
	 	Scanner capt = new Scanner(System.in);
	 	
	 	
		try {
			cliente = new ClientBotserver();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(!activo){
			System.out.println("¿Qué mensaje quiere envia? ");
			System.out.println("1. Subir");
			System.out.println("2. Bajar");
			System.out.println("3. Abrir");
			System.out.println("4. Cerrar");
		 
			opcion  = capt.nextInt();
			
			
			
			switch (opcion) {
			case 1:
				//De esta forma se ejecuta un movimiento tienen que colocar el token (opcional), el movimiento DOWN y el ultimo va vacio
				 cliente.getSocket().emit(ClientBotserver.MOVEMENT_CHANNEL, JSONmessage.messageMovement("Opcion1", "UP", ""));
				break;
			case 2:
				//De esta forma se ejecuta un movimiento tienen que colocar el token (opcional), el movimiento UP y el ultimo va vacio
				 cliente.getSocket().emit(ClientBotserver.MOVEMENT_CHANNEL, JSONmessage.messageMovement("Opcion2", "DOWN", ""));
				break;
			case 3:
				//De esta forma se ejecuta un movimiento tienen que colocar el token (opcional), el movimiento OPEN y el ultimo va vacio
				 cliente.getSocket().emit(ClientBotserver.MOVEMENT_CHANNEL, JSONmessage.messageMovement("Opcion3", "OPEN", ""));
				break;
			case 4:
				//De esta forma se ejecuta un movimiento tienen que colocar el token (opcional), el movimiento CLOSE y el ultimo va vacio
				 cliente.getSocket().emit(ClientBotserver.MOVEMENT_CHANNEL, JSONmessage.messageMovement("Opcion4", "CLOSE", ""));
				break;

			default:
				break;
			}
			
		}
		 
	 }
	 
}
