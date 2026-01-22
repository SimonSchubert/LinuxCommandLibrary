# TLDR

**Interactive** mode

```bitwise```

Convert **decimal**

```bitwise 12345```

Convert **hexadecimal**

```bitwise 0x563d```

**Calculate** expression

```bitwise "0x123 + 0x20 - 30"```

# SYNOPSIS

**bitwise** [_OPTIONS_] [_value_|_expression_]

# DESCRIPTION

**bitwise** is a multi-base interactive calculator supporting dynamic base conversion and bit manipulation. It displays values in decimal, hexadecimal, octal, and binary simultaneously.

# PARAMETERS

Values can be specified in different bases:
> Decimal: plain numbers (123)
> Hexadecimal: 0x prefix (0x7B)
> Octal: 0 prefix (0173)
> Binary: 0b prefix (0b1111011)

Supports C-style arithmetic and bitwise operators.

# CAVEATS

Interactive mode provides a visual bit toggle interface. Expressions with special shell characters need quoting. Useful for low-level programming and debugging.

# HISTORY

**bitwise** is an open-source terminal-based calculator for programmers.

# SEE ALSO

[bc](/man/bc)(1), [calc](/man/calc)(1)
