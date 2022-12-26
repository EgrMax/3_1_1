package ru.egorov.IT_Mentor_PP_3_1_1.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.egorov.IT_Mentor_PP_3_1_1.model.User;
import ru.egorov.IT_Mentor_PP_3_1_1.repositories.UsersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UserService {

    private final UsersRepository usersRepository;


    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    @Override
    public List<User> findAll() {
        return usersRepository.findAll();
    }
    @Override
    public Object findOne(int id) {
        Optional<User> foundUser = usersRepository.findById(id);
        return foundUser.orElse(null);
    }
    @Override
    @Transactional
    public void save(User user) {
        usersRepository.save(user);
    }
    @Override
    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        usersRepository.save(updatedUser);
    }
    @Override
    @Transactional
    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}

