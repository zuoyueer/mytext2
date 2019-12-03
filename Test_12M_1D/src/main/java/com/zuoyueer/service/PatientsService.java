package com.zuoyueer.service;

import com.zuoyueer.domain.Patients;

import java.util.List;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 15:12
 * @projectName Framework
 * @description: TODO
 */
public interface PatientsService {
    public List<Patients> findAll();

    void save(Patients patients);

    void update(Patients patients);

    public  Patients findById(Integer id);
}
