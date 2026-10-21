# Exercise 3 — Concatenation Predictions

Predict every result **before** running anything. Be exact — include spaces.

Assume: `int a = 5;  int b = 3;  String s = "Score";  char c = 'A';`

| # | Expression | Predicted | Actual | Right? |
|---|---|---|---|---|
| 1 | `s + a` | Score 5| correct| |
| 2 | `s + a + b` |Score 53 | correct| |
| 3 | `s + (a + b)` | Score 8| correct| |
| 4 | `a + b + s` | 8 Score| correct| |
| 5 | `a + (b + s)` | 53Score| correct| |
| 6 | `"" + a + b` | ""53| 53| |
| 7 | `c + 1` |A1 | 66| |
| 8 | `"" + c + 1` |""A1 | A1| |
| 9 | `(char)(c + 1)` |A1| B| |
| 10 | `s + c` | Score A| correct| |

---

## Follow-up

**1. Compare #2 and #4. Same three values, opposite order, and the results are structurally different. Explain the rule.**

[because s is in the front rathe rthe back]

**2. Why does #7 give `66` instead of `A1`?**

[because its a int connected to a char]

**3. Why does #8 give `A1` when #7 gives `66`? What did the empty string change?**

[The empty string makes Java join text instead of doing math, so the result is "A1". Without it, Java adds 'A'’s value (65) and 1, giving 66.

**4. Write a single line that prints exactly `The total of 5 and 3 is 8` using the variables `a` and `b`.**

```java
System.out.println("The total of " + a + " and " + b + " is " + (a + b));
```

---

## Immutability check

Run this:
```java
String word = "hello";
word.toUpperCase();
System.out.println(word);

word = word.toUpperCase();
System.out.println(word);
```

**1. What did each line print?**

[hello, HELLO]

**2. In your own words: what does it mean that Strings are immutable?**

[that they cannot be ignored ]

**3. Why is it easy to write `word.toUpperCase();` and think you've changed something? What kind of error is this — syntax, runtime, or logic?**

[logic erros because the code runs but it doesnt do what you think itll do ]
