package com.devops.Spring.boot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {
    private final LogEntryService logEntryService;

    @Autowired
    public LogController(LogEntryService logEntryService) {
        this.logEntryService = logEntryService;
    }
    // One syntax to implement a
    // GET method
    @GetMapping("/entries")
    public List<LogEntry> getAllLogEntries() {
        return logEntryService.getAllLogEntries();
    }

    @PostMapping("/create")
    public LogEntry createLogEntry(@RequestBody String route) {
        return logEntryService.createLogEntry(route);
    }
}

//    // Another syntax to implement a
//    // GET method
//    @RequestMapping(
//            method = { RequestMethod.GET },
//            value = { "/devops" })






//package com.devops.Spring.boot.app;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/logs")
//public class LogController {
//
//    @Autowired
//    private LogEntryService logEntryService;
////    private final LogEntryService logEntryService; ??????
//
//    @GetMapping("/entries")
//    public List<LogEntry> getAllLogEntries() {
//        // Your code to get and return all log entries
//        return logEntryService.getAllLogEntries();
//    }
//
//    @PostMapping("/create")
//    public LogEntry createLogEntry(@RequestBody String route) {
//        return logEntryService.createLogEntry(route);
//    }
//
////    @PostMapping("/create")
////    public LogEntry createLogEntry(@RequestBody LogEntry logEntry) {
////        return logEntryService.createLogEntry(logEntry.getMessage());
////    }
//}






//@RestController
//@RequestMapping("/logs")
//public class LogController {
//
//    @Autowired
//    private LogEntryService logEntryService;
//
//    @GetMapping("/entries")
//    public List<LogEntry> getAllLogEntries() {
//        return logEntryService.getAllLogEntries();
//    }
//
//    @PostMapping("/create")
//    public LogEntry createLogEntry(@RequestBody String route) {
//        return logEntryService.createLogEntry(route);
//    }
//}
