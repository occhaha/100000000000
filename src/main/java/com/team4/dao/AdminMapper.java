package com.team4.dao;

import com.team4.entity.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {

    @Select("select * from admin where id = #{id} and password = #{password}")
    Admin getAdmin(@Param("id")String id, @Param("password")String password);

    @Select("select * from admin where authority = 1")
    List<Admin> getAllFrontAdmin();

    @Delete("delete from admin where id = #{id}")
    Integer delAdminById(@Param("id")String id);
}
