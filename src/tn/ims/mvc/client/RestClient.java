package tn.ims.mvc.client;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import tn.ims.mvc.model.Contact;

public class RestClient {

	private static String url="http://localhost:8080/Client-Serveur-REST/contacts";

	public static void main(String[] args) {
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.postForObject(url, new Contact("dfjdss","dsjkdq","alpha.blondy@gmail.com"), Contact.class);
		restTemplate.postForObject(url, new Contact("dsjqs","fjdfds","dhsjdsh@yopmail.com"), Contact.class);
		
		Contact[] contacts= restTemplate.getForObject(url, Contact[].class);
		System.out.println(Arrays.deepToString(contacts));
	}
}
