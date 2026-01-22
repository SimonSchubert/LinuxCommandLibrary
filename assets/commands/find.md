# TLDR

**Find files by** name

```find [path] -name "[*.txt]"```

**Find directories**

```find [path] -type d -name "[dirname]"```

**Find and delete**

```find [path] -name "[*.tmp]" -delete```

**Find by modification** time

```find [path] -mtime -[7]```

**Find and execute** command

```find [path] -name "[*.log]" -exec rm {} \;```

# SYNOPSIS

**find** [_path_...] [_expression_]

# PARAMETERS

_PATH_
> Starting directories (default: current).

**-name** _PATTERN_
> Match filename pattern (glob).

**-iname** _PATTERN_
> Case-insensitive name match.

**-type** _TYPE_
> File type: f (file), d (directory), l (link).

**-mtime** _N_
> Modified N days ago.

**-size** _N_
> File size (c bytes, k KB, M MB).

**-exec** _CMD_ **{}** **\;**
> Execute command on results.

**-delete**
> Delete matched files.

**-maxdepth** _N_
> Maximum directory depth.

**--help**
> Display help information.

# DESCRIPTION

**find** searches directory trees for files matching criteria. It's one of Unix's most powerful utilities, combining searching with file operations through -exec.

The tool evaluates expressions left to right, short-circuiting with -a (and) and -o (or). Actions like -print, -delete, and -exec operate on matches.

find's flexibility handles complex queries combining name patterns, timestamps, sizes, permissions, and ownership.

# CAVEATS

Glob patterns need quoting. -delete acts immediately without confirmation. Complex expressions need careful ordering.

# HISTORY

find appeared in **Unix Version 5** (1974). It remains the standard file-finding utility, though modern alternatives like fd offer simpler syntax for common cases.

# SEE ALSO

[fd](/man/fd)(1), [locate](/man/locate)(1), [xargs](/man/xargs)(1)
