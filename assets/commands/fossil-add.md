# TAGLINE

stage files for addition to the current Fossil check-out

# TLDR

**Add a file** to the staging list

```fossil add [file]```

**Add every new file** in the check-out tree

```fossil add .```

**Show what would be added** without actually adding

```fossil add --dry-run .```

**Include dotfiles**

```fossil add --dotfiles [path]```

**Add files matching a pattern, ignoring others**

```fossil add --ignore "[*.log,build/*]" [path]```

**Undo pending adds** in the current check-out

```fossil add --reset```

**Add a file** whose name is reserved on Windows

```fossil add --allow-reserved [file]```

# SYNOPSIS

**fossil add** [_options_] _FILE_...

**fossil add --reset** [**-v**] [**-n**]

# PARAMETERS

**--case-sensitive** _BOOL_
> Override the `case-sensitive` setting when matching file names.

**--dotfiles**
> Include files whose name begins with a dot (hidden files). Without this flag, fossil ignores them.

**-f**, **--force**
> Add files without prompting (useful when the file is outside the usual scope).

**--ignore** _CSG_
> Comma-separated glob patterns of unmanaged files to skip. Overrides the `ignore-glob` setting.

**--clean** _CSG_
> Comma-separated glob patterns of files to ignore for the `clean` operation. Overrides the `clean-glob` setting.

**--reset**
> Remove the ADDED status from files previously staged with `fossil add` (they remain on disk, just not tracked for the next commit).

**--allow-reserved**
> Permit filenames that are reserved on Windows (`CON`, `NUL`, `COM1`, …). Needed mainly on cross-platform repos.

**-v**, **--verbose**
> Report each file affected by `--reset`.

**-n**, **--dry-run**
> Show what would happen without touching the repository.

# DESCRIPTION

**fossil add** schedules one or more files (or directories, recursively) to be added to the repository on the next `fossil commit`. It does not write to the repository directly: staged additions live in the check-out metadata until committed.

Dotfiles and files matching the configured `ignore-glob` are skipped unless overridden. Directory arguments are walked recursively.

Use `fossil addremove` to stage both new and missing files in one call, or `fossil add --reset` to undo pending additions.

# CAVEATS

`fossil add` only stages — nothing is visible to other clones until `fossil commit` runs. File names are case-sensitive by default on Unix and insensitive on Windows; mix platforms by setting `case-sensitive on` globally or per-repo. Symbolic links are added as symlinks only if `allow-symlinks on` is set.

# SEE ALSO

[fossil-commit](/man/fossil-commit)(1), [fossil-rm](/man/fossil-rm)(1)
