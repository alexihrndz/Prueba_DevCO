#language: es
Característica: Navegar en home de travelocity
  Yo como usuario requiero navegar en el home de Traveolcity

  Antecedentes:
    Dado que yo como usuario quiero navegar en la pagina travelocity

  @manual-result:passed
  Escenario: Cambiar a idioma español
    Cuando ingrese a la pagina y selecciono idioma español en el encabezado
    Entonces puedo ver todo el sitio en idioma español

  @manual-result:passed
  Escenario: Validar seccion contigo en cada parte del viaje
    Cuando vea la seccion contigo en cada parte dle viaje
    Entonces puedo ver las imagenes con las dimensiones correctas y alta definicion

  @manual-result:passed
  Escenario: Validar imagenes opcion de menu paquetes
    Cuando seleccione del menu la opción "paquetes"
    Entonces puedo ver las imagenes de la seccion "Unete y goza de nuestros beneficios" con las dimensiones correctas y alta definicion

  @manual-result:passed
  Escenario: Validar imagenes opcion de menu hotel
    Cuando seleccione del menu la opción "hotel"
    Entonces puedo ver las imagenes de la seccion "Ofertas de hotel para relajarse" con las dimensiones correctas y alta definicion
    Y un carrusel con la seccion de "Ofertas cercanas" con las dimensiones correctas y alta definicion

  @manual-result:passed
  Escenario: Validar imagenes opcion de menu autos
    Cuando seleccione del menu la opción "autos"
    Entonces puedo ver las imagenes de la seccion "Ofertas en renta de autos" con las dimensiones correctas y alta definicion

  @manual-result:passed
  Escenario: Validar imagenes opcion de menu vuelos
    Dado que yo como usuario quiero navegar en la pagina travelocity
    Cuando seleccione del menu la opción "vuelos"
    Entonces puedo ver las imagenes de la seccion "Vuela por menos de 200$" con las dimensiones correctas y alta definicion
    Y puedo ver las imagenes de la seccion "Vuela con America Airlines" con las dimensiones correctas y alta definicion

  @manual-result:failed
  Escenario: Validar imagenes opcion de menu cruceros
    Cuando seleccione del menu la opción "cruceros"
    Entonces puedo ver las imagenes de la seccion "Destinos imperdibles" con las dimensiones correctas y alta definicion

  @manual-result:passed
  Escenario: Validar imagenes opcion de menu cosas para hacer
    Cuando seleccione del menu la opción "cosas para hacer"
    Entonces puedo ver las imagenes de la seccion "Unete y goza de nuestros beneficios" con las dimensiones correctas y alta definicion
    Y puedo ver las imagenes de la seccion "Ofertas en rentas de autos" con las dimensiones correctas y alta definicion


  @manual-result:passed
  Escenario: Validar imagenes opcion de menu viajes para mi
    Cuando seleccione del menu la opción "viajes para mi"
    Entonces puedo ver un home con diseño diferente y recomendaciones de destinos para familias

  @manual-result:passed
  Escenario: Validar seccion moviles
    Cuando seleccione del menu la opción "viajes para mi"
    Y luego ingrese a la opción "móviles"
    Entonces puedo ver un sitio con opciones de instalacion de apps Android y Apple mas la reseña de estas

  @manual-result:passed
  Esquema del escenario: Validar mensaje plan de viaje afectado por COVID-19
    Cuando ingrese a cualquier opcion de menu <opcion>
    Entonces puedo ver el mensaje de vaijes afectados por COVID-19

    Ejemplos:
      | opcion          |
      | Paquetes        |
      | Hoteles         |
      | Autos           |
      | Vuelos          |
      | Curceros        |
      | Cosas por hacer |




