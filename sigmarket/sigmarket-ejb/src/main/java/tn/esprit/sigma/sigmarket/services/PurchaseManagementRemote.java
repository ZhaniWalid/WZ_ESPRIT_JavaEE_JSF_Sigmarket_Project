package tn.esprit.sigma.sigmarket.services;

import javax.ejb.Remote;

@Remote
public interface PurchaseManagementRemote {
	void purchase(Integer idCustomer, Integer idProduct, Integer quantity);
}
