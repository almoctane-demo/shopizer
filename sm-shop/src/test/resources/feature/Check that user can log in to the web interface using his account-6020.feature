#Auto generated Octane revision tag
@TID6020REV0.2.0
Feature: Buying items in shopping cart for many users
Background:
  Given payment security system is up

Scenario Outline: Many users buy items in their carts
Given a customer named <customer>
Given I am logged in as <customer>
Given I have at least one item in cart and I live in Singapore
When I try to buy items in my cart
Then I confirm my payment method <payment> and proceed to checkout.

  Examples:
| customer | payment |
| Jane Doe | Paypal |
| Jorge Rodrigues | VISA |
| Sally Dunn | VISA |
| Pierre Bisset | American Express |
| Masayoshi Horita | Cash |
