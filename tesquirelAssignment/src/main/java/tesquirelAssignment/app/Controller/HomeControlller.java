package tesquirelAssignment.app.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tesquirelAssignment.app.Entity.EmployeeDetails;
import tesquirelAssignment.app.Service.EmployeeService;

@RestController
public class HomeControlller {

    @Autowired
    private EmployeeService empService;

    
    @PostMapping("/createEmployee")
    public EmployeeDetails createEmployee(@RequestBody EmployeeDetails empDetails){
      return this.empService.createEmployee(empDetails);
    }
    
    
    @GetMapping("/getAllEmployees")
    public List<EmployeeDetails> getAllEmployees(){
    	return this.empService.getAllEmployees();
    }

    
    @PutMapping("/{empId}")
    public EmployeeDetails updateEmployee(@PathVariable long empId, @RequestBody EmployeeDetails empDetails){
    	return this.empService.updateEmployee(empId, empDetails);
    	
}
    @GetMapping("/getoneEmployee/{empId}")
    public EmployeeDetails getOneEmployee(@PathVariable long empId) {
   return this.empService.getOneEmployee(empId);
}
    
    @DeleteMapping("/deleteEmployee/{empId}")
    public ResponseEntity<HttpStatus>deleteEmployee(@PathVariable long empId){
    	
    	try {
			this.empService.deleteEmployee(empId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
    }
}

