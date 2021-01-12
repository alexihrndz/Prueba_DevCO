#language: es

Característica: Validar ofertas de familia

  Antecedentes: iniciar sesion
    Dado que yo quiero realizar una operacion en travelocity

  @ofertasDeFamilia
  Esquema del escenario: Validar ofertas de familia
    Cuando ingreso a la seccion ofertas de familia
    Entonces puedo ver el siguiente "<hotel>"

    Ejemplos:

      | hotel                           |
      | Legacy Vacation Resorts-Orlando |