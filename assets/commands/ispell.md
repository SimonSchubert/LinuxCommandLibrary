# TAGLINE

interactive spell checker

# TLDR

**Check file interactively**

```ispell [file.txt]```

**Check from stdin**

```echo "wrods" | ispell -a```

**List misspellings**

```ispell -l < [file.txt]```

**Use specific dictionary**

```ispell -d [american] [file.txt]```

**Check TeX/LaTeX file**

```ispell -t [document.tex]```

**Expand affix flags**

```ispell -e [word]```

# SYNOPSIS

**ispell** [_options_] _file_...

# PARAMETERS

**-a**
> Pipe mode for programs.

**-l**
> List misspelled words only.

**-d** _DICT_
> Use specific dictionary.

**-t**
> TeX/LaTeX mode.

**-n**
> nroff/troff mode.

**-p** _FILE_
> Personal dictionary file.

**--help**
> Display help information.

# DESCRIPTION

**ispell** is an interactive spell checker. It highlights misspellings and offers corrections for text files.

The tool supports multiple languages and formats. It can run interactively or in batch mode for scripting.

# CAVEATS

Largely replaced by aspell/hunspell. Dictionary availability varies. Format-specific modes needed.

# HISTORY

ispell was created by **Ralph E. Gorin** at Stanford in 1971, later rewritten as International Ispell by **Geoff Kuenning**.

# SEE ALSO

[aspell](/man/aspell)(1), [hunspell](/man/hunspell)(1), [spell](/man/spell)(1)
