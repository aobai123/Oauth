package com.example.demo.controller;


import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@SessionAttributes("authorizationRequest")
public class GrantController {
    //此处获取到申请授权的clientid用于在页面展示
    @RequestMapping("/oauth/confirm_access")
    public ModelAndView getAccessConfirmation(Map<String,Object> model )  {
        AuthorizationRequest authorizationRequest=(AuthorizationRequest)
                model.get("authorizationRequest");
        ModelAndView view =new ModelAndView("base-grant");
        view.addObject("clientId",authorizationRequest.getClientId());
        return view;
    }
}
