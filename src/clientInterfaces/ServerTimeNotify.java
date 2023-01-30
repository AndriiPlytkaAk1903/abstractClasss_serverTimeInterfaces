package clientInterfaces;

import java.time.LocalDateTime;

public interface ServerTimeNotify {
    void setCurrentDateWithTime(int day, int month, int year, int hour, int minute, int second);
    LocalDateTime getLastDateNotify();
    LocalDateTime getCurrentDateWithTime();
    LocalDateTime getLocalDateTime();

}
