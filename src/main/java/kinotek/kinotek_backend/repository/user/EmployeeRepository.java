package kinotek.kinotek_backend.repository.user;

import kinotek.kinotek_backend.model.user.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    boolean existsByName(String name);

    Optional<Employee> findByName(String name);
    Optional<Employee> findByNameAndPassword(String name, String password);


}
