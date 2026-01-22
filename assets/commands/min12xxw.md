# TLDR

**Print file**

```min12xxw [file.prn]```

**Set resolution**

```min12xxw -r [600] [file.prn]```

**Set paper size**

```min12xxw -p [a4] [file.prn]```

**Verbose output**

```min12xxw -v [file.prn]```

# SYNOPSIS

**min12xxw** [_options_] [_file_]

# PARAMETERS

_FILE_
> Print file.

**-r** _DPI_
> Resolution.

**-p** _SIZE_
> Paper size.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**min12xxw** is a driver for Minolta PagePro printers. It converts print data for 12xxW series.

The tool is a filter for CUPS. It handles Minolta-specific print protocols.

min12xxw drives Minolta printers.

# CAVEATS

Minolta 12xxW specific. Part of printer driver. CUPS integration.

# HISTORY

min12xxw provides Linux support for **Minolta PagePro** 12xxW series laser printers.

# SEE ALSO

[lp](/man/lp)(1), [cups](/man/cups)(1), [lpr](/man/lpr)(1)

