package kinotek.kinotek_backend.repository.user;

import kinotek.kinotek_backend.model.user.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
