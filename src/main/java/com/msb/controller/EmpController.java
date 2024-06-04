package com.msb.controller;

import com.msb.Service.EmpService;
import com.msb.Service.impl.EmpServiceA;
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
    private EmpService empService = new EmpServiceA();

    @RequestMapping("/listEmp")
    public Result list(){
        List<Emp> daoList = empService.getDaoList();


//        3、 响应数据
        return Result.success(daoList);


    }
}
