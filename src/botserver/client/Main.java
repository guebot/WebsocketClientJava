package botserver.client;

import botserver.client.message.structure.JSONmessage;

public class Main {

	 public static void main(String args[]) {
		 ClientBotserver cliente = new ClientBotserver();
		 //De esta forma se ejecuta un movimiento tienen que colocar el token (opcional), el movimiento UP, DOWN,... y el ultimo va vacio
		 cliente.getSocket().emit(ClientBotserver.MOVEMENT_CHANNEL, JSONmessage.messageMovement("Tokennn", "DOWN", ""));
	 }
	 
}
