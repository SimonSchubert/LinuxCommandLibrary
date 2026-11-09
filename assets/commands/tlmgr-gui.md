# TAGLINE

Built-in graphical TeX Live Manager interface

# TLDR

**Start graphical interface**

```tlmgr gui```

**Start with specific repository**

```tlmgr --repository [url] gui```

**Load the default repository at startup**

```tlmgr gui --load```

**Open directly at the screen of an action**

```tlmgr --gui [update]```

**Start in a specific language**

```tlmgr --gui-lang [de] gui```

# SYNOPSIS

**tlmgr gui** [_options_]

**tlmgr --gui** [_action_]

# PARAMETERS

**--load**
> Load the default repository at startup.

**--gui-lang** _code_
> Interface language as an ISO 639-1 based code; by default deduced from the environment.

**-background**, **-font**, **-geometry**, **-title**
> Standard Tk options are also accepted.

# DESCRIPTION

**tlmgr gui** launches the graphical interface built into TeX Live Manager. Provides visual package browsing, installation, and configuration. Requires Perl/Tk.

# CAVEATS

Requires **perl-tk** to be installed outside of TeX Live on Unix. Windows no longer ships the necessary modules, so an external Perl that includes them is needed. The TeX Live documentation suggests the separate front-ends **tlshell** (Tcl/Tk) or **tlcockpit** (Java) as easier alternatives, and **TeX Live Utility** on macOS.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [tlmgr-shell](/man/tlmgr-shell)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
