package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void create(User user) {
        userDao.addUser(user);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Override
    public void update(User user) {
        userDao.updateUser(user);
    }
}
