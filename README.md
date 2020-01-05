Testing - FizzBuzzGenerator
=============
The `FizzBuzzGenerator.class` has been tested using the JUnit 5 Framework.

This documentation showcases the Test Results, with information such as the test ID, description, expected result, actual result etc. It also provides the changes that have been made to any tests that failed. 

Note: When reviewing the 'Changes/Refactoring' section, use the ID number to correlate the change to its appropriate failed test from the 'Test Results' section.

## Test Results
| ID 	| Description 	| Expected Result 	| Actual Result 	| Pass/Fail 	|
|----	|--------------------------------------------------------------------------------------------------------------	|-----------------------------------------------------------------------------	|-------------------------------------------------------------------------------------------	|------------------------	|
| 1 	| Test `divisbleBy(4, 2)` method using positive values that are divisible as parameters. 	| `true` 	| `false` 	| FAIL:x: 	|
| 2  	| Test `divisibleBy(3, 2)` method using positive values that are not divisible as parameters. 	| `false` 	| `false` 	| PASS:white_check_mark: 	|
| 3 	| Test `divisibleBy(-9, -3)` method using negative values that are divisible as parameters. 	| `true` 	| `true` 	| PASS:white_check_mark: 	|
| 4 	| Test `divisibleBy(-6, 2)` method using one negative and one positive value that are divisible as parameters. 	| `true` 	| `true` 	| PASS:white_check_mark: 	|
| 5 	| Test `FizzBuzz(1, 15)` method using positive integers as parameters. 	| `[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]` 	| `[1, 2, FizzBuzz, 4, FizzBuzz, FizzBuzz, 7, 8, FizzBuzz, FizzBuzz, 11, FizzBuzz, 13, 14]` 	| FAIL:x: 	|
| 6 	| Test `FizzBuzz(-10, -1)` method using negative integers as parameters. 	| `[Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1]` 	| `[Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1]` 	| PASS:white_check_mark: 	|
| 7 	| Test `FizzBuzz(-5, 5)` method using negative and positive integers as parameters. 	| `[Buzz, -4, Fizz, -2, -1, FizzBuzz, 1, 2, Fizz, 4, Buzz]` 	| `[Buzz, -4, Fizz, -2, -1, FizzBuzz, 1, 2, Fizz, 4, Buzz]` 	| PASS:white_check_mark: 	|
| 8 	| Test `FizzBuzz(7, 1)` method using non consecutive integers as parameters. 	| `[Error: Start number must be larger than end number]` 	| `[]` 	| FAIL:x: 	|


## Changes/Refactoring
| ID 	| Changes 	| Expected Result 	| Actual Result 	|
|----	|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	|-----------------------------------------------------------------------------	|-----------------------------------------------------------------------------	|
| 1 	| After analysing the `divisibleBy()` method, the reason it was returning the incorrect result was this line of code:<br><br>`return numerator % Denominator == 2;`<br><br>This line of code will only return true if the remainder of the two numbers is 2. This is incorrect logic and has been changed to this:<br><br>`return numerator % Denominator == 0`	| `true` 	| `true` 	|
| 5 	| The `FizzBuzz` method needed several changes to get the desired result. The first `if` statement within the `for` loop used the logical OR operator, thus adding `FizzBuzz` to the list in places where it should be `Fizz` or `Buzz`. This was changed to an AND (`&&`) operator. Secondly, the result was not showing the last number (`endNumber`). This was because the conditional statement in the `for` loop initialisation was checking if `i < endNumber`. This was changed to `i <= endNumber` to rectify the issue. Finally, there was a typo error for the word `Buzz`. Instead of adding `Buzz` to the list, it was adding `Buz`.  	| `[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]` 	| `[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]` 	|
| 8 	| The `FizzBuzz` method didn't present an error message when given non consecutive integers as parameters. It simply returned an empty list. To rectify this, an `if` statement has been added to the method to check if non consecutive numbers have been given. 	| [Error: Start number must be larger than end number] 	| [Error: Start number must be larger than end number] 	|
