package com.bp3.oss.bp3springbootcamunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class ServiceTask1Delegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Executing System Task 1 Service");

        execution.setVariable("testVar", "testVar");
    }

}
