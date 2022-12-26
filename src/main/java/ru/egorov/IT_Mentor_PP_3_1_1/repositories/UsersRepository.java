package ru.egorov.IT_Mentor_PP_3_1_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.egorov.IT_Mentor_PP_3_1_1.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
