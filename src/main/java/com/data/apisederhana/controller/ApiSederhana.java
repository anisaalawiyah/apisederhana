package com.data.apisederhana.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiSederhana {
    @GetMapping("api")
    public Map<String,Object> dataApi(){
        Map<String,Object> obj= new HashMap<>();
        obj.put("usia",20);
        obj.put("nama","wahyu");
        Map<String,Object> obj1= new HashMap<>();
        obj1.put("perusahaan","posisi");
        obj1.put("Posisi","Sofware Engineer");
        obj.put("pekerjaan",obj1);
        ArrayList<String> obj2= new ArrayList<>();
        obj2.add("java");
        obj2.add("python");
        obj2.add("java Script");
        obj.put("skill",obj2);
        Map<String,Object> obj3= new HashMap<>();
        obj3.put("Provinsi","jawa barat");
        obj3.put("Kota","Bandung");
        obj3.put("kecamatan","cicendo");
        obj.put("alamat",obj3);
        return obj;
    }
    // @GetMapping
    // public Map<String,Object> dataApi(){
    //     Map<String,Object> obj = new HashMap<>();
    //     obj.put("naman","20");
    //     ArrayList<String> obj2= new ArrayList<>();
        
    //     return obj;

        
    // }

    
}
