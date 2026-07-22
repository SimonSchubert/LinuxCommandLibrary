# TAGLINE

Printhead cleaning utility for HPLIP-supported HP inkjet printers

# TLDR

**Clean print heads** for the default printer (opens the interactive cleaning wizard)

```hp-clean```

**Clean a specific CUPS printer** by queue name

```hp-clean -p [printer-name]```

**Clean a printer** by device URI

```hp-clean -d [device-uri]```

**Run interactively**, choosing the cleaning level (1-3) at the prompt

```hp-clean -i```

**Enable debug-level logging** for troubleshooting

```hp-clean -g```

# SYNOPSIS

**hp-clean** [_DEVICE-URI_|_PRINTER-NAME_] [_MODE_] [_OPTIONS_]

# PARAMETERS

**-d** _device-uri_, **--device**=_device-uri_
> Specify the target printer by CUPS device URI.

**-p** _printer_, **--printer**=_printer_
> Specify the target printer by CUPS queue name.

**-i**, **--interactive**
> Run in interactive mode.

**-l** _level_, **--logging**=_level_
> Set logging verbosity: none, info (default), error, warn, or debug.

**-g**
> Run with debug-level logging (equivalent to **-l debug**).

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**hp-clean** runs the printhead cleaning routine on HPLIP-supported HP inkjet printers, clearing dried ink and debris from the nozzles to restore print quality.

When launched without a specific mode it walks through an interactive wizard that lets the user pick a cleaning level from 1 to 3; higher levels clean more aggressively and consume more ink, so level 1 is usually tried first. The target printer can be selected up front with **-p** or **-d**, otherwise hp-clean prompts for one if more than one HPLIP device is installed.

hp-clean only works with inkjet printers whose HPLIP plugin exposes a cleaning routine; laser printers and some low-end inkjets do not support it.

# CAVEATS

Part of the HPLIP package. Cleaning consumes ink and should only be run when print quality actually degrades (streaks, missing lines). Not all HPLIP-supported models implement printhead cleaning.

# HISTORY

**hp-clean** is one of the device-maintenance utilities in **HPLIP** (HP Linux Imaging and Printing), HP's open-source printer/scanner driver suite for Linux, alongside **hp-align** and **hp-linefeedcal**.

# INSTALL

```apt: sudo apt install hplip```

```dnf: sudo dnf install hplip```

```pacman: sudo pacman -S hplip```

```zypper: sudo zypper install hplip```

```nix: nix profile install nixpkgs#hplip```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hp-align](/man/hp-align)(1), [hp-check](/man/hp-check)(1), [hp-levels](/man/hp-levels)(1), [hp-info](/man/hp-info)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/hplip/)```

```[Homepage](https://developers.hp.com/hp-linux-imaging-and-printing)```

```[Documentation](https://developers.hp.com/hp-linux-imaging-and-printing/tech_docs/man_pages/index)```

<!-- verified: 2026-07-19 -->
