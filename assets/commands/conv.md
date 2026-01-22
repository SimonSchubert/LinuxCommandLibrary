# TLDR

**Convert between units** interactively

```conv```

**Convert a specific value** between units

```conv [100] [meters] [feet]```

**Convert temperature**

```conv [32] [fahrenheit] [celsius]```

**Convert currency** (requires network)

```conv [100] [USD] [EUR]```

**List available unit categories**

```conv --list```

**Convert with high precision**

```conv --precision [10] [1] [mile] [km]```

# SYNOPSIS

**conv** [_options_] [_value_] [_from_unit_] [_to_unit_]

# PARAMETERS

**--list**
> List available unit categories and units.

**--precision** _N_
> Set decimal precision for output.

**--offline**
> Use only offline conversion tables (no currency updates).

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**conv** is a command-line unit conversion utility that handles a wide variety of measurement types including length, weight, volume, temperature, time, and currency. It provides both interactive and command-line modes for quick conversions.

The tool supports common unit abbreviations and full names, making it accessible for quick calculations. Temperature conversions handle the non-linear relationship between Fahrenheit and Celsius correctly. Currency conversions can fetch current exchange rates when network access is available.

conv is useful for developers working with international systems, scientists needing quick unit translations, and anyone who regularly converts between measurement systems. Its command-line interface integrates well with scripts and other tools.

# CAVEATS

Currency conversion rates may be outdated without network access. Some specialized or obscure units may not be supported. Unit names must match the expected format; use **--list** to see available options.

# HISTORY

Unit conversion utilities have been part of Unix systems since early days. The **units** command from BSD provided similar functionality. Various implementations of conv-style tools have emerged to provide simpler interfaces for common conversion tasks.

# SEE ALSO

[units](/man/units)(1), [bc](/man/bc)(1), [qalc](/man/qalc)(1)
