# TLDR

**Run** a LOLCODE file

```lci [path/to/file.lol]```

Display **help**

```lci -h```

Display **version**

```lci -v```

# SYNOPSIS

**lci** [_options_] _file_

# PARAMETERS

**-h**, **--help**
> Display help information

**-v**, **--version**
> Display version information

# DESCRIPTION

**lci** is an interpreter for LOLCODE, an esoteric programming language inspired by lolcat memes and internet humor. The language uses lolspeak-style syntax for programming constructs.

Example LOLCODE:
```
HAI 1.2
  VISIBLE "HAI WORLD!"
KTHXBYE
```

# CAVEATS

LOLCODE is a joke language not intended for serious development. The specification is informal and implementations may vary. Primarily useful for entertainment and educational purposes.

# HISTORY

LOLCODE was created by Adam Lindsay in **2007** at Lancaster University as a humorous programming language. The lci interpreter was developed by Justin Meza to provide a C-based implementation.

# SEE ALSO

[python](/man/python)(1), [perl](/man/perl)(1), [ruby](/man/ruby)(1)
