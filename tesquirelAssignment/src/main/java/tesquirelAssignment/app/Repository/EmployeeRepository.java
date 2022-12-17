package tesquirelAssignment.app.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tesquirelAssignment.app.Entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Long> {
}
