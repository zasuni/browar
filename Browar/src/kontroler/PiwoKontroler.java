package kontroler;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import domain.Piwo;
 
@ApplicationScoped
public class PiwoKontroler {
	
	private List<Piwo> piwa;
	private int lastId = 1;
	
	public PiwoKontroler() {
		piwa = new ArrayList<Piwo>();
		generujDaneTestowe();
	}
		
	public void dodajNowy(String marka, String nazwa, String gatunek, String opis) {
		
		piwa.add(new Piwo(lastId++, marka, nazwa , gatunek, opis));
				
	}	 
	
	public void usunPiwo(Piwo piwo) {
		
		piwa.remove(piwo);
		
	} 

	public List<Piwo> getPiwa() {
		  
		return piwa;
	}
	
	public Piwo getPiwoById(int id){
		
		Piwo piwo = null;
		
		for(Piwo p : piwa){
			if(p.getId()==id){
				piwo=p;
				break;
			}
		}
		
		return piwo;
	}

	public void generujDaneTestowe(){
		piwa.add(new Piwo(lastId++, "Pilsner","Urquell","Pilzner", "Jasne piwo produkowane w Pilznie w Czechach. [Prazdroj] oznacza pierwsze Ÿród³o, praŸród³o (piwa dolnej fermentacji). Pierwsze masowo produkowane piwo tzw. dolnej fermentacji (fermentowane w niskich temperaturach) na œwiecie, w miejskim browarze w Pilznie za³o¿onym w 1842 r. Produkcja piwa nadzorowana by³a przez bawarskiego piwowara Josefa Grolla, który poprowadzi³ browar w Pilznie. To od nazwy miejscowoœci, której miejski browar rozpropagowa³ produkcjê klarownego piwa metod¹ dolnej fermentacji, (pilsner) wziê³y pocz¹tek wszystkie piwa typu pils, a sam Pilsner jest do dziœ przez wielu uznawany za wzorzec jasnego piwa. Zawiera 4,4% alk."));
		piwa.add(new Piwo(lastId++, "Warka","Strong","Marcowe", "Recepturê Stronga w 1992 roku wymyœli³ Jerzy Kula[1]. Pocz¹tkowo piwo funkcjonowa³o pod nazw¹ Warka Strong z etykiet¹ w kolorach: bia³ym, czerwonym i z³otym. Elementem graficznym wyró¿nionym na przedniej etykiecie by³ wizerunek Kazimierza Pu³askiego. Decyzjê o rozdzieleniu Warki jasnej pe³nej od Stronga jako samodzielnej marki podjêto w 2004 roku. Wp³ynê³a ona na odœwie¿enie projektu graficznego opakowañ. W 2006 roku Grupa ¯ywiec wprowadzi³a na rynek Stronga w nowych butelkach i puszkach utrzymanych w czarno-z³otej kolorystyce. Projekt opakowañ ponownie zmodyfikowano trzy lata póŸniej – w sierpniu 2009 roku. Pojawi³o siê nowe logo, na etykietach wyró¿niono napis „dwus³odowy” i opatrzono je siedmioma gwiazdkami[2]. Strong rozlewany jest do butelek 0,5l oraz puszek 0,5 l oraz kegów 30 l."));
		piwa.add(new Piwo(lastId++, "Kormoran","Marcowe z Browaru Kormoran","Marcowe", "Marcowe to ikona europejskiego piwowarstwa. Piwo to charakteryzuje siê g³êbok¹ z³ot¹ barw¹, pe³nym s³odowym smakiem i gêst¹ bia³¹ piana. Warzone raz w roku wiosn¹ (st¹d jego nazwa) le¿akuje przez ca³e lato aby oddaæ to co najlepsze jesieni¹. Piwo to pozostawa³o te¿ uk³onem w stronê przyrody, gdy¿ wznoszono nim toast z okazji do¿ynek i pocz¹tku sezonu piwowarskiego. Tak by³o te¿ na Warmii. Dlatego te¿ ka¿dego sezonu warzymy piwo marcowe dziêkuj¹c za plony i wznosz¹c toast za powodzenie. By podkreœliæ tradycyjne podejœcie do warzenia marcowego le¿akujemy je z dêbowymi wiórami."));
		piwa.add(new Piwo(lastId++, "Heineken","Heineken","Jasny Lager", "Heineken jest najs³ynniejsz¹ mark¹ holenderskiej grupy. Piwo ma blado¿ó³t¹ barwê (7 EBC) oraz lekki, nieskomplikowany smak, cechuje je „du¿a stabilnoœæ i swoista szlachetna subtelnoœæ”[2]. Warzone jest z brzeczki o ekstrakcie 11,4%, zawiera 5% alkoholu i 23 jednostki goryczy IBU[3]. Na pocz¹tku lat dziewiêædziesi¹tych XX wieku browar zaprzesta³ wytwarzania piwa z udzia³em kukurydzy jako zamiennika s³odu i ponownie zacz¹³ warzyæ piwo jedynie ze s³odów jêczmiennych z domieszk¹ pszenicznego[4]. Nad zachowaniem identycznego smaku piwa we wszystkich filiach grupy czuwa Heineken Technisch Beheer (HTB) - centrum zarz¹dzania jakoœci¹, które nadzoruje proces produkcji[5]. Od lipca 2001 roku Heineken warzony jest w browarze w ¯ywcu, a od 2008 równie¿ w browarze w Warce[6]. Dostêpny jest w butelkach 0,33 l, 0,5 l oraz 0,65 l, puszkach 0,5 l oraz kegach 20 l i 30 l. Marka s³ynie z innowacyjnych rozwi¹zañ, m.in. 5-litrowej beczki DraughtKeg z systemem ciœnienia, dziêki któremu piwo zachowuje œwie¿oœæ 30 dni po otwarciu. Innym autorskim patentem Heinekena jest system Extra Cold pozwalaj¹cy serwowaæ piwo o znacznie obni¿onej temperaturze."));
		piwa.add(new Piwo(lastId++, "Browary Lubelskie","Per³a","Pilzner", "OrzeŸwiaj¹ce piwo bêd¹ce kwintesencj¹ tradycyjnych metod produkcji i najnowszych rozwi¹zañ stosowanych w browarnictwie. Posiada charakterystyczny, zdecydowany smak, z³ocisty kolor oraz subtelny zapach aromatycznego chmielu. Walory te sprawiaj¹, ¿e w wiêkszoœci po Per³ê Export siêgaj¹ m³odzi konsumenci. Docelowo przeznaczona jest na rynki zagraniczne, ale wystêpuje równie¿ w Polsce, g³ównie na LubelszczyŸnie i wybranych kana³ach dystrybucji na terenie ca³ego kraju."));
	}


} 	


