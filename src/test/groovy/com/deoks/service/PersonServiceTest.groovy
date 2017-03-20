package com.deoks.service;

import com.deoks.config.DemoApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by deokar on 3/16/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= DemoApp.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonServiceTest {

    @Autowired
       PersonService  personService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getPerson() throws Exception {
        personService.getPerson();
    }

}