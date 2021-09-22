package com.Utest.steps;



import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

import com.Utest.questions.Resultado;
import com.Utest.tasks.AbrirNavegador;
import com.Utest.tasks.Clicks;
import com.Utest.tasks.Escribir;
import com.Utest.user_interfaces.UtestPagina;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class UtestStepDefinitions {
	private UtestPagina automationpracticePage;
	public int c=0;
	  @Before
	  public void setTheStage() {
	      OnStage.setTheStage(new OnlineCast());
	  }
	  
	  @Given("Que la pagina de Utest este abierta")
	  public void que_la_pagina_de_Utest_este_abierta() {
	    // Write code here that turns the phrase above into concrete actions
		 theActorCalled("Usuario").wasAbleTo(AbrirNavegador.on(automationpracticePage));

	}


	
@When("el usuario hace click en el boton Join today")
public void el_usuario_hace_click_en_el_boton() {
    // Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.REGISTRO));
}

@When("el usuario coloca su nombre: First name")
public void el_usuario_coloca_su_nombre_First_name() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("aa", automationpracticePage.NOMBRE));
}

@When("el usuario coloca su apellido: Last name")
public void el_usuario_coloca_su_apellido_Last_name() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("aa", automationpracticePage.APELLIDO));
}

@When("el usuario coloca su correo: Email address")
public void el_usuario_coloca_su_correo_Email_address() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("abc123"+c+"@yopmail.com", automationpracticePage.EMAIL));
	c++;
}

@When("el usuario coloca su fecha de nacimiento: Date of birth")
public void el_usuario_coloca_su_fecha_de_nacimiento_Date_of_birth() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.MES));
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("mayo", automationpracticePage.MES));
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.DIA));
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("1", automationpracticePage.DIA));
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.ANIO));
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("2003", automationpracticePage.ANIO));
}


@When("el usuario hace click en el boton: Location")
public void el_usuario_hace_click_en_el_boton_Location() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.LOCACION));
}

@When("el usuario hace click en el boton: Devices")
public void el_usuario_hace_click_en_el_boton_Devices() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.DISPOSITIVOS));
}

@When("el usuario hace click en el boton: Last Step")
public void el_usuario_hace_click_en_el_boton_Last_Step() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.ULTIMOPASO));
}


@When("el usuario coloca su contrasenia: Create your uTest password")
public void el_usuario_coloca_su_contrasenia_Create_your_uTest_password() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("Je903578123", automationpracticePage.CONTRASENIA));
}

@When("el usuario vuelve a colocar su contrasenia: Confirm password")
public void el_usuario_vuelve_a_colocar_su_contrasenia_Confirm_password() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Escribir.theTerm("Je903578123", automationpracticePage.CONFIRMAR));
}

@When("el usuario hace click en el checkbox: I have read and accept")
public void el_usuario_hace_click_en_el_checkbox_I_have_read_and_accept() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.TERMINOS));
}

@When("el usuario hace click en el checkbox: Polity")
public void el_usuario_hace_click_en_el_checkbox_Polity() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.POLICY));
}
 
@When("el usuario hace click en el boton: Complete")
public void el_usuario_hace_click_en_el_boton_Complete() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight().attemptsTo(Clicks.theElement(automationpracticePage.COMPLETAR));
}
@Then("deberia aparecer: Welcome to the world's largest community of freelance software testers!")
public void deberia_aparecer_Welcome_to_the_world_s_largest_community_of_freelance_software_testers() {
    // Write code here that turns the phrase above into concrete actions
	theActorInTheSpotlight()
    .should(
    seeThat(Resultado.resultMessage(), 
    containsString("Welcome to the world's largest community of freelance software testers!")
)
);
}
	
}
