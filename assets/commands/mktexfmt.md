# TAGLINE

create a single TeX format or Metafont base on demand

# TLDR

**Build** the **pdflatex** format

```mktexfmt pdflatex.fmt```

**Build** by plain format name

```mktexfmt latex```

**Build** a Metafont base

```mktexfmt mf.base```

# SYNOPSIS

**mktexfmt** _FORMAT.fmt_|_BASE.base_|_FMTNAME_

# DESCRIPTION

**mktexfmt** is a restricted front-end to **fmtutil** that creates **exactly one** format or Metafont base. TeX engines invoke it automatically when a required **.fmt** is missing (on-the-fly format generation).

The argument may be a full dump name with extension (**pdflatex.fmt**, **mf.base**) or a plain format name passed as if **--byfmt** were used. On success, **mktexfmt** writes the full path of the generated file to standard output and nothing else. Only **--help** and **--version** are accepted as options.

If the system format directory (TEXMFSYSVAR) is writable, formats are written there; otherwise the user directory (TEXMFVAR) is used.

# PARAMETERS

_FORMAT.fmt_ | _BASE.base_ | _FMTNAME_
> Name of the format or base to build. With an extension, the dump file name is used; without, the name is treated as a **--byfmt** argument

**--help**
> Show help and exit

**--version**
> Show version and exit

# CAVEATS

Unlike **fmtutil**, only one format can be built per invocation. Failed builds typically leave the engine that triggered **mktexfmt** unable to start; fix the underlying **fmtutil.cnf** / engine install and rebuild with **fmtutil-sys --byfmt**. Output is intentionally minimal so callers can capture the generated path.

# HISTORY

Part of the TeX Live / kpathsea tooling around **fmtutil**, used as the on-demand format builder when formats are not pre-generated.

# SEE ALSO

[fmtutil](/man/fmtutil)(1), [fmtutil-sys](/man/fmtutil-sys)(1), [fmtutil-user](/man/fmtutil-user)(1), [kpsewhich](/man/kpsewhich)(1), [pdflatex](/man/pdflatex)(1)

# RESOURCES

```[Documentation](https://tug.org/texlive/doc/fmtutil.html)```

```[Homepage](https://tug.org/texlive/)```

<!-- verified: 2026-07-17 -->
