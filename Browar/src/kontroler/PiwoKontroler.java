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
		piwa.add(new Piwo(lastId++, "Pilsner","Urquell","Pilzner", "Jasne piwo produkowane w Pilznie w Czechach. [Prazdroj] oznacza pierwsze �r�d�o, pra�r�d�o (piwa dolnej fermentacji). Pierwsze masowo produkowane piwo tzw. dolnej fermentacji (fermentowane w niskich temperaturach) na �wiecie, w miejskim browarze w Pilznie za�o�onym w 1842 r. Produkcja piwa nadzorowana by�a przez bawarskiego piwowara Josefa Grolla, kt�ry poprowadzi� browar w Pilznie. To od nazwy miejscowo�ci, kt�rej miejski browar rozpropagowa� produkcj� klarownego piwa metod� dolnej fermentacji, (pilsner) wzi�y pocz�tek wszystkie piwa typu pils, a sam Pilsner jest do dzi� przez wielu uznawany za wzorzec jasnego piwa. Zawiera 4,4% alk."));
		piwa.add(new Piwo(lastId++, "Warka","Strong","Marcowe", "Receptur� Stronga w 1992 roku wymy�li� Jerzy Kula[1]. Pocz�tkowo piwo funkcjonowa�o pod nazw� Warka Strong z etykiet� w kolorach: bia�ym, czerwonym i z�otym. Elementem graficznym wyr�nionym na przedniej etykiecie by� wizerunek Kazimierza Pu�askiego. Decyzj� o rozdzieleniu Warki jasnej pe�nej od Stronga jako samodzielnej marki podj�to w 2004 roku. Wp�yn�a ona na od�wie�enie projektu graficznego opakowa�. W 2006 roku Grupa �ywiec wprowadzi�a na rynek Stronga w nowych butelkach i puszkach utrzymanych w czarno-z�otej kolorystyce. Projekt opakowa� ponownie zmodyfikowano trzy lata p�niej � w sierpniu 2009 roku. Pojawi�o si� nowe logo, na etykietach wyr�niono napis �dwus�odowy� i opatrzono je siedmioma gwiazdkami[2]. Strong rozlewany jest do butelek 0,5l oraz puszek 0,5 l oraz keg�w 30 l."));
		piwa.add(new Piwo(lastId++, "Kormoran","Marcowe z Browaru Kormoran","Marcowe", "Marcowe to ikona europejskiego piwowarstwa. Piwo to charakteryzuje si� g��bok� z�ot� barw�, pe�nym s�odowym smakiem i g�st� bia�� piana. Warzone raz w roku wiosn� (st�d jego nazwa) le�akuje przez ca�e lato aby odda� to co najlepsze jesieni�. Piwo to pozostawa�o te� uk�onem w stron� przyrody, gdy� wznoszono nim toast z okazji do�ynek i pocz�tku sezonu piwowarskiego. Tak by�o te� na Warmii. Dlatego te� ka�dego sezonu warzymy piwo marcowe dzi�kuj�c za plony i wznosz�c toast za powodzenie. By podkre�li� tradycyjne podej�cie do warzenia marcowego le�akujemy je z d�bowymi wi�rami."));
		piwa.add(new Piwo(lastId++, "Heineken","Heineken","Jasny Lager", "Heineken jest najs�ynniejsz� mark� holenderskiej grupy. Piwo ma blado��t� barw� (7 EBC) oraz lekki, nieskomplikowany smak, cechuje je �du�a stabilno�� i swoista szlachetna subtelno��[2]. Warzone jest z brzeczki o ekstrakcie 11,4%, zawiera 5% alkoholu i 23 jednostki goryczy IBU[3]. Na pocz�tku lat dziewi��dziesi�tych XX wieku browar zaprzesta� wytwarzania piwa z udzia�em kukurydzy jako zamiennika s�odu i ponownie zacz�� warzy� piwo jedynie ze s�od�w j�czmiennych z domieszk� pszenicznego[4]. Nad zachowaniem identycznego smaku piwa we wszystkich filiach grupy czuwa Heineken Technisch Beheer (HTB) - centrum zarz�dzania jako�ci�, kt�re nadzoruje proces produkcji[5]. Od lipca 2001 roku Heineken warzony jest w browarze w �ywcu, a od 2008 r�wnie� w browarze w Warce[6]. Dost�pny jest w butelkach 0,33 l, 0,5 l oraz 0,65 l, puszkach 0,5 l oraz kegach 20 l i 30 l. Marka s�ynie z innowacyjnych rozwi�za�, m.in. 5-litrowej beczki DraughtKeg z systemem ci�nienia, dzi�ki kt�remu piwo zachowuje �wie�o�� 30 dni po otwarciu. Innym autorskim patentem Heinekena jest system Extra Cold pozwalaj�cy serwowa� piwo o znacznie obni�onej temperaturze."));
		piwa.add(new Piwo(lastId++, "Browary Lubelskie","Per�a","Pilzner", "Orze�wiaj�ce piwo b�d�ce kwintesencj� tradycyjnych metod produkcji i najnowszych rozwi�za� stosowanych w browarnictwie. Posiada charakterystyczny, zdecydowany smak, z�ocisty kolor oraz subtelny zapach aromatycznego chmielu. Walory te sprawiaj�, �e w wi�kszo�ci po Per�� Export si�gaj� m�odzi konsumenci. Docelowo przeznaczona jest na rynki zagraniczne, ale wyst�puje r�wnie� w Polsce, g��wnie na Lubelszczy�nie i wybranych kana�ach dystrybucji na terenie ca�ego kraju."));
	}


} 	


