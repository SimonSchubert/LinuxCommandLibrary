# TAGLINE

RPN calculator with a TUI for your terminal

# TLDR

**Launch the RPN calculator**

```vectro```

# SYNOPSIS

**vectro**

# DESCRIPTION

**vectro** is a reverse Polish notation (RPN) calculator that runs in the terminal using the Bubble Tea TUI framework. Type a number to push it onto the stack and an operator to apply it to the top elements. The interface adapts to the size of the terminal and persists the stack between sessions, so values entered yesterday are still available today.

The editor supports yank/paste of stack values, an undo buffer, and trigonometric, logarithmic, and bitwise operators in addition to the basic arithmetic ones. Decimal precision and the radix mode (DEC/HEX/BIN) are selectable from inside the TUI.

# CAVEATS

No command-line flags are exposed; configuration and key bindings live in the configuration file managed by the application. Like other RPN calculators, there is no infix-expression parser: operands must be entered before operators.

# HISTORY

**vectro** was created by **gurgeous** and is written in **Go** using the **Bubble Tea** TUI framework. It is distributed as a single static binary.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [calc](/man/calc)(1), [qalc](/man/qalc)(1)
