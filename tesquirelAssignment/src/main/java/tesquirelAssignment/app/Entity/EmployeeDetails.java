package tesquirelAssignment.app.Entity;

import javax.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
public class EmployeeDetails {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(unique = true)
    private Long empId;
   
    private String empName;

    @Column( unique = true)
    private Long mobileNumber;

    @Column( unique = true)
    private String email;
    
    
    private Date empdob;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getEmpdob() {
		return empdob;
	}

	public void setEmpdob(Date empdob) {
		this.empdob = empdob;
	}









    

  
}
