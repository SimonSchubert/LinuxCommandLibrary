# TAGLINE

List icon groups stored in a Windows executable

# TLDR

List **icon groups** in an executable

```icolist [path/to/input.exe]```

List icons in a **DLL** or **.mun** resource file

```icolist [path/to/shell32.dll.mun]```

Run with **debug logging**

```icolist -v [path/to/input.exe]```

Print **version**

```icolist -V```

# SYNOPSIS

**icolist** [**-v**] _input_

# PARAMETERS

_input_
> Windows executable to inspect: **.exe**, **.dll**, or **.mun**

**-v**, **--verbose**
> Enable debug logging

**-V**, **--version**
> Print the program version and exit

**-h**, **--help**
> Show usage

# DESCRIPTION

**icolist** prints the icon groups embedded in a Windows executable so you can choose which one **icoextract** should write out. Both commands ship in the **icoextract** Python package.

For each group it prints the 0-based **Group Icon Index**, the resource **ID** (with a hex form when the ID is numeric), and the **Count** of images in that group. Each image line then shows **Icon ID**, **Width**, **Height** (a stored 0 means 256), resource and file offsets, and size in bytes. Pass that index to `icoextract -n` or the resource ID to `icoextract -i`.

The extractor understands PE files and Windows 10+ **.mun** system-resource files. Win16 NE executables need the optional **nefile** extra.

Requires **Python 3.10** or newer and **pefile**.

# CAVEATS

icolist only lists groups; it does not write an ICO. Recent Windows system DLLs often have no icon resources left in the DLL itself — inspect the matching **.mun** under `C:\Windows\SystemResources` instead. A file that is not a recognized executable raises an error.

# HISTORY

Part of **icoextract** by James Lu (MIT License), first released in 2019. Version **0.3.0** (2026-06-06) prints per-image dimensions, sizes, and offsets, and supports string resource IDs.

# INSTALL

```dnf: sudo dnf install python3-icoextract```

```pacman: sudo pacman -S icoextract```

```nix: nix profile install nixpkgs#icoextract```

<!-- packages: 2026-09-29 -->

# SEE ALSO

[icoextract](/man/icoextract)(1), [file](/man/file)(1), [identify](/man/identify)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/jlu5/icoextract)```

```[Documentation](https://projects.jlu5.com/icoextract.html)```

<!-- verified: 2026-09-29 -->
