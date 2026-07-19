# TAGLINE

Displays bar graphs of current ink or toner supply levels for HP printers

# TLDR

**Show ink/toner levels** for the default/only installed printer

```hp-levels```

**Show levels for a specific CUPS printer**

```hp-levels -p [printer-name]```

**Show levels by device URI**

```hp-levels -d [device-uri]```

**Run interactively**, choosing the printer from a list

```hp-levels -i```

**Draw a wider bar graph** (default width is 51 characters)

```hp-levels -s [80]```

# SYNOPSIS

**hp-levels** [_DEVICE-URI_|_PRINTER-NAME_] [_MODE_] [_OPTIONS_]

# PARAMETERS

**-d** _device-uri_, **--device**=_device-uri_
> Specify the target printer by CUPS device URI.

**-p** _printer_, **--printer**=_printer_
> Specify the target printer by CUPS queue name.

**-i**, **--interactive**
> Run in interactive mode, prompting to choose a device.

**-s** _size_, **--size**=_size_
> Bar graph width in characters (default 51).

**-c**, **--color**
> Use colored bar graphs (colorized by default).

**-a** _char_, **--char**=_char_
> Character used to draw the bar graph (default **/**).

**-l** _level_, **--logging**=_level_
> Set logging verbosity: none, info (default), error, warn, or debug.

**-g**
> Run with debug-level logging (equivalent to **-l debug**).

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**hp-levels** queries an HPLIP-supported HP printer for its current ink or toner supply levels and renders them as text bar graphs in the terminal, one bar per installed cartridge or tank.

Point it at a printer with **-p** or **-d**; with no target given it uses the sole installed HPLIP device or prompts to choose one when several are configured. This is the CLI equivalent of the supply-levels panel in the HPLIP toolbox GUI.

# CAVEATS

Part of the HPLIP package. Level reporting accuracy and granularity vary by printer model; some cheaper models only report ok/low/out rather than a percentage, and a few report nothing at all.

# HISTORY

**hp-levels** is one of the supply-monitoring utilities in **HPLIP** (HP Linux Imaging and Printing), HP's open-source printer/scanner driver suite for Linux.

# SEE ALSO

[hp-info](/man/hp-info)(1), [hp-check](/man/hp-check)(1), [lpstat](/man/lpstat)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/hplip/)```

```[Homepage](https://developers.hp.com/hp-linux-imaging-and-printing)```

```[Documentation](https://developers.hp.com/hp-linux-imaging-and-printing/tech_docs/man_pages/index)```

<!-- verified: 2026-07-19 -->
