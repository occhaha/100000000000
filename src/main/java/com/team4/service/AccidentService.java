package com.team4.service;

import com.team4.entity.Accident;

import java.util.List;

public interface AccidentService {

    public void saveAccident(Accident accident);

    public Integer deleteAccident(String accid);

    public boolean updateAccident(Accident accident);

    Accident findAccidentById(String accid);

    public List<Accident> findAllAccident();

    boolean batchDelAccident(String[] accidentItems) throws RuntimeException;

}