package org.littuss.hrManagementApp.vendorController;

import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.littuss.hrManagementApp.vendorService.vendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityNotFoundException;


@RestController
@CrossOrigin("*")
@RequestMapping("/vendorDetails")
public class vendorController {

	@Autowired
	private vendorService venDet;
	
//	@PostMapping("/save/vendorName")
//	 public Long saveVendorDetails(@RequestBody VendorDetails VendorDetails) {
//		 venDet.save(VendorDetails);
//		 return VendorDetails.getId();
//    }
//	
	@PostMapping("/save/vendorName")
	public VendorDetails addRequirement(@RequestBody VendorDetails VendorDetails) {
        return venDet.save(VendorDetails);
    }
	
	//getting Details By Id
	 @GetMapping("/get/{id}")
	    public ResponseEntity<?> getDataById(@PathVariable Long id) {
	        try {
	            VendorDetails nrml = venDet.getDataById(id);
	            return ResponseEntity.ok(nrml);
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
	        }
	    }
	 
	 //Delete Details By Id
//	 @DeleteMapping("/delete/{id}")
//	 public ResponseEntity<String> deleteById(@PathVariable Long id) {
//	        try {
////	            VendorDetails nrml = venDet.deleteById(id);
////	            return ResponseEntity.ok(nrml);
//	        	venDet.deleteById(id);
//	        	return ResponseEntity.ok("Deleted");
//	        } catch (Exception e) {
//	            	return	ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
//	        }
//	    }
	 
	 //update
	 @PutMapping("/update/{id}")
	    public ResponseEntity<VendorDetails> updateUser(@PathVariable Long id, @RequestBody VendorDetails updatedUserData) {
	        try {
	        	VendorDetails updatedUser = venDet.updateUser(id, updatedUserData);
	            return ResponseEntity.ok(updatedUser);
	        } catch (EntityNotFoundException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }
 
}

