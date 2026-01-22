# TLDR

**Compile PPD files**

```ppdc [driver.drv]```

**Compile to specific directory**

```ppdc -d [output_dir] [driver.drv]```

**Verbose output**

```ppdc -v [driver.drv]```

# SYNOPSIS

**ppdc** [_options_] _source_

# PARAMETERS

_SOURCE_
> Driver source file.

**-d** _DIR_
> Output directory.

**-v**
> Verbose output.

**-I** _DIR_
> Include directory.

# DESCRIPTION

**ppdc** compiles CUPS PPD driver files. Creates printer definitions.

The tool generates PPD files. Part of CUPS printing system.

ppdc compiles drivers.

# CAVEATS

CUPS specific. PPD files for printer support.

# HISTORY

ppdc is part of **CUPS** for PPD file compilation.

# SEE ALSO

[ppdhtml](/man/ppdhtml)(1), [ppdi](/man/ppdi)(1), [cups](/man/cups)(1)

