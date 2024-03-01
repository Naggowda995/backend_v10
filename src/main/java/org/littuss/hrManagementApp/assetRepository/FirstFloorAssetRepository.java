package org.littuss.hrManagementApp.assetRepository;

import org.littuss.hrManagementApp.assetModel.FirstFloorAssetRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstFloorAssetRepository extends JpaRepository<FirstFloorAssetRegister, Long>{
	
    
}