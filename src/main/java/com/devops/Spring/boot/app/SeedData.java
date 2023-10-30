package com.devops.Spring.boot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SeedData implements ApplicationRunner {

    private final LogEntryRepository logEntryRepository;

    @Autowired
    public SeedData(LogEntryRepository logEntryRepository) {
        this.logEntryRepository = logEntryRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        LogEntry logEntry = new LogEntry();
        logEntry.setMessage("This is a seed log entry.");
        logEntry.setTimestamp(LocalDateTime.now());
        logEntry.setRoute("נתיב זריעה"); // הגדר את הנתיב הרלוונטי
        logEntryRepository.save(logEntry);
    }
}


//package com.devops.Spring.boot.app;
//
//import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.stereotype.Service;
//
//        import javax.annotation.PostConstruct;
//        import java.util.List;
//
//@Service
//public class SeedData {
//
//    private final LogEntryService logEntryService; // כאן נשתמש בשירות
//
//
//    @Autowired
//    public SeedData(LogEntryService logEntryService) {
//        this.logEntryService = logEntryService;
//    }
//
//    @PostConstruct
//    public void init() {
//        // הכנס כאן את הנתונים מה-Seed
//        logEntryService.createLogEntry("תוכן הכנסת כאן");
//        logEntryService.createLogEntry("עוד תוכן לכניסה");
//        // המשך להוסיף את הנתונים הרלוונטיים
//    }
//}
