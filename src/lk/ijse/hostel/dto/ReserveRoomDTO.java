package lk.ijse.hostel.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReserveRoomDTO {

    private String reservationId;
    private String roomType;
    private String studentId;
    private String status;

}
