# TAGLINE

Convert paths between Unix and Windows formats in a Wine prefix

# TLDR

Convert a **Windows path to a Unix path** (this is also the default)

```winepath --unix '[C:\path\to\file]'```

Convert a **Unix path to a long Windows path**

```winepath --windows [path/to/file]```

Convert an existing file's **short (8.3) Windows path to long form**

```winepath --long '[C:\PROGRA~1]'```

Convert an existing file's **long Windows path to short (8.3) form**

```winepath --short '[C:\Program Files]'```

Print several Unix paths **NUL-separated** (for **xargs -0**)

```winepath --unix -0 [path1] [path2]```

# SYNOPSIS

**winepath** [_option_...] [_path_...]

# PARAMETERS

**-u**, **--unix**
> Convert a Windows path to a Unix path. This is the default if no format option is given.

**-w**, **--windows**
> Convert a Unix path to a long Windows path (for example **C:\Program Files\...**).

**-l**, **--long**
> Convert the short Windows path of an existing file or directory to the long format. The path must exist in the prefix.

**-s**, **--short**
> Convert the long Windows path of an existing file or directory to the short (8.3) format. The path must exist in the prefix.

**-0**
> Separate output records with a NUL byte instead of a newline.

**-h**, **--help**
> Print the help message and exit.

# DESCRIPTION

**winepath** converts file paths between Unix and Win32 forms for the Wine prefix named by **WINEPREFIX** (default **~/.wine**). Windows programs see drive letters and backslashes; Unix tools see **drive_c** and forward slashes. **winepath** is the command-line bridge between those two views.

If more than one format option is given, each input path is printed in every requested format, in the order long, short, Unix, Windows. With no format option, Unix format is used. Unlike **wine start /unix**, **winepath** only prints converted names; it does not launch anything.

# CAVEATS

**--long** and **--short** require the path to exist; they fail silently (empty line) for missing files. Conversion follows the current prefix's drive mappings, so a path that is valid in one **WINEPREFIX** may not convert in another. Quote Windows paths that contain backslashes or spaces so the shell does not eat them.

# HISTORY

**winepath** is part of **Wine**, the Windows compatibility layer begun in **1993**. The Unix helper was added so scripts and native file managers could translate paths without starting a Windows program.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-start](/man/wine-start)(1), [wineboot](/man/wineboot)(1), [winecfg](/man/winecfg)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-15 -->
