package tesquirelAssignment.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import tesquirelAssignment.app.Entity.EmployeeDetails;
import tesquirelAssignment.app.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
   private EmployeeRepository EmployeeRepo;

    @Override
    public EmployeeDetails createEmployee(EmployeeDetails empDetails) {
        return EmployeeRepo.save(empDetails);
    }

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		
		return EmployeeRepo.findAll();
	}

	@Override
	public EmployeeDetails updateEmployee(long empId, EmployeeDetails empDetails) {
		EmployeeDetails existingEmployee = EmployeeRepo.findById(empId).orElse(null);
		if (existingEmployee == null) {
	        return null;
	    }
	    existingEmployee.setEmpName(empDetails.getEmpName());
	    existingEmployee.setMobileNumber(empDetails.getMobileNumber());
	    existingEmployee.setEmail(empDetails.getEmail());
	    existingEmployee.setEmpdob(empDetails.getEmpdob());

	    return EmployeeRepo.save(existingEmployee);
	
	}

	@Override
	public EmployeeDetails getOneEmployee(long empId) {
		return EmployeeRepo.findById(empId).orElse(null);
	}

	@Override
	public void deleteEmployee(long empId) {
		EmployeeDetails Employee = EmployeeRepo.getOne(empId);
		EmployeeRepo.delete(Employee);
		
	}
	

}
