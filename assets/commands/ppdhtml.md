# TAGLINE

Generate HTML from PPD printer files

# TLDR

**Convert PPD to HTML**

```ppdhtml [file.ppd] > [output.html]```

**Convert multiple files**

```ppdhtml [file1.ppd] [file2.ppd]```

# SYNOPSIS

**ppdhtml** [_options_] _file_

# PARAMETERS

_FILE_
> One or more PPD source (`.drv` / `.ppd`) files to render.

**-D** _NAME=VALUE_
> Define a variable for the PPD compiler (passed through to `ppdc`).

**-I** _DIR_
> Add a directory to the include search path.

# DESCRIPTION

**ppdhtml** reads a PPD or PPD compiler (`.drv`) source file and writes a human-readable HTML summary to standard output. The generated page documents the printer's options groups, UI constraints, paper sizes, resolutions, and other PPD attributes.

It is most often used while authoring printer drivers as part of the CUPS DDK toolchain — the same source files that **ppdc** compiles into installable PPDs.

# CAVEATS

Output goes only to stdout — there is no `-o` flag; redirect with `> output.html`. The CUPS DDK (which ships `ppdhtml`, `ppdc`, `ppdi`, `ppdmerge`, `ppdpo`) was deprecated upstream in CUPS 2.x and may be packaged separately (e.g., `cups-ppdc` on Debian/Ubuntu).

# HISTORY

ppdhtml is part of **CUPS** for PPD documentation generation.

# INSTALL

```apt: sudo apt install cups-ppdc```

```dnf: sudo dnf install cups-client```

```apk: sudo apk add cups-client```

```zypper: sudo zypper install cups-client```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdi](/man/ppdi)(1), [cups](/man/cups)(1)

