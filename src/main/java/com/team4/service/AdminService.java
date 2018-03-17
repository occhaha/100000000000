package com.team4.service;

import com.team4.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin loginVerification(String id, String password);
    List<Admin> getAllFrontAdmin();
    Integer delAdminById(String id);
    boolean batchDelAdmin(String[] adminItems) throws RuntimeException;
}
