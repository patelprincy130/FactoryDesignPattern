package factory;

public class MainFactory {

	public static void main(String[]args) {
		
		//this is visible to clients, we are showing implementation to client
		OS obj=new Android();
		obj.title();
		
		//Factory- hide implementation from client, loose coupling, we are not creating objs rather we ask factory to create objs for us.
		OperatingSystemFactory obj2=new OperatingSystemFactory();
		OS prod=obj2.getInstance("closed");
		prod.title();
	}
}
