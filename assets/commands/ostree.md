# TAGLINE

version control system for binary files, optimized for managing operating system root filesystems

# TLDR

Create a repository, choosing how objects are **stored**

```ostree init --repo=[path/to/repo] --mode=archive```

**Commit** a directory tree onto a branch

```ostree commit --repo=[path/to/repo] --branch=[branch] --subject="[message]" [path/to/tree]```

List the **branches** a repository holds

```ostree refs --repo=[path/to/repo]```

Show a branch's **history**

```ostree log --repo=[path/to/repo] [branch]```

Show one commit's **metadata**

```ostree show --repo=[path/to/repo] [commit]```

**List the files** inside a commit

```ostree ls --repo=[path/to/repo] [commit] [/usr/bin]```

Print a **single file** out of a commit

```ostree cat --repo=[path/to/repo] [commit] [/etc/os-release]```

**Compare** two commits

```ostree diff --repo=[path/to/repo] [commit_a] [commit_b]```

**Extract** a commit into a real directory

```ostree checkout --repo=[path/to/repo] [branch] [path/to/dir]```

Register a **remote** to pull from

```ostree remote add --repo=[path/to/repo] [name] [url]```

**Fetch** a branch from a remote

```ostree pull --repo=[path/to/repo] [remote] [branch]```

Check the repository for **corruption**

```ostree fsck --repo=[path/to/repo]```

Reclaim space by deleting **unreachable objects**

```ostree prune --repo=[path/to/repo] --refs-only```

Show the **deployments** on an OSTree-based system

```ostree admin status```

# SYNOPSIS

**ostree** [_global-options_] _command_ [_command-options_] [_arguments_]

# PARAMETERS

**init**
> Initialize a new repository

**commit**
> Create a new commit

**checkout**
> Check out a commit to a directory

**ls**
> List files in a commit

**show**
> Show commit metadata

**log**
> Show commit history

**refs**
> List available refs (branches)

**summary**
> Show or update repository summary

**diff**
> Show differences between two commits

**cat**
> Display file contents from a commit

**prune**
> Search for unreachable objects and delete them

**remote**
> Manage remote repository configuration

**pull**
> Pull from a remote repository

**fsck**
> Check repository for consistency

**static-delta**
> Manage static deltas between commits

**admin**
> Manage system deployments (for bootable trees)

**--repo _path_**
> Path to the repository

**--verbose**
> Enable verbose output

**--version**
> Print version and exit

# DESCRIPTION

**ostree** is a version control system for binary files, optimized for managing operating system root filesystems. Unlike git (which tracks text files), OSTree efficiently handles the large binary files and hard links common in OS trees.

OSTree is the foundation for immutable, image-based operating systems like Fedora Silverblue, Fedora CoreOS, and Endless OS. It enables atomic upgrades, rollbacks, and multiple parallel deployments of the operating system.

The system uses content-addressed storage (like git) with deduplication, making it efficient for storing multiple OS versions that share most files.

# CAVEATS

Repository format is not compatible with git. System deployments (bootable trees) require additional configuration through **ostree admin**. Large commits can take significant disk space initially before deduplication. Not designed for arbitrary binary files; optimized for filesystem trees.

# HISTORY

OSTree was developed by Colin Walters at Red Hat, initially for GNOME's continuous integration system. It evolved into the foundation for Fedora's immutable desktop variants and container-focused distributions.

# INSTALL

```apt: sudo apt install ostree```

```dnf: sudo dnf install ostree```

```pacman: sudo pacman -S ostree```

```apk: sudo apk add ostree```

```nix: nix profile install nixpkgs#ostree```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rpm-ostree](/man/rpm-ostree)(1), [flatpak](/man/flatpak)(1), [podman](/man/podman)(1)
