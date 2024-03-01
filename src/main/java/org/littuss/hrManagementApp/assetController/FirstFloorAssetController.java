package org.littuss.hrManagementApp.assetController;

import org.littuss.hrManagementApp.assetModel.FirstFloorAssetRegister;
import org.littuss.hrManagementApp.assetService.FirstFloorAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityNotFoundException;



@RestController
@CrossOrigin("*")
@RequestMapping("/assetsfirstfloor")
public class FirstFloorAssetController {

	@Autowired 
	private FirstFloorAssetService acr; 
	
	//save user
	   @PostMapping("/register")
	   public FirstFloorAssetRegister saveAssetRegister(@RequestBody FirstFloorAssetRegister AssetsRegister) {
	 	return acr.save(AssetsRegister);
	}
	   //visibile on webpage
	   @GetMapping("/get/{id}")
	    public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
	        try {
	        	FirstFloorAssetRegister nrml = acr.getClassDataById(id);
	        //	System.out.println(nrml.getActiveStatus());
	        	if (nrml.getActiveStatus().equals("1")) {
	        		return ResponseEntity.ok(nrml);
				}else
				{
	        	return ResponseEntity.ok("Data not found because `INACTIVE` ");
				}
	        	
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
	        }
	    }
	   
	     //update
		 @PutMapping("/update/{id}")
		    public ResponseEntity<FirstFloorAssetRegister> updateUser(@PathVariable Long id, @RequestBody FirstFloorAssetRegister updatedUserData) {
		        try {
		        	FirstFloorAssetRegister updatedUser = acr.updateUser(id, updatedUserData);
		            return ResponseEntity.ok(updatedUser);
		        } catch (EntityNotFoundException e) {
		            return ResponseEntity.notFound().build();
		        }
		    }

		 //delete
		 
		 @DeleteMapping("/delete/{id}")
		 public ResponseEntity<FirstFloorAssetRegister> deleteUser(@PathVariable Long id) {
		     try {
		         FirstFloorAssetRegister updatedUser = acr.softDeleteUser(id);
		         return ResponseEntity.ok(updatedUser);
		     } catch (EntityNotFoundException e) {
		         return ResponseEntity.notFound().build();
		     }
		 }


}
