# TAGLINE

official installer for the TeX Live distribution

# TLDR

**Start the TeX Live installer** interactively (text menu on Unix)

```sudo ./install-tl```

**Install immediately** with default settings, without the menu

```sudo ./install-tl --no-interaction```

**Install a smaller scheme** unattended

```sudo ./install-tl --scheme=small --no-interaction```

**Install into a user directory** without root

```./install-tl --texdir=[~/texlive/2026] --no-interaction```

Install **without documentation and source** files to save space

```sudo ./install-tl --no-doc-install --no-src-install```

**Install from a local ISO** or directory

```sudo ./install-tl --repository [/mnt/texlive]```

**Unattended install** from a profile file

```sudo ./install-tl --profile=[texlive.profile]```

Start the **graphical installer**

```./install-tl --gui```

# SYNOPSIS

**install-tl** [_option_]...

# PARAMETERS

**-gui** [_module_]
> Start the Tcl/Tk GUI installer; module **text** is the same as **-no-gui**.

**-no-gui**
> Use the text-mode installer (default on Unix).

**-no-interaction**
> Skip the interactive menu and install immediately after parsing options.

**-repository** _URL|PATH_
> Package repository to install from (default: automatic CTAN mirror; **ctan** is an alias).

**-select-repository**
> Choose a specific CTAN mirror from a list.

**-scheme** _SCHEME_
> Installation scheme, e.g. full (default), medium, small, basic, minimal, infraonly.

**-profile** _FILE_
> Install without interaction using settings from a profile file.

**-init-from-profile** _FILE_
> Load settings from a profile, then start the interactive menu.

**-texdir** _DIR_
> Main installation directory (default **/usr/local/texlive/YYYY**).

**-texuserdir** _DIR_
> User directory (default **~/.texliveYYYY**).

**-texmflocal** _DIR_
> Directory for site-wide local files.

**-texmfhome** _DIR_
> Directory for user-specific files (default **~/texmf**).

**-paper** _a4|letter_
> Default paper size (default a4).

**-portable**
> Install for portable use (USB drive, no system integration).

**-no-doc-install**, **-no-src-install**
> Do not install documentation or source files.

**-no-verify-downloads**
> Skip GnuPG verification of downloads.

**-no-continue**
> Abort if a non-core package fails to install.

**-print-platform**
> Print the detected platform identifier and exit.

**-logfile** _FILE_
> Write all messages to a log file.

**-q**
> Omit informational messages.

**-no-cls**
> Do not clear the screen in text mode.

**-help**
> Display help information.

# DESCRIPTION

**install-tl** is the official installer for TeX Live, a comprehensive TeX distribution including LaTeX, fonts, and related programs. It is shipped in **install-tl-unx.tar.gz** (Unix) and **install-tl-windows.exe**/**install-tl.zip** (Windows). Options may be given with **-** or **--**, and values separated by a space or **=**.

The installer downloads packages from CTAN mirrors or uses a local repository. Installation schemes range from infraonly and minimal to full (several GB, the recommended default). After installation, add the **bin/**_platform_ directory to **PATH** and use **tlmgr** (TeX Live Manager) to update and manage packages. A profile of the finished installation is saved in **tlpkg/texlive.profile**.

# CAVEATS

Full installation requires about 8 GB of disk space. Network installations depend on CTAN mirror availability. The GUI requires Tcl/Tk (the former Perl/Tk interface was replaced). **PATH** is not adjusted on Unix by default. Each yearly release installs into a new directory; upgrading across releases is not supported by tlmgr, so a fresh install is normally done each year. Do not use install-tl to modify an existing installation: use **tlmgr**.

# HISTORY

TeX Live was first released in **1996** as a collaboration between TeX user groups worldwide to provide a consistent, cross-platform TeX distribution. The Perl-based **install-tl** became the standard installer with **TeX Live 2008**, replacing earlier platform-specific installers. It is maintained by the TeX Live team, mainly **Karl Berry** and **Norbert Preining**.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [lualatex](/man/lualatex)(1), [tex](/man/tex)(1)

# RESOURCES

```[Homepage](https://tug.org/texlive/)```

```[Source code](https://tug.org/texlive/svn/)```

```[Documentation](https://tug.org/texlive/doc/install-tl.html)```

<!-- verified: 2026-09-29 -->
