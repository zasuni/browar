package beans;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;



import domain.Piwo;
import kontroler.PiwoKontroler;

@ManagedBean(name="piwoBean")
@SessionScoped

public class PiwoBean implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Piwo piwo = new Piwo();
	private ListDataModel<Piwo> piwa = new ListDataModel<Piwo>();

	@Inject
	private PiwoKontroler piwoKontroler;
	
	public ListDataModel<Piwo> getAllPiwa() {
		piwa.setWrappedData(piwoKontroler.getPiwa());
		return piwa;
	}


	public Piwo getPiwo() {
		return piwo;
	}


	public void setPiwo(Piwo piwo) {
		this.piwo = piwo;
	}
	
	public String addPiwo() {
		piwoKontroler.dodajNowy(piwo.getMarka(), piwo.getNazwa(), piwo.getGatunek(), piwo.getOpis());
		return "mojePiwa";
	}	
	
	public String usunPiwo() {
		Piwo p = piwa.getRowData();
		piwoKontroler.usunPiwo(p);
		return null;
	}
	
	
	
}
