package org.littuss.hrManagementApp.assetRepository;

import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondFloorAssetRepository extends JpaRepository<SecondFloorAssetEntity, Long> {

}
