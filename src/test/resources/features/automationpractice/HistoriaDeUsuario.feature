Feature: Registro
En esta seccion el usuario se registra 
  Scenario: hacer el registro
    Given Que la pagina de Utest este abierta
     When el usuario hace click en el boton Join today
     And el usuario coloca su nombre: First name
     And el usuario coloca su apellido: Last name
     And el usuario coloca su correo: Email address
     And el usuario coloca su fecha de nacimiento: Date of birth
     And el usuario hace click en el boton: Location
     And el usuario hace click en el boton: Devices
     And el usuario hace click en el boton: Last Step
   	 And el usuario coloca su contrasenia: Create your uTest password
     And el usuario vuelve a colocar su contrasenia: Confirm password
     And el usuario hace click en el checkbox: I have read and accept
     And el usuario hace click en el checkbox: Polity
     And el usuario hace click en el boton: Complete
     Then deberia aparecer: Welcome to the world's largest community of freelance software testers! 
  
  