package se.systementor.unittester.Data;

import org.springframework.data.repository.CrudRepository;

public interface  LogUsageRepo extends CrudRepository<LogUsageRecord, Long> {
}
