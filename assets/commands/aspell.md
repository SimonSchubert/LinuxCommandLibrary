# TLDR

**Check** a file

```aspell check [file.txt]```

Check with **specific language**

```aspell --lang=[es] check [file.txt]```

**List** available dictionaries

```aspell dicts```

Check from **stdin**

```echo "speling errror" | aspell list```

Create **personal dictionary**

```aspell --lang=[en] create master [./custom.rws] < [wordlist.txt]```

# SYNOPSIS

**aspell** [_options_] _mode_ [_file_]

# DESCRIPTION

**aspell** is a spell checker designed to replace ispell. It can check individual files, work as a pipe filter, or provide a C library interface for other programs.

The tool supports multiple languages, personal dictionaries, and has better suggestion algorithms than older spell checkers.

# PARAMETERS

**check** _file_
> Interactively check file

**list**
> List misspelled words from stdin

**-c** _file_
> Same as check (GNU ispell compatibility)

**--lang=**_code_
> Language code (en, es, fr, etc.)

**--mode=**_mode_
> Parsing mode (tex, html, markdown, etc.)

**--encoding=**_enc_
> File encoding

**--add-extra-dicts=**_list_
> Additional dictionaries

**--personal=**_file_
> Personal dictionary file

**--ignore=**_n_
> Ignore words ≤ n characters

**--ignore-case**
> Case insensitive checking

**dicts**
> List available dictionaries

**dump** _mode_
> Dump dictionary information

# CAVEATS

Language dictionaries must be installed separately. Personal dictionary format differs from ispell. Some applications use hunspell instead.

# HISTORY

**aspell** was created by Kevin Atkinson and first released in **2001** as an improvement over ispell, featuring better suggestion algorithms and Unicode support.

# SEE ALSO

[ispell](/man/ispell)(1), [hunspell](/man/hunspell)(1), [spell](/man/spell)(1)
