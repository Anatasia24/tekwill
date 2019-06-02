public class loops{
   public static void main(String[] args) {
		for(byte num =0;num <=40; num += 8){
			System.out.println(num);
		}
	    byte num2=0;
	    while(num2<=40){
	    	System.out.println(num2);
	    	num2 +=8;
	    }
	    byte num3= -8;
	    do{
	    	 num3 +=8;
	    	 System.out.println(num3);}
	    while(num3<=32);
	}
}