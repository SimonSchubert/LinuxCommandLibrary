# TAGLINE

Lightweight programmer's calculator with variables and functions

# TLDR

**Start the interactive calculator**

```hexowl```

**Perform a hex calculation**

```hexowl -e "0xFF + 0x10"```

**Mix number bases** in expressions

```hexowl -e "255 + 0b1010 + 0xF"```

**Define and use variables**

```hexowl -e "x = 42; x * 2"```

# SYNOPSIS

**hexowl** [**-e** _expression_] [_options_]

# DESCRIPTION

**hexowl** is a lightweight and flexible programmer's calculator with support for user-defined **variables** and **functions**. Its main purpose is to perform operations on numbers regardless of their base — a single expression can contain **decimal**, **hexadecimal**, and **binary** numbers mixed together.

Users can declare variables for reuse and define custom functions using the **->** operator. The calculator supports standard arithmetic operations, bitwise operations, and base conversions, making it useful for low-level programming, embedded development, and reverse engineering tasks.

# CAVEATS

Has no external dependencies. Function syntax uses the **->** operator which differs from most calculator conventions. Results are displayed in decimal by default.

# HISTORY

**hexowl** was created by **DECE2183** and is written in **Go**. A web implementation is also available at hexowl.ru for browser-based usage.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [kalker](/man/kalker)(1)
