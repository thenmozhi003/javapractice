package com.cms.cms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.cms.cms.model.ApplicantModel;
import com.cms.cms.repository.ApplicantRepository;

@Controller
public class ApplicantController {
    @Autowired
    private ApplicantRepository userrepo;

    @GetMapping("/error")
    public String error() {
        return "Error handling";
    }


    @GetMapping("/details")
        public String index(){
            return "index";
    }

    @PostMapping("/details")
    public String submitPersonalInfoForm(ApplicantModel usernew, Model model){
        userrepo.save(usernew);
        System.out.println("Data Saved Successfully");
        return "add-image";
    }    
}
   