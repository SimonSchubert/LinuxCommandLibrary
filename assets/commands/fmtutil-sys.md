# TAGLINE

manage TeX formats and Metafont bases system-wide

# TLDR

**Rebuild all** system formats

```fmtutil-sys --all```

**Create only missing** system formats

```fmtutil-sys --missing```

**Rebuild** the **pdflatex** format

```fmtutil-sys --byfmt pdflatex```

**Rebuild formats** for the **pdftex** engine

```fmtutil-sys --byengine pdftex```

**List** format configuration

```fmtutil-sys --listcfg```

# SYNOPSIS

**fmtutil-sys** [_OPTION_]... [_COMMAND_]

# DESCRIPTION

**fmtutil-sys** is the system-wide form of **fmtutil**. It rebuilds TeX format files and Metafont bases into TEXMFSYSVAR (typically under the TeX Live tree), reading system configuration from trees such as TEXMFSYSCONFIG, TEXMFLOCAL, and TEXMFDIST.

This is the recommended mode for almost every installation: package managers and **tlmgr** updates expect formats in the system location. Prefer **fmtutil-sys** over **fmtutil-user** unless you deliberately maintain private per-user formats.

Exactly one command is required (**--all**, **--missing**, **--byfmt**, and so on). See **fmtutil** for the full option set; **fmtutil-sys** is equivalent to **fmtutil --sys**.

# PARAMETERS

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
> Recreate only existing format files

**--listcfg**
> List format configurations filtered to available formats

**--enablefmt** _FORMAT_[/_ENGINE_]
> Enable FORMAT

**--disablefmt** _FORMAT_[/_ENGINE_]
> Disable FORMAT

**--cnffile** _FILE_
> Read alternate **fmtutil.cnf** (may be repeated)

**--fmtdir** _DIR_
> Write formats under DIR

**--dry-run**, **-n**
> Do not actually build formats

**--quiet**
> Be silent

**--version**, **--help**
> Show version or help and exit

# CAVEATS

Usually requires write access to the TeX Live system trees (root or the texlive admin account). If a user has previously run **fmtutil-user**, their TEXMFVAR formats still override system ones for that account until removed. Building **--all** can take several minutes.

# HISTORY

Part of TeX Live's multi-**fmtutil** design; **fmtutil-sys** selects system trees the way **updmap-sys** does for font maps. See the TeX Live sys-vs-user documentation for migration details.

# SEE ALSO

[fmtutil](/man/fmtutil)(1), [fmtutil-user](/man/fmtutil-user)(1), [mktexfmt](/man/mktexfmt)(1), [kpsewhich](/man/kpsewhich)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Documentation](https://tug.org/texlive/scripts-sys-user.html)```

```[Homepage](https://tug.org/texlive/)```

<!-- verified: 2026-07-17 -->
