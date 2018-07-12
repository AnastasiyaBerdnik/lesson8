package by.epam.anastasiya.hometask8;

public class MainAcc {
	public static void main (String[] args) {
		BankAccount b1 = new BankAccount("Ivanov", "Deposit", 1250, Currency.USD);
		BankAccount b2 = new BankAccount("Ivanov", "Deposit", 1240, Currency.RYB);
		BankAccount b3 = new BankAccount("Ivanov", "Deposit", 1250, Currency.USD);
		if (b1.equals(b2)){
			System. out .println("true b1=b2");
			}
		else {System.out.println("false b1!=b2");
		}
		if (b2.equals(b3)){
			System. out .println("true b2=b3");
			}
		else {System.out.println("false b2!=b3");
		}
		if (b1.equals(b3)){
			System. out .println("true b1=b3");
			}
			else {System.out.println("false b1!=b3");
			}
	        System.out.println(b1.hashCode());
			System.out.println(b2.hashCode());
			System.out.println(b3.hashCode());
			}
		
	}


