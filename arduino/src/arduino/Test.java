package arduino;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("working");
	}

}
