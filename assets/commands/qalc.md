# TAGLINE

Command-line calculator with unit conversion

# TLDR

**Calculate expression**

```qalc "[2 + 2]"```

**Convert units**

```qalc "[5 kilometers to miles]"```

**Interactive mode**

```qalc```

**Currency conversion**

```qalc "[100 USD to EUR]"```

**Scientific calculation**

```qalc "[sin(45 degrees)]"```

# SYNOPSIS

**qalc** [_options_] [_expression_]

# PARAMETERS

_EXPRESSION_
> Mathematical expression.

**-t**
> Terse output.

**-f** _FILE_
> Read from file.

**-u** _MODE_
> Update exchange rates.

# DESCRIPTION

**qalc** is the command-line interface to the Qalculate library, providing a powerful calculator with support for mathematical expressions, unit conversions, currency exchange, and symbolic computation. It handles everything from basic arithmetic to complex expressions involving trigonometric functions, logarithms, integrals, and physical constants.

A standout feature is built-in awareness of physical units and currencies, allowing natural expressions like "5 kilometers to miles" or "100 USD to EUR". Exchange rates can be updated automatically. In interactive mode, qalc provides a persistent session with command history and tab completion.

# CAVEATS

Requires libqalculate. Supports currency exchange rates.

# HISTORY

Qalculate was created as a **multi-purpose** calculator with unit support.

# SEE ALSO

[bc](/man/bc)(1), [calc](/man/calc)(1), [units](/man/units)(1)

