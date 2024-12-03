package ie.atu.sw;
import java.rmi.Naming;
public class MessageClient {
	public static void main(String[] args) throws Exception{
		
		//Ask the registry running on 10.2.2.65 and listening in port 1099 for the instannce of
		//the MessageService object that is bound to the RMI registry with the name ATUMessageService.
		MessageService ms = (MessageService) Naming.lookup("rmi://127.0.0.1:1099/ATUMessageService");
		
		//Make the remote method invocation. This results in the Message object being transferred
		//to us over the network in serialized form. 
		RemoteMessage message = ms.getMessage();
		
		//Print out the message from the message object.c
		System.out.println(message.message());
		
		System.out.println("message "+message);
		System.out.println(ms);
		System.out.println(ms instanceof MessageService);
		System.out.println(ms.getClass().getName());
	}
}
