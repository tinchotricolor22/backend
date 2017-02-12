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

import com.mm.model.TradeMark;
import com.mm.services.TradeMarkService;

@Path("/trademark")
public class TradeMarkRest {
	
	private TradeMarkService tradeMarkService;
		
	public TradeMarkService getTradeMarkService() {
		return tradeMarkService;
	}

	public void setTradeMarkService(TradeMarkService tradeMarkService) {
		this.tradeMarkService = tradeMarkService;
	}

	@POST
	@Path("/create")
	@Produces("application/json")
	@Consumes("application/json")
	public Response createTradeMark(TradeMark trademark) {
		getTradeMarkService().save(trademark);
		return Response.ok(trademark).build();
	}
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public List<TradeMark> getAll() {
		return getTradeMarkService().retriveAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public TradeMark getById(@PathParam("id") final Integer id) {
		return getTradeMarkService().findBy(id);
	}
	
	@DELETE
    @Path("/delete/{id}")
    @Consumes("application/json")
    public void deleteTradeMark(@PathParam("id") final Integer id) {
        getTradeMarkService().delete(getTradeMarkService().findBy(id));
    }
	
	@PUT
    @Path("/update")
    @Consumes("application/json")
    public void updateTradeMark(TradeMark trademark) {
        getTradeMarkService().update(trademark);
    }
	
	@PUT
    @Path("/updateList")
    @Consumes("application/json")
    public void updateListTradeMarks(List<TradeMark> trademarks) {
        for(TradeMark trademark : trademarks){
        	getTradeMarkService().update(trademark);
        }
    }
}
