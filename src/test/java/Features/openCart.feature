Feature: OpenCart Automation using Cucumber Framework_Selenium_Java for Login functionality
  @SmokeTest
  Scenario: Browser opened successfully
    Given I want to land on the Login Page of the Cart

  @PositiveTest
  Scenario Outline: Login Successfully
    Given I want to land on the Login Page of the Cart
    When I enter "<username>" and "<password>" into respective fields
    And I click on Login button
    Then I should be successfully login to OpenCart Account by verifying the presence of logout button

    Examples:
      | username              | password |
      | saranya2020@gmail.com | password |

  @NegativeTest
  Scenario: Unsuccessfull login
    Given I want to land on the Login Page of the Cart
    When I enter the invalid "<username>" and "<password>" into respective fields
    And I click on Login button
    Then I should be able to see the warning message displayed

    Example:
      | username                  | password |
      | saranyarselvaraj@gmail.com| password |

