# TAGLINE

Low-level LFS transfer protocol

# TLDR

**Transfer LFS objects**

```git lfs transfer```

# SYNOPSIS

**git lfs transfer** [_options_]

# PARAMETERS

**--help**
> Display help information.

# DESCRIPTION

**git lfs transfer** is a low-level Git LFS protocol helper that handles object transfer between the LFS client and server. It implements the LFS transfer protocol, managing authentication, batch requests, and object upload/download.

Direct invocation is rare as the command is typically called internally by `git lfs push` and `git lfs pull`. It provides the underlying transfer mechanism that makes LFS file synchronization work.

# CAVEATS

Internal command. Usually not called directly. Part of Git LFS transfer protocol.

# HISTORY

git lfs transfer is part of **Git LFS**, implementing the transfer protocol for large file synchronization.

# SEE ALSO

[git-lfs](/man/git-lfs)(1), [git-lfs-push](/man/git-lfs-push)(1)
