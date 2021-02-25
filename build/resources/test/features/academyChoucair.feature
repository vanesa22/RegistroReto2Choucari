# Autor:LeidyFernandez
@stories
Feature: Academy Choucair
  As a user, I want to be able to register on the New experience platform to see and buy fashion products.
  @scenario1
  Scenario: Automated registration in New experience quickly
    Given Rose wants to register on the platform quickly

    When she registers all the data required by the platform
      |strFirstName|strLastName|strEmail                |strMonth|strDay |strYear|strPassword| strCity|strZip|strAddress|strState|strPhoneMobile|
      |Rose        |Fernandez  |vanesa089-17@hotmail.com|2       |11     |1997   |Choucair1* |Popayán |96779 |Carrera 2 |11      |3125897458    |
    Then she will be registered

  @scenario2
  Scenario: Automated registration in New experience completely
    Given Rose wants to register on the platform completely

    When she registers all the data requested by the platform
      |strFirstName|strLastName|strEmail                |strMonth|strDay |strYear|strPassword| strCity|strZip|strAddress|strState|strPhoneMobile|strTitle |strAddress2|strAditInfor        |strHomePhone|strCompania|
      |Rose        |Fernandez  |vanesa089-18@hotmail.com|2       |11     |1997   |Choucair1* |Popayán |96779 |Carrera 2 |11      |3125897458    |Mrs      |Carrera6   |InformacionAdicional|3128569745  |Choucair   |
    Then she will be registered

  @scenario3
  Scenario: Automated registration in New experience without mandatory data
    Given Rose wants to register on the platform without mandatory data
    When she registers if the data required by the platform
    | strEmail               |
    |vanesa089-19@hotmail.com|
    Then she will not be able to register
