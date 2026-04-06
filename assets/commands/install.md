# TAGLINE

copies files while setting permissions and ownership

# TLDR

**Copy file with specific permissions**

```install -m [755] [source] [dest]```

**Copy files into a target directory**

```install -t [/usr/local/bin/] [file1] [file2]```

**Create directories (including parents)**

```install -d [/path/to/dir]```

**Set owner and group**

```install -o [user] -g [group] [file] [dest]```

**Copy preserving timestamps**

```install -p [file] [dest]```

**Strip binaries during install**

```install -s [binary] [/usr/local/bin/]```

**Copy only if source is different (avoids unnecessary writes)**

```install -C [file] [dest]```

**Create parent directories then copy**

```install -D [source] [/path/to/new/dir/dest]```

# SYNOPSIS

**install** [_options_] [**-s**] [**--strip-program**=_PROGRAM_] _source_... _dest_

**install** [_options_] -t _DIRECTORY_ _source_...

**install** [_options_] -d _directories_...

# DESCRIPTION

**install** copies files while setting permissions and ownership. It is primarily used in Makefiles and installation scripts to place files with correct attributes.

The tool combines cp, chmod, chown, and mkdir functionality, streamlining installation tasks. It can also strip binaries and back up existing files. The default permission mode is **rwxr-xr-x** (755).

# PARAMETERS

**-m** _mode_, **--mode**=_mode_
> Set permission mode (as in chmod), instead of the default rwxr-xr-x.

**-o** _owner_, **--owner**=_owner_
> Set ownership (super-user only).

**-g** _group_, **--group**=_group_
> Set group ownership instead of the process's current group.

**-d**, **--directory**
> Treat all arguments as directory names; create all components of the specified directories.

**-D**
> Create all leading parent directory components of dest, then copy source to dest.

**-t** _DIRECTORY_, **--target-directory**=_DIRECTORY_
> Copy all source arguments into DIRECTORY.

**-T**, **--no-target-directory**
> Treat dest as a normal file, not a directory.

**-C**, **--compare**
> Compare source and destination; do not modify dest if content, ownership, and permissions are unchanged.

**-s**, **--strip**
> Strip symbol tables from installed binaries.

**--strip-program**=_PROGRAM_
> Program used to strip binaries (default: strip).

**-p**, **--preserve-timestamps**
> Apply access/modification times of source files to destination files.

**-b**
> Make a backup of each existing destination file.

**--backup**[=_CONTROL_]
> Make a backup of each existing destination file, with optional version control method.

**-S** _suffix_, **--suffix**=_suffix_
> Override the usual backup suffix.

**-v**, **--verbose**
> Print the name of each file or directory as it is created.

**-c**
> Ignored; for compatibility with older Unix versions.

**-Z**, **--context**
> Set SELinux security context of destination files to the default type.

# CAVEATS

Not intended for general file copying. The default permission mode is 755 (rwxr-xr-x), unlike cp which preserves source permissions. Requires appropriate privileges for ownership changes.

# HISTORY

**install** is a traditional Unix utility, part of **GNU coreutils** on Linux. It has been used in Makefiles since early Unix for standardized software installation procedures.

# SEE ALSO

[cp](/man/cp)(1), [chmod](/man/chmod)(1), [chown](/man/chown)(1), [mkdir](/man/mkdir)(1), [make](/man/make)(1)
