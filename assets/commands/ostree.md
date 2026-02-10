# TAGLINE

version control system for binary files, optimized for managing operating

# TLDR

**Initialize** a repository

```ostree init --repo [path/to/repo]```

Create a **commit** (snapshot) of the files

```ostree commit --repo [path/to/repo] --branch [branch_name]```

**Show files** in a commit

```ostree ls --repo [path/to/repo] [commit_id]```

Show **metadata** of a commit

```ostree show --repo [path/to/repo] [commit_id]```

Show **list of commits** (log)

```ostree log --repo [path/to/repo] [branch_name]```

Show **repo summary**

```ostree summary --repo [path/to/repo] --view```

Show available **refs** (branches)

```ostree refs --repo [path/to/repo]```

# SYNOPSIS

**ostree** _command_ [_options_]

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

**pull**
> Pull from a remote repository

**admin**
> Manage system deployments (for bootable trees)

**--repo _path_**
> Path to the repository

**--branch _name_**
> Branch name for operations

# DESCRIPTION

**ostree** is a version control system for binary files, optimized for managing operating system root filesystems. Unlike git (which tracks text files), OSTree efficiently handles the large binary files and hard links common in OS trees.

OSTree is the foundation for immutable, image-based operating systems like Fedora Silverblue, Fedora CoreOS, and Endless OS. It enables atomic upgrades, rollbacks, and multiple parallel deployments of the operating system.

The system uses content-addressed storage (like git) with deduplication, making it efficient for storing multiple OS versions that share most files.

# CAVEATS

Repository format is not compatible with git. System deployments (bootable trees) require additional configuration through **ostree admin**. Large commits can take significant disk space initially before deduplication. Not designed for arbitrary binary files; optimized for filesystem trees.

# HISTORY

OSTree was developed by Colin Walters at Red Hat, initially for GNOME's continuous integration system. It evolved into the foundation for Fedora's immutable desktop variants and container-focused distributions.

# SEE ALSO

[rpm-ostree](/man/rpm-ostree)(1), [flatpak](/man/flatpak)(1), [podman](/man/podman)(1)
