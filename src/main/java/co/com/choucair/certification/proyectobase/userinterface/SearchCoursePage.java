package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject{
    public static final Target BUTTON_UC= Target.the("selecciona la universidad").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE= Target.the("buscar el curso").located(By.id("coursearchbox"));
    public static final Target BUTTON_GO= Target.the("CLICK PARA BUSCAR EL CURSO").located(By.id("//button[@class,'btn-btn-primary']"));
    public static final Target SELECT_COURSE= Target.the("button to confirm login").located(By.xpath("//h4[contains(text(),'recursos automatizacion bancolombia')]"));
}
