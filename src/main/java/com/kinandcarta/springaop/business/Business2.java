package com.kinandcarta.springaop.business;

import com.kinandcarta.springaop.data.DAO2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    private DAO2 dao2;

    public  String calculateSomething(){
            return  dao2.returnSomething();
    }
}
