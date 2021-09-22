package com.Utest.questions;

import com.Utest.user_interfaces.UtestPagina;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Resultado implements Question<String> {
  @Override
  public String answeredBy(Actor actor) {
    return Text.of(UtestPagina.RESULTADO).viewedBy(actor).asString();
  }

  public static Resultado resultMessage() {
    return new Resultado();
  }
}
