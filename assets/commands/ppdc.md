# TAGLINE

Compile CUPS PPD printer driver files

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

**ppdc** compiles CUPS printer driver source files (.drv) into PPD (PostScript Printer Description) files. PPD files describe a printer's capabilities including supported paper sizes, resolutions, color modes, and optional features, and are used by CUPS to generate appropriate print job data.

The driver source format provides a compact way to define multiple printer models in a single file with shared options and model-specific overrides. The compiled PPD files can be placed in the CUPS model directory for automatic printer detection and setup.

# CAVEATS

CUPS specific. PPD files for printer support.

# HISTORY

ppdc is part of **CUPS** for PPD file compilation.

# SEE ALSO

[ppdhtml](/man/ppdhtml)(1), [ppdi](/man/ppdi)(1), [cups](/man/cups)(1)

