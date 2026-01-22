# TLDR

Display **100 digits** of Pi

```pi```

Display **specific number** of digits

```pi [1000]```

Display **bibliography**

```pi --bibliography```

Display **help**

```pi --help```

# SYNOPSIS

**pi** [_digits_] [**--bibliography**] [**--help**] [**--version**]

# PARAMETERS

**digits**
> Number of decimal digits to compute (default: 100)

**--bibliography**
> Display recommended readings about Pi computation

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pi** computes and displays decimal digits of Archimedes' constant Pi (π). It uses efficient algorithms to calculate Pi to arbitrary precision, limited only by available memory and time.

The tool is useful for testing system performance, generating Pi digits for verification purposes, or educational exploration of the mathematical constant.

# CAVEATS

Very large digit counts require significant computation time and memory. Results are computed fresh each run (not cached). Part of the GNU coreutils on some systems.

# HISTORY

**pi** implementations have existed in various forms across Unix systems. The constant Pi has been computed to trillions of digits using specialized algorithms like the Chudnovsky algorithm, though command-line tools typically compute fewer digits for practical use.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [factor](/man/factor)(1)
