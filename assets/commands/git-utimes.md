# TLDR

**Restore file timestamps**

```git utimes```

# SYNOPSIS

**git utimes**

# DESCRIPTION

**git utimes** updates file modification times to match their last commit time. Git doesn't preserve timestamps, so this command restores them from commit history.

The command is useful for build systems that rely on timestamps or when file dates matter. It sets each file's mtime to its last modification commit.

git utimes restores commit-based file timestamps.

# CAVEATS

Part of git-extras package. Only affects tracked files. May affect build systems.

# HISTORY

git utimes is part of **git-extras**, addressing the common issue that git doesn't preserve file modification times.

# SEE ALSO

[touch](/man/touch)(1), [git-log](/man/git-log)(1)
