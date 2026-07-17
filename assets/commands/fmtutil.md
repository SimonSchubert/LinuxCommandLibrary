# TAGLINE

manage TeX format files and Metafont bases

# TLDR

**Rebuild all** formats (prefer the sys/user wrappers)

```fmtutil --sys --all```

**Create missing** formats only

```fmtutil --sys --missing```

**Rebuild one** format by name

```fmtutil --sys --byfmt pdflatex```

**Rebuild formats** for a given engine

```fmtutil --sys --byengine pdftex```

**List** configured formats

```fmtutil --sys --listcfg```

# SYNOPSIS

**fmtutil** [**-user**|**-sys**] [_OPTION_]... [_COMMAND_]

# DESCRIPTION

**fmtutil** rebuilds and manages TeX format files and Metafont bases (collectively called "formats"). Formats are pre-dumped engine states (for example **pdflatex.fmt**) that make subsequent TeX runs much faster.

As of TeX Live 2017, prefer the explicit wrappers **fmtutil-sys** and **fmtutil-user**, or pass **-sys** / **-user**. Invoking bare **fmtutil** without a mode prints a warning. Best practice for almost all installations is **system mode** so generated files land under TEXMFSYSVAR and stay consistent with package updates.

Exactly one command must be given (except in **mktexfmt** mode). Configuration is merged from all **fmtutil.cnf** files found via **kpsewhich**.

# PARAMETERS

**-sys**
> Use system trees TEXMFSYSVAR / TEXMFSYSCONFIG (same as **fmtutil-sys**)

**-user**
> Use user trees TEXMFVAR / TEXMFCONFIG (same as **fmtutil-user**)

**--all**
> Recreate all format files

**--missing**
> Create all missing format files

**--byfmt** _FORMAT_
> (Re)create format FORMAT

**--byengine** _ENGINE_
> (Re)create formats built with ENGINE

**--byhyphen** _HYPHENFILE_
> (Re)create formats that depend on HYPHENFILE

**--refresh**
> Recreate only formats that already exist

**--enablefmt** _FORMAT_[/_ENGINE_]
> Enable FORMAT (optionally for a specific engine)

**--disablefmt** _FORMAT_[/_ENGINE_]
> Disable FORMAT

**--listcfg**
> List enabled and disabled configurations for available formats

**--showhyphen** _FORMAT_
> Print the hyphen file name for FORMAT

**--cnffile** _FILE_
> Read FILE instead of the default **fmtutil.cnf** (may be repeated)

**--fmtdir** _DIR_
> Write formats under DIR instead of TEXMF[SYS]VAR

**--dry-run**, **-n**
> Do not actually build formats

**--quiet**
> Be silent

**--nohash**
> Do not update ls-R files

**--no-strict**
> Exit successfully even if a format fails to build

**--version**, **--help**
> Show version or help and exit

# CAVEATS

Running in **user** mode once writes formats under TEXMFVAR that permanently override system formats until those user files are removed. Prefer **fmtutil-sys** / **-sys** unless you intentionally maintain private formats. Building all formats can take a long time and needs a complete TeX Live engine set.

# HISTORY

Originally written by Thomas Esser for teTeX; maintained as part of TeX Live. The **-user** / **-sys** split and dedicated **fmtutil-user** / **fmtutil-sys** commands were introduced around TeX Live 2017.

# SEE ALSO

[fmtutil-sys](/man/fmtutil-sys)(1), [fmtutil-user](/man/fmtutil-user)(1), [mktexfmt](/man/mktexfmt)(1), [kpsewhich](/man/kpsewhich)(1), [pdflatex](/man/pdflatex)(1), [latex](/man/latex)(1)

# RESOURCES

```[Documentation](https://tug.org/texlive/doc/fmtutil.html)```

```[Homepage](https://tug.org/texlive/)```

<!-- verified: 2026-07-17 -->
