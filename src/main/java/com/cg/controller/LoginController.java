package com.cg.controller;


import com.cg.entity.generate.Account;
import com.cg.service.IAccountService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;




@RequestMapping("/login")
@Controller
public class LoginController {
    @Autowired
    private IAccountService accountServiceImpl;

    @RequestMapping("/index")
    public String index() {
        return "/login/login";
    }


    @RequestMapping("/beforeRegister")
    public String beforeRegister() {
        return "login/register";
    }

    @RequestMapping("/topFirst")
    public String topFirst() {
        return "login/enroll-top-first";
    }

    @RequestMapping("/topSecond")
    public String topSecond() {
        return "login/enroll-top-second";
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(df, true);//true表示允许为空，false反之
        binder.registerCustomEditor(Date.class, editor);
    }

    @RequestMapping("/register")
    @ResponseBody
    public Map<String, Object> signup(@RequestBody Account account) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (StringUtils.isNotBlank(account.getAccountName()) && StringUtils.isNotBlank(account.getAccountPassword()) && StringUtils.isNotBlank(account.getAccountAddress()) && StringUtils.isNotBlank(account.getAccountAutograph()) && StringUtils.isNotBlank(account.getAccountEmail())) {
            accountServiceImpl.insert(account);
            map.put("success", "true");
        } else {
            map.put("success", "false");
            map.put("msg",
                    "注册信息有问题，请重新填写");
        }
        return map;
    }
}
