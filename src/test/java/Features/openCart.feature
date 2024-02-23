Feature: OpenCart Automation using Cucumber Framework_Selenium_Java
  @SmokeTest
  Scenario: Browser opened successfully
   Given I want to land on the Home Page of the Cart

  Scenario: Login Successfully
    Given I want to land on the Home Page of the Cart
    When I navigate to My Account tab and select Login
    And I enter "<username>" and "<password>" into respective fields
    And I click on Login button
    Then I should be successfully login to OpenCart Account

  Scenario Outline: Successful Browsing of product for checkout
    Given I want to go to home page to browse the product
    When I click on Search box
    And I enter the "<productHint>" to search
    Then I click on Search Icon button / press Enter
    Then I should be able to see the list of products related to my <productHint>

    Examples:
      | Pho |
      | mac |

