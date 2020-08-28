package main;

import pattern.SomeClassFactory;

public class Application {

	public static void main(String[] args) {
		
		
		try {
			SomeClass a = SomeClassFactory.getObject();
			System.out.println(a.getXyz());
		} catch (Exception e) {
			e.printStackTrace();
		}
        
		}


	}

