package lk.ijse.hostel.dto;

import lk.ijse.hostel.entity.Room;
import lk.ijse.hostel.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationRoomDTO {

    private String reservationId;
    private Student student;
    private Room room;
    private String timeDuration;
    private String status;
    private LocalDate reserveDate;

}
