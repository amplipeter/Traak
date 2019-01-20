//import java.util.*;
import java.util.Random;

public class ImportSamePackage {

	public static void main(String[] args) {
		// it does not slow down the program! compiler knows what to take 
		// java.lang is automatically imported!!v
		Random r= new Random(); 
		
		System.out.println(r.nextInt(1000));
	}

}