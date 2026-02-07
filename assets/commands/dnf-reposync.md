# TAGLINE

synchronize remote repositories locally

# TLDR

**Synchronize** repository to local directory

```dnf reposync --repoid [repo_name]```

Sync to **custom location**

```dnf reposync --repoid [repo_name] -p [path/to/directory]```

Sync packages **and metadata**

```dnf reposync --repoid [repo_name] --download-metadata```

Download only **newest packages**

```dnf reposync --repoid [repo_name] -n```

**Print URLs** only

```dnf reposync --repoid [repo_name] -u```

Preserve **remote timestamps**

```dnf reposync --repoid [repo_name] --remote-time```

# SYNOPSIS

**dnf reposync** [_options_]

# DESCRIPTION

**dnf reposync** synchronizes packages and metadata from remote DNF repositories to a local directory. Part of dnf-plugins-core.

Useful for creating local mirrors or offline repositories.

# PARAMETERS

**--repoid** _repo_
> Repository to sync

**-p, --download-path** _path_
> Download destination

**--download-metadata**
> Also download repository metadata

**-n, --newest-only**
> Only download newest package versions

**-u, --urls**
> Print URLs instead of downloading

**--remote-time**
> Preserve remote timestamps

# CAVEATS

Requires dnf-plugins-core. Large repositories require significant disk space and bandwidth. Use --newest-only to reduce size.

# SEE ALSO

[dnf](/man/dnf)(8), [createrepo](/man/createrepo)(8), [reposync](/man/reposync)(1)
