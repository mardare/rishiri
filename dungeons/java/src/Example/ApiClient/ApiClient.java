package example.ApiClient;
//version 0.2-NOK 'Remote host closed connection during handshake' line 62 via doPOST
//publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/Example/ApiClient
//dependency example.ApiClient.ApiResponse

import java.util.HashMap;

import java.io.*; 
import java.net.*;

public class ApiClient {
	
	private URL url; 
	private HttpURLConnection httpCon; 
	
	private final String USER_AGENT = "ibol-smokie";
	

	private OutputStream httpConWritter;
	
	public ApiClient(String url) throws MalformedURLException, IOException{
		
		httpCon= (HttpURLConnection) new java.net.URL(url).openConnection();
		httpCon.setDoOutput(true);
		httpCon.setRequestProperty("User-Agent", USER_AGENT);
	}
	
	public ApiClient(String url, HashMap<String, String> headers) throws MalformedURLException, IOException{	
		
		this(url);
		
		for (String key: headers.keySet()){
			httpCon.setRequestProperty(key, headers.get(key));
		}
	}
	
	public ApiClient (String url, String rawQueryString, HashMap<String, String> headers) throws MalformedURLException, IOException {
		this(url+rawQueryString, headers);
	}
	
	public ApiResponse doGET () throws IOException{
		
		httpCon.setRequestMethod("GET");
		
		return doHTTP();		
	}

	public ApiResponse doPOST (String rawBody) throws IOException{
		
		httpCon.setRequestMethod("POST");
		
		OutputStream writter = httpCon.getOutputStream();
		writter.write(rawBody.getBytes());
		writter.flush();
		
		return doHTTP();	
	}
	
	public ApiResponse doHTTP () throws IOException{
		
		//initiate connection
		ApiResponse re = new ApiResponse(httpCon.getResponseCode());
		//read full response
		re.content=ApiResponseReader();
		
		return re;	
	}
	
	private StringBuilder ApiResponseReader() throws IOException{
		
		BufferedReader httpConReader = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
		StringBuilder re = new StringBuilder();
		
		String line;
		while ((line = httpConReader.readLine())!=null){
			re.append(line.trim());
		}

		httpCon.disconnect();
		httpConReader.close();
			
		return re;
	}

}
 