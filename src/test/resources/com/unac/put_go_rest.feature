Feature: automatizacion de rest api - pom
  yo como estudiante de calidad de software
  necesito construir una peticion a una api
  para aprender a automatizar servicios

  Scenario: actualizar el nombre y el email de un usuario con metodo put
    Given se establece la base url "https://gorest.co.in/"
    When se actualiza el nombre en el endpoint "public/v2/users/" por id "6920258" con el nombre "Giancarlo Cabrera" y el email "giancarlo@unac.com"
    Then se valida que el status code 200 y que el nombre sea "Giancarlo Cabrera" y el email sea "giancarlo@unac.com"
