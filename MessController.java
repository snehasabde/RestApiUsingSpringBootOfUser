package in.sp.main.MessController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entities.MessInfo;
import in.sp.main.entities.User;
import in.sp.main.messService.MessService;
import in.sp.main.service.UserService;


@RestController
@CrossOrigin(origins = "*")
public class MessController {

	@Autowired
	private MessService messService;
	
	
	@PostMapping("/messIn")
    public MessInfo addMessDetails(@RequestBody MessInfo messIn) {
		
       return messService.createMessInfo(messIn); 
    }
	
	
	@GetMapping("/messIn")
	public List<MessInfo>  getAllMessInfo() {
		return messService.getAllMessInfo();
		
	}
	
	@GetMapping("/messIn/{id}")
	public ResponseEntity<MessInfo> getMessDetails(@PathVariable long id) {
		
		MessInfo messIn =  messService.getMessDetails(id).orElse(null) ;
	     if(messIn != null) {
	    	 return ResponseEntity.ok().body(messIn);
	     }
	     else {
	     return ResponseEntity.notFound().build();
	     }
	}
	
	@PutMapping("/messIn/{id}")
	public ResponseEntity<MessInfo> updateMessDetails(@PathVariable int id , @RequestBody MessInfo messIn) {
	
		MessInfo updatedMessData = messService.updateMessDetails(id , messIn);
		if(updatedMessData != null) {
			return ResponseEntity.ok(updatedMessData);	
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/messIn/{id}")
	public ResponseEntity<Void> deleteMessData(@PathVariable long id){
	
		messService.deleteMessData(id);
		return ResponseEntity.noContent().build();
	}
}
