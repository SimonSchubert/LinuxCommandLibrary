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

**git mv** moves or renames files and directories while updating the index. It's equivalent to moving the file, deleting the old path from git, and adding the new path.

The command preserves file history by recording the rename. Git detects renames by content similarity, so the explicit command helps ensure proper tracking.

git mv provides tracked file relocation.

# CAVEATS

Actually a convenience wrapper. Git detects renames anyway. History follows content, not command.

# HISTORY

git mv is a core **Git** command providing explicit rename/move tracking, though git can detect renames automatically through content analysis.

# SEE ALSO

[git-rm](/man/git-rm)(1), [git-add](/man/git-add)(1), [mv](/man/mv)(1)
