# TAGLINE

Classic Unix spell-checking utility

# TLDR

**Check spelling** in a file

```spell [file.txt]```

**Check spelling from stdin**

```echo "[text to check]" | spell```

**Check using British spelling** rules

```spell -b [file.txt]```

**Use a custom word list** as additional dictionary

```spell +[custom_words.txt] [file.txt]```

**Show all words not in dictionary** with derivations

```spell -v [file.txt]```

**Print plausible stems** for each word

```spell -x [file.txt]```

**Check multiple files**

```spell [file1.txt] [file2.txt]```

# SYNOPSIS

**spell** [**-bilvx**] [**+**_local_file_] [_file_...]

# PARAMETERS

**-b**
> Use British spelling rules (colour, centre, -ise endings)

**-i**
> Ignore troff/nroff formatting constructs

**-l**
> Follow chains of included files

**-v**
> Print all words not literally in the dictionary, including plausible derivations

**-x**
> Print plausible stems, one per line, preceded by =

**+**_local_file_
> Use additional word list; words found here are not reported as misspellings

# DESCRIPTION

**spell** is a classic Unix spell-checking utility that reports misspelled words. It reads text from files (or stdin if none specified), looks up each word in its dictionary, and outputs words that are not found or cannot be derived from known words.

Unlike modern spell checkers such as **aspell** or **ispell**, spell does not suggest corrections or offer an interactive interface. It simply lists unrecognized words to standard output, making it suitable for scripting and batch processing.

The program recognizes common inflections, prefixes, and suffixes, so it can identify valid derivations of dictionary words. The **-v** option shows words that are derivable but not literally in the dictionary, while **-x** displays the stems used for derivation.

A custom word list can be specified with **+filename** to supplement the system dictionary with domain-specific or technical terms.

# CAVEATS

spell provides no spelling suggestions and no interactive correction. It may flag proper nouns, technical terms, and abbreviations as misspellings. The dictionary coverage varies by distribution. For more sophisticated spell checking, consider **aspell** or **ispell**.

# HISTORY

**spell** was developed by **Stephen C. Johnson** at Bell Labs and first appeared in **Version 6 Unix** in **1975**. It was one of the earliest text-processing utilities and helped establish Unix as a document preparation system. The command has remained largely unchanged, preserving its simple, filter-based design philosophy.

# SEE ALSO

[aspell](/man/aspell)(1), [ispell](/man/ispell)(1), [hunspell](/man/hunspell)(1), [look](/man/look)(1)
