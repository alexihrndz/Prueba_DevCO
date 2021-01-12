#language: es

Característica: Reserva de vuelo en travelocity
  Yo como usuario de travelocity quiero reservar un vuelo

  @reservaDeVuelo
  Escenario: Reservar vuelo en travelocity
    Dado que yo como usuario quiero realizar la reserva de vuelo ingreso a travelocity
    Cuando ingrese los filtros de vuelo
      | typeTrip  | travelersAdults | typeClass | cityFrom | cityGoingTo | departingDate | returningDate |
      | Roundtrip | 2               | Economy   | Medellin | Bogota      | Jan 15, 2021  | Feb 15, 2021  |
    Y selecciono la aerolinea y los vuelos
      | airLine           |
      | Viva Air Colombia |
    Entonces puedo ver el resumen de la solicitud