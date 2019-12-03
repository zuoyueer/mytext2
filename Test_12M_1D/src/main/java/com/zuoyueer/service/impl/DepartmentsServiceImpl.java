package com.zuoyueer.service.impl;

import com.zuoyueer.dao.DepartmentsDao;
import com.zuoyueer.domain.Departments;
import com.zuoyueer.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 14:55
 * @projectName Framework
 * @description: TODO
 */
@Service
public class DepartmentsServiceImpl implements DepartmentsService {
    @Autowired
    private DepartmentsDao departmentsDao;

    @Override
    public List<Departments> findAll() {
        return departmentsDao.findAll();
    }
}
