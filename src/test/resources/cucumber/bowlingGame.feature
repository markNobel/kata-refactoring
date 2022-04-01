Feature: Scoring Bowling Game

    Scenario Outline: Suggested Test Cases
      Given Line is <Frames>
      When Calculate score
      Then Result is <Score>

      Examples:
      |Frames| Score|
      |  "9- 9- 9- 9- 9- 9- 9- 9- 9- 9-"   |  90    |
      |  "6- 9- 5- -- 9- 5- 7- 7- 9- 9-"   |  66    |
      |  "-- -- -- -- -- -- -- -- -- --"   |  0     |
