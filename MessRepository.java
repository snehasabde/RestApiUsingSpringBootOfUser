package in.sp.main.messRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entities.MessInfo;

public interface MessRepository extends JpaRepository<MessInfo , Long>  {

	
}
