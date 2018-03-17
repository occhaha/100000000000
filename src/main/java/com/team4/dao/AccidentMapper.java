package com.team4.dao;

import com.team4.entity.Accident;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccidentMapper {

    public void saveAccident(Accident accident);

    public Integer deleteAccident(String accid);

    public boolean updateAccident(Accident accident);

    Accident findAccidentById(String accid);

    public List<Accident> findAllAccident();

}
