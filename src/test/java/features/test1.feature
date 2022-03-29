Feature: Login
  Como usuario quiero poder iniciar sesion.

 Scenario: Iniciar Sesion
        Given El usuario se encuentra en la pagina login
        When rellena la informacion
        Then Se debe enviar la informacion

Scenario: Crear Cliente
        Given El usuario se encuentra en la pagina login
        When rellena la informacion
        And rellena la informacion cliente
        Then Se debe enviar la informacion cliente

Scenario: Crear Venta
        Given El usuario se encuentra en la pagina login
        When rellena la informacion
        And rellena la informacion de venta
        Then Se debe enviar la informacion de venta

