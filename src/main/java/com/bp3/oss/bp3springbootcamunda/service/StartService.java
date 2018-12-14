package com.bp3.oss.bp3springbootcamunda.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartService {

    @Autowired
    private RuntimeService runtimeService;

    public String startProcess1(final String name) {
        return runtimeService.startProcessInstanceByKey("Process_1", name).getId();
    }
}
