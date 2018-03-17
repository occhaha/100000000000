package com.team4.service;

import com.team4.dao.AdminMapper;
import com.team4.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin loginVerification(String id,String password){
        Admin admin = adminMapper.getAdmin(id,password);
        return admin;
    }

    public List<Admin> getAllFrontAdmin() {
        return adminMapper.getAllFrontAdmin();
    }

    public Integer delAdminById(String id) {
        return adminMapper.delAdminById(id);
    }

    @Transactional
    public boolean batchDelAdmin(String[] adminItems) throws RuntimeException{
        int flag = 0;
        System.out.println(adminItems[0]);
        for (String adminItemId:adminItems) {
            flag = adminMapper.delAdminById(adminItemId);
            if(flag != 1){
                throw new RuntimeException();
            }
        }
        return true;
    }

}
