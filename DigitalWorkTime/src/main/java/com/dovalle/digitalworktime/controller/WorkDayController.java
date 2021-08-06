package com.dovalle.digitalworktime.controller;

import com.dovalle.digitalworktime.model.WorkDay;
import com.dovalle.digitalworktime.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workday")
public class WorkDayController {
    private WorkDayService workDayService;

    @Autowired
    public WorkDayController(WorkDayService workDayService) {
        this.workDayService = workDayService;
    }

    @PostMapping
    public WorkDay createWorkday(@RequestBody WorkDay workDay){
        return this.workDayService.saveWorkday(workDay);
    }

    @GetMapping
    public List<WorkDay> getWorkdayList(){
        return this.workDayService.findAll();
    }
    @GetMapping("/idWorkday")
    public ResponseEntity<WorkDay> getWordayBy(@PathVariable("/idWorkday") Long idWorkday) throws Exception{
        return ResponseEntity.ok(this.workDayService.getById(idWorkday).orElseThrow(() -> new NoSuchElementException("Workday not found! ")));
    }

}
