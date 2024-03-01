package org.littuss.hrManagementApp.empRegisterRepository;

import org.littuss.hrManagementApp.empRegisterModel.EmpNormalizedData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRegisterRepo extends JpaRepository<EmpNormalizedData, Long>{
 
	EmpNormalizedData save(EmpNormalizedData employeeNormalizedData);
}
