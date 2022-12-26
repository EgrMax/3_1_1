package ru.egorov.IT_Mentor_PP_3_1_1.service;

import ru.egorov.IT_Mentor_PP_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    Object findOne(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
