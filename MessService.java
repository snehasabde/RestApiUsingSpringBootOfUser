package in.sp.main.messService;

import java.util.List;
import java.util.Optional;

import in.sp.main.entities.MessInfo;

public interface MessService {

	public MessInfo createMessInfo(MessInfo messIn);
	public List<MessInfo> getAllMessInfo();
	public Optional<MessInfo> getMessDetails (long id);
	public MessInfo updateMessDetails(long id , MessInfo messIn);
	public void deleteMessData (long id);
	
}
