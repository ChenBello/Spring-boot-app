//**************************************//
package com.devops.Spring.boot.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;


@Service
public class LogEntryService {
    private final LogEntryRepository logEntryRepository;

    @Autowired
    public LogEntryService(LogEntryRepository logEntryRepository) {

        this.logEntryRepository = logEntryRepository;
    }

//  //public void logRequest(String route)????
    public LogEntry createLogEntry(String route) {
        LogEntry logEntry = new LogEntry();

//      Set the timestamp as needed
        logEntry.setTimestamp(LocalDateTime.now());
        logEntry.setRoute(route);
        logEntry.setMessage("Request to route: " + route);
//        logEntry.setMessage("הודעת לוג כאן"); // ניתן לכלול הודעת לוג רלוונטית

//         Save the log entry to the database
        return logEntryRepository.save(logEntry);
    }
    public List<LogEntry> getAllLogEntries() {
       return logEntryRepository.findAll();
    }

}






//package com.devops.Spring.boot.app;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class LogEntryService {
//    private final LogEntryRepository logEntryRepository;
////    private LogEntryRepository logEntryRepository;
//
//    @Autowired
//    public LogEntryService(LogEntryRepository logEntryRepository) {
//        this.logEntryRepository = logEntryRepository;
//    }
//
//    // אחת משני הפונקציות הבאות יכול להיות מיותרת
////     this one
////     done in LogController????????
//        public LogEntry createLogEntry(String message) {
//        LogEntry logEntry = new LogEntry();
//        logEntry.setMessage("Request to route: " + message);
//        // Set the timestamp as needed
//        logEntry.setTimestamp(LocalDateTime.now());
//        // Save the log entry to the database
//        return logEntryRepository.save(logEntry);
//    }
////    or this one
//    public LogEntry saveLogEntry(LogEntry logEntry) {
//        return logEntryRepository.save(logEntry);
//    }
//
//    public List<LogEntry> getAllLogEntries() {
//        return logEntryRepository.findAll();
//    }
//
//    // ניתן להוסיף פונקציות נוספות לפי הצורך
//
//
//
//}
//
//




//@Service
//public class LogEntryService {
//    @Autowired
//    private LogEntryRepository logEntryRepository;
////    private final LogEntryRepository logEntryRepository;
//
//    public List<LogEntry> getAllLogEntries() {
//        return logEntryRepository.findAll();
//    }
//
//    public LogEntryService(LogEntryRepository logEntryRepository) {
//        this.logEntryService = logEntryRepository;
//    }
//
//    public LogEntry createLogEntry(String message) {
//        LogEntry logEntry = new LogEntry();
//        logEntry.setMessage("Request to route: " + message);
//        // Set the timestamp as needed
//        logEntry.setTimestamp(LocalDateTime.now());
//        // Save the log entry to the database
//        return logEntryRepository.save(logEntry);
//    }

    // ניתן להוסיף פונקציות נוספות לפי הצורך

//}



//package com.devops.Spring.boot.app;
//
//import com.devops.Spring.boot.app.LogEntry;
//import com.devops.Spring.boot.app.LogEntry.LogEntryRepository;
//import org.hibernate.mapping.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//
//@Service
//public class LogEntryService {
//
//    @Autowired
//    private LogEntryRepository logEntryRepository;
//
//    public List<LogEntry> getAllLogEntries() {
//        return logEntryRepository.findAll();
//    }
//
//    public LogEntry createLogEntry(String route) {
//        LogEntry logEntry = new LogEntry();
//        logEntry.setTimestamp(LocalDateTime.now());
//        logEntry.setMessage("Request to route: " + route);
//        return logEntryRepository.save(logEntry);
//    }
//}
