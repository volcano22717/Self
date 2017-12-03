
public class TestSwitch {
	public static void main(String[ ] args) {
	//	System.out.println("aaa");
	double d= Math.random();
	int e=1+(int)(d*6);
		System.out.println(e);
	
	
	switch(e){
	case 6:
	    System.out.println("运气非常好");
	break;
	case 5:
        System.out.println("运气很不错");
    break; 
	case 4:
        System.out.println("运气非常好");
    break;
    default:
    	    System.out.println("运气不好");
    	    break;
	}
	
	}
}
