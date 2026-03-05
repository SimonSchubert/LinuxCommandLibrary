# TAGLINE

High-precision scientific calculator with physical units

# TLDR

**Start the interactive calculator**

```numbat```

**Evaluate an expression**

```numbat -e "[expression]"```

**Convert between units**

```numbat -e "5 km -> miles"```

# SYNOPSIS

**numbat** [_options_] [_file_]

# PARAMETERS

**-e** _EXPRESSION_
> Evaluate an expression and print the result.

# DESCRIPTION

**numbat** is a statically typed programming language for scientific computations with first-class support for physical dimensions and units. It functions as both a powerful calculator and a scripting language.

Units can be entered in various formats (km/h, kilometer/hour, GiB, gibibytes, m²) and converted using the **->** operator. The standard library includes SI, US Customary, Imperial, Nautical, Astronomical, and Atomic unit systems. Custom units can be defined (e.g., `unit bathtub = 150 L`).

The interactive REPL supports command history, Ctrl-R search, and tab completion.

# CAVEATS

Physical dimension checking means expressions with incompatible units produce type errors rather than incorrect results.

# HISTORY

**numbat** was created by **sharkdp** (David Peter) and is written in **Rust**.

# SEE ALSO

[bc](/man/bc)(1), [kalker](/man/kalker)(1), [qalc](/man/qalc)(1)
