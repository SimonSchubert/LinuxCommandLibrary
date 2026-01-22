# TLDR

**Show repository root**

```git root```

**Change to root directory**

```cd $(git root)```

# SYNOPSIS

**git root**

# DESCRIPTION

**git root** displays the absolute path to the repository's root directory. It provides a reliable way to reference the top-level directory regardless of current location.

The command is useful in scripts that need consistent paths or for navigation. It's equivalent to git rev-parse --show-toplevel but shorter.

git root simplifies repository root directory access.

# CAVEATS

Part of git-extras package. Alternative: git rev-parse --show-toplevel. Fails outside git repo.

# HISTORY

git root is part of **git-extras**, providing a convenient shorthand for the common operation of finding the repository root.

# SEE ALSO

[git-rev-parse](/man/git-rev-parse)(1)
