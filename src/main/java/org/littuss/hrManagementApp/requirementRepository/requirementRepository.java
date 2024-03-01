package org.littuss.hrManagementApp.requirementRepository;

import org.littuss.hrManagementApp.requirementModel.requirementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface requirementRepository extends JpaRepository<requirementEntity, Long> {

	
}