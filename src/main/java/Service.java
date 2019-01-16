import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;

public class Service {

	
	private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

	public Service() {

	}
	
	public void gsonStuff() {
		Gson gson = new Gson();
		String json = gson.toJson(accounts);
	}
	
	public int numberOfAccounts() {
		return accounts.size();
	}
	

	
	private int id = 0;

	public void addPeople(Account acc) {
		id++;
		accounts.put(id, acc);
	}
	
	public void removePeople(String name) {
		getAccounts().remove(name);
	}
	
	public HashMap getHashMap() {
		return this.getAccounts();
	
	}

	public HashMap<Integer, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(HashMap<Integer, Account> accounts) {
		this.accounts = accounts;
	}
	
	
	public int compareNames(String a) {
		int count = 0;
		for (Map.Entry<Integer, Account> entry: accounts.entrySet()) {
			if(entry.getValue().getFirstName().equalsIgnoreCase(a)) {
				count++;
			}
		}
		System.out.println(count);
		return count;
		
	}
	
}
