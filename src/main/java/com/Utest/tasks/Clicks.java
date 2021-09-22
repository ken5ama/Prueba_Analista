package com.Utest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;




import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Clicks implements Task {

  private Target target;

  public Clicks(Target target) {
    this.target = target;
  }

  @Step("{0} hace click en un elemento")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(this.target));
  }

  public static Clicks theElement(Target target) {
    return instrumented(Clicks.class,  target);
  }

}
