public class Teachback1 {
    public static void main(String[] args) {
    	
    	char action = 'A'; // Example action input

    	switch (action) {
    	    case 'A':
    	        System.out.println("go Left");
    	        break;
    	    case 'D':
    	        System.out.println("go Right");
    	        break;
    	    case 'W':
    	        System.out.println("hop");
    	        break;
    	    case 'S':
    	        System.out.println("lay down");
    	        break;
    	    default:
    	        System.out.println("Invalid action");
    	}
} 
}