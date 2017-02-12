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

import com.mm.model.Product;
import com.mm.services.ProductService;

@Path("/product")
public class ProductRest {
	
	private ProductService productService;
		
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@POST
	@Path("/create")
	@Produces("application/json")
	@Consumes("application/json")
	public Response createProduct(Product product) {
		getProductService().save(product);
		return Response.ok(product).build();
	}
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public List<Product> getAll() {
		return getProductService().retriveAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Product getById(@PathParam("id") final Integer id) {
		return getProductService().findBy(id);
	}
	
	@DELETE
    @Path("/delete/{id}")
    @Consumes("application/json")
    public void deleteProduct(@PathParam("id") final Integer id) {
        getProductService().delete(getProductService().findBy(id));
    }
	
	@PUT
    @Path("/update")
    @Consumes("application/json")
    public void updateProduct(Product product) {
        getProductService().update(product);
    }
	
	@PUT
    @Path("/updateList")
    @Consumes("application/json")
    public void updateListProducts(List<Product> products) {
        for(Product product : products){
        	getProductService().update(product);
        }
    }
}
