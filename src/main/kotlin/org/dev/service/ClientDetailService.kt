package org.dev.service

import org.dev.model.ClientDetail
import org.dev.repository.ClientDetailRepository
import org.springframework.stereotype.Service
import java.util.*
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

//@ApplicationScoped
//@Transactional
@Service
class ClientDetailService(
    private val clientDetailRepository: ClientDetailRepository
) {


    fun findAll(): List<ClientDetail> {
        return clientDetailRepository.findAll()
    }

    fun findById(id: Long): Optional<ClientDetail>? {
        return clientDetailRepository.findById(id)
    }

    fun create(clientDetail: ClientDetail): ClientDetail? {
        return clientDetailRepository.save(clientDetail)
    }

    fun delete(id: Long) = clientDetailRepository.deleteById(id)

    fun update(id: Long, clientDetail: ClientDetail): Any? {
        val old = clientDetailRepository.findById(id).orElseThrow { RuntimeException() }
        val updated = clientDetail.copy(id = id)
        return clientDetailRepository.save(updated)
    }

}