package com.mm.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.mm.model.ProductType;
import com.mm.services.ProductTypeService;

@Path("/ptype")
public class ProductTypeRest {
	
	private ProductTypeService productTypeService;
	
	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService; 
	}
	
	@POST
	@Path("/create")
	@Produces("application/json")
	@Consumes("application/json")
	public Response createProductType(ProductType producttype) {
		getProductTypeService().save(producttype);
		return Response.ok(producttype).build();
	}
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public List<ProductType> getAll() {
		return getProductTypeService().retriveAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public ProductType getById(@PathParam("id") final Integer id) {
		return getProductTypeService().findBy(id);
	}
	
	@DELETE
    @Path("/delete/{id}")
    @Consumes("application/json")
    public void deleteProductType(@PathParam("id") final Integer id) {
        getProductTypeService().delete(getProductTypeService().findBy(id));
    }
	
	@PUT
    @Path("/update")
    @Consumes("application/json")
    public void updateProductType(ProductType producttype) {
        getProductTypeService().update(producttype);
    }
	
	@PUT
    @Path("/updateList")
    @Consumes("application/json")
    public void updateListProductTypes(List<ProductType> producttypes) {
        for(ProductType producttype : producttypes){
        	getProductTypeService().update(producttype);
        }
    }
}
