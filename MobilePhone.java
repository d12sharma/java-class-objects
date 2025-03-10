class MobilePhone {
	private String brand;
	private String model;
	private double price;
	public MobilePhone (String brand, String model ,  double price){
		this.brand = brand;
		this.model=model;
		this.price=price;
	}
	public void showDetails (){
		System.out.println("Mobile Brand :"+brand);
		System.out.println("Mobile Model :"+model);
		System.out.println("Mobile Price :"+price);
		
	}
	
	public static void main(String[]args){
		MobilePhone mobile1 = new MobilePhone("One Plus","11 R",40000);
		mobile1.showDetails();
		
		}
}
/*
Ouput 
Mobile Brand :One Plus
Mobile Model :11 R
Mobile Price :40000.0
*/