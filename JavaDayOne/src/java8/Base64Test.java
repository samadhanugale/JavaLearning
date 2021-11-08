package java8;


import java.net.URL;
import java.util.Base64;

public class Base64Test {
	public static void main(String[] args) {
		String msg = "Welcome here!";
		Base64.Encoder encoder = Base64.getEncoder();
		String encodeMsg = encoder.encodeToString(msg.getBytes());
		System.out.println("Encode Msg : "+encodeMsg);
		
		Base64.Decoder decoder = Base64.getDecoder();
		String decodeMsg = new String(decoder.decode(encodeMsg));
		System.out.println("Decoded Msg : "	+decodeMsg);
		
		//String url = "https://www.neosofttech.com/technologies/java";
		//URL url1 = new URL(url);
		String url1 = "https://employee.neosofttech.com/work-from-home/task";
		System.out.println("Original Url : "+url1);
		//Encoding
		Base64.Encoder urlEncoder = Base64.getUrlEncoder();
		String encodeUrl = urlEncoder.encodeToString(url1.toString().getBytes());
		System.out.println("Encode URL : "+encodeUrl);
		
		//Decoding
		Base64.Decoder urlDecoder = Base64.getUrlDecoder();
		String decodeUrl = new String(urlDecoder.decode(encodeUrl));
		System.out.println("Decoded Url : "+decodeUrl);
		
		
		
	}
}
