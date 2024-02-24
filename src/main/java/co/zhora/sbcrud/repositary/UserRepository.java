package co.zhora.sbcrud.repositary;

import co.zhora.sbcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
