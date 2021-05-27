#Author: basak.riya18@gmail.com

Feature: Validate Android OI Shopping List App
  
  @smokesuite
  Scenario: Delete List Item from a created List
    Given user creates new lists "List A" and "ListB"
    When user adds items in the list 
    Then user deletes "TV" from list
    
  @smokesuite
  Scenario: Validate sorted list
    Given user creates one new lsits with name "LISTC"
    When user adds items in the list 
    Then user sorts the list 
   
   
   

