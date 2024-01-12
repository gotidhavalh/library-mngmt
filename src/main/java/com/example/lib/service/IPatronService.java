package com.example.lib.service;

import com.example.lib.entity.Patron;

import java.util.List;

public interface IPatronService {

    List<Patron> getAllPatrons();

    String addPatron(Patron patron);

    String getPatronbyId(int id);

    String detetePatronbyId(int id);

    String updatePatronbyId(int id , Patron patron);
}
