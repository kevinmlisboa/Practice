public class PaymentApp {
    public static void main(String[] args){
        Order gcash = new Order("keyboard", 10, 300.0, new Gcash());
        System.out.println("Order item is " + gcash.getItem() + ".");
        System.out.println("Unit price is " + gcash.getUnitPrice());
        System.out.println("Quantity is " + gcash.getQuantity());

        System.out.println("\nPayment order details if " + gcash.getMode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + gcash.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + gcash.getTotalAmount());

        Order gcash
        System.out.println("Payment order details if " + payMaya.getMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getMode().determineDiscountRate());
        System.out.println("Payment amount is ");

        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount Rate is " + order.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + (order.getTotalAmount()*order.getMode().determineDiscountRate()));
        */



    }
}
