package org.dev.controller

import org.dev.model.ClientDetail
import org.dev.service.ClientDetailService
import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.PUT
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/client-detail")
class ClientDetailController(
    val clientDetailService: ClientDetailService
) {

    @GET
    fun findAll(): Response? {
        return Response.ok(clientDetailService.findAll()).build()
    }

    @POST
    fun create(clientDetail: ClientDetail): Response? {
        return Response.status(Response.Status.CREATED).entity(clientDetailService.create(clientDetail)).build()
    }

    @PUT
    @Path("/{id}")
    fun update(@PathParam id: String, clientDetail: ClientDetail): Response? {
        return Response.ok(clientDetailService.update(id.toLong(), clientDetail)).build()
    }

    @DELETE
    @Path("/{id}")
    fun delete(@PathParam id: String): Response {
        clientDetailService.delete(id.toLong())
        return Response.ok("Delete Client-detail id $id success.").build()
    }

    @GET
    @Path("/{id}")
    fun findById(@PathParam id: String): Response {
        return Response.ok(clientDetailService.findById(id.toLong())).build()
    }
}