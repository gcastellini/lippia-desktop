Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus
  ##Scenario: Plus operation
    ##When Seven Plus Eight
    ##Then Result is Fifteen

    @Smoke @Minus
  Scenario Outline: Minus operation
    When <minuend> Minus <subtrahend>
    Then Result  is <result>
    Examples:
      | minuend | subtrahend | result |
      | 6       | -4         | 10     |
      | -10     | 2          | -12    |

  @Smoke @Multiplied
  Scenario Outline: Multiplication operation
    When <factor1> multiplied <factor2>
    Then Result  is <result>
    Examples:
      | factor1 | factor2 | result |
      | 10      | -2      | -20    |
      | -189    | 33      | -6237  |


  @Smoke @Division
  Scenario Outline: Division operation
    When <dividend> divided <divisor>
    Then Result  is <result>
    Examples:
      | dividend | divisor | result |
      | -10      | 2       | -5    |
      | 144      | -12     | -12    |

