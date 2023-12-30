package exercise_26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduler {
  
  public LocalDateTime schedule (String appointmentDateDescription) {
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
    
    return LocalDateTime.parse(appointmentDateDescription, formatter);
  }
  
  
  public boolean hasPassed (LocalDateTime appointmentDate) {
    
    return appointmentDate.isBefore(LocalDateTime.now());
  }
  
  
  public boolean isAfternoonAppointment (LocalDateTime appointmentDate) {
    int appointmentHour = appointmentDate.getHour();
    return (appointmentHour >= 12 && appointmentHour < 18);
    
  }
  
  
  public String getDescription (LocalDateTime appointmentDate) {
    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a'.'");
    
    return "You have an appointment on " + outputFormatter.format(appointmentDate);
  }
  
  
  public LocalDate getAnniversaryDate () {
    int currentYear = LocalDate.now().getYear();
    
    return LocalDate.of(currentYear,9,15);
  }
  
}
