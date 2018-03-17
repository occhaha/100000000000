package com.team4.service;

import com.team4.dao.AccidentMapper;
import com.team4.entity.Accident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccidentServiceImpl implements AccidentService {

    @Autowired
    private AccidentMapper accidentMapper;

    public void saveAccident(Accident accident) {
        accidentMapper.saveAccident(accident);
    }

    public Integer deleteAccident(String accid){
        return accidentMapper.deleteAccident(accid);
    }
    public boolean updateAccident(Accident accident) {
        return accidentMapper.updateAccident(accident);
    }
    public Accident findAccidentById(String accid)
    {
        Accident accident = accidentMapper.findAccidentById(accid);
        return accident;
    }

    public List<Accident> findAllAccident()
    {
        return accidentMapper.findAllAccident();
    }

    @Transactional
    public boolean batchDelAccident(String[] accidentItems) throws RuntimeException{
        int flag = 0;
        System.out.println(accidentItems[0]);
        for (String accidentItemId:accidentItems) {
            flag = accidentMapper.deleteAccident(accidentItemId);
            if(flag != 1){
                throw new RuntimeException();
            }
        }
        return true;
    }
}