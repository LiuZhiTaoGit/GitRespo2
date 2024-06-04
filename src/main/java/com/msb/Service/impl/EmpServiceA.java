package com.msb.Service.impl;

import com.msb.Dao.EmpDao;
import com.msb.Dao.impl.EmpDaoA;
import com.msb.Service.EmpService;
import com.msb.pojo.Emp;

import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/6/4 - 06 - 04 - 12:42
 * @description: com.msb.Service.impl
 * @version: 1.0
 */
public class EmpServiceA implements EmpService {
    private EmpDao empDao = new EmpDaoA();
    @Override
    public List<Emp> getDaoList() {
        List<Emp> emps = empDao.getList();
        //        2\ 对数据进行转换处理
        emps.stream().forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("学生");
            }else if("2".equals(job)){
                emp.setJob("老师");
            }else if("3".equals(job)){
                emp.setJob("其他人员");
            }
        });
        return emps;
    }
}
