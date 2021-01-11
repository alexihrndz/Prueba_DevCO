#language: es
Característica: Registro en travelocity
  Yo como usuario requiero hacer registro de nuevo usuario en Traveolcity

  @manual-result:passed
  Escenario: Registro de nuevo usuario en travelocity con correo exitoso
    Dado que yo como usuario quiero hacer registro de una nueva cuenta con correo
    Cuando ingrese mis datos correctamente
    Entonces puedo ver el mensaje de registro exitoso

  @manual-result:passed
  Escenario: Registro de nuevo usuario en travelocity con facebook exitoso
    Dado que yo como usuario quiero hacer registro de una nueva cuenta con facebook
    Cuando ingrese mis datos correctamente
    Entonces puedo ver el mensaje de registro exitoso

  @manual-result:passed
  Escenario: Registro de nuevo usuario en travelocity con cuenta apple exitoso
    Dado que yo como usuario quiero hacer registro de una nueva cuenta con cuenta apple
    Cuando ingrese mis datos correctamente
    Entonces puedo ver el mensaje de registro exitoso

  @manual-result:failed @manual-test-evidence:resources/evidences/2021-01-10-12_43_51-Create_an_account.png
  Escenario: Registro de nuevo usuario en travelocity con correo fallido
    Dado que yo como usuario quiero hacer registro de una cuenta con correo ya registrado
    Cuando ingrese mis datos correctamente
    Entonces puedo ver el mensaje de registro ya existe


