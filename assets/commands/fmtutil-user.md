# TAGLINE

manage TeX formats and Metafont bases for the current user

# TLDR

**Rebuild all** user-local formats

```fmtutil-user --all```

**Create missing** user formats

```fmtutil-user --missing```

**Rebuild** a single format under the user tree

```fmtutil-user --byfmt pdflatex```

**List** user-visible format configuration

```fmtutil-user --listcfg```

# SYNOPSIS

**fmtutil-user** [_OPTION_]... [_COMMAND_]

# DESCRIPTION

**fmtutil-user** is the per-user form of **fmtutil**. It writes format files under TEXMFVAR (for example **~/.texliveYYYY/texmf-var**) and can read additional config from TEXMFCONFIG / TEXMFHOME. It is equivalent to **fmtutil --user**.

User mode is only appropriate when formats must be private to one account (for example experimental engines under TEXMFHOME). For a normal single- or multi-user machine, **fmtutil-sys** is strongly preferred.

Exactly one command is required. Options match **fmtutil** / **fmtutil-sys**.

# PARAMETERS

**--all**
> Recreate all format files in the user tree

**--missing**
> Create all missing format files

**--byfmt** _FORMAT_
> (Re)create format FORMAT

**--byengine** _ENGINE_
> (Re)create formats built with ENGINE

**--refresh**
> Recreate only existing format files

**--listcfg**
> List format configurations

**--enablefmt** _FORMAT_[/_ENGINE_]
> Enable FORMAT

**--disablefmt** _FORMAT_[/_ENGINE_]
> Disable FORMAT

**--cnffile** _FILE_
> Read alternate **fmtutil.cnf**

**--dry-run**, **-n**
> Do not actually build formats

**--quiet**
> Be silent

**--version**, **--help**
> Show version or help and exit

# CAVEATS

Running **fmtutil-user** once causes user-tree formats to **override** system formats for that account forever after. Later **fmtutil-sys** or package updates will not be visible until you remove the generated files under TEXMFVAR/web2c (after backing them up) or re-run **fmtutil-user** whenever the system formats change. Prefer **fmtutil-sys** unless you understand this trade-off.

# HISTORY

Introduced as an explicit counterpart to **fmtutil-sys** in TeX Live 2017 so bare **fmtutil** would no longer silently default to ambiguous tree selection.

# SEE ALSO

[fmtutil](/man/fmtutil)(1), [fmtutil-sys](/man/fmtutil-sys)(1), [mktexfmt](/man/mktexfmt)(1), [kpsewhich](/man/kpsewhich)(1)

# RESOURCES

```[Documentation](https://tug.org/texlive/scripts-sys-user.html)```

```[Homepage](https://tug.org/texlive/)```

<!-- verified: 2026-07-17 -->
