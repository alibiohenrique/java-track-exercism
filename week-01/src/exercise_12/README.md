# Salary Calculator

In this exercise, we have a class `SalaryCalculator` that calculates an employee's salary based on the number of days skipped and the number of products sold.

## Methods

- `multiplierPerDaysSkipped(int daysSkipped)`

  - Calculates and returns a multiplier based on the number of days skipped.
  - If more than 5 days are skipped, the multiplier is 0.85; otherwise, it's 1.

- `multiplierPerProductsSold(int productsSold)`

  - Calculates and returns a multiplier based on the number of products sold.
  - If more than 20 products are sold, the multiplier is 13; otherwise, it's 10.

- `bonusForProductSold(int productsSold)`

  - Calculates and returns the bonus for the number of products sold.
  - It multiplies the number of products sold by the multiplier determined by the `multiplierPerProductsSold` method.

- `finalSalary(int daysSkipped, int productsSold)`

  - Calculates the employee's final salary based on the number of days skipped and products sold.
  - It multiplies the multiplier calculated by `multiplierPerDaysSkipped` by 1000.
  - Adds the bonus calculated by `bonusForProductSold`.
  - The final salary is capped at 2000 if it exceeds this amount.

## Usage Example

```java
// Method: multiplierPerDaysSkipped()

SalaryCalculator calculator = new SalaryCalculator();
int daysSkipped = 4;
double multiplierPerDaysSkipped = calculator.multiplierPerDaysSkipped(daysSkipped);
System.out.println("Multiplier per days skipped: " + multiplierPerDaysSkipped);
```
```java
// Method: multiplierPerProductsSold()

SalaryCalculator calculator = new SalaryCalculator();
int productsSold = 25;
int multiplierPerProductsSold = calculator.multiplierPerProductsSold(productsSold);
System.out.println("Multiplier per products sold: " + multiplierPerProductsSold);
```
```java
// Method: bonusForProductSold()

SalaryCalculator calculator = new SalaryCalculator();
int productsSold = 25;
int bonusForProductsSold = calculator.bonusForProductSold(productsSold);
System.out.println("Bonus for products sold: " + bonusForProductsSold);
```
```java
// Method: finalSalary()

SalaryCalculator calculator = new SalaryCalculator();
int daysSkipped = 4;
int productsSold = 25;
double finalSalary = calculator.finalSalary(daysSkipped, productsSold);
System.out.println("Final salary: " + finalSalary);
```