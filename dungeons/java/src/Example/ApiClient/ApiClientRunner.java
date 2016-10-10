package example.ApiClient;
//version 0.2-OK
//publish-to https://github.com/mardare/rishiri/tree/master/dungeons/java/src/Example/ApiClient
//dependency example.ApiClient.ApiClient and ApiResponse

import java.util.HashMap;

public class ApiClientRunner {

	public static void main(String[] args) {
		
		try {
			
 			ApiResponse r;
			
			//REST
			ApiClient a = new ApiClient("http://192.168.1.2:8280/service2", "/100", 
						new HashMap(){{
							put("Accept", "application/json");
						}});
			
			r = a.doGET();			
			System.out.format ("status %s\nresponse %s\n", r.status, r.content);
			
			//SOAP
			ApiClient b = new ApiClient("https://localhost:8281/services/MockServiceNr1.MockServiceNr1HttpsSoap11Endpoint",  
					new HashMap(){{
						put("Accept", "application/xml");
						put("SOAPAction", "\"urn:mediate\"");
					}});
			
			r = b.doPOST("<xml><note>nothing to write to SOAP about</note></xml>");	
			System.out.format ("status %s\nresponse %s\n", r.status, r.content);
			
		} catch (Throwable e){
		
			System.out.format ("Upsy daisy, something went wrong moment -- %s\n", e.getMessage());
		}

	}

}
