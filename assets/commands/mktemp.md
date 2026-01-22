# TLDR

Create an empty **temporary file** and print its path

```mktemp```

Create a temporary file in a **custom directory**

```mktemp -p [/path/to/directory]```

Use a **custom template** (Xs replaced with random characters)

```mktemp [/tmp/example.XXXXXXXX]```

Create a temporary file with a **specific suffix**

```mktemp --suffix [.txt]```

Create an empty **temporary directory**

```mktemp -d```

**Dry run**: print name without creating

```mktemp -u```

# SYNOPSIS

**mktemp** [**-d**] [**-u**] [**-q**] [**-p** _dir_] [**--suffix** _suff_] [_template_]

# PARAMETERS

**-d, --directory**
> Create a directory instead of a file

**-u, --dry-run**
> Print name without creating anything (unsafe for scripts)

**-q, --quiet**
> Suppress error messages on creation failure

**-p _dir_, --tmpdir[=_dir_]**
> Create temporary file relative to specified directory; defaults to $TMPDIR or /tmp

**-t**
> Interpret template as filename relative to temp directory (deprecated)

**--suffix _suff_**
> Append suffix to template; suffix cannot contain slashes

# DESCRIPTION

**mktemp** creates temporary files or directories safely and prints their names. The template must include at least 3 consecutive X characters in its final component, which are replaced with random alphanumeric characters to ensure uniqueness.

When no template is provided, mktemp defaults to tmp.XXXXXXXXXX in the system temp directory. Files are created with u+rw permissions and directories with u+rwx, both modified by umask.

The safe creation prevents race conditions where another process might create a file between checking for existence and creating. This is critical for secure script writing.

# CAVEATS

The -u (dry-run) option is unsafe for production scripts because another process could create the file between printing the name and actual use. Always let mktemp create the file directly. Temporary files persist until explicitly deleted; clean up in scripts using trap.

# HISTORY

**mktemp** originated in **OpenBSD** and was later adopted by other systems. The GNU version is part of **coreutils**. The command provides a safe interface to the mkstemp(3) and mkdtemp(3) library functions.

# SEE ALSO

[tmpfile](/man/tmpfile)(1), [mkstemp](/man/mkstemp)(3), [mkdtemp](/man/mkdtemp)(3)
