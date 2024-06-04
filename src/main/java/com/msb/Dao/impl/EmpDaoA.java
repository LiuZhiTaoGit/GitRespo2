package com.msb.Dao.impl;

import com.msb.Dao.EmpDao;
import com.msb.pojo.Emp;
import com.msb.utils.XmlParserUtils;

import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/6/4 - 06 - 04 - 12:41
 * @description: com.msb.Dao.impl
 * @version: 1.0
 */
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> getList() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();

        List<Emp> empsList = XmlParserUtils.parse(file, Emp.class);
//        System.out.println(emps);
        return empsList;
    }
}
