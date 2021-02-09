/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entidades.Medico;
import com.mycompany.session.MedicoFacade;
import java.util.List;
import javafx.scene.media.Media;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("medico")
public class medicoRest {
     @EJB
    private MedicoFacade medicoFacade;
    //TRAE LOS DATOS
    
    @GET
    
    //CON FORMATO JSON
    @Produces({MediaType.APPLICATION_JSON})
    
    //FUNCION para presentar los reg de la BDD
    
    public List<Medico> findAll ()
    {
        return medicoFacade.findAll();
    }

    /* 
    //TRAER UN ID ESPECIFICO DE LA BASE DE DATOS
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Personal findById(@PathParam("id") Integer id) {
        return personalFacade.find(id);
    }

    //BORRAR UN ID ESPECIFICO DE LA BASE DE DATOS
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response remove(@PathParam("id") Integer id) {
        personalFacade.remove(personalFacade.find(id));
        
        String message = "Eliminado Correctamente !!";
        return Response.ok(message).build();
    }

    //INSERTAR UN ELEMENTO EN LA BASE DE DATOS
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response create(Personal personal) {
        personalFacade.create(personal);
        
        String message = "Insertado Correctamente !!";
        return Response.ok(message).build();
    }

    //ACTUALIZAR UN ID ESPECIFICO DE LA BASE DE DATOS
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response edit(@PathParam("id") Integer id, Personal personal) 
    {
        if (personalFacade.find(id) != null) {
            personal.setId(id);
            personalFacade.edit(personal); 
        }
        String message = "Actualizado Correctamente !!";
        return Response.ok(message).build();
        
    }
     */
           
}
