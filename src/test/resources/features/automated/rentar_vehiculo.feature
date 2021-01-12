#language: es

Característica: Rentar vehiculo en travelocity
  Yo como usuario de travelocity quiero rentar un vehiculo

  Antecedentes: iniciar sesion
    Dado que yo quiero realizar una operacion en travelocity

  @rentarVehiculo
  Escenario: Rentar un vehiculo en travelocity
    Cuando ingreso los datos de la renta
      | pickUpCity | dropOffCity     | pickUpDate   | dropOffDate  | pickupTime | dropOffTime |
      | Brooklyn   | Same as pick-up | Jan 21, 2021 | Feb 25, 2021 | 09:00      | 18:00       |
    Entonces puedo ver lista de vehiculos