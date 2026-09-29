# TAGLINE

Extract icons from Windows executables into ICO files

# TLDR

Extract the **first icon group** from an executable

```icoextract [path/to/input.exe] [path/to/output.ico]```

Extract from a **DLL** or a Windows **.mun** resource file

```icoextract [path/to/shell32.dll.mun] [path/to/output.ico]```

Extract a specific icon by **index** (0-based)

```icoextract -n [1] [path/to/input.exe] [path/to/output.ico]```

Extract an icon by **resource ID**

```icoextract -i [32512] [path/to/input.exe] [path/to/output.ico]```

Run with **debug logging**

```icoextract -v [path/to/input.exe] [path/to/output.ico]```

Print **version**

```icoextract -V```

# SYNOPSIS

**icoextract** [**-n** _index_] [**-i** _id_] [**-v**] _input_ _output_

# PARAMETERS

_input_
> Windows executable to read: **.exe**, **.dll**, or **.mun**

_output_
> Destination **.ico** path

**-n** _index_, **--num** _index_
> 0-based index of the icon group to extract (default **0**)

**-i** _id_, **--id** _id_
> Resource ID of the icon group (integer or string)

**-v**, **--verbose**
> Enable debug logging

**-V**, **--version**
> Print the program version and exit

**-h**, **--help**
> Show usage

# DESCRIPTION

**icoextract** reads icon resources from Windows Portable Executable (PE) files and writes them as a Windows ICO. It also understands Windows 10+ **.mun** system-resource files, where icons that used to live in `shell32.dll` and similar libraries were moved. An optional **nefile** extra adds Win16 New Executable (NE) support.

The same project ships **icolist**, which prints every icon group in a file so you can pick an index or resource ID before extracting, and **exe-thumbnailer**, a FreeDesktop thumbnailer for Linux file managers.

Output is always ICO data. If the destination path ends in **.png**, **.jpg**, or **.jpeg**, icoextract still writes ICO bytes and prints a warning; convert the ICO afterwards if you need another format.

Requires **Python 3.10** or newer and **pefile**.

# CAVEATS

The default **--num 0** extracts the first group only. A missing index or resource ID raises an error. Recent Windows system DLLs often contain no icons; extract the matching **.mun** under `C:\Windows\SystemResources` instead. Win16 NE files need the optional **nefile** extra. This is a Python CLI (`icoextract.scripts.extract`), not ImageMagick **convert**.

# HISTORY

Written by James Lu (MIT License), first released in 2019. Inspired by extract-icon-py and icoutils. Version **0.3.0** (2026-06-06) added Win16 NE extraction via **nefile** and string resource IDs.

# INSTALL

```dnf: sudo dnf install python3-icoextract```

```pacman: sudo pacman -S icoextract```

```nix: nix profile install nixpkgs#icoextract```

<!-- packages: 2026-09-29 -->

# SEE ALSO

[icolist](/man/icolist)(1), [file](/man/file)(1), [identify](/man/identify)(1), [convert](/man/convert)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/jlu5/icoextract)```

```[Documentation](https://projects.jlu5.com/icoextract.html)```

<!-- verified: 2026-09-29 -->
