# TAGLINE

Show the repository root directory path

# TLDR

**Show repository root**

```git root```

**Change to root directory**

```cd $(git root)```

# SYNOPSIS

**git root**

# DESCRIPTION

**git root** displays the absolute path to the repository's top-level directory. Part of git-extras, it provides a concise alternative to `git rev-parse --show-toplevel`.

The command is useful in scripts that need consistent paths or for quick navigation to the repository root regardless of the current working directory.

# CAVEATS

Part of git-extras package. Alternative: git rev-parse --show-toplevel. Fails outside git repo.

# HISTORY

git root is part of **git-extras**, providing a convenient shorthand for the common operation of finding the repository root.

# SEE ALSO

[git-rev-parse](/man/git-rev-parse)(1)
