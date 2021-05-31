package com.kinandcarta.springaop.data;

import com.kinandcarta.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DAO1 {

    @TrackTime
    public String returnSomething(){
        return "DAO1";
    }
}
