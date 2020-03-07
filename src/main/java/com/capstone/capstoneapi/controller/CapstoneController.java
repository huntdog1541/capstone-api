package com.capstone.capstoneapi.controller;

import com.capstone.capstoneapi.Utils.CapstoneUtils;
import com.capstone.capstoneapi.model.CapstoneRequest;
import com.capstone.capstoneapi.services.CapstoneServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapstoneController
{
    CapstoneServices capstoneServices = new CapstoneServices();

    @PostMapping("/capstone")
    CapstoneRequest create(@RequestBody CapstoneRequest capstoneRequest)
    {
        System.out.println("Arch: " + capstoneRequest.getArchitecture() + " Mode: " +  capstoneRequest.getMode());
        System.out.println("Code: " + capstoneRequest.getCode() + " Syntax: " + capstoneRequest.getSyntax());
        capstoneRequest.updateValues();
        System.out.println("Arch_Num: " + capstoneRequest.getArch_num() + " Mode_Num: " + capstoneRequest.getMode_num());
        return capstoneRequest;
    }
}
