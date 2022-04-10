package EaseMyTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EasyMyTripClasses {
	WebDriver driver;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[1]/ul/li[1]")public WebElement trip;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[1]/ul/li[2]")public WebElement rtrip;
@FindBy(id= "FromSector_show")public WebElement from;
@FindBy(id= "Editbox13_show")public WebElement destination;
@FindBy(xpath="//*[@id=\\\"frmHome\\\"]/div[5]/div[2]/div[3]/div[1]/div[3]")public WebElement fcalendar;
@FindBy(xpath="//*[@id=\\\"frth_5_25/03/2022\\\"]")public WebElement fdate;
@FindBy(xpath="//*[@id=\"rdate\"]")public WebElement tcalendar;
@FindBy(id="//*[@id=\"frth_6_26/03/2022\"]")public WebElement tdate;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[5]/div/a")public WebElement traveller;
@FindBy(xpath="//*[@id=\"traveLer\"]")public WebElement done1;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[6]/div/a")public WebElement economy;
@FindBy(xpath="//*[@id=\"tripType\"]")public WebElement done2;
@FindBy(xpath= "//*[@id=\"search\"]/input")public WebElement search;
@FindBy(id="Editbox13_show")public WebElement clearto;
@FindBy(id="FromSector_show")public WebElement clearfrom;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[3]")public WebElement fcalendar1;//hyderabad
@FindBy(xpath="//*[@id=\"25/03/2022\"]")public WebElement fdate1;//vijayawada
@FindBy(xpath="//*[@id=\"rdate\"]")public WebElement tcalendar1;
@FindBy(id="//*[@id=\"fiv_0_27/03/2022\"]")public WebElement tdate1;

////searching Spice jets
@FindBy(xpath="//*[@id=\"hidesec\"]/div[3]/div[4]/div[1]/label/span")public WebElement spicejet;
////return calendar
@FindBy(xpath="//*[@id=\"rdate\"]") public WebElement returncalendar;
@FindBy(xpath="//*[@id=\"fst_6_02/04/2022\"]") public WebElement returndate;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[3]") public WebElement fromcalendar11;
@FindBy(xpath="//*[@id=\"fiv_4_31/03/2022\"]") public WebElement fromdate11;
//////samedate calendar
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[3]")public WebElement fsdcalendar;
@FindBy(xpath="//*[@id=\"frth_5_25/03/2022\"]")public WebElement fsddate;
@FindBy(xpath="//*[@id=\"rdate\"]")public WebElement rsdcalendar;
@FindBy(xpath="//*[@id=\"frth_5_25/03/2022\"]")public WebElement rsddate;
/////dropdownhandling
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[6]/div/a")public WebElement economydropdown;
@FindBy(xpath="//*[@id=\"myDropdown_n9\"]/div/label[3]") public WebElement business;
/////
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/div[3]/div[1]/div[6]/div/a")public WebElement economy1;
//////
@FindBy(xpath="//*[@id=\"ui-id-20\"]/span[1]")public WebElement BOM;
@FindBy(xpath="//*[@id=\"airport6\"]")public WebElement HYD;
//////webcheckin
@FindBy(xpath="//*[@id=\"frmHome\"]/div[5]/div[2]/a") public WebElement Webcheck;
@FindBy(xpath="//*[@id=\"tab-5\"]/div/p[1]/a")public WebElement Iwebcheckin;
//@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")public WebElement Wbook;
@FindBy(xpath="//*[@id=\"headerSection\"]/nav/div/a[2]/i")public WebElement Wmenu;
@FindBy(xpath="//*[@id=\"headerSection\"]/nav/div/div[5]/nav/ul/div[1]/li[2]")public WebElement Wbook;

//////
@FindBy(xpath="//*[@id=\"divchkOneStop\"]/p")public WebElement stops1;
@FindBy(xpath="")public WebElement sixpm;
//////
@FindBy(xpath = "//*[@id=\"headerSection\"]/nav/div/div[5]/nav/ul/div[1]/li[2]/a")public WebElement Book;
////
@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div/div/ul/li[1]/a/span")public WebElement Home;
@FindBy(xpath="//*[@id=\"checkin-form\"]/div[1]/div[1]/div/div[1]/div/input")public WebElement PNR;
@FindBy(xpath="//*[@id=\"checkin-emailorlast\"]")public WebElement Email;
@FindBy(xpath="//*[@id=\"checkin-form\"]/div[2]/div[2]/button")public WebElement Checkin;
@FindBy(xpath="//*[@id=\"left-accordion\"]/div[1]/a")public WebElement flightbook;
//////Flight+Hotels
@FindBy(xpath="//*[@id=\"myTopnav\"]/div[1]/ul/li[3]/a")public WebElement flightHotel;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[15]/div/div[3]/ul/li[1]")public WebElement FHtrip;
@FindBy(xpath="//*[@id=\"FromSector_show\"]")public WebElement FHfrom;
@FindBy(xpath="//*[@id=\"Editbox13_show\"]")public WebElement FHto;
@FindBy(xpath="//*[@id=\"frmHome\"]/div[15]/div/div[5]/div[1]/div[2]/input")public WebElement FHs;
@FindBy(xpath="/html/body/div[2]/div[9]/div[2]/div[1]/a[2]")public WebElement easystay;

//public EasyMyTripClasses(WebDriver driver) {
//	this.driver= driver;
	//PageFactory.initElements(driver, this);
//}

}
this is naveen badisha Project of the EaseMytrip Classes
