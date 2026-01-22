# TLDR

**Transfer LFS objects**

```git lfs transfer```

# SYNOPSIS

**git lfs transfer** [_options_]

# PARAMETERS

**--help**
> Display help information.

# DESCRIPTION

**git lfs transfer** is a low-level Git LFS protocol helper that handles object transfer between the LFS client and server. It's typically invoked automatically by Git LFS operations.

The command implements the LFS transfer protocol, handling authentication, batch requests, and object upload/download. Direct invocation is rare; it's used internally by git lfs push and pull.

git lfs transfer provides the underlying transfer mechanism for LFS.

# CAVEATS

Internal command. Usually not called directly. Part of Git LFS transfer protocol.

# HISTORY

git lfs transfer is part of **Git LFS**, implementing the transfer protocol for large file synchronization.

# SEE ALSO

[git-lfs](/man/git-lfs)(1), [git-lfs-push](/man/git-lfs-push)(1)
