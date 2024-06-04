package com.msb.controller;

import com.msb.pojo.Emp;
import com.msb.pojo.Result;
import com.msb.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/6/4 - 06 - 04 - 11:10
 * @description: com.msb.controller
 * @version: 1.0
 */
@RestController
public class EmpController {
    @RequestMapping("/listEmp")
    public Result list(){
//        1\ 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();

        List<Emp> emps = XmlParserUtils.parse(file, Emp.class);
        System.out.println(emps);

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

//        3、 响应数据
        return Result.success(emps);


    }
}
