# TAGLINE

Manage large file storage

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

**git lfs** (Large File Storage) manages large files in Git repositories. Instead of storing large binary files directly in the repository, it replaces them with lightweight pointer files and stores the actual content on a separate LFS server.

LFS significantly reduces repository size and clone times by downloading large files only on demand. It integrates transparently with standard Git commands, so `git add`, `git commit`, and `git push` work as expected while LFS handles the content storage efficiently behind the scenes.

# CONFIGURATION

**.gitattributes**
> Specifies which file patterns are tracked by LFS.

```
*.psd filter=lfs diff=lfs merge=lfs -text
*.zip filter=lfs diff=lfs merge=lfs -text
```

**.lfsconfig**
> Repository-specific LFS configuration including endpoint URLs.

# CAVEATS

Requires LFS server support. Storage limits may apply. Some hosting has LFS quotas.

# HISTORY

Git LFS was created by **GitHub** in **2015** with Atlassian, addressing the long-standing problem of large files in git repositories.

# SEE ALSO

[git](/man/git)(1), [git-annex](/man/git-annex)(1)
