import java.io.IOException;
import java.security.GeneralSecurityException;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;

public class Principal {

	public static void main(String[] args) {
		try {
			System.out.println(new ServiceMePoupe().getVideos(2L));
		} catch (GoogleJsonResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
