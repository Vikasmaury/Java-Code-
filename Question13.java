import java.util.*;
class Question13 
{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		float c = 2;
		
		System.out.println("Enetr width::");	
		double width = sc.nextFloat();
		
		System.out.println("Enetr height::");
       	double height =  sc.nextFloat();		
		
        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.println("Perimeter is:: "+ perimeter);

        System.out.println("Area is:: "+  area);

		


	}
}