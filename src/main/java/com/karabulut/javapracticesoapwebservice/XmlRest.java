package com.karabulut.javapracticesoapwebservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/xml")
public class XmlRest {

    @GET
    @Path("plain")
    @Produces("application/xml; charset=UTF-8")
    public Product getBinding(){
        Product product = new Product();
        product.setProductId(401L);
        product.setProductName("Cep Telefonu");
        product.setSalesPrice(1300.0);
        return product;
    }
}
