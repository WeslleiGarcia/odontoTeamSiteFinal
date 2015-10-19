package odontoTeam.com.br;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

public class SelectOneMenuView {
	 private String estado;  
	    private List<SelectItem> estados;
	    
	    @PostConstruct
	    public void init() {
	        //cars
	        SelectItemGroup g1 = new SelectItemGroup("Estados");
	        g1.setSelectItems(new SelectItem[] {new SelectItem("Am", "Amazonas"), new SelectItem("Pa", "Pará"), new SelectItem("Ac", "Acre")});
	         
	        estados = new ArrayList<SelectItem>();
	        estados.add(g1);
	    }
}
