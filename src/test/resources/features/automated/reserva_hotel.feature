#language: es
Característica: Reserva de hotel en travelocity
  Yo como usuario quiero realizar la reserva de un hotel en travelocity

  @reservaDeHotel
  Escenario: Reserva de hotel
    Dado que yo como usuario quiero realizar la reserva de hotel en travelocity
    Cuando ingrese los filtros
      | goingTo             | checkIn      | checkOut     | travelersAdults | travelersChildren |
      | Medellin el Poblado | Jan 15, 2021 | Jan 18, 2021 | 2               | 1                 |
    Entonces puedo ver la lista de resultados y seleccionar el de menor precio
    Cuando seleccione la opcion de reserva lleno los datos de pago
      | contactName | countryCode | phoneNumber | creditCardName  | creditCardNumber | expMonth | expYear | secCode | countryAddress | billingAddres1         | city     | State     | zipCode | emailAddress     |
      | nombre test | 57          | 3009995522  | PRUEBA A TEST B | 4575623182290326 | 12-Dec   | 2025    | 200     | Colombia       | Calle 1 Av 10 CASA 100 | Medellin | Antioquia | 059999  | pruebas@test.com |
    Entonces puedo ver la reserva con exito
