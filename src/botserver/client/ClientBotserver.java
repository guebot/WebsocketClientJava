package botserver.client;

import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import io.socket.IOAcknowledge;
import io.socket.IOCallback;
import io.socket.SocketIO;
import io.socket.SocketIOException;
import botserver.client.message.structure.JSONmessage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;


public class ClientBotserver implements IOCallback{
	private static final String URL_WEBSOCKET ="https://guebot.herokuapp.com:443";
    public static final String MOVEMENT_CHANNEL = "movement";
    public static final String STATUS_CHANNEL = "status";
	private SocketIO socket;
	 
	public ClientBotserver() throws NoSuchAlgorithmException{
		startConnection();
	}
	 
	public void startConnection() throws NoSuchAlgorithmException{
		try {
            SocketIO.setDefaultSSLSocketFactory(SSLContext.getDefault());
            socket = new SocketIO();
            socket.connect(URL_WEBSOCKET, this);

        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	} 
	public void callback(JsonArray data) throws Throwable {}

	public void onMessage(String data, IOAcknowledge ack) {
		// TODO Auto-generated method stub
		
	}

	public void onMessage(JsonElement json, IOAcknowledge ack) {
		// TODO Auto-generated method stub
		
	}

	public void on(String event, IOAcknowledge ack, JsonElement... args) {
		System.out.print("Entra");
		if (event.equals(STATUS_CHANNEL)) {
			//Definir Acción cuando se recibe un cambio de estado
			/*
			 args[0].toString() Contiene el mensaje JSON que retorna el websocket 
			  por el canal status
			 * 
			 */
            System.out.println("Receide "+args[0].toString());
        }
	}

	public void onError(SocketIOException socketIOException) {
		// TODO Auto-generated method stub
		
	}

	public void onDisconnect() {
		// TODO Auto-generated method stub
		
	}

	public void onConnect() {
		// TODO Auto-generated method stub
		
	}

	public SocketIO getSocket() {
		return socket;
	}
	
	
	    
}
