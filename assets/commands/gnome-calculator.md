# TAGLINE

GNOME desktop calculator application

# TLDR

Launch the **GNOME Calculator GUI**

```gnome-calculator```

**Solve** the specified equation without launching the GUI

```gnome-calculator --solve [2^5 * 2 + 5]```

Display **version**

```gnome-calculator --version```

# SYNOPSIS

**gnome-calculator** [_options_]

# PARAMETERS

**--solve** _EQUATION_
> Solve equation and print result without launching GUI

**-m**, **--mode** _MODE_
> Start in specific mode: basic, advanced, financial, programming

**--version**
> Display version information

**--help**
> Display help message

# DESCRIPTION

**gnome-calculator** is the official calculator application for the GNOME desktop environment. It provides multiple modes: Basic for simple arithmetic, Advanced for scientific functions and trigonometry, Financial for interest and currency conversion, and Programming for bitwise operations and base conversion.

The calculator supports variables, unit conversions, and complex mathematical expressions. The **--solve** option allows using it as a command-line calculator without opening the GUI window.

# CAVEATS

Requires GTK and GLib libraries. Some advanced features may require additional libraries. Currency conversion requires network access for current rates.

# HISTORY

gnome-calculator evolved from the original gcalctool, which was part of GNOME since its early versions. The modern gnome-calculator was rewritten in Vala and introduced with GNOME 3.0 in **2011**, providing a cleaner interface and improved functionality.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [qalc](/man/qalc)(1)
