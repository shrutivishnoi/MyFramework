Feature: Test CMS

  Scenario Outline: Login with emailId and password
    Given Launch the Browser
    When User is on CMS landing page
    Then Login with "<emailId>" and "<password>"
    Examples:
      | emailId | password |
      | shruti.vishnoi@ticketmaster.com | Ticketmaster@1234 |


  Scenario: Add new Benefit
    Given Login with valid credentials
    When User is inside the Benefit page
    Then Add "ben123" Benefit
    And Verify the added benefit

  Scenario: Update the Benefit desc
    Given Login with valid credentials
    When User is inside the Benefit page
    Then Update benefit with "ben456" desc
    And Verify the updated desc of benefit

  Scenario: Delete Benefit
    Given Login with valid credentials
    When User is inside the Benefit page
    When Benefit is already added
    Then Delete benefit
    And Verify the deleted benefit