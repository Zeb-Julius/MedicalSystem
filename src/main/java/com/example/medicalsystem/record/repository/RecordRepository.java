package com.example.medicalsystem.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record,Integer> {
    Record findByToken(String token);

    Record findByRecordNumber(String recordNumber);
}
