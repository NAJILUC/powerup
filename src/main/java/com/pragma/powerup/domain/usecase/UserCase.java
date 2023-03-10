package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IUserServicePort;
import com.pragma.powerup.domain.model.RolModel;
import com.pragma.powerup.domain.model.UserModel;
import com.pragma.powerup.domain.spi.IUserPersistencePort;
import org.mindrot.jbcrypt.BCrypt;

import java.util.List;

public class UserCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }


    @Override
    public void saveUser(UserModel userModel) {
    userModel.setClave(BCrypt.hashpw(userModel.getClave(),BCrypt.gensalt()));
    userPersistencePort.saveUser(userModel);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public void deleteUser(UserModel userModel) {
        List<UserModel> aux = getAllUsers();
        for (UserModel tmp : aux) {
            if(userModel.getId()== tmp.getId()) userModel=tmp;
            userPersistencePort.deleteUser(userModel);
        }
       userPersistencePort.deleteUser(userModel);
    }
}