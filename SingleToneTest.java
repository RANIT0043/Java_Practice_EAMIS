
public class SingleToneTest {

	private static SingleToneTest singletone = null;
	
	private SingleToneTest(){
		
	}
	
	public static synchronized SingleToneTest getSingleToneTestObject(){
		
		if(singletone==null){
			singletone= new SingleToneTest();
		}
		return singletone;
	}
}
