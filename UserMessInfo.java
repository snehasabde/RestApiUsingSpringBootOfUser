package in.sp.main.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class UserMessInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private long uId;
	
	@Column
	private long mId;
	
	public long  getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public long getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	
	public long getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	
	
}
