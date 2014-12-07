package botserver.client;

import java.security.NoSuchAlgorithmException;

import botserver.client.message.structure.JSONmessage;

public class Main {

	 public static void main(String args[]) {
		 ClientBotserver cliente = null;
		try {
			cliente = new ClientBotserver();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //De esta forma se ejecuta un movimiento tienen que colocar el token (opcional), el movimiento UP, DOWN,... y el ultimo va vacio
		 cliente.getSocket().emit(ClientBotserver.MOVEMENT_CHANNEL, JSONmessage.messageMovement("Tokennn", "DOWN", ""));
	 }
	 
}
