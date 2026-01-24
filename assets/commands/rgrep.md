# TLDR

**Search recursively**

```rgrep "[pattern]" [path]```

**Case insensitive**

```rgrep -i "[pattern]" [path]```

**Show line numbers**

```rgrep -n "[pattern]" [path]```

**List matching files only**

```rgrep -l "[pattern]" [path]```

**Count matches**

```rgrep -c "[pattern]" [path]```

**Exclude directory**

```rgrep --exclude-dir=[node_modules] "[pattern]" [path]```

# SYNOPSIS

**rgrep** [_-i_] [_-n_] [_-l_] [_options_] _pattern_ [_path_]

# PARAMETERS

**-i**
> Case insensitive.

**-n**
> Show line numbers.

**-l**
> Files only.

**-c**
> Count matches.

**-v**
> Invert match.

**--exclude-dir** _DIR_
> Skip directory.

**--include** _GLOB_
> Include pattern.

# DESCRIPTION

**rgrep** is recursive grep. It searches directories automatically.

Equivalent to grep -r. Convenience wrapper.

Searches all files below. Traverses subdirectories.

Standard grep options. Same flags work.

Found on many systems. Default installation.

# CAVEATS

Follows symlinks. May be slow on large trees. Consider ripgrep for speed.

# HISTORY

**rgrep** is typically an alias or wrapper for **grep -r**, providing convenient recursive searching in GNU grep.

# SEE ALSO

[grep](/man/grep)(1), [egrep](/man/egrep)(1), [fgrep](/man/fgrep)(1), [rg](/man/rg)(1)
