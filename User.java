package in.sp.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int uid;
	
	@Column
	private String u_name;
	
	@Column
	private String address;
	
	@Column
	private String user_meal_choice;
	
	@Column
	private int mobNo;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getUser_meal_choice() {
		return user_meal_choice;
	}
	public void setUser_meal_choice(String user_meal_choice) {
		this.user_meal_choice = user_meal_choice;
	}
	
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	
	
}
