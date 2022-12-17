package tesquirelAssignment.app.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import tesquirelAssignment.app.Entity.EmployeeDetails;

public interface EmployeeService {

    public EmployeeDetails createEmployee(@RequestBody EmployeeDetails empDetails);
    public List<EmployeeDetails> getAllEmployees();
    public EmployeeDetails updateEmployee(@PathVariable long empId, @RequestBody EmployeeDetails empDetails);
    public EmployeeDetails getOneEmployee(@PathVariable long empId);
    public void deleteEmployee(@PathVariable long empId);
}
