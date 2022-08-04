package demos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class Test05HttpClient {
	public static void main(String[] args) throws Exception {
		//Creating HTTP Client for making Request and Returning Response
		HttpClient httpClient = HttpClient.newBuilder().version(Version.HTTP_1_1).connectTimeout(Duration.ofSeconds(10)).build();
		
		HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("http://www.google.com")).build();
		
		//HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		HttpResponse<Path> httpResponse = httpClient.send(httpRequest, BodyHandlers.ofFile(Paths.get("d://javawork/google.html")));
		System.out.println(httpResponse.body());
		
	}
}
