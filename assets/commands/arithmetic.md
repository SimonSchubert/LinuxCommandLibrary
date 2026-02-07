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
> Specify which operations to include: **+** (addition), **-** (subtraction), **x** (multiplication), **/** (division)

**-r** _range_
> Set the range for numbers in problems (0 to range, inclusive)

# HISTORY

**arithmetic** is one of the classic BSD games, originating from the early Unix systems at Bell Labs. It has been included in the **bsdgames** package for decades as a simple educational utility.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1)
