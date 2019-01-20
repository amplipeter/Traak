package packageb;

import java.util.*;
import packagea.*;

//import packagea.PackageAClass;

public class TwoPackages {

	public static void main(String[] args) {
		Random r= new Random(); 
	
		PackageAClass a = new PackageAClass();
		System.out.println(r.nextInt(1000));
	}

}