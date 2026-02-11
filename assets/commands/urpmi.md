# TAGLINE

Install packages on Mageia Linux

# TLDR

**Install** package

```sudo urpmi [package]```

Install from **local** RPM

```sudo urpmi [path/to/file.rpm]```

**Download** without installing

```urpmi --no-install [package]```

**Update** all packages

```sudo urpmi --auto-select```

Install on **multiple** machines

```sudo urpmi --parallel local [package]```

# SYNOPSIS

**urpmi** [_OPTIONS_] _PACKAGE_...

# PARAMETERS

**--no-install**
> Download package without installing

**--auto-select**
> Update all installed packages

**--parallel** _CONFIG_
> Install on multiple machines

**--auto**
> Automatically confirm actions

# DESCRIPTION

**urpmi** is the package installer for Mageia Linux. It can install packages from repositories or local RPM files, handling dependencies automatically.

The tool supports updating all installed packages and can manage packages across multiple machines using parallel configuration.

# CAVEATS

Mageia specific. Run urpmi.update -a first to get latest package lists. Requires root privileges for installation.

# SEE ALSO

[urpme](/man/urpme)(8), [urpmq](/man/urpmq)(8), [urpmi.update](/man/urpmi.update)(8), [urpmi.addmedia](/man/urpmi.addmedia)(8)
