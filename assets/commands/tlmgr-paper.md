# TAGLINE

Set default paper size for TeX programs

# TLDR

**Show current paper size**

```tlmgr paper```

**Set paper size for all programs**

```tlmgr paper [a4]```

**Set paper for specific program**

```tlmgr paper [dvips] [letter]```

**List available sizes**

```tlmgr paper --list```

# SYNOPSIS

**tlmgr paper** [_program_] [_paper_]

# PARAMETERS

**--list**
> List available paper sizes.

_program_
> Specific program (dvips, pdftex, xetex, etc.).

_paper_
> Paper size (a4, letter, etc.).

# DESCRIPTION

**tlmgr paper** configures default paper size for TeX programs. Sets consistent paper size across LaTeX, dvips, and PDF output tools. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-conf](/man/tlmgr-conf)(1), [tlmgr](/man/tlmgr)(1)

