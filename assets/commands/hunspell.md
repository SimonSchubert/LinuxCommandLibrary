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

**hunspell** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to check.

**-d** _DICT_
> Dictionary to use.

**-l**
> List misspelled words.

**-a**
> Ispell pipe mode.

**-G**
> Print correct words too.

**-H**
> HTML mode.

**-L**
> LaTeX mode.

**--help**
> Display help information.

# DESCRIPTION

**Hunspell** is a spell checker and morphological analyzer. It's the default spell checker for many applications including LibreOffice and Firefox.

The tool supports many languages with dictionary files. It can check files interactively or in batch mode for scripts.

# CAVEATS

Requires dictionaries for languages. Replacement for ispell. Personal dictionary support.

# HISTORY

Hunspell was created by **László Németh** as an improved ispell-like spell checker with better language support.

# SEE ALSO

[aspell](/man/aspell)(1), [ispell](/man/ispell)(1), [spell](/man/spell)(1)
