package com.example.lib.service;

import com.example.lib.entity.BorrowingRecord;

public interface IBorrowingRecordService {

//    List<BorrowingRecord> getAllBorrowingRecords();

    String addBorrowingRecord(int bookId, int patronId , BorrowingRecord borrowingRecord);

    String updateBorrowingRecordbyId(int bookId , int PatronId, BorrowingRecord borrowingRecord);

//    String getBorrowingRecordbyId(int id);

//    String deteteBorrowingRecordbyId(int id);
}
