package org.littuss.hrManagementApp.hrRegisterService;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.littuss.hrManagementApp.hrRegisterModel.HrRegisterEntity;
import org.littuss.hrManagementApp.hrRegisterRepo.HrRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrRegisterService{
	
	@Autowired
	 private HrRegisterRepo hrRepo;
	 
	 public HrRegisterEntity findByEmail(String email) {
	        return hrRepo.findByEmail(email);
	    }

	 //registration 
	 public HrRegisterEntity save(HrRegisterEntity empres) {
	        return hrRepo.save(empres);
	    }

	 //for login request
	 public HrRegisterEntity findByEmailAndPassword(String email, String password) {
		 System.out.println("login request");
	        return hrRepo.findByEmailAndPassword(email, password);
	    }
	 
	//timestamp
     public static String timeStamp()
        {
             // Example timestamp in milliseconds
            long timestamp = System.currentTimeMillis();


            // Convert timestamp to Date
            Date date = new Date(timestamp);


         // Create a SimpleDateFormat with GMT+05:30 time zone
            DateFormat dateFormat = new SimpleDateFormat("dd MMM yy HH:mm:ss");
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+05:30"));


            // Format Date as a string in the "01-feb-24 03:48:56" pattern with GMT time zone
            String formattedDate = dateFormat.format(date);


            //System.out.println("Formatted Date in GMT: " + formattedDate);
            return formattedDate;
        }
     private void updateLastLoginTimestamps(HrRegisterEntity hrRegisterEntity) {
            // Ensure that lastLoginTimestamps is not null
            if (hrRegisterEntity.getLastLoginTimestamps() == null) {
                hrRegisterEntity.setLastLoginTimestamps(new String[5]);
            }


            String[] lastLoginTimestamps = hrRegisterEntity.getLastLoginTimestamps();
            


            // Shift the elements to the left to keep only the last 5 timestamps
            for (int i = 0; i < lastLoginTimestamps.length - 1; i++) {
                lastLoginTimestamps[i]= lastLoginTimestamps[i + 1];
            }
            
            // Add new timestamp to the end of the array
            lastLoginTimestamps[lastLoginTimestamps.length - 1] = timeStamp();
        }


     
     public HrRegisterEntity saveTimeStamp(HrRegisterEntity hrRegisterEntity) {
            // Update last login timestamp
            updateLastLoginTimestamps(hrRegisterEntity);
            return hrRepo.save(hrRegisterEntity);
        }
}
