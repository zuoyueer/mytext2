package com.zuoyueer.dao;

import com.zuoyueer.domain.Patients;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 15:11
 * @projectName Framework
 * @description: TODO
 */
public interface PatientsDao {
    @Select("SELECT * FROM  patients")
    public List<Patients> findAll();

    @Insert("INSERT INTO patients VALUES (null, #{name}, #{gender}, #{did}, NULL);")
    void save(Patients patients);

    @Select("select * from patients where id=#{id}")
    public Patients findById(Integer id);

    @Update("update patients set advice=#{advice} where id=#{id}")
    void uptdae(Patients patients);


}
