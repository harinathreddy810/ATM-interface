package Miniproject;

public class AccountHolder {
	private String userid;
	private String userpin;
	
	public AccountHolder(String userid, String userpin) {
		this.userid=userid;
		this.userpin=userpin;
	}

	

	public String getUserid() {
		return userid;
	}

	
	public String getUserpin() {
		return userpin;
	}
  
	public String gettoaccount() {
		return userid;
	}
	public boolean validatePin(String pin) {
		return this.userpin.equals(pin);
	}

}
