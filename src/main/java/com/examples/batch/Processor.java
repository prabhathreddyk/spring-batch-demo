package com.examples.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.examples.model.Aggrement;

import java.util.Date;

@Component
public class Processor implements ItemProcessor<Aggrement, Aggrement> {

    public Processor() {
    }

    @Override
    public Aggrement process(Aggrement aggrement) throws Exception {
    	aggrement.setTime(new Date());
        System.out.println("Aggrement : "+ aggrement);
        return aggrement;
    }
}
