package com.Utest.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class AbrirNavegador implements Task {

  private PageObject page;

  public AbrirNavegador(PageObject page) {
    this.page = page;
  }

  @Override
  @Step("{0} opens the browser on the '#page'")
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(Open.browserOn(page));
  }

  public static AbrirNavegador on(PageObject page) {

    return Tasks.instrumented(AbrirNavegador.class, page);
  }

}


