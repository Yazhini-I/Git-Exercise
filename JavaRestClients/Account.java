package JavaRestClients;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;

public class Account {
	
//	Create a simple POJO class called Account with members "AccountNumber", "AccountType", 
	//"BalanceAmount" and "BankName" with setters and getters.
//    In main method create few objects of Account and convert it to JSON and print the same.
	
	long  AccountNumber;
	String AccountType,BankName;
	int BalanceAmount;
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public int getBalanceAmount() {
		return BalanceAmount;
	}
	public void setBalanceAmount(int balanceAmount) {
		BalanceAmount = balanceAmount;
	}
	public static void main(String[] args) throws IOException {
		
		Account holder1=new Account();
		holder1.setAccountNumber(50000001);
		holder1.setAccountType("Savings");
		holder1.setBankName("SBI");
		holder1.setBalanceAmount(5000);
		
		Account holder2=new Account();
		holder2.setAccountNumber(50000002);
		holder2.setAccountType("Salary");
		holder2.setBankName("Indian Bank");
		holder2.setBalanceAmount(50000);
		Account holder3=new Account();
		holder3.setAccountNumber(50000003);
		holder3.setAccountType("Savings");
		holder3.setBankName("CUB");
		holder3.setBalanceAmount(15000);
		ArrayList <Account>list=new ArrayList<Account>();
		list.add(holder1);	
		list.add(holder2);	
		list.add(holder3);	
		
		
		ObjectMapper objectmapper=new ObjectMapper();
		objectmapper.writeValue(new File("accountHolderJSON.json"), list);
		String accountHolderJSON=objectmapper.writeValueAsString(list);
		System.out.println(accountHolderJSON);
		
//		ObjectMapper objectmapper=new ObjectMapper();
//		objectmapper.writeValue(new File("accountHolderJSON.json"), holder1);
//		String accountHolderJSON=objectmapper.writeValueAsString(holder1);
//		System.out.println(accountHolderJSON);
//		
		
	}
	

}
