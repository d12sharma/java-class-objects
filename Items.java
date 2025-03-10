class Items {
	private int itemCode;
	private String itemName;
	private double price;
	public Items (int itemCode, String itemName , double price){
		this.itemCode = itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	public void showDetails (){
		System.out.println("Item Code :"+itemCode);
		System.out.println("Item Name :"+itemName);
		System.out.println("Price :"+price);
		
	}
	public double calculatePrice(int quantity){
		return price*quantity;
	}
	public static void main(String[]args){
		Items item1 = new Items(5,"Biscuit",100);
		item1.showDetails();
		System.out.println("The cost for 5 units :"+item1.calculatePrice(5));
		}
}

/*
Output
Item Code :5
Item Name :Biscuit
Price :100.0
The cost for 5 units :500.0
*/