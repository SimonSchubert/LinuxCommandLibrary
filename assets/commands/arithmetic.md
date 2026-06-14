# TAGLINE

Practice basic math with a quiz game

# TLDR

Start an **arithmetic quiz**

```arithmetic```

Specify one or more **operation symbols** to practice

```arithmetic -o [+|-|x|/]```

Specify a **range** for problem numbers

```arithmetic -r [7]```

# SYNOPSIS

**arithmetic** [**-o** _+-x/_] [**-r** _range_]

# DESCRIPTION

**arithmetic** is a simple educational program that quizzes users on basic arithmetic problems. It generates random math problems and tracks the user's accuracy, providing a playful way to practice mental math.

By default, problems use all four basic operations. The range option controls the magnitude of numbers used in problems.

# PARAMETERS

**-o** _operations_
> Specify which operations to include: **+** (addition), **-** (subtraction), **x** (multiplication), **/** (division). Defaults to **+** and **-**.

**-r** _range_
> Largest operand used in problems (default: **10**). For addition and multiplication the operands lie between 0 and _range_; for subtraction and division both the answer and the second operand lie in that range, so results are never negative or fractional.

# CAVEATS

**arithmetic** asks problems repeatedly and weights operations you answer slowly or incorrectly, so they recur more often. Press **Ctrl-D** to end the session and print a summary of the number of correct answers and the time taken.

# HISTORY

**arithmetic** is one of the classic BSD games, originating in the Unix games collection and carried into **4.4BSD**. It ships in the **bsdgames** package on most Linux distributions as a simple educational utility.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1)

# RESOURCES

```[Source code](https://github.com/jsm28/bsd-games)```

```[Homepage](https://www.polyomino.org.uk/computer/software/bsd-games/)```

<!-- verified: 2026-06-15 -->
