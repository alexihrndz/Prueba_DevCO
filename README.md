# Prueba_DevCO
Prueba DevCO

Crear un proyecto de automatización usando SerenityBDD o SerenityJS para la página https://www.travelocity.com/, el proyecto de automatización deberá ser construido con los mejores estándares de automatización y programación que conozcan, deberán usar el patrón Screenplay y deberá tener mínimo 5 escenarios completamente automatizados, además deberán crear otros 15 escenarios extras (en total serían 20 escenarios) que deberán quedar como de ejecución manual.


Criterios de evaluación:

1. Uso del framework de automatización.Uso de Screenplay.
2. Legibilidad de los escenarios de pruebas.
3. Diseño de casos de pruebas y testing de aplicaciones de negocio.
4. Diseño de casos de pruebas automatizados basados en la pirámide de testing.

Formato de entrega: enviar al correo cacevedod@devco.com.co indicando la URL del repositorio de código fuente. En caso de requerir documentos extras, dejar todo en el repositorio y construir un README que permita entender en que consiste la entrega.
En el README, dejar explicado como puede ejecutarse el proyecto.

# Información de ejecución del proyecto

El proyecto fue construido con gradle, serenity, cucumber, junit y chromedriver 87.0.4280.88

La ejecución se puede realizar desde línea de comandos de varias maneras:

1. Ejecución total (mauales y automáticos): gradle clean test 
2. Ejecución parcial: gradle test --tests "NombreRunner"

Para la ejecución de los escenarios manuales se creó un solo Runner ManualScenaries, en el cual se ejecutan todos los features tipo manual que fueron creados

Atento a cualquier duda o inquietud 

Alexi Hernandez
