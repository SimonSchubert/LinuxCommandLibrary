# TLDR

**Print the target of a symbolic link**

```readlink [symlink]```

**Get the absolute path** (resolve all symlinks)

```readlink -f [path]```

**Get the absolute path** (all but last component must exist)

```readlink -e [path]```

**Get the canonical path** (without requiring existence)

```readlink -m [path]```

**Print each resolved path on a new line**

```readlink -f [path1] [path2]```

# SYNOPSIS

**readlink** [_option_]... _file_...

# PARAMETERS

**-f**, **--canonicalize**
> Canonicalize by following every symlink recursively; all components must exist

**-e**, **--canonicalize-existing**
> Canonicalize, but all components must exist

**-m**, **--canonicalize-missing**
> Canonicalize without requiring components to exist

**-n**, **--no-newline**
> Do not output trailing newline

**-q**, **--quiet**
> Suppress error messages

**-s**, **--silent**
> Suppress error messages (same as -q)

**-v**, **--verbose**
> Report error messages

**-z**, **--zero**
> End each output line with NUL, not newline

**--help**
> Display help and exit

**--version**
> Output version information and exit

# DESCRIPTION

**readlink** prints the value of a symbolic link or the canonical path of a file. Without options, it displays the immediate target of a symlink (one level only).

The canonicalize options (**-f**, **-e**, **-m**) resolve the complete path by following all symbolic links, resolving references to /./ and /../, and returning an absolute pathname. The difference is how they handle non-existent components:
- **-f**: All components except the last must exist
- **-e**: All components must exist (strictest)
- **-m**: No existence requirements (most permissive)

This is commonly used in scripts to find the real location of files or to get absolute paths from relative ones.

# CAVEATS

Without canonicalize options, readlink only shows the immediate symlink target. For chained symlinks, use **-f** to resolve the final target.

On macOS, readlink behaves differently and may lack GNU options. Use **greadlink** from coreutils or **realpath** for portable canonicalization.

For scripts needing portability, consider **realpath** which is POSIX-specified, though not universally available.

# SEE ALSO

[ln](/man/ln)(1), [realpath](/man/realpath)(1), [stat](/man/stat)(1), [ls](/man/ls)(1)
