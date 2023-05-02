Feature: Sanity Suite

  @Sanity @TC_01
  Scenario Outline: Book Flight Tickets for One Way Trip
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_02
  Scenario Outline: Book Flight Tickets for One Way Trip with seat
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight
    Then I fill passenger details
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_03
  Scenario Outline: Inbound Book Flight Tickets for One Way Trip
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Inbound
    Then I confirm my flight

    Examples:
    |Pick Up Loc|Drop Off Loc|
    |Delhi(DEL) |London Heathrow(LHR)|

  @Sanity @TC_04
  Scenario Outline: Inbound Book Flight Tickets for One Way Trip with seat
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Inbound
    Then I confirm my flight with seat for Inbound

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |London Heathrow(LHR)|

  @Sanity @TC_05
  Scenario Outline: Outbound Book Flight Tickets for One Way Trip
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Outbound
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |London Heathrow(LHR) |Delhi(DEL)|

  @Sanity @TC_06
  Scenario Outline: Outbound Book Flight Tickets for One Way Trip with seat
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Outbound
    Then I confirm my flight with seat for Inbound

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |London Heathrow(LHR) |Delhi(DEL)|

  @Sanity @TC_07
  Scenario Outline: Book Flight Tickets for One Way Trip for flexi
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My flexi Flight
    Then I fill passenger details for flexi
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_08
  Scenario Outline: Book Flight Tickets for One Way Trip for super
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My super Flight
    Then I fill passenger details for Super
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @roundTrip
  Scenario Outline: Book Flight Tickets for Round Trip
    Given I landed on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Round Trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|
