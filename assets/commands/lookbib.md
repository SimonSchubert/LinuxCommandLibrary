# TLDR

**Search bibliography database**

```lookbib [database]```

**Search with specific query**

```lookbib [database] <<< "[search terms]"```

**Search multiple databases**

```lookbib [database1] [database2]```

# SYNOPSIS

**lookbib** [_options_] _database_...

# PARAMETERS

**-i** _string_
> Index file suffix.

**-t** _n_
> Truncate keys to n characters.

# DESCRIPTION

**lookbib** interactively searches bibliographic databases for groff/troff refer preprocessing. It prompts for keywords and displays matching bibliography entries.

The tool uses index files created by indxbib for fast searching. Enter keywords at the prompt to find references; a blank line exits.

# EXAMPLE SESSION

```
$ lookbib refs.bib
> knuth algorithms
%A Donald E. Knuth
%T The Art of Computer Programming
%D 1997
>
```

# DATABASE FORMAT

```
%A Author Name
%T Title of Work
%J Journal Name
%D Date
%V Volume
%P Pages
```

# CAVEATS

Requires indxbib to create indexes first. Part of groff refer system. Interactive only; use refer for document processing.

# HISTORY

lookbib originated in the **troff** document preparation system at Bell Labs and was part of the **refer** bibliography system developed in the 1970s.

# SEE ALSO

[refer](/man/refer)(1), [indxbib](/man/indxbib)(1), [lkbib](/man/lkbib)(1), [groff](/man/groff)(1)
