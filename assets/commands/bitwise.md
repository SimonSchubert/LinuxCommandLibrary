# TAGLINE

Interactive multi-base calculator with bit manipulation

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

**-i, --interactive**
> Force interactive mode (the default when no value or expression is given)

**-w, --width** _b8|b16|b32|b64_
> Set the bit width of the calculation

**--no-color**
> Disable colored output

**-v, --version**
> Print version information

**-h, --help**
> Show help message

Values can be specified in different bases:
> Decimal: plain numbers (123)
> Hexadecimal: 0x prefix (0x7B)
> Octal: 0 prefix (0173)
> Binary: 0b prefix (0b1111011)

Supports C-style arithmetic and bitwise operators (NOT, OR, AND, XOR, and shifts). In command-line mode the result is printed in all bases at once.

# CAVEATS

Interactive mode provides a visual bit toggle interface. Expressions with special shell characters need quoting. Useful for low-level programming and debugging.

# HISTORY

**bitwise** is an open-source (GPL-3.0) ncurses-based calculator written by **Ramon Fried** (mellowcandle). It targets low-level developers such as kernel and device-driver programmers who frequently work across number bases.

# INSTALL

```apt: sudo apt install bitwise```

```dnf: sudo dnf install bitwise```

```apk: sudo apk add bitwise```

```zypper: sudo zypper install bitwise```

```brew: brew install bitwise```

```nix: nix profile install nixpkgs#bitwise```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bc](/man/bc)(1), [calc](/man/calc)(1)

# RESOURCES

```[Source code](https://github.com/mellowcandle/bitwise)```

<!-- verified: 2026-06-19 -->
