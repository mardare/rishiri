package example.ApiClient;

public class ApiResponse {
	public StringBuilder content;
	public int status; 
	
	public ApiResponse (final StringBuilder reponse){
		content=reponse;
	}
	
	public ApiResponse (int statusCode){
		status = statusCode;
	}
	
}
