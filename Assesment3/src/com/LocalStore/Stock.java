package com.LocalStore;

public class Stock {
    private String Stockname;
    private double rateofItem;
    private int codeofitem;
    private int quantity;

    public Stock() {
        this.Stockname = "";
        this.rateofItem = 0;
        this.codeofitem = 0;
        this.quantity = 0;
    }


    
    
    public Stock(String stockname, double rateofItem, int codeofitem, int quantity) {
		
		Stockname = stockname;
		this.rateofItem = rateofItem;
		this.codeofitem = codeofitem;
		this.quantity = quantity;
	}

	

    public Stock(Stock item) {
        this.Stockname = item.Stockname;
        this.rateofItem = item.rateofItem;
        this.codeofitem = item.codeofitem;
        this.quantity = item.quantity;

    }

    @Override
    public String toString() {
        return "Item [name=" + Stockname + ", rate=" + rateofItem + ", code=" + codeofitem
                + ", quantity=" + quantity + "]";
    }

    public String getStockname() {
        return Stockname;
    }

    public void setStockname(String Stocknname) {
        this.Stockname = Stockname;
    }

    public double getRateofItem() {
        return rateofItem;
    }

    public void setRateofItem(double rateofItem) {
        this.rateofItem = rateofItem;
    }

    public long getCodeofitem() {
        return codeofitem;
    }

    public void setCodeofitem(int codeofitem) {
        this.codeofitem = codeofitem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
  
    


}