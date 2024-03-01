package org.littuss.hrManagementApp.hrRegisterModel;

public class UserResponse {
	
	private String firstName;
    private String fullName;
    private Long empid;
    private String email;
    private String lastLogin;

    public UserResponse(String firstName, String fullName, Long empid, String email, String lastLogin) {
        this.firstName = firstName;
        this.fullName = fullName;
        this.empid = empid;
        this.email = email;
        this.lastLogin = lastLogin;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}


}
