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

**Expand affix flags** from stdin

```echo "[BOTH/R]" | ispell -e```

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

**-H**
> HTML mode.

**-b**
> Create a backup file (.bak) of the input file.

**-x**
> Don't create a backup file.

**-B**
> Report run-together words as spelling errors.

**-C**
> Consider run-together words as legal compounds.

**-M**
> Display a one-line mini-menu of options at the bottom of the screen.

**-N**
> Suppress the mini-menu.

**-c**
> Suggest corrections for words read from stdin.

**-e**[_1-5_]
> Expand affix flags from stdin. Optional level controls output detail.

**-S**
> Sort the list of guesses by probable correctness.

**-W** _N_
> Specify length of words to consider always legal (default 3).

**-p** _FILE_
> Personal dictionary file.

**-L** _LINES_
> Number of context lines to display.

# DESCRIPTION

**ispell** is an interactive spell checker. It highlights misspellings and offers corrections for text files. In interactive mode, each misspelled word is displayed with context, and the user can choose a suggested correction, type a replacement, or add the word to a personal dictionary.

The tool supports multiple languages and input formats including plain text, TeX/LaTeX, nroff/troff, and HTML. It can run interactively or in pipe mode (-a) for scripting and integration with other programs.

# CAVEATS

Largely replaced by aspell/hunspell. Dictionary availability varies. Format-specific modes needed.

# HISTORY

ispell was created by **Ralph E. Gorin** at Stanford in 1971, later rewritten as International Ispell by **Geoff Kuenning**.

# SEE ALSO

[aspell](/man/aspell)(1), [hunspell](/man/hunspell)(1), [spell](/man/spell)(1)
