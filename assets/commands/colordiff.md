# TLDR

**Compare files with colored output**

```colordiff [file1] [file2]```

**Unified diff format**

```colordiff -u [file1] [file2]```

**Pipe diff output through colordiff**

```diff -u [file1] [file2] | colordiff```

**Side-by-side comparison**

```colordiff -y [file1] [file2]```

**Compare directories**

```colordiff -r [dir1] [dir2]```

**View with pager**

```colordiff [file1] [file2] | less -R```

# SYNOPSIS

**colordiff** [_diff_options_] _file1_ _file2_

# DESCRIPTION

**colordiff** is a wrapper for diff that produces the same output with colored syntax highlighting. Colors improve readability when viewing differences at the command line.

All options are passed through to diff except colordiff-specific options.

# PARAMETERS

All diff options are supported, plus:

**--difftype**=_type_
> Specify diff type: diff, diffc, diffu, diffy, wdiff, debdiff

Standard diff options:

**-u**
> Unified format

**-c**
> Context format

**-y**
> Side-by-side

**-r**
> Recursive directory comparison

# CONFIGURATION

**/etc/colordiffrc**
> System-wide configuration

**~/.colordiffrc**
> User configuration

Configuration sets colors for:
- plain text
- new text (added)
- old text (removed)
- diff commands

# PAGER USAGE

Use **less -R** to preserve ANSI colors:

```colordiff file1 file2 | less -R```

# ALTERNATIVE

Modern diff (3.4+) supports built-in color:

```diff --color file1 file2```

# CAVEATS

Written in Perl. Requires ANSI color support in terminal (xterm, etc.). Colors can be customized via configuration files.

# SEE ALSO

[diff](/man/diff)(1), [git-diff](/man/git-diff)(1), [vimdiff](/man/vimdiff)(1)
