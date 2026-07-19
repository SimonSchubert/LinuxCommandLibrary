# TAGLINE

spell checker and morphological analyzer

# TLDR

**Check spelling**

```hunspell [file.txt]```

**Use specific dictionary**

```hunspell -d [en_US] [file.txt]```

**List misspellings**

```hunspell -l [file.txt]```

**Pipe input**

```echo "teh quikc fox" | hunspell -a```

**Check in batch mode**

```hunspell -a < [file.txt]```

# SYNOPSIS

**hunspell** [_-aDGhHlmnrstvwX_] [_-d_ _dict_[,_dict2_,...]] [_-i_ _enc_] [_-p_ _dict_] [_files_]

# PARAMETERS

_FILES_
> Files to check (text, HTML, XML, TeX/LaTeX, nroff/troff, or OpenDocument).

**-d** _dict_[,_dict2_,...]
> Dictionary/dictionaries to use, by base name.

**-p** _dict_
> Path of the personal dictionary.

**-l**
> List misspelled words (one per line) from the input.

**-a**
> Ispell-compatible pipe mode; used by editors and other programs.

**-D**
> Show detected dictionary path, search path, and available dictionaries.

**-G**
> Print only correct words or lines.

**-L**
> Print lines containing misspelled words.

**-H**
> Input is HTML/SGML.

**-X**
> Input is XML.

**-t**
> Input is TeX or LaTeX.

**-n**
> Input is nroff/troff.

**-O**
> Input is OpenDocument (ODF or Flat ODF).

**-s**
> Stem the words in the input.

**-m**
> Analyze word morphology and affix data.

**-i** _enc_
> Set input encoding.

**--check-url**
> Also check URLs, e-mail addresses, and file paths.

**-v**, **--version**
> Print version number.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**Hunspell** is a spell checker and morphological analyzer. It's the default spell checker for many applications including LibreOffice, OpenOffice, Firefox, Thunderbird, and Chrome.

The tool supports many languages via Myspell/Hunspell-format dictionary files, and understands compounding and complex morphology better than older spell checkers. It can check files interactively, in list mode (**-l**), or in the ispell-compatible pipe mode (**-a**) used by editors and other programs. Input format filters (**-H**, **-X**, **-t**, **-n**, **-O**) strip markup before checking.

# CAVEATS

Requires a dictionary for each language to be installed separately (e.g. **hunspell-en-us**). Designed as a drop-in replacement for ispell/myspell. Supports a per-user personal dictionary via **-p**.

# HISTORY

Hunspell was created by **László Németh** as an improved ispell/myspell-compatible spell checker with better Unicode, compounding, and morphological support. It remains actively maintained and is the spell-checking engine behind most major open-source office suites and browsers.

# SEE ALSO

[aspell](/man/aspell)(1), [ispell](/man/ispell)(1), [spell](/man/spell)(1)

# RESOURCES

```[Source code](https://github.com/hunspell/hunspell)```

```[Homepage](https://hunspell.github.io/)```

<!-- verified: 2026-07-19 -->
