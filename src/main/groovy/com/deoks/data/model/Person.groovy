package com.deoks.data.model

import grails.persistence.*

@Entity
class Person {

    UUID id
    String name

    static mapWith = "cassandra"
}