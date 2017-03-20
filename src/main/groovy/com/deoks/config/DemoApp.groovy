package com.deoks.config

import com.deoks.data.model.Person
import com.deoks.service.PersonService
import grails.cassandra.bootstrap.CassandraDatastoreSpringInitializer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
    import org.springframework.boot.autoconfigure.SpringBootApplication
    import org.springframework.boot.SpringApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

//import static grails.async.Promises.*

    //@EnableAutoConfiguration
    @ComponentScan
    @SpringBootApplication
    class DemoApp {

        /*@Autowired
        static ApplicationContext context*/

        @Bean
        public PersonService personService() {
            return new PersonService();
        }

        static void main(String[] args) {

            SpringApplication.run(DemoApp.class,args)


            // initialize app
            //def initializer = new CassandraDatastoreSpringInitializer(['grails.cassandra.keyspace.username':'cassandra','grails.cassandra.keyspace.password':'TYkbLmZTdGc8','grails.cassandra.keyspace.name':'test','grails.cassandra.contactPoints':'deoks.eastus.cloudapp.azure.com','grails.cassandra.port':9042], Person)
            //def initializer = new CassandraDatastoreSpringInitializer(Person)
            //def applicationContext = initializer.configure()




        }

        /**
         * initialize application once our spring application context is avilable
         */
//     /*   static void init(){
//
//            def initializer = new CassandraDatastoreSpringInitializer(Person)
//            def applicationContext = initializer.configure()
//
//            println Person.count()
//
//            *//*task {
//                context.getBean(AkkaService.class).init()
//            }*//*
//
//        }*/

        /**
         * configure primary datasource bean
         * @return
         */
        /*@Bean
        @Primary
        @ConfigurationProperties(prefix="dataSources.dataSource")
        public javax.sql.DataSource dataSource() {
            return DataSourceBuilder.create().build()
        }*/



    }

