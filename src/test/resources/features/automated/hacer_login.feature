#language: es
Característica: Inicio de sesion en travelocity
  Yo como usuario requiero iniciar sesion con usuario registrado en Traveolcity

  @inicioDeSesionCorreo
  Escenario: Inicio de sesion exitoso con correo
    Dado que yo como usuario quiero iniciar sesion en Travelocity con correo
    Cuando ingrese mis credenciales correo y password
      | correo               | password        |
      | alexihrndz@gmail.com | Ek5$_97XrspAkyB |
    Entonces puedo ver el usuario logueado
      | nombre      |
      | Alexi Ruben |
