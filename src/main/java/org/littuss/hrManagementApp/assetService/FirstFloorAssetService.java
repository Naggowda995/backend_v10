package org.littuss.hrManagementApp.assetService;

import org.littuss.hrManagementApp.assetModel.FirstFloorAssetRegister;
import org.littuss.hrManagementApp.assetRepository.FirstFloorAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FirstFloorAssetService {
	
	@Autowired
	public FirstFloorAssetRepository asr;
	
	//save user
	 public FirstFloorAssetRegister save(FirstFloorAssetRegister ser) {
		return  asr.save(ser);	
	}
	
	 //find by Id
	 public FirstFloorAssetRegister getClassDataById(Long id) {
	        return asr.findById(id)
	                .orElseThrow(() -> new RuntimeException("Data not found with id: " + id)); 
	   }
	 
	 //updateUser
	 public FirstFloorAssetRegister updateUser(Long id, FirstFloorAssetRegister updatedUser) {
		 FirstFloorAssetRegister existingUser = asr.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
			
	        existingUser.setNormalChairs(updatedUser.getNormalChairs());
	        existingUser.setWheelChairs(updatedUser.getWheelChairs());
	        existingUser.setAcRemotes(updatedUser.getAcRemotes());
	        existingUser.setFanRemotes(updatedUser.getFanRemotes());
	        existingUser.setPedestals(updatedUser.getPedestals());
	        existingUser.setAirConditioners(updatedUser.getAirConditioners());
	        existingUser.setLaptops(updatedUser.getLaptops());
	        existingUser.setMouses(updatedUser.getMouses());
	        existingUser.setChargers(updatedUser.getChargers());
	        existingUser.setBags(updatedUser.getBags());
	        existingUser.setFans(updatedUser.getFans());
	        existingUser.setDustbins(updatedUser.getDustbins());
	        existingUser.setTables(updatedUser.getTables());
	        

	        return asr.save(existingUser);
	    }
	 
//	 //deleteUser
//	 public FirstFloorAssetRegister deleteUser(Long id, FirstFloorAssetRegister updatedUser) {
//		 FirstFloorAssetRegister existingUser = asr.findById(id)
//	                .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
//			
//	        existingUser.setActiveStatus("0");
//	        
//	        return asr.save(existingUser);
//	    }
//	 

	 //delete
	 public FirstFloorAssetRegister softDeleteUser(Long id) {
		    FirstFloorAssetRegister existingUser = asr.findById(id)
		            .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));

		    existingUser.setActiveStatus("0"); // Assuming ActiveStatus is a String. If it's boolean, use setActive(false);

		    return asr.save(existingUser);
		}

}
