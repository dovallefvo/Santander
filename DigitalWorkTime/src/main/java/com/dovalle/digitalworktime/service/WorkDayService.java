package com.dovalle.digitalworktime.service;

import com.dovalle.digitalworktime.model.WorkDay;
import com.dovalle.digitalworktime.repository.WorkDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkDayService {
    private WorkDayRepository workDayRepository;

    @Autowired
    public WorkDayService(WorkDayRepository workDayRepository){
        this.workDayRepository = workDayRepository;
    }

    public WorkDay saveWorkday(WorkDay workDay){
        return workDayRepository.save(workDay);

    }

    public List<WorkDay> findAll() {
        return   workDayRepository.findAll();
    }

    public Optional<WorkDay> getById(Long idWorkDay) {
        return workDayRepository.findById(idWorkDay);
    }

    public WorkDay updateWorkday(WorkDay workDay){
        return workDayRepository.save(workDay);

    }

    public void deleteWorkday(Long idWorkDay) {
        workDayRepository.deleteById(idWorkDay);
    }
}
