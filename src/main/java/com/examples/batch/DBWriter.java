package com.examples.batch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examples.model.Aggrement;
import com.examples.repository.AgreementRepository;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Aggrement> {

    private AgreementRepository agreementRepository;

    @Autowired
    public DBWriter (AgreementRepository agreementRepository) {
        this.agreementRepository = agreementRepository;
    }

    @Override
    public void write(List<? extends Aggrement> agreements) throws Exception{
        System.out.println("Data Saved for agreements: " + agreements);
        agreementRepository.saveAll(agreements);
    }
}
