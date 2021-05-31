package com.kinandcarta.springaop.business;

import com.kinandcarta.springaop.aspect.TrackTime;
import com.kinandcarta.springaop.data.DAO1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private DAO1 dao1;

    @TrackTime
    public  String calculateSomething(){
            return  dao1.returnSomething();
    }
}
