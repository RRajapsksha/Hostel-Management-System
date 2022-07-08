package lk.ijse.hostel.bo.custom.impl;

import lk.ijse.hostel.bo.custom.LoginBO;
import lk.ijse.hostel.dao.DAOFactory;
import lk.ijse.hostel.dao.DAOType;
import lk.ijse.hostel.dao.custom.UserDAO;
import lk.ijse.hostel.dto.UserDTO;
import lk.ijse.hostel.entity.User;

import java.io.IOException;
import java.sql.SQLException;

public class LoginBOImpl implements LoginBO {
    private final UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOType.USER);
    @Override
    public UserDTO search(String userName) throws SQLException, ClassNotFoundException, IOException {

        User user = userDAO.searchForLogin(userName);
        return new UserDTO(user.getPassword());
    }
}
