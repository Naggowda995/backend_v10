package org.littuss.hrManagementApp.hrRegisterRepo;

import org.littuss.hrManagementApp.hrRegisterModel.HrRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrRegisterRepo  extends JpaRepository<HrRegisterEntity, Long>{
    
	HrRegisterEntity findByEmail(String email);
	
	HrRegisterEntity findByEmailAndPassword(String email, String password);
}
