package com.rab3tech.customer.service.impl;

import com.rab3tech.customer.dao.repository.SecurityQuestionsRepository;
import com.rab3tech.dao.entity.SecurityQuestions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTestST {

//    @Override
//    public List<SecurityQuestions> findAllQuestion() {
//        List<SecurityQuestions> questionsList = securityQuestionsRepository.findAll();
//        return questionsList;
//    }

    @Mock
    SecurityQuestionsRepository securityQuestionsRepository;

    @InjectMocks
    CustomerServiceImpl customerServiceImpl;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findAllquestionTest(){

        SecurityQuestions securityQuestions1 = new SecurityQuestions(1,"What is your name?",
                "True","Shanker", new Timestamp(System.currentTimeMillis()),
                new Timestamp(new Date().getTime()));

        SecurityQuestions securityQuestions2 = new SecurityQuestions(1,"What is your last name?",
                "false","Tamang", new Timestamp(System.currentTimeMillis()),
                new Timestamp(new Date().getTime()));

        List <SecurityQuestions> list = new ArrayList<>();
        list.add(securityQuestions1);
        list.add(securityQuestions2);


        when(securityQuestionsRepository.findAll()).thenReturn(list);

        assertEquals(list, customerServiceImpl.findAllQuestion());

        verify(securityQuestionsRepository, times(1)).findAll();




    }


}