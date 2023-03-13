public class Invoice implements Comparable<Invoice>, PayAble {

	private String companyName;
	private Double amount;

	public Invoice() {
		companyName = "No Name";
		amount = 0.0;
	}

	public Invoice(String theName, Double theAmount) {
		companyName = theName;
		if (theName == null || theAmount < 0) {
			System.out.println("Fatal Error creating Invoice.");
			System.exit(0);
		}
		companyName = theName;
		amount = theAmount;
	}

	public Double amountToPay() {
		return this.amount;
	}

	public void printPayment() {
		System.out.println("Payment information for an invoice. Company name: " + this.companyName + "; payment "
				+ amountToPay() + ".");
	}

	public int compareTo(Invoice bill) {
		// return:
		// -1 if self amount is smaller than parameter amount
		// 0 if amounts are equal
		// 1 if self amount is bigger than parameter amount
		if (this.amount < bill.getAmount()) {
			return -1;
		} else if (this.amount == bill.getAmount()) {
			return 0;
		} else if (this.amount > bill.getAmount()) {
			return 1;
		}
		// This case will never be reached but errors otherwise.
		return -1;
	}

	public String getName() {
		return companyName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setName(String newName) {
		if (newName == null) {
			System.out.println("Fatal Error setting invoice name.");
			System.exit(0);
		} else
			companyName = newName;
	}

	public void setAmount(Double newAmount) {
		if (newAmount < 0) {
			System.out.println("Fatal Error setting invoice name.");
			System.exit(0);
		} else
			amount = newAmount;
	}

	public String toString() {
		return companyName + " is owed " + amount;
	}

}
