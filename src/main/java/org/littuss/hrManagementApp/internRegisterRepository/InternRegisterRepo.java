package org.littuss.hrManagementApp.internRegisterRepository;


import org.littuss.hrManagementApp.internRegisterModel.InternNormalizedData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRegisterRepo extends JpaRepository<InternNormalizedData, Long>{
	 
	InternNormalizedData save(InternNormalizedData internNormalizedData);

}
