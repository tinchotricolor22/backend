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

import com.mm.model.ProductTypeCategory;
import com.mm.services.ProductTypeCategoryService;

@Path("/ptypecat")
public class ProductTypeCategoryRest {
	
	private ProductTypeCategoryService productTypeService;
	
	public ProductTypeCategoryService getProductTypeCategoryService() {
		return productTypeService;
	}

	public void setProductTypeCategoryService(ProductTypeCategoryService productTypeService) {
		this.productTypeService = productTypeService; 
	}
	
	@POST
	@Path("/create")
	@Produces("application/json")
	@Consumes("application/json")
	public Response createProductTypeCategory(ProductTypeCategory producttypecat) {
		getProductTypeCategoryService().save(producttypecat);
		return Response.ok(producttypecat).build();
	}
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public List<ProductTypeCategory> getAll() {
		return getProductTypeCategoryService().retriveAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public ProductTypeCategory getById(@PathParam("id") final Integer id) {
		return getProductTypeCategoryService().findBy(id);
	}
	
	@DELETE
    @Path("/delete/{id}")
    @Consumes("application/json")
    public void deleteProductTypeCategory(@PathParam("id") final Integer id) {
        getProductTypeCategoryService().delete(getProductTypeCategoryService().findBy(id));
    }
	
	@PUT
    @Path("/update")
    @Consumes("application/json")
    public void updateProductTypeCategory(ProductTypeCategory producttypecat) {
        getProductTypeCategoryService().update(producttypecat);
    }
	
	@PUT
    @Path("/updateList")
    @Consumes("application/json")
    public void updateListProductTypeCategorys(List<ProductTypeCategory> producttypecats) {
        for(ProductTypeCategory producttypecat : producttypecats){
        	getProductTypeCategoryService().update(producttypecat);
        }
    }
}
