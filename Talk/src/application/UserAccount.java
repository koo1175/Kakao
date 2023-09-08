package application;

public class UserAccount {
	   private static UserAccount instance;
	   private String uid;

	   private UserAccount() {
	   }

	   public static synchronized UserAccount getInstance() {
	      if (instance == null) {
	         instance = new UserAccount();
	      }
	      return instance;
	   }

	   public String getUid() {
	      return uid;
	   }

	   public void setUid(String uid) {
	      this.uid = uid;
	   }

	   public void clearUserUid() {
	      uid = null;
	   }
	}