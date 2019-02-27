package com.gao.dept.service.impl;


import com.gao.api.Dept;
import com.gao.dept.dao.DeptDao;
import com.gao.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {
    /**
     *
     */
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept (dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById (id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll ();
    }
}
