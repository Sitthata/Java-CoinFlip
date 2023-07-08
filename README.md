# Coin Flip Simulation

This Java program simulates flipping a coin a certain number of times and calculates the probability of getting a certain number of consecutive heads or tails. The primary purpose of this program is to demonstrate how to solve complex problems by breaking them down into smaller, more manageable parts, which is a key aspect of programming.

## How it Works

The program has three main functions:

1. `flipCoin()`: This function simulates flipping a coin once. It uses Java's built-in random number generator to generate a number between 0 and 1. If the number is less than 0.5, the function returns "heads"; otherwise, it returns "tails".

2. `countConsecutiveFlips(int numberOfFlips, int consecutiveFlipsToFind)`: This function simulates flipping a coin `numberOfFlips` times and counts the number of times `consecutiveFlipsToFind` consecutive flips have the same result (either heads or tails).

3. `calculateProbability(int numberOfFlips, int consecutiveFlipsToFind)`: This function calls `countConsecutiveFlips()` and then calculates the probability of finding `consecutiveFlipsToFind` consecutive flips in `numberOfFlips` flips by dividing the count by `numberOfFlips`.

In the `main` function, we set `numberOfFlips` to 1,000,000 and `consecutiveFlipsToFind` to 5, then call `calculateProbability()` and `countConsecutiveFlips()`, and print out the results.


