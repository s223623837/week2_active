package decisiontable;

public class SimpleLoginForm {
	 private static final String FIXED_USERNAME = "admin";
	    private static final String FIXED_PASSWORD = "password123";

	    public static String login(String username, String password) {
	        // Check if the provided credentials match the fixed credentials
	        if (username.equals(FIXED_USERNAME) && password.equals(FIXED_PASSWORD)) {
	            return "success"; // Credentials match, return success
	        } else {
	            return "failure"; // Credentials do not match, return failure
	        }
	    }
}
