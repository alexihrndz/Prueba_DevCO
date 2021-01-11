#language: es
Característica: Reserva de hotel en travelocity
  Yo como usuario quiero realizar la reserva de un hotel en travelocity

  @reservaDeHotel
  Escenario: Reserva de hotel
    Dado que yo como usuario quiero realizar la reserva de hotel en travelocity
    Cuando ingrese los filtros
      | goingTo             | checkIn      | checkOut     | travelersAdults | travelersChildren |
      | Medellin el Poblado | Jan 25, 2021 | Jan 30, 2021 | 4               | 2                 |
    Entonces puedo ver la lista de resultados y seleccionar el de menor precio
    Cuando seleccione la opcion de reserva lleno los datos de pago
      | contactName | countryCode | phoneNumber | nameCreditCard  | creditCardNumber | expMonth | expYear | secCode | countryAddress | billingAddres1         | city     | State     | zipCode | emailAddress     |
      | nombre test | COL         | 3009995522  | PRUEBA A TEST B | 4049222233339999 | 01-Jan   | 2030    | 999     | Colombia       | Calle 1 Av 10 CASA 100 | Medellin | Antioquia | 059999  | pruebas@test.com |
    Entonces puedo ver el mensaje de pago rechazado
