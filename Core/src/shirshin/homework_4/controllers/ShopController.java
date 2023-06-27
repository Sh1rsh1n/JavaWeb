

public class ShopController {

    private ShopService shopService = null;
    
    private Scanner scanner = null;
    
    public ShopController() {
        shopService = new ShopService();
        scanner = new Scanner(System.in);
    }
    
    public void start() {
        
        while(true) {
        
            System.out.println("Create new order: ");
            
            System.out.println("Write customer phone (format number +71234567890)\n>>> ");
            String customerPhone = scanner.nextLine();
            
            System.out.println("Write product title\n>>> ");
            Strng productTitle = scanner.nextLine();
            
            System.out.println("Write product title\n>>> ");
            int productAmount = Integer.parseInt(scanner.nextLine());
            
            shopService.addOrder(customerPhone, productTitle, productAmount);
            
            System.out.println("Create one more order? Enter 'y', else enter any key");
            Strng input = scanner.nextLine();
            
            if (!input.equalsIgnoreCase("y") {
                  return;
            }
        }
    }
    

}