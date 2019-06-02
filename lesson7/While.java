public class While{
	public static void main(String[] args) {
		byte count = 0;
while (count <= 100){
System.out.println (count);
count++;
}
 
        byte count1 = 0;
while (count1 <= 50){
byte count2 = 0;
while (count2 % 2 == 0) {
System.out.println (count2);
++count2 ;
}
++count1 ;
}
         byte count3 = 50;
while (count3 <= 100){
byte count4 = 50;
while (count4 % 2 != 0) {
System.out.println (count4);
count4++ ;
}
count3++ ;
}


	}
}