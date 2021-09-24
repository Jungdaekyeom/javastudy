package Keyboard;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamTest {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)); 

	}

}
