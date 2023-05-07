Feature: Sanity Suite

  @Sanity @TC_01
  Scenario Outline: Book Flight Tickets for One Way Trip (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_02
  Scenario Outline: Book Flight Tickets for One Way Trip with seat (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight
    Then I fill passenger details
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_03
  Scenario Outline: Inbound Book Flight Tickets for One Way Trip (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Inbound
    Then I confirm my flight

    Examples:
    |Pick Up Loc|Drop Off Loc|
    |Delhi(DEL) |London Heathrow(LHR)|

  @TC_04
  Scenario Outline: Inbound Book Flight Tickets for One Way Trip with seat (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Inbound
    Then I confirm my flight with seat for Inbound

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |London Heathrow(LHR)|

  @Sanity @TC_05
  Scenario Outline: Outbound Book Flight Tickets for One Way Trip (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Outbound
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |London Heathrow(LHR) |Delhi(DEL)|

  @TC_06
  Scenario Outline: Outbound Book Flight Tickets for One Way Trip with seat (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound
    Then I fill passenger details for Outbound
    Then I confirm my flight with seat for Inbound

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |London Heathrow(LHR) |Delhi(DEL)|

  @Sanity @TC_07
  Scenario Outline: Book Flight Tickets for One Way Trip for flexi (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My flexi Flight
    Then I fill passenger details for flexi
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_08
  Scenario Outline: Book Flight Tickets for One Way Trip for super (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My super Flight
    Then I fill passenger details for Super
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_09
  Scenario Outline: Book Flight Tickets for One Way Trip for Infant Child(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight with infant child
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_10
  Scenario Outline: Book Flight Tickets for One Way Trip for Senior Citizen(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight with senior citizen
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_11
  Scenario Outline: Book Flight Tickets for One Way Trip for Multiple Passenger(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight with multiple passenger
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_12
  Scenario Outline: Book Flight Tickets for One Way Trip for Student (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for student
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_13
  Scenario Outline: Book Flight Tickets for One Way Trip for Doctor and Nurse(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Doctor and Nurse
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_14
  Scenario Outline: Book Flight Tickets for One Way Trip for Armed Forces (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Armed Forces
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_15
  Scenario Outline: Book Flight Tickets for One Way Trip for Family and Friends(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Family and Friends
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_16
  Scenario Outline: Book Flight Tickets for One Way Trip for Vacinated (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Vacinated
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_17
  Scenario Outline: Book Flight Tickets for One Way Trip with single meal(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight
    Then I fill passenger details and add single meal
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_18
  Scenario Outline: Book Flight Tickets for One Way Trip with double meal(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight
    Then I fill passenger details and add double meal
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_19
  Scenario Outline: Book Flight Tickets for One Way Trip with prime addon(Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight
    Then I fill passenger details and add prime addon
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_20
  Scenario Outline: Book Connecting Flight Tickets for One Way Trip (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Connecting Flight
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Bengaluru(BLR)|

  @Sanity @TC_21
  Scenario Outline: Book Connecting Flight Tickets for One Way Trip with seat for 1 sector (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Connecting Flight
    Then I fill passenger details
    Then I confirm my flight with seat for 1 sector

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Bengaluru(BLR)|

  @Sanity @TC_22
  Scenario Outline: Book Connecting Flight Tickets for One Way Trip with seat for both sector. (Payment not included)
    Given I landed on Home Page and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Connecting Flight
    Then I fill passenger details
    Then I confirm my flight with seat for both sector

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Bengaluru(BLR)|

  @Sanity @TC_23
  Scenario Outline: Book Flight Tickets for Round Trip (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Round Trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_24
  Scenario Outline: Book Flight Tickets for Round Trip with seat (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Round Trip
    Then I fill passenger details
    Then I confirm my flight with seat

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_25
  Scenario Outline: Inbound Book Flight Tickets for Round Trip (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound Round Trip
    Then I fill passenger details for Inbound Round Trip
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |London Heathrow(LHR)|

  @TC_26
  Scenario Outline: Inbound Book Flight Tickets for Round Trip with seat (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound Round Trip
    Then I fill passenger details for Inbound Round Trip
    Then I confirm my flight with seat for Inbound

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |London Heathrow(LHR)|

  @Sanity @TC_27
  Scenario Outline: Outbound Book Flight Tickets for Round Trip (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound Round Trip
    Then I fill passenger details for Inbound Round Trip
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |London Heathrow(LHR) |Delhi(DEL)|

  @TC_28
  Scenario Outline: Outbound Book Flight Tickets for Round Trip with seat (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Inbound Round Trip
    Then I fill passenger details for Inbound Round Trip
    Then I confirm my flight with seat for Inbound

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |London Heathrow(LHR) |Delhi(DEL)|

  @Sanity @TC_29
  Scenario Outline: Book Flexi Flight Tickets for Round Trip (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flexi Flight for Round Trip
    Then I fill passenger details for flexi for Round Trip

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_30
  Scenario Outline: Book Super Flight Tickets for Round Trip (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Super Flight for Round Trip
    Then I fill passenger details for Super for Round Trip

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_31
  Scenario Outline: Book Flight Tickets for Round Trip for Infant Child(Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight with infant child for round trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_32
  Scenario Outline: Book Flight Tickets for Round Trip for Senior Citizen(Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight with senior citizen for round trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_33
  Scenario Outline: Book Flight Tickets for Round Trip for Multiple Passenger(Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight with multiple passenger for round trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_34
  Scenario Outline: Book Flight Tickets for Round Trip for Student (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Student for Round Trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_35
  Scenario Outline: Book Flight Tickets for Round Trip for Doctor and Nurse(Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Doctor and Nurse for Round Trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_36
  Scenario Outline: Book Flight Tickets for Round Trip for Armed Forces (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Armed Forces for Round Trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_37
  Scenario Outline: Book Flight Tickets for Round Trip for Family and Friends(Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Family and Friends for Round Trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|

  @Sanity @TC_38 @test
  Scenario Outline: Book Flight Tickets for Round Trip for Vacinated (Payment not included)
    Given I redirect on Home Page and search for round trip and search for <Pick Up Loc> and <Drop Off Loc>
    Then I select My Flight for Vacinated for Round Trip
    Then I fill passenger details
    Then I confirm my flight

    Examples:
      |Pick Up Loc|Drop Off Loc|
      |Delhi(DEL) |Jaipur(JAI)|
