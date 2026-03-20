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

**Display result in hexadecimal**

```qalc -b 16 "[255]"```

**Terse output** (result only, useful in scripts)

```qalc -t "[2^16]"```

# SYNOPSIS

**qalc** [_options_] [_expression_]

# PARAMETERS

_EXPRESSION_
> Mathematical expression to evaluate.

**-t**, **--terse**
> Reduce output to just the result.

**-f** _FILE_, **--file** _FILE_
> Execute commands from a file first.

**-e**, **--exrates**
> Update exchange rates.

**-b** _BASE_, **--base** _BASE_
> Set the number base for results.

**-c**, **--color**
> Use colors to highlight expressions and results.

**-i**, **--interactive**
> Start in interactive mode.

**-l** [_TERM_], **--list** [_TERM_]
> List matching variables, functions, units, and prefixes.

**-s** _"OPTION VALUE"_, **--set** _"OPTION VALUE"_
> Set a configuration option (e.g., -s "base 16").

**-p** [_BASE_], **--prog** [_BASE_]
> Start in programming mode with base conversion.

**-n**, **--nodefs**
> Do not load any functions, units, or variables from file.

# DESCRIPTION

**qalc** is the command-line interface to the Qalculate library, providing a powerful calculator with support for mathematical expressions, unit conversions, currency exchange, and symbolic computation. It handles everything from basic arithmetic to complex expressions involving trigonometric functions, logarithms, integrals, and physical constants.

A standout feature is built-in awareness of physical units and currencies, allowing natural expressions like "5 kilometers to miles" or "100 USD to EUR". Exchange rates can be updated automatically. In interactive mode, qalc provides a persistent session with command history and tab completion.

# CAVEATS

Requires libqalculate. Supports currency exchange rates.

# HISTORY

Qalculate was created as a **multi-purpose** calculator with unit support.

# SEE ALSO

[bc](/man/bc)(1), [calc](/man/calc)(1), [units](/man/units)(1)

