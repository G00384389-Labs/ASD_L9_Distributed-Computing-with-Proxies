package ie.atu.sw;

import java.io.*;
public class Message implements Serializable, RemoteMessage{
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public Message(String message){
		this.msg = message;
	}
	
	
	public String message(){
		return msg;
	}
}