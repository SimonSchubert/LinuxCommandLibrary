# TAGLINE

Set default paper size for TeX programs

# TLDR

**Show current paper size for all programs**

```tlmgr paper```

**Set paper size for all programs**

```tlmgr paper [a4|letter]```

**Show paper size for a specific program**

```tlmgr [dvips] paper```

**Set paper for specific program**

```tlmgr [dvips] paper [letter]```

**List valid sizes for a program, default first**

```tlmgr [dvips] paper --list```

# SYNOPSIS

**tlmgr paper** [a4|letter]

**tlmgr** _program_ **paper** [_paper_|**--list**]

**tlmgr paper --json**

# PARAMETERS

**--list**
> List valid paper sizes for the given program; the first is the default. A program name is required.

**--json**
> Dump the paper setup in JSON format.

_program_
> Specific program: xdvi, pdftex, dvips, dvipdfmx, context or psutils. Comes before the **paper** keyword.

_paper_
> Paper size (a4, letter, etc.).

# DESCRIPTION

**tlmgr paper** configures default paper size for TeX programs. Sets consistent paper size across LaTeX, dvips, and PDF output tools. Part of TeX Live Manager.

If **pdftex** or **context** is affected, whether implicitly or explicitly, existing formats are rebuilt unless **--no-execute-actions** is given.

# CAVEATS

Setting all programs at once accepts only a4 or letter. The program name goes before the **paper** keyword, a syntax inherited from **texconfig**.

# SEE ALSO

[tlmgr-conf](/man/tlmgr-conf)(1), [tlmgr](/man/tlmgr)(1), [texconfig](/man/texconfig)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
