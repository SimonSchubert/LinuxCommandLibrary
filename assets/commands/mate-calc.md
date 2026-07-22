# TAGLINE

graphical calculator for the MATE desktop environment

# TLDR

**Start** the calculator

```mate-calc```

Calculate a **specific expression**

```mate-calc -s "[2 + 5]"```

# SYNOPSIS

**mate-calc** [_options_] [_-s expression_]

# PARAMETERS

**-s**, **--solve** _expression_
> Calculate the given expression and display the result.

**--version**
> Display version information

**--help**
> Display help information

# DESCRIPTION

**mate-calc** is the graphical calculator for the MATE desktop environment. It provides basic, advanced, financial, and programming calculator modes with support for arbitrary precision arithmetic.

Features include trigonometric functions, logarithms, factorials, unit conversions, and bitwise operations. The calculator supports multiple number bases (binary, octal, decimal, hexadecimal) and can work with complex numbers.

With **--solve**, expressions can be evaluated directly from the command line without opening the GUI, useful for scripts and quick calculations.

# INSTALL

```apt: sudo apt install mate-calc```

```dnf: sudo dnf install mate-calc```

```pacman: sudo pacman -S mate-calc```

```apk: sudo apk add mate-calc```

```zypper: sudo zypper install mate-calc```

```nix: nix profile install nixpkgs#mate-calc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mate-calc-cmd](/man/mate-calc-cmd)(1), [bc](/man/bc)(1), [gnome-calculator](/man/gnome-calculator)(1)
