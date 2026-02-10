# TAGLINE

command-line interface to the MATE calculator, providing an interactive

# TLDR

Start an **interactive calculator** session

```mate-calc-cmd```

Calculate a specific expression (in interactive mode)

```[2 + 5]```

# SYNOPSIS

**mate-calc-cmd**

# DESCRIPTION

**mate-calc-cmd** is the command-line interface to the MATE calculator, providing an interactive terminal-based calculator session. It uses the same calculation engine as the graphical **mate-calc** application.

The interactive session accepts mathematical expressions and displays results immediately. It supports the same functions and operators as the GUI version, including trigonometry, logarithms, and arbitrary precision arithmetic.

Type **quit** or press **Ctrl+D** to exit the interactive session.

# CAVEATS

Unlike **mate-calc --solve**, this command starts an interactive session rather than evaluating a single expression. For one-off calculations in scripts, use **mate-calc --solve** instead.

# SEE ALSO

[mate-calc](/man/mate-calc)(1), [bc](/man/bc)(1), [calc](/man/calc)(1)
