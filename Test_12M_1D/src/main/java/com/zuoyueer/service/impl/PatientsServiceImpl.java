package com.zuoyueer.service.impl;

import com.zuoyueer.dao.PatientsDao;
import com.zuoyueer.domain.Patients;
import com.zuoyueer.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 15:13
 * @projectName Framework
 * @description: TODO
 */
@Service
public class PatientsServiceImpl implements PatientsService {
    @Autowired
    private PatientsDao patientsDao;

    @Override
    public List<Patients> findAll() {
        return patientsDao.findAll();
    }

    @Override
    public void save(Patients patients) {
        patientsDao.save(patients);
    }
    @Override
    public  Patients findById(Integer id){
        return patientsDao.findById(id);
    }

    @Override
    public void update(Patients patients) {
        patientsDao.uptdae(patients);
    }
}
