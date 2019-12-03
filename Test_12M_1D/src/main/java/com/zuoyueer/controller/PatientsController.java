package com.zuoyueer.controller;

import com.zuoyueer.dao.PatientsDao;
import com.zuoyueer.domain.Patients;
import com.zuoyueer.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.java2d.pipe.SpanIterator;
import sun.security.krb5.internal.PAData;

import java.util.List;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 15:14
 * @projectName Framework
 * @description: TODO
 */
@Controller
@RequestMapping("patents")
public class PatientsController {

    @Autowired
    private PatientsService patientsService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Patients> findAll() {
        return patientsService.findAll();
    }


    @RequestMapping("/save")
    public String save(Patients patients){
        System.out.println(patients);
        patientsService.save(patients);
        return "subscribe-form";
    }

    @ResponseBody
    @RequestMapping("findById")
    public ModelAndView findById(String id){
        System.out.println(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("patient", patientsService.findById(Integer.parseInt(id)));
        modelAndView.setViewName("subscribe-form-update");
        return modelAndView;
    }

    @RequestMapping("update")
    public String update( Patients patients){
        System.out.println(patients);
        patientsService.update(patients);
        return "patients-list";
    }
}
