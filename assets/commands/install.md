# TLDR

**Copy file with permissions**

```install -m [755] [source] [dest]```

**Copy to directory**

```install [file] [/usr/local/bin/]```

**Create directory**

```install -d [/path/to/dir]```

**Set owner and group**

```install -o [user] -g [group] [file] [dest]```

**Copy preserving timestamps**

```install -p [file] [dest]```

**Strip binaries**

```install -s [binary] [/usr/local/bin/]```

# SYNOPSIS

**install** [_options_] _source_ _dest_

**install** [_options_] -d _directories_

# DESCRIPTION

**install** copies files while setting permissions and ownership. It's primarily used in Makefiles and installation scripts to place files with correct attributes.

The tool combines cp, chmod, chown, and mkdir functionality, streamlining installation tasks. It can also strip binaries and backup existing files.

# PARAMETERS

**-m** _mode_
> Set permission mode.

**-o** _owner_
> Set owner.

**-g** _group_
> Set group.

**-d**
> Create directories.

**-D**
> Create parent directories.

**-s**
> Strip symbol tables.

**-p**
> Preserve timestamps.

**-b**
> Make backup of existing dest.

**-S** _suffix_
> Backup suffix.

**-v**
> Verbose output.

**-c**
> Ignored (compatibility).

# CAVEATS

Not for general file copying. Strips binaries by default on some systems. Requires appropriate privileges for ownership changes.

# HISTORY

**install** is a traditional Unix utility, part of **GNU coreutils** on Linux. It has been used in Makefiles since early Unix for standardized software installation procedures.

# SEE ALSO

[cp](/man/cp)(1), [chmod](/man/chmod)(1), [chown](/man/chown)(1), [mkdir](/man/mkdir)(1), [make](/man/make)(1)
