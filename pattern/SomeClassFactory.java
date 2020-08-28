package pattern;
import ca.DefaultValue;
import main.SomeClass;

public class SomeClassFactory {

	 @SuppressWarnings("unused")
	public static SomeClass getObject() throws Exception {
		 
	        SomeClass sc = new SomeClass();

	        java.lang.reflect.Field f = SomeClass.class.getDeclaredField("xyz");
	        Integer av = f.getAnnotation(DefaultValue.class).value();
	        if (av != null) {
	            sc.setXyz(av);
	            return sc;
	        } else {
	            throw new Exception("The field does not exist in the class");
	        }
	    }

}
