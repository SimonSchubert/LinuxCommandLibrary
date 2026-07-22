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

**git lfs transfer** is a low-level Git LFS protocol helper that implements the **pure-SSH transfer protocol** introduced in Git LFS 3.0. When a Git LFS server is reached over **git+ssh://**, the LFS client invokes **git lfs transfer** on the remote shell to negotiate batch requests, exchange OIDs, and stream object content over the SSH channel — bypassing the HTTP-based "ssh-as-auth" flow used by older LFS deployments.

Direct invocation is rare; users normally interact with the protocol indirectly through **git lfs push**, **git lfs pull**, **git lfs fetch**, or any operation that materialises LFS objects.

# CAVEATS

Internal helper — invoked by Git LFS over an SSH connection, not by users directly. Requires both client and server to support the pure-SSH transfer protocol (Git LFS ≥ 3.0 on both sides).

# HISTORY

git lfs transfer is part of **Git LFS**, implementing the transfer protocol for large file synchronization.

# INSTALL

```nix: nix profile install nixpkgs#git-lfs-transfer```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-lfs](/man/git-lfs)(1), [git](/man/git)(1)
