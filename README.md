# Diwali BOGO Offer Processor 🎉

## Overview

This Java program simulates a **Buy One Get One Free (BOGO)** offer for a festive Diwali sale. It ensures that customers **maximize their discounts** by always pairing the most expensive items with the next highest eligible items for free.

## Problem Statement

During the Diwali sale, the store is running a BOGO campaign:
- For every item a customer purchases, they can get another item **of equal or lesser value for free**.
- Customers can buy any number of products.
- The goal is to pair items in such a way that the total **discount is maximized**.

### Example

**Input:**  
`[10, 20, 30, 40, 50, 60]`

**Output:**  
- Items to Purchase: `[60, 40, 20]`  
- Free Bonus Items: `[50, 30, 10]`

## Solution Strategy

1. **Sort the product prices in descending order**.
2. **Iterate over the list**:
   - Pay for the first item.
   - Take the next eligible item for free.
3. Repeat until all items are processed.

This strategy ensures that the most expensive items are paid for, and the next most expensive are taken as free, maximizing savings.

## How to Run

1. Compile the program:
   ```bash
   javac FestiveSaleProcessor.java
2. Run the program:
 ```bash
 java FestiveSaleProcessor

-- Code Explanation
processDiwaliDiscount(List<Integer> productRates):

Sorts the product prices.

Splits them into toBePaid and freebies lists.

Prints both lists as output.

Output
Case 1:
Items to Purchase: [60, 40, 20]
Free Bonus Items: [50, 30, 10]

Case 2:
Items to Purchase: [60, 50, 30, 10]
Free Bonus Items: [50, 40, 20]
