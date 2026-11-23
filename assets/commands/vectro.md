# TAGLINE

RPN calculator with a TUI for your terminal

# TLDR

**Launch the RPN calculator**

```vectro```

**Start with an empty stack** (don't load or save the saved state)

```vectro -q```

**Show the version**

```vectro --version```

# SYNOPSIS

**vectro** [**-q**] [**-v**|**--version**]

# PARAMETERS

**-q**
> Disable initialization: the saved stack and history are neither loaded at startup nor saved on quit.

**-v**, **--version**
> Print the version and build date, then exit.

# KEY BINDINGS

**+ - * /**
> Basic arithmetic on the top two stack values.

**n**
> Negate the top value.

**i**
> Inverse (1/x).

**l**
> Logarithm base 10.

**p**
> Push pi.

**@**
> Square root.

**^**
> Power (x ^ y).

**%**
> Modulo (x mod y).

**!**
> Factorial.

**s**
> Swap the top two values.

**y**
> Yank (copy) the top value to the clipboard.

**z**
> Undo.

**Backspace**
> Drop the top value.

**Enter**
> Push the typed number, or duplicate the top value when the input is empty.

**Esc**
> Clear.

**q**
> Quit.

# DESCRIPTION

**vectro** is a reverse Polish notation (RPN) calculator that runs in the terminal using the Bubble Tea TUI framework. Type a number and press Enter to push it onto the stack, then press an operator key to apply it to the top elements. The interface adapts to the size of the terminal, and the stack and history are saved across sessions in **vectro/state.yml** under the XDG config directory.

# CAVEATS

Like other RPN calculators, there is no infix-expression parser: operands must be entered before operators. The operator set is deliberately small; trigonometric functions, natural log, rounding, and bitwise/radix operations are listed upstream as not yet implemented.

# HISTORY

**vectro** was created by **gurgeous** (Adam Doppelt) in **2025** and is written in **Go** using the **Bubble Tea** TUI framework. It is distributed as a single executable under the MIT license.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [calc](/man/calc)(1), [qalc](/man/qalc)(1)

# RESOURCES

```[Source code](https://github.com/gurgeous/vectro)```

<!-- verified: 2026-11-23 -->
