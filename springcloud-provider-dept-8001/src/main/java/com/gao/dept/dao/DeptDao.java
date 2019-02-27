package com.gao.dept.dao;

import com.gao.api.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author jinyulinlang
 */
@Mapper
public interface DeptDao {
    /**
     * 添加 部门信息
     *
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据id查找相应的部门信息
     *
     * @param id
     * @return
     */
    Dept findById(Long id);

    /**
     * 查找所有的部门信息
     *
     * @return
     */
    List<Dept> findAll();
}
