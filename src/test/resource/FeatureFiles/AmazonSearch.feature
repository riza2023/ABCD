@regression @smoke @Capt.America-1 @E2E
Feature: Amazon Search Functionality


	Scenario:   Search for AmazonShoes
	
	Given       Open Amazon Homepage
	When        Search for Shoes
	And         Click search button
	Then        Item list should have only Shoes related products