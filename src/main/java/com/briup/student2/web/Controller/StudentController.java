package com.briup.student2.web.Controller;

import com.briup.student2.util.Message;
import com.briup.student2.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "学生控制器")
public class StudentController {
    @GetMapping("/delete")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name="stuId",value = "学号",paramType = "query",dataType = "int",required = true),
                    @ApiImplicitParam(name="name",value = "姓名",paramType = "query",dataType = "String")
            }

    )
    public Message delete(int stuId,String name){

        return MessageUtil.success("删除成功");
    }
}
