package chapter2;

public class Variable1 {

	public static void main(String[] args) {
		final int MY_AGE = 22;
		System.out.println(MY_AGE);
		int AN_AGE;
		for(AN_AGE = 23; AN_AGE<=50; AN_AGE++){
			if(AN_AGE%12==0){
				System.out.println("12 times someting age is" + AN_AGE);
			}
			else{
				continue;
			}
		}
		
	}

}
