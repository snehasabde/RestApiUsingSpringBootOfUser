package in.sp.main.UserInfoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.UserMessInfoRepositories.UserMessRepository;
import in.sp.main.entities.UserMessInfo;

@Service
public class UserMessInfoImpl implements UserMessInfoService {

	@Autowired
	private UserMessRepository userMessRepository;
	
	@Override
	public UserMessInfo createUserMessInfo(UserMessInfo usermessInfo) {
		
		return userMessRepository.save(usermessInfo);
	}

	@Override
	public List<UserMessInfo> getAllUserMessInfo() {
		
		return userMessRepository.findAll();
	}

	@Override
	public Optional<UserMessInfo> getUserMessDetails(int id) {
		
		return userMessRepository.findById((long) id);
	}

	@Override
	public UserMessInfo updateUserMessDetails(int id, UserMessInfo newUsermessInfo) {
		
		UserMessInfo userMessData = userMessRepository.findById((long) id).orElse(null);
		
		if(userMessData != null ) {
			return userMessRepository.save(newUsermessInfo);
		}
		else {
		throw new RuntimeException("User Not Found with Id : " + id);	
		}
	}

	@Override
	public void deleteUserMessDetails(int id) {
	
		userMessRepository.deleteById((long) id);
	}

}
