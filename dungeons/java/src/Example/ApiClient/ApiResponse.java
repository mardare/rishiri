package example.ApiClient;
//version 0.2-OK
//publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/Example/ApiClient
//dependency example.ApiClient.ApiClient


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
