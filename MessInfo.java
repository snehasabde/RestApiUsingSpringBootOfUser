package in.sp.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class MessInfo {

	@Column
	private String m_name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long  m_id;
	
	@Column
	private long mess_owner_mobNo;
	
	@Column
	private String mess_Home_college_delivery;
	
	@Column
	private String mess_addr;
	
	@Column
	private String meal_rate;
	
	@Column
	private String mess_meal_type;
	
	
	
	public String getMess_meal_type() {
		return mess_meal_type;
	}
	public void setMess_meal_type(String mess_meal_type) {
		this.mess_meal_type = mess_meal_type;
	}
	
	
	
	public String getMeal_rate() {
		return meal_rate;
	}
	public void setMeal_rate(String meal_rate) {
		this.meal_rate = meal_rate;
	}
	
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public long getM_id() {
		return m_id;
	}
	public void setM_id(long m_id) {
		this.m_id = m_id;
	}
	
	public long getMess_owner_mobNo() {
		return mess_owner_mobNo;
	}
	public void setMess_owner_mobNo(long mess_owner_mobNo) {
		this.mess_owner_mobNo = mess_owner_mobNo;
	}
	
	public String getMess_Home_college_delivery() {
		return mess_Home_college_delivery;
	}
	public void setMess_Home_college_delivery(String mess_Home_college_delivery) {
		this.mess_Home_college_delivery = mess_Home_college_delivery;
	}
	
	public String getMess_addr() {
		return mess_addr;
	}
	public void setMess_addr(String mess_addr) {
		this.mess_addr = mess_addr;
	}
	
	
	
}
