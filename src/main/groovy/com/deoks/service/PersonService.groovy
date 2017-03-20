package com.deoks.service

import com.deoks.data.model.Person
import grails.cassandra.bootstrap.CassandraDatastoreSpringInitializer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.web.context.WebApplicationContext

/**
 * Created by deokar on 3/16/17.
 */
@Component
class PersonService {

    @Autowired
    private ApplicationContext context


    def getPerson(){
        def initializer = new CassandraDatastoreSpringInitializer(context.getEnvironment(), Person)
        initializer.configureForBeanDefinitionRegistry(context)
        println '>>>>>>>>>>>>>' + Person.count()
    }
}
