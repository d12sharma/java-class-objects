class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " more " + itemName + "(s) added to the cart.");
    }

    public void removeItem(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " " + itemName + "(s) removed from the cart.");
        } else {
            System.out.println("Not enough items in the cart to remove.");
        }
    }

    public double totalCost() {
        return price * quantity;
    }

    public void displayCartDetails() {
        System.out.println("Cart Item Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 800.0, 1);
        cart.displayCartDetails();
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayCartDetails();
    }
}