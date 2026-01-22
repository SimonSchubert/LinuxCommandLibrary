# TLDR

**Lock a file**

```git lock [file.psd]```

**Lock multiple files**

```git lock [file1.psd] [file2.psd]```

# SYNOPSIS

**git lock** _files_

# PARAMETERS

_FILES_
> Files to lock.

**--help**
> Display help information.

# DESCRIPTION

**git lock** marks files as locked in git-extras. It adds files to a .gitlock file, indicating they shouldn't be modified by others. This provides advisory file locking.

The lock is advisory and tracked in the repository. It requires team cooperation to respect locks. Use git locked to see currently locked files.

git lock provides simple file locking coordination.

# CAVEATS

Part of git-extras package. Advisory only, not enforced. See git lfs lock for LFS locking.

# HISTORY

git lock is part of **git-extras**, providing simple advisory locking. For enforced locking, see **Git LFS lock** which provides server-side enforcement.

# SEE ALSO

[git-locked](/man/git-locked)(1), [git-unlock](/man/git-unlock)(1), [git-lfs](/man/git-lfs)(1)
