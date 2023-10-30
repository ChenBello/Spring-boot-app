package com.devops.Spring.boot.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class LogEntry {
    @Id // מזהה ראשי של הישות
    @GeneratedValue(strategy = GenerationType.IDENTITY) //אומר שבכל פעם שתוסיף רשומה חדשה לטבלת מסד הנתונים המשויכת למחלקה זו, המסד ייצר אוטומטית מזהה ראשי חדש ויכניס אותו כערך של התכונה id.
    private Long id;
    private LocalDateTime timestamp;
    //    private Date timestamp;
    private String route;
    private String message;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) { //Message
        this.route = route;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


//    public static interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
//    }

//    public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
//        // אם יש פעולות אחרות שרוצים להוסיף, יש להוסיפם כאן
//    }

}

