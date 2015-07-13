/*



Suppose a class GroceryBill keeps track of a list of items being purchased at a market:
Method/Constructor 	Description
public GroceryBill(Employee clerk) 	constructs a GroceryBill object for the given clerk
public void add(Item i) 	adds i to this bill's total
public double getTotal() 	returns the cost of these items
public void printReceipt() 	prints a list of items

GroceryBill objects interact with Item objects. An Item has the following public methods:
Method/Constructor 	Description
public double getPrice() 	returns the price for this item
public double getDiscount() 	returns the discount for this item

For example, a candy bar item might cost 1.35 with a discount of 0.25 for preferred customers, meaning that preferred customers get it for 1.10. (Some items will have no discount, 0.0.) Currently the above classes do not consider discounts. Every item in a bill is charged full price, and item discounts are ignored.

Define a class DiscountBill that extends GroceryBill to compute discounts for preferred customers. The constructor for DiscountBill accepts a parameter for whether the customer should get the discount.

Your class should adjust the amount reported by getTotal for preferred customers. For example, if the total would have been $80 but a preferred customer is getting $20 in discounts, then getTotal should report the total as $60 for that customer. You should also keep track of how many items a customer is getting a non-zero discount for and the overall discount, both as a total amount and as a percentage of the original bill. Include the extra methods below that allow a client to ask about the discount:
Method/Constructor 	Description
public DiscountBill(Employee clerk, boolean preferred) 	constructs discount bill for given clerk
public int getDiscountCount() 	returns the number of items that were discounted, if any
public double getDiscountAmount() 	returns the total discount for this list of items, if any
public double getDiscountPercent() 	returns the percent of the total discount as a percent of what the total would have been otherwise

If the customer is not a preferred customer the DiscountBill behaves at all times as if there is a total discount of 0.0 and no items have been discounted.
Related Files:

    GroceryBill.java

*/


public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int numDiscounted;
    private double discount;

    public DiscountBill(Employee clerk, boolean preferred) {
	super(clerk);
	this.preferred = preferred;
	this.numDiscounted = 0;
	this.discount = 0;
    }

    @Override
    public void add(Item i) {
	if (preferred && i.getDiscount() > 0.0) {
	    numDiscounted++;
	    discount += i.getDiscount();
	}
	super.add(i);
    }

    @Override
    public double getTotal() {
	return super.getTotal() - discount;
    }
    
    public int getDiscountCount() {
	return numDiscounted;
    }

    public double getDiscountAmount() {
	return discount;
    }

    public double getDiscountPercent() {
	return (discount * 100) / super.getTotal();
    }
}

