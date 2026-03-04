# TAGLINE

REPL CLI calculator for storage expressions and byte conversions

# TLDR

**Evaluate an arithmetic expression** with storage units

```bcal "(5kb+2mb)/3"```

**Convert a value** to all storage units

```bcal 0xaabbcc kb```

**Show binary, decimal and hex** representations of a number

```bcal -c 20140115```

**Perform bitwise operations**

```bcal -b '0xFF & 0x0F'```

**Use as a general-purpose calculator**

```bcal -b '3.5 * 2.1 + 5.7'```

**Convert LBA to CHS**

```bcal -f l500```

**Convert CHS to LBA**

```bcal -f c10-10-10```

**Start interactive REPL mode**

```bcal```

# SYNOPSIS

**bcal** [**-b** [_expr_]] [**-c** _N_] [**-p** _N_] [**-f** _loc_] [**-s** _bytes_] [_expr_] [_N_ [_unit_]] [**-m**] [**-d**] [**-h**]

# PARAMETERS

**-b** [_expr_]
> Start general-purpose REPL mode. If an expression is provided, evaluate it and quit.

**-c** _N_
> Show decimal, binary and hex representation of positive integer N.

**-p** _N_
> Show bit positions and bit values of a number.

**-f** _loc_
> Convert CHS to LBA or LBA to CHS. The location is a hyphen-separated representation.

**-s** _bytes_
> Sector size in bytes. Default value is 512.

**-m**
> Show minimal output (e.g. decimal bytes only).

**-d**
> Enable debug information and logs.

**-h**
> Show help, storage sizes on the system, and exit.

# DESCRIPTION

**bcal** (Byte CALculator) is a command-line utility for calculations and expressions involving binary prefixes, SI/IEC conversion, byte addressing, base conversion, and LBA/CHS calculation. It also supports general-purpose arithmetic, bitwise operations, and mathematical functions.

Storage expressions support the operators **+**, **-**, **\***, **/**, **%** with units such as B, KiB, MiB, GiB, TiB, kB, MB, GB, and TB. Units are case-insensitive. Hex values are prefixed with **0x** and binary values with **0b**.

In general-purpose mode (**-b**), bcal supports bitwise operations: AND (**&**), OR (**|**), XOR (**^**), complement (**~**), left shift (**<<**), and right shift (**>>**). Mathematical functions include **exp**(n), **log**(base, n), **ln**(n), **pow**(n, exponent), and **root**(radical, n).

When started without arguments, bcal enters an interactive REPL mode. The last valid result is stored in the variable **r** and can be reused in subsequent expressions. In the REPL, press **b** to toggle between storage and general-purpose modes, **c N** for base conversion, **p N** for bit positions, **s** for storage type sizes, and **q** or double Enter to quit.

bcal works with piped input and file redirection, making it suitable for scripted workflows. Precision is 128-bit when **__uint128_t** is available, otherwise 64-bit. Floating-point operations use **long double** arithmetic.

# CONFIGURATION

**History file**
> REPL history is stored at **$XDG_CONFIG_HOME/bcal/history**, or **$HOME/.config/bcal/history** if XDG_CONFIG_HOME is unset.

**BCAL_BIT_ANSI_COLOR_CODE**
> Environment variable to set the ANSI escape code for colorizing bit value 1 in **-p** output. Set to empty to disable coloring.

# CAVEATS

Only 64-bit operating systems are supported. Fractional bytes do not exist and cannot be addressed; bcal shows the floor value of non-integer byte results. Negative values in storage expressions are unsupported.

LBA and CHS format conversion arguments must be hyphen-separated. LBA values are prefixed with **l** and CHS values with **c**. Any unspecified value defaults to 0.

Default disk geometry values are: sector size 512, max heads per cylinder 16, max sectors per track 63.

# HISTORY

**bcal** was created by **Arun Prakash Jana** and released in **2016** as open-source software under the **GPLv3+** license. It is written in C with minimal dependencies (libc and optionally GNU Readline or BSD Editline).

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [calc](/man/calc)(1), [units](/man/units)(1), [numfmt](/man/numfmt)(1)
