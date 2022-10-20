Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus
  ##Scenario: Plus operation
    ##When Seven Plus Eight
    ##Then Result is Fifteen

  @Smoke @Minus
  Scenario Outline: Minus operation
    When <minuend> Minus <subtrahend>
    Then Result for <minuend> minus <subtrahend> is <result>
    Examples:
      | minuend | subtrahend |result|
      | 10      | 2          |8     |

