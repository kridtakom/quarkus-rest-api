package org.dev.repository

import io.quarkus.hibernate.orm.panache.PanacheRepository
import org.dev.model.ClientDetail
import org.springframework.data.jpa.repository.JpaRepository
import javax.enterprise.context.ApplicationScoped

//@ApplicationScoped
//class ClientDetailRepository : PanacheRepository<ClientDetail> {
//}

interface ClientDetailRepository : JpaRepository<ClientDetail, Long>