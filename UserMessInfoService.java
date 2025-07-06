package in.sp.main.UserInfoService;

import java.util.List;
import java.util.Optional;

import in.sp.main.entities.UserMessInfo;

public interface UserMessInfoService {

	public UserMessInfo createUserMessInfo(UserMessInfo usermessInfo);
	public List<UserMessInfo> getAllUserMessInfo();
	public Optional <UserMessInfo>getUserMessDetails(int id);
	public UserMessInfo updateUserMessDetails(int id , UserMessInfo usermessInfo);
	public void deleteUserMessDetails(int id);
	
}
