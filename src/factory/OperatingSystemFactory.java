package factory;

public class OperatingSystemFactory{

	public OS getInstance(String type) {
		if(type.equals("open")) {
			return new Android();
		}else if(type.equals("closed")) {
			return new IOS();
		}
		return new Windows();
	}

}
