# TAGLINE

Recursive grep through directories

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

**-w**
> Match whole words only.

**--exclude-dir** _DIR_
> Skip directory.

**--include** _GLOB_
> Include pattern.

**--exclude** _GLOB_
> Exclude files matching pattern.

# DESCRIPTION

**rgrep** is a convenience wrapper equivalent to **grep -r**, providing recursive text searching through directory trees. It traverses all subdirectories from the specified path, searching file contents for the given pattern using standard grep regular expression syntax.

All standard grep options work with rgrep, including case-insensitive search (**-i**), line numbers (**-n**), listing matching files only (**-l**), and inverted matching (**-v**). The **--exclude-dir** and **--include** flags allow filtering which files and directories are searched, which is important for skipping large directories like node_modules or build output.

On most GNU/Linux systems, rgrep is installed by default as part of the GNU grep package. For better performance on large codebases, consider using ripgrep (**rg**) which is significantly faster and automatically respects .gitignore rules.

# CAVEATS

By default follows symlinks on the command line. May be slow on large trees. Deprecated in GNU grep in favor of **grep -r**, but still provided for backward compatibility. Consider ripgrep (**rg**) for better performance on large codebases.

# SEE ALSO

[grep](/man/grep)(1), [egrep](/man/egrep)(1), [fgrep](/man/fgrep)(1), [rg](/man/rg)(1)
