public class TrianglePattern {

	public static void main(String[] args) {

		System.out.println("Welcome friend. We are displaying patterns of triangle");
			
			int vertical;
			int horizontal;
		
		for(vertical = 1; vertical <= 10; vertical++) {

			for(horizontal = 0; horizontal < vertical; horizontal++) {
				System.out.print("*");
}
			System.out.println(" ");	

} 

			System.out.println(" ");
		

		for(vertical = 10; vertical >= 1; vertical--) {

			for(horizontal = 0; horizontal < vertical; horizontal++) {
				System.out.print("*");

} 
			System.out.println(" ");

}  

			System.out.println(" ");


		for(vertical = 1; vertical <= 10; vertical++) {
			
			for(horizontal = 0; horizontal < vertical; horizontal++) {
				System.out.print(" ");
				
}			for(horizontal = 10; horizontal > vertical; horizontal--) {
				System.out.print("*");
}
			
			System.out.println(" ");
			
}
			System.out.println(" ");

		
		for(vertical = 10; vertical >=1 ; vertical--) {
			
			for(horizontal = 0; horizontal < vertical; horizontal++) {
				System.out.print(" ");
				
}			for(horizontal = 10; horizontal >= vertical; horizontal--) {
				System.out.print("*");
}
			
			System.out.println(" ");
			
}
			System.out.println(" ");

}
} 