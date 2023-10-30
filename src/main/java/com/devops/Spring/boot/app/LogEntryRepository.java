package com.devops.Spring.boot.app;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
    // אם יש פעולות אחרות שרוצים להוסיף, יש להוסיפם כאן
}


