# TLDR

**Install LFS for repo**

```git lfs install```

**Track file pattern**

```git lfs track "*.psd"```

**Show tracked patterns**

```git lfs track```

**List LFS files**

```git lfs ls-files```

**Fetch LFS objects**

```git lfs fetch```

# SYNOPSIS

**git lfs** _command_ [_options_]

# PARAMETERS

**install**
> Set up LFS for repository.

**track** _PATTERN_
> Track files matching pattern.

**untrack** _PATTERN_
> Stop tracking pattern.

**ls-files**
> List tracked LFS files.

**fetch**
> Download LFS objects.

**pull**
> Fetch and checkout LFS files.

**push**
> Push LFS objects to remote.

**--help**
> Display help information.

# DESCRIPTION

**git lfs** (Large File Storage) manages large files in git. Instead of storing large binary files directly, it stores pointers and keeps actual content on a separate server.

LFS reduces repository size and clone times by downloading large files on demand. It integrates transparently with git commands while storing content efficiently.

git lfs is essential for repositories with large binary assets.

# CAVEATS

Requires LFS server support. Storage limits may apply. Some hosting has LFS quotas.

# HISTORY

Git LFS was created by **GitHub** in **2015** with Atlassian, addressing the long-standing problem of large files in git repositories.

# SEE ALSO

[git](/man/git)(1), [git-annex](/man/git-annex)(1)
