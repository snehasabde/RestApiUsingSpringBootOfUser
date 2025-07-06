package in.sp.main.messService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.MessInfo;
import in.sp.main.messRepositories.MessRepository;

@Service
public class MessServiceImpl implements MessService {

	@Autowired
	private MessRepository messRepository;
	
	@Override
	public MessInfo createMessInfo(MessInfo messIn) {
		
		return messRepository.save(messIn);
	}

	@Override
	public List<MessInfo> getAllMessInfo() {
	
		return messRepository.findAll();
	}

	@Override
	public Optional<MessInfo> getMessDetails(long id) {
		
		return messRepository.findById((long) id);
	}

	@Override
	public MessInfo updateMessDetails(long id, MessInfo newMessIn) {
		
		MessInfo messData = messRepository.findById((long) id).orElse(null);
		
		if(messData != null) {
			return messRepository.save(newMessIn);
		}
		else {
		 throw new RuntimeException("Mess Data not found with id : " + id);
	    }
	}

	@Override
	public void deleteMessData(long id) {
		messRepository.deleteById((long) id);
		
	}

}
