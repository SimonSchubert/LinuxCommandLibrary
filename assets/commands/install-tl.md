# TAGLINE

official installer for TeX Live, a comprehensive TeX distribution including

# TLDR

**Start the TeX Live installer** interactively

```install-tl```

**Install TeX Live** in unattended mode with default settings

```install-tl --no-interaction```

**Install from a local ISO** or directory

```install-tl --repository [/path/to/texlive/iso]```

**Install a minimal scheme** (basic packages only)

```install-tl --scheme=small```

**Specify custom installation directory**

```install-tl --texdir=[/opt/texlive/2024]```

**Install with a specific profile** file

```install-tl --profile=[texlive.profile]```

# SYNOPSIS

**install-tl** [_-gui_] [_-no-gui_] [_-repository URL_] [_-scheme SCHEME_] [_-profile FILE_] [_-texdir DIR_] [_-no-interaction_] [_-help_]

# PARAMETERS

**-gui**
> Start in GUI mode (requires Perl/Tk)

**-no-gui**
> Force text mode installation

**-repository** _URL_
> Specify package repository (local path or URL)

**-scheme** _SCHEME_
> Installation scheme: full, medium, small, basic, minimal, etc.

**-profile** _FILE_
> Use settings from profile file for automated installation

**-texdir** _DIR_
> Main TeX Live installation directory

**-texmflocal** _DIR_
> Directory for site-wide local files

**-texmfhome** _DIR_
> Directory for user-specific files

**-portable**
> Install for portable use (USB drive, no system integration)

**-no-interaction**
> Run without user interaction (automated installation)

**-no-cls**
> Do not clear screen before output

**-help**
> Display help information

# DESCRIPTION

**install-tl** is the official installer for TeX Live, a comprehensive TeX distribution including LaTeX, fonts, and related programs. The installer can run in GUI, text, or fully automated mode depending on available dependencies and command-line options.

The installer downloads packages from CTAN mirrors or uses a local repository. Installation schemes range from minimal (~100MB) to full (~7GB). Post-installation, use **tlmgr** (TeX Live Manager) to update and manage packages.

# CAVEATS

Full installation requires several gigabytes of disk space. Network installations depend on CTAN mirror availability. GUI mode requires Perl/Tk which may not be installed by default. Annual releases mean reinstallation is typically needed each year rather than upgrades.

# HISTORY

TeX Live was first released in **1996** as a collaboration between TeX user groups worldwide to provide a consistent, cross-platform TeX distribution. The install-tl script has evolved alongside, with the Perl-based installer becoming standard around **2008**. It replaced earlier platform-specific installers and continues to be actively maintained by the TeX Live team.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [lualatex](/man/lualatex)(1), [tex](/man/tex)(1)
