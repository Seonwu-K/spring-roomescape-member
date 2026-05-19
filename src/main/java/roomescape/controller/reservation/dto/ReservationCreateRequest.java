package roomescape.controller.reservation.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ReservationCreateRequest(
        @NotBlank(message = "INVALID_INPUT::예약자 이름은 비어 있을 수 없습니다.")
        @Size(max = 9, message = "INVALID_INPUT::예약자 이름은 10자 미만이어야 합니다.")
        String name,

        @NotNull(message = "INVALID_INPUT::날짜는 필수입니다.")
        @JsonFormat(pattern = "yyyy-MM-dd")
        LocalDate date,

        @NotNull(message = "INVALID_INPUT::themeId는 필수입니다.")
        Long themeId,

        @NotNull(message = "INVALID_INPUT::timeId는 필수입니다.")
        Long timeId
) {
}
