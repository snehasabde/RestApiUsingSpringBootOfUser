package in.sp.main.UserMessInfoController;


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

import in.sp.main.UserInfoService.UserMessInfoService;
import in.sp.main.entities.UserMessInfo;

@RestController
@CrossOrigin(origins = "*")
public class UserMessInfoController {

	@Autowired
	private UserMessInfoService userMessInfoService;
	
	
	@PostMapping("/usermessInfo")
	public UserMessInfo addUserMessDetail(@RequestBody UserMessInfo usermessInfo) {
		return userMessInfoService.createUserMessInfo(usermessInfo);
	}
	
	@GetMapping("/usermessInfo")
	public List<UserMessInfo> getAllUserMessDetail() {
		return userMessInfoService.getAllUserMessInfo();
	}
	
	@GetMapping("/usermessInfo/{id}")
	public ResponseEntity<UserMessInfo>getUserMessDetails(@PathVariable int id) {
		UserMessInfo usermessInfo = userMessInfoService.getUserMessDetails(id).orElse(null);
		if(usermessInfo != null ) {
			return ResponseEntity.ok().body(usermessInfo);
		}
		else {
			return ResponseEntity.notFound().build();
		}
			
	}
	
	@PutMapping("/usermessInfo/{id}")
	public ResponseEntity<UserMessInfo> updateUserMessDetails(@PathVariable int id , @RequestBody UserMessInfo usermessInfo) {
		
		UserMessInfo UpdatedusermessInfo = userMessInfoService.updateUserMessDetails(id,usermessInfo);
		
		if(UpdatedusermessInfo != null) {
			return ResponseEntity.ok(UpdatedusermessInfo);
		}
		else {
			return ResponseEntity.notFound().build();
		}		
		
	}
	
	@DeleteMapping("/usermessInfo/{id}")
	public ResponseEntity<Void> deleteUserMessDetails(@PathVariable int id ) {
		
		userMessInfoService.deleteUserMessDetails(id);
		return ResponseEntity.noContent().build();
		
	}
	
	
}
