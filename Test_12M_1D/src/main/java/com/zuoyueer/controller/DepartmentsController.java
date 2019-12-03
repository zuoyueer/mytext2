package com.zuoyueer.controller;

import com.zuoyueer.domain.Departments;
import com.zuoyueer.service.DepartmentsService;
import com.zuoyueer.service.impl.DepartmentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 14:56
 * @projectName Framework
 * @description: TODO
 */
@RestController
@RequestMapping("/departments")
public class DepartmentsController {
    @Autowired
    private DepartmentsService departmentsService;

    @RequestMapping("/findAll")
    public List<Departments> findAll(){
        return departmentsService.findAll();
    }
}
