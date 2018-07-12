package by.epam.anastasiya.hometask8;

public class BankAccount {

	public String  accountType;
	public String ownerName;
	public double amount;
	Currency currency;
	
	public BankAccount (String ownerName, String accountType, double amount, Currency currency)
	{
		this.ownerName = ownerName;
		this.accountType=accountType;
		this.amount = amount;
		this.currency = currency;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getAmount() {
		return amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountType == null) ? 0 : accountType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = 33* prime * result
				+ ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		if (currency != other.currency)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BankAccount [accountType=" + accountType + ", ownerName="
				+ ownerName + ", amount=" + amount + ", currency=" + currency
				+ "]";
	}
	
}
