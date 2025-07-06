package in.sp.main.UserMessInfoRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entities.UserMessInfo;

public interface UserMessRepository extends JpaRepository<UserMessInfo ,Long > {

	

}
