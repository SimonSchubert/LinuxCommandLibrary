# TAGLINE

unit conversion terminal utility

# TLDR

**Convert a value** by appending its unit abbreviation

```conv [100f]```

**Convert metres to other distance units**

```conv [50m]```

**Convert weight** in kilograms

```conv [75kg]```

**Convert data transfer speed** in megabits per second

```conv [100mbps]```

**Display help** and list all supported unit abbreviations

```conv --help```

# SYNOPSIS

**conv** _value__unit_

**conv** **-h**|**--help**

**conv** **-v**|**--version**

# PARAMETERS

**-h**, **--help**
> Display help information and list all supported unit abbreviations.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**conv** is a lightweight, self-contained terminal utility for converting everyday units of measurement. A value and its unit abbreviation are written together as a single argument (e.g. `100f` for 100 degrees Fahrenheit), and conv prints the equivalent values in all other units of the same category.

Supported categories and their abbreviations:

- **Temperature:** c (Celsius), f (Fahrenheit)
- **Distance:** cm (centimetres), ft (feet), in (inches), km (kilometres), m (metres), mi (miles), nm (nautical miles), yd (yards)
- **Weight:** ct (carats), g (grams), kg (kilograms), oz (ounces), lb (pounds), st (stone)
- **Volume:** cum (cubic metres), l (litres), guk (imperial gallons), gus (US gallons)
- **Speed:** kmh (km/h), kn (knots), mph (miles per hour), mps (metres per second)
- **Data rate:** bps, kbps, mbps (bits per second family); bs, kbs, mbs (bytes per second family)
- **Power:** hp (horsepower), w (watts)
- **Other:** bbl (petroleum barrels)

# CAVEATS

The value and unit abbreviation must be written as a single argument with no space between them (e.g. `conv 100f`, not `conv 100 f`). Only the unit categories listed above are supported; currency and arbitrary unit expressions are not handled. The project was archived in 2019 and is no longer actively maintained.

# HISTORY

**conv** was written by Ben Garrett and implemented in Go. Precompiled binaries were provided for Linux, macOS, Windows, and ARM. The repository at github.com/bengarrett/conv was archived in September 2019.

# SEE ALSO

[units](/man/units)(1), [bc](/man/bc)(1), [qalc](/man/qalc)(1)
