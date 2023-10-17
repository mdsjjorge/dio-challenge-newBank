package dio.challenge.newBank.domain.repository;

import dio.challenge.newBank.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);

}
