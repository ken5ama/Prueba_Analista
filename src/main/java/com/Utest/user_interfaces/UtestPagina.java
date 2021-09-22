package com.Utest.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class UtestPagina extends PageObject {
	 
	 public static final Target REGISTRO = Target.the("Boton para el registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
	 public static final Target NOMBRE = Target.the("Boton para el registro").located(By.id("firstName"));
	 public static final Target APELLIDO = Target.the("Boton para el registro").located(By.id("lastName"));
	 public static final Target EMAIL = Target.the("Boton para el registro").located(By.id("email"));
	 public static final Target MES = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"birthMonth\"]"));
	 public static final Target DIA = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"birthDay\"]"));
	 public static final Target ANIO = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"birthYear\"]"));
	 public static final Target LOCACION = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
	 public static final Target CIUDAD = Target.the("Boton para el registro").located(By.id("city"));
	 public static final Target CODIGO = Target.the("Boton para el registro").located(By.id("zip"));
	 public static final Target PAIS = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
	 public static final Target DISPOSITIVOS = Target.the("Boton para el registro").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
	 public static final Target ULTIMOPASO = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
	 public static final Target CONTRASENIA = Target.the("Boton para el registro").located(By.id("password"));
	 public static final Target CONFIRMAR = Target.the("Boton para el registro").located(By.id("confirmPassword"));
	 public static final Target TERMINOS = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label"));
	 public static final Target POLICY = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label"));
	 public static final Target COMPLETAR = Target.the("Boton para el registro").located(By.id("laddaBtn"));
	 public static final Target RESULTADO = Target.the("Boton para el registro").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
	 
	 
	
	 
	 
}
