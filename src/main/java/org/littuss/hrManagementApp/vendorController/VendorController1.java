//package org.littuss.hrManagementApp.vendorController;
//
//public class VendorController1 {
//
//}
package org.littuss.hrManagementApp.vendorController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.util.Map;

import org.littuss.hrManagementApp.assetModel.SecondFloorAssetEntity;
import org.littuss.hrManagementApp.clientModel.ClientEntity;
import org.littuss.hrManagementApp.vendorDetailsModel.VendorDetails;
import org.littuss.hrManagementApp.vendorRepo.vendorRepo;
import org.littuss.hrManagementApp.vendorService.vendorService;


@RestController
@CrossOrigin("*")
@RequestMapping("/vendors")
public class VendorController1 {


       @Autowired
        private vendorService vendorService;
        
        @Autowired
        private vendorRepo repo;



        //register
       @PostMapping("/create")
        public ResponseEntity<String> saveUser(
               // @RequestParam String activeStatus,
                @RequestParam String vendorName,
                @RequestParam String rateCard,
                @RequestParam String location,
                @RequestParam String jobType,
                @RequestParam String payRoll,
                @RequestParam String candidateName,
                @RequestParam String candidateLocation,
                @RequestParam String technology,
                @RequestParam String firstReviewed,
                @RequestParam String secondReviewed,
                @RequestParam MultipartFile file) {
            


            createUser( vendorName, rateCard, location, jobType, payRoll, candidateName, candidateLocation, technology, firstReviewed, secondReviewed, file);


           return ResponseEntity.ok("User created successfully!");
        }
               
     // Endpoint to retrieve a user by email
        @GetMapping("/get/{id}")
        public ResponseEntity<?> getUserByEmail(@PathVariable Long id) {
        	try {
            VendorDetails vendor=  vendorService.getDataById(id);
            if (vendor.getActiveStatus().equals("1")) {
        		return ResponseEntity.ok(vendor);
			}else
			{
        	return ResponseEntity.ok("Data not found because `INACTIVE` ");
			}
        	
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not found");
        }
          //  return (vendor != null) ? ResponseEntity.ok(vendor) : ResponseEntity.notFound().build();
        }
        
      //update
        @PutMapping("/update/{id}")
           public ResponseEntity<String> updateUser(@PathVariable Long id,@RequestParam String vendorName,
                   @RequestParam String rateCard,@RequestParam String location,
                   @RequestParam String jobType,@RequestParam String payRoll,
                   @RequestParam String candidateName,@RequestParam String candidateLocation,
                   @RequestParam String technology,@RequestParam String firstReviewed,
                   @RequestParam String secondReviewed,
                   @RequestParam MultipartFile file ) {
               try {
                   updateUserbyId(id,vendorName, rateCard, location, jobType, payRoll, candidateName, candidateLocation, technology, firstReviewed, secondReviewed, file );
                   return ResponseEntity.ok("User Updated SucessFully!");
               } catch (EntityNotFoundException e) {
                   return ResponseEntity.notFound().build();
               }
           }
        
       //deletebyId
           @DeleteMapping("/delete/{id}")
            public ResponseEntity<String> deleteUser(@PathVariable Long id) {
                try {
                     softDeleteUser(id);
                    return ResponseEntity.ok("User Deleted Succesfully!");
                } catch (EntityNotFoundException e) {
                    return ResponseEntity.notFound().build();
                }
            }
        
       

//
//       // Endpoint to retrieve the uploaded file by user email
//        @GetMapping("/file/{id}")
//        public ResponseEntity<org.springframework.core.io.Resource> getFileByEmail(@PathVariable Long id, HttpServletResponse response) throws IOException {
//            byte[] fileContent = vendorService.loadFileById(id);
//
//
//           if (fileContent != null) {
//                // Create a ByteArrayResource to represent the file content
//                ByteArrayResource resource = new ByteArrayResource(fileContent);
//
//
//               // Return the file content as a response with appropriate headers
//                return ResponseEntity.ok()
//                        .header("Content-Disposition", "attachment; filename=user_file.txt")
//                        .body(resource);
//            } else {
//                return ResponseEntity.notFound().build();
//            }
//        }
        
        
        //service
           
           
		 //create
        public  void createUser( String vendorName, String rateCard, String location, String jobType, String payRoll,
                String candidateName, String candidateLocation, String technology, String firstReviewed,
                String secondReviewed,  MultipartFile file) {
            try {
                byte[] fileContent = file.getBytes(); // Convert the uploaded file to byte array
                VendorDetails user = new VendorDetails( vendorName, rateCard, location, jobType, payRoll, candidateName, candidateLocation, technology, firstReviewed, secondReviewed, fileContent);
                        repo.save(user);
            } catch (IOException e) {
                // Handle the IOException (e.g., log the error, return an error response)
                e.printStackTrace();
            }
        }
        
      //update
        public void updateUserbyId(Long id, String vendorName,
                 String rateCard, String location,
                 String jobType, String payRoll,
                 String candidateName, String candidateLocation,
                 String technology, String firstReviewed,
                 String secondReviewed,
                 MultipartFile file ) {
            VendorDetails existingUser = repo.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
            
            //VendorDetails updatedUser=new VendorDetails();
            try {
            byte[] fileContent = file.getBytes();
            
            existingUser.setVendorName(vendorName);
            existingUser.setRateCard(rateCard);
            existingUser.setLocation(location);
            existingUser.setJobType(jobType);
            existingUser.setPayRoll(payRoll);
            existingUser.setCandidateName(candidateName);
            existingUser.setCandidateLocation(candidateLocation);
            existingUser.setTechnology(technology);
            existingUser.setFirstReviewed(firstReviewed);
            existingUser.setSecondReviewed(secondReviewed);
            
            existingUser.setCvFormat(fileContent);
            


             repo.save(existingUser);
            } catch (IOException e) {
                // Handle the IOException (e.g., log the error, return an error response)
                e.printStackTrace();
            }
         
        }
        
        //delete
         public void softDeleteUser(Long id) {
             VendorDetails existingUser = repo.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));


                existingUser.setActiveStatus("0"); // Assuming ActiveStatus is a String. If it's boolean, use setActive(false);


                 repo.save(existingUser);
            }
        

        
      
}