package lk.ijse.hostel.bo.custom;

import lk.ijse.hostel.bo.SuperBO;
import lk.ijse.hostel.dto.UserDTO;

import java.io.IOException;
import java.sql.SQLException;

public interface LoginBO extends SuperBO {
    UserDTO search (String userName) throws SQLException, ClassNotFoundException, IOException;
}
