package org.littuss.hrManagementApp.hrRegisterController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.littuss.hrManagementApp.hrLoginVariables.HrLoginRequest;
import org.littuss.hrManagementApp.hrRegisterModel.HrRegisterEntity;
import org.littuss.hrManagementApp.hrRegisterModel.UserResponse;
import org.littuss.hrManagementApp.hrRegisterService.HrRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/littuss/hr") 
@CrossOrigin("*")
public class HrRegisterController {
	
	@Autowired
	 private HrRegisterService hrRegSer;
	 
	 //register
	 @GetMapping("/hrregister/{email}")
	 public HrRegisterEntity getUserByEmail(@PathVariable String email) {
	        return hrRegSer.findByEmail(email);
	    }
	 
		/*
		 * // @PostMapping("/register") // public EmployeeRegisterEntity
		 * createUser(@RequestBody EmployeeRegisterEntity EmpregEnt) { // String email =
		 * EmpregEnt.getEmail(); // EmployeeRegisterEntity user =
		 * empRegSer.findByEmail(email); // if (user == null) { // return
		 * empRegSer.save(EmpregEnt); // } // else // { // return null; // } // }
		 */ 
	 
	 @PostMapping("/hrregister")
	 public ResponseEntity<String> createHr(@RequestBody HrRegisterEntity hrRegEnt) {
	     String email = hrRegEnt.getEmail();
	     HrRegisterEntity existingUser = hrRegSer.findByEmail(email);

	     if (existingUser == null) {
	         // Email is not taken, so save the user
	        //ex: EmployeeRegisterEntity savedUser = empRegSer.save(empRegEnt);
	    	 hrRegSer.save(hrRegEnt);
	         return ResponseEntity.ok("User registered successfully");
	     } 
	     else {
	         // Email is already taken, return a response indicating that
	         return ResponseEntity.badRequest().body("Email address already taken");
	     }
	 }
	 
	 private HrRegisterEntity user;
     
     //login
     @PostMapping("/hrlogin")
      public ResponseEntity<String> loginUser(@RequestBody HrLoginRequest hrLoginRequest) {
          String email = hrLoginRequest.getEmail();
          String password = hrLoginRequest.getPassword();
          try {
          // Perform login validation
           user = hrRegSer.findByEmailAndPassword(email, password);


          if (user != null && password.equals(user.getPassword())) {
              // Successful login  
              hrRegSer.saveTimeStamp(user);
              return ResponseEntity.ok("Login successful");
          }
          else {
              // Failed login
               return ResponseEntity.badRequest().body("Login failed");
          }
          } catch (Exception e) {
              // Handle unexpected errors
              return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
          }
      }
     
		/*
		 * @GetMapping("/userdetails") public ResponseEntity<Object> userDetails() {
		 * System.out.println(user); if (user != null) { // Retrieve additional user
		 * details based on your requirements String firstName = user.getFirstname();
		 * String fullName = user.getFirstname()+" "+user.getLastname(); Long userId =
		 * user.getId(); String email = user.getEmail(); String lastLogin =
		 * user.getLastLoginTimestamps()[user.getLastLoginTimestamps().length - 1]; //
		 * Add more details as needed
		 * 
		 * 
		 * // Prepare the response data as a Map Map<String, Object> responseData = new
		 * HashMap<>(); responseData.put("firstName", firstName);
		 * responseData.put("fullName", fullName); responseData.put("userId", userId);
		 * responseData.put("email", email); responseData.put("lastLogin", lastLogin);
		 * // Add more details to the response data as needed
		 * System.out.println(responseData); // Return the response to the frontend
		 * return ResponseEntity.ok(responseData); } else { // Handle the case where the
		 * user is not logged in return
		 * ResponseEntity.badRequest().body(Collections.singletonMap("error",
		 * "User not logged in")); } }
		 */
     
     @GetMapping("/userdetails")
     public ResponseEntity<?> userDetails() {
         if (user != null) {
             String firstName = user.getFirstname();
             String fullName = user.getFirstname() + " " + user.getLastname();
             Long userId = user.getId();
             String email = user.getEmail();
             String lastLogin = user.getLastLoginTimestamps()[user.getLastLoginTimestamps().length - 1];

             // Create a custom class to hold user details
             UserResponse userResponse = new UserResponse(firstName, fullName, userId, email, lastLogin);

             return ResponseEntity.ok(userResponse);
         } else {
             return ResponseEntity.badRequest().body( "User not logged in");
         }
     }

}


