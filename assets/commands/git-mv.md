# TAGLINE

Move or rename tracked files

# TLDR

**Rename a file**

```git mv [old-name.txt] [new-name.txt]```

**Move file to directory**

```git mv [file.txt] [directory/]```

**Force overwrite**

```git mv -f [source] [destination]```

**Dry run**

```git mv -n [source] [destination]```

# SYNOPSIS

**git mv** [_options_] _source_ _destination_

# PARAMETERS

_SOURCE_
> File or directory to move.

_DESTINATION_
> Target path or directory.

**-f**, **--force**
> Force move/rename.

**-k**
> Skip errors.

**-n**, **--dry-run**
> Show what would happen.

**-v**, **--verbose**
> Report moved files.

**--help**
> Display help information.

# DESCRIPTION

**git mv** moves or renames files and directories while updating the Git index. It is equivalent to moving the file with `mv`, deleting the old path with `git rm`, and adding the new path with `git add`.

Using this command ensures the rename is properly staged for the next commit. While Git can detect renames automatically through content analysis, using `git mv` makes the intent explicit and updates the index in one step.

# CAVEATS

Actually a convenience wrapper. Git detects renames anyway. History follows content, not command.

# HISTORY

git mv is a core **Git** command providing explicit rename/move tracking, though git can detect renames automatically through content analysis.

# SEE ALSO

[git-rm](/man/git-rm)(1), [git-add](/man/git-add)(1), [mv](/man/mv)(1)
