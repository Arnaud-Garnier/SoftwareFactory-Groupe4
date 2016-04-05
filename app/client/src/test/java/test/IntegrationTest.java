package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import stubs.cart.Item;
import stubs.customerCare.Cookies;
import api.TCFPublicAPI;

public class IntegrationTest {
	
	/**
	 * Teste qu'un client peut commander et payer un cookie.
	 * Test d'intégration : client -> j2e -> .NET -> j2e -> client.
	 * 
	 * @throws Exception
	 */
	@Test
	public void orderAndPayTest() throws Exception {
		TCFPublicAPI system = new TCFPublicAPI("localhost", "8080");
		Item item = new Item();
		
		item.setQuantity(8);
		item.setCookie(stubs.cart.Cookies.CHOCOLALALA);
		
		system.ccs.register("Lisa", "532097547654765");
		assertEquals(system.carts.getCustomerCartContents("Lisa").size(), 0);
		system.carts.addItemToCustomerCart("Lisa",item);
		assertEquals(system.carts.getCustomerCartContents("Lisa").size(), 1);
		
		assertNotNull(system.ccs.listAllRecipes());
	}
}
