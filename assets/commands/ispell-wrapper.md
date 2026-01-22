# TLDR

**Check file with default checker**

```ispell-wrapper [file.txt]```

**Force specific checker**

```ispell-wrapper --ispell=[aspell] [file.txt]```

**List misspellings**

```ispell-wrapper -l < [file.txt]```

**Use specific dictionary**

```ispell-wrapper -d [english] [file.txt]```

# SYNOPSIS

**ispell-wrapper** [_options_] _file_...

# PARAMETERS

**--ispell** _CHECKER_
> Specify spell checker (aspell, hunspell, ispell).

**-d** _DICT_
> Dictionary to use.

**-a**
> Pipe mode.

**-l**
> List mode.

**--help**
> Display help information.

# DESCRIPTION

**ispell-wrapper** provides a unified interface to various spell checkers. It wraps aspell, hunspell, or ispell with consistent options.

The wrapper chooses the best available checker automatically. It allows scripts to work regardless of which checker is installed.

ispell-wrapper unifies spell checkers.

# CAVEATS

Debian/Ubuntu specific. Depends on installed checkers. Not all options pass through.

# HISTORY

ispell-wrapper was created for **Debian** to provide compatibility between different spell checking programs.

# SEE ALSO

[ispell](/man/ispell)(1), [aspell](/man/aspell)(1), [hunspell](/man/hunspell)(1)
