@sanitytest
Feature: Test

  Background: launch the app
    Given open the Posbytz app

  @smoketest1
  Scenario: Test cash sale
    Given complete one order with cash sale

  @smoketest2
  Scenario: Test split sale
    Then complete one order with split sale

  @smoketest3
  Scenario Outline: Test credit sale
    And create customer with <customername> and <phonenumber> and complete credit sale

    Examples: 
      | customername | phonenumber |
      | arjun         |  9888902001 |

  @smoketest4
  Scenario: Test discount order sale with modifiers and tips
    Given Complete discounted order with modifier and tips

  @smoketest5
  Scenario: Test table order complete flow
    Given add one item to table
    Then again add another item to the same table
    And go to table edit the order by adding new item and complete order

  @smoketest6
  Scenario Outline: Test table order complete with waiter app
    Given Open the waiter app in browser by using <ip> and place order with modifier
    And complete the waiter app order in table

    Examples: 
      | ip |
      | http://192.168.1.6:3344/ |

  @smoketest7
  Scenario Outline: Test online order in pos
    Given open <customerweb> app and place one selfpickup order
    Then complete the online order in pos
  
    Examples: 
      | customerweb                            |
      | https://automation.store.smartbytz.com |
   
   
    @smoketest8
  Scenario: Test loyalty sale of customer
  Given Add item to cart and choose customer
  Then click check for loyalty then apply discount and complete the order 
  
  @smoketest9
  Scenario Outline: Test kitchen display order with notes
  Given Add order with notes in cart move to table
  Then open <kitchendisplay>take  and complete the order status
  And back to poscomplete go to table and complete the order
  
  Examples:
  |kitchendisplay|
  |http://192.168.1.4:3344/kitchens|
