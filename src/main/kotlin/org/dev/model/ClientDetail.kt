package org.dev.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ClientDetail(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    var firstName: String? = null,

    var lastName: String? = null,

    var age: Int? = null,

    var email: String? = null,

    var basicSalary: Double? = null
)
