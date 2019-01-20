
//import java.util.*;
import java.util.Random;

public class ImportSamePackage {

	public static void main(String[] args) {
		// it does not slow down the program! compiler knows what to take 
		// java.lang is automatically imported!!v
		Random r= new Random(); 
		// no need to import Blub because it is in same package
	
		Blub b = new Blub();
		System.out.println(r.nextInt(1000));
	}

}