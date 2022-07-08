package lk.ijse.hostel.dao.custom;

import lk.ijse.hostel.dao.CrudDAO;
import lk.ijse.hostel.dao.SuperDAO;
import lk.ijse.hostel.entity.Student;
import lk.ijse.hostel.entity.User;

import java.sql.SQLException;

public interface UserDAO extends CrudDAO<User, String> {

    User searchForLogin(String s) throws SQLException, ClassNotFoundException;

}
