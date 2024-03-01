package org.littuss.hrManagementApp.vendorRepo;


import java.util.Optional;

import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface vendorRepo extends JpaRepository<VendorDetails, Long> {

	VendorDetails findByvendorName(String vendorName);
	Optional<VendorDetails> findById(Long id);

}
