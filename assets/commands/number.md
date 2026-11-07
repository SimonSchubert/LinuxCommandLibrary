# TAGLINE

convert Arabic numerals to English words

# TLDR

**Spell out a number**, one group of thousands per line

```number [1234567]```

**Spell out a number on a single line**

```number -l [1234567]```

**Spell out a decimal fraction**

```number [3.14]```

**Convert numbers read from standard input**

```echo [42] | number -l```

# SYNOPSIS

**number** [**-l**] [_number_ ...]

# PARAMETERS

**-l**
> Display the number on a single line instead of one line per power of 1000.

_number_
> Number to convert. If none is given, numbers are read one per line from standard input.

# DESCRIPTION

**number** prints the English equivalent of a number to standard output, with each 10^3 magnitude ("million", "thousand", ...) on a separate line by default. Negative numbers and decimal fractions are understood.

It is part of the classic BSD games collection.

# CAVEATS

Exponent notation such as **1e6** is not understood. Output is English only, using the short scale (billion = 10^9). Usually installed in **/usr/games**, which may not be in **PATH**.

# HISTORY

**number** appeared in early BSD Unix as one of the small utilities in the games collection and is maintained today in NetBSD and the Linux **bsd-games** ports.

# SEE ALSO

[factor](/man/factor)(1), [units](/man/units)(1), [bc](/man/bc)(1), [figlet](/man/figlet)(1)

# RESOURCES

```[Source code](https://github.com/NetBSD/src/tree/trunk/games/number)```

<!-- verified: 2026-11-07 -->
