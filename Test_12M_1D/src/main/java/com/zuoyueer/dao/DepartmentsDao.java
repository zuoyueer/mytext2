package com.zuoyueer.dao;

import com.zuoyueer.domain.Departments;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 14:53
 * @projectName Framework
 * @description: TODO
 */
public interface DepartmentsDao {
    @Select("select * from departments")
    public List<Departments> findAll();
}
