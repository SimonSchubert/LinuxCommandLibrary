# TAGLINE

Sanitize filenames by removing toxic characters

# TLDR

**Preview filename changes** (safe mode, default)

```notox [path/to/directory]```

**Apply the renames**

```notox -d [path/to/directory]```

**Preview with quiet output**

```notox -q [path/to/directory]```

**Output changes as JSON**

```notox --json [path/to/directory]```

# SYNOPSIS

**notox** [_options_] [_path_]

# PARAMETERS

**-d**, **--do**
> Execute the renames (default is preview only).

**-q**, **--quiet**
> Suppress verbose output.

**--json**
> Output results in JSON format.

# DESCRIPTION

**notox** is a CLI tool that renames files in a directory to eliminate problematic characters from filenames such as spaces, special characters, and non-ASCII characters. By default it operates in safe mode, displaying proposed changes without applying them.

# CAVEATS

Always previews changes before applying. Use **-d** flag to actually rename files.

# HISTORY

**notox** was created by **Its-Just-Nans** and is written in **Rust**.

# SEE ALSO

[detox](/man/detox)(1), [rename](/man/rename)(1)
