package org.littuss.hrManagementApp.assetController;

import org.littuss.hrManagementApp.assetModel.FirstFloorAssetRegister;
import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.littuss.hrManagementApp.assetService.SecondFloorAssetService;
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
@RequestMapping("/assetsecondfloor")

public class SecondFloorAssetController {
	
	@Autowired

	private SecondFloorAssetService asc;
	
	@PostMapping("/register")
	public SecondFloorAssetEntity saveAssetRegister(@RequestBody SecondFloorAssetEntity AssetRegister) {
	 	return asc.save(AssetRegister);
	}
	
//	@GetMapping("/get/{id}")
//    public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
//        try {
//        	
//            SecondFloorAssetEntity nrml = asc.getClassDataById(id);
//            return ResponseEntity.ok(nrml);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
//        }
//    }
	
	//visibile on webpage
	   @GetMapping("/get/{id}")
	    public ResponseEntity<?> getClassDataById(@PathVariable Long id) {
	        try {
	        	SecondFloorAssetEntity nrml = asc.getClassDataById(id);
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
		    public ResponseEntity<SecondFloorAssetEntity> updateUser(@PathVariable Long id, @RequestBody SecondFloorAssetEntity updatedUserData) {
		        try {
		        	SecondFloorAssetEntity updatedUser = asc.updateUser(id, updatedUserData);
		            return ResponseEntity.ok(updatedUser);
		        } catch (EntityNotFoundException e) {
		            return ResponseEntity.notFound().build();
		        }
		    }

		 //delete
		 
		 @DeleteMapping("/delete/{id}")
		 public ResponseEntity<SecondFloorAssetEntity> deleteUser(@PathVariable Long id) {
		     try {
		    	 SecondFloorAssetEntity updatedUser = asc.softDeleteUser(id);
		         return ResponseEntity.ok(updatedUser);
		     } catch (EntityNotFoundException e) {
		         return ResponseEntity.notFound().build();
		     }
		 }
	

}
