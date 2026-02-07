# TAGLINE

Create files and stage them for commit

# TLDR

**Touch and stage file**

```git touch [file.txt]```

**Create multiple files**

```git touch [file1.txt] [file2.txt]```

# SYNOPSIS

**git touch** _files_

# PARAMETERS

_FILES_
> Files to create and stage.

**--help**
> Display help information.

# DESCRIPTION

**git touch** creates files and stages them for commit. It combines the Unix `touch` command with `git add`, creating empty files that are immediately tracked.

The command is useful for creating placeholder files that will be committed. It saves the separate steps of creating files then adding them.

# CAVEATS

Part of git-extras package. Creates empty files. Files still need to be committed.

# HISTORY

git touch is part of **git-extras**, combining file creation with staging for convenience.

# SEE ALSO

[touch](/man/touch)(1), [git-add](/man/git-add)(1)
