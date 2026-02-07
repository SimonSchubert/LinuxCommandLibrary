# TAGLINE

Convert dictionaries from ispell to aspell format

# TLDR

**Import** ispell dictionary

```aspell-import --ispell [dict.hash]```

Import from **old format**

```aspell-import old [wordlist] [new_dict]```

# SYNOPSIS

**aspell-import** [_--ispell_|_--run-together_|_old_] _source_ [_destination_]

# DESCRIPTION

**aspell-import** converts dictionaries from other spell checkers (particularly ispell) to aspell format. This enables migration of custom dictionaries when switching spell checkers.

The tool handles format conversion and creates aspell-compatible dictionary files.

# PARAMETERS

**--ispell**
> Import from ispell hash file

**--run-together**
> Import run-together list

**old**
> Import from old aspell format

# CAVEATS

Not all ispell features translate to aspell. Backup original dictionaries before conversion. May require manual adjustment for complex dictionaries.

# HISTORY

**aspell-import** facilitates migration from ispell to aspell, recognizing that users have accumulated custom dictionaries.

# SEE ALSO

[aspell](/man/aspell)(1), [ispell](/man/ispell)(1)
