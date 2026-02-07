# TAGLINE

Manage large files in git without storing content in repository

# TLDR

**Initialize git-annex**

```git annex init "[description]"```

**Add large file**

```git annex add [largefile.zip]```

**Get file content**

```git annex get [file]```

**Drop local copy**

```git annex drop [file]```

**Sync with remotes**

```git annex sync```

# SYNOPSIS

**git annex** _command_ [_options_] [_files_]

# PARAMETERS

**init** _DESC_
> Initialize repository for annex.

**add** _FILES_
> Add files to annex.

**get** _FILES_
> Download file content.

**drop** _FILES_
> Remove local content.

**sync**
> Synchronize with remotes.

**whereis** _FILE_
> Show where content is stored.

**copy** _FILE_ **--to** _REMOTE_
> Copy to remote.

**--help**
> Display help information.

# DESCRIPTION

**git-annex** manages large files with git without storing file contents in git history. Files are replaced with symlinks to content stored in a separate annex, enabling version control of large datasets.

The tool tracks which repositories have copies of which files, enabling distributed storage across local drives, servers, and cloud services. Content can be retrieved on demand with **git annex get** and removed locally with **git annex drop**.

git-annex supports special remotes including Amazon S3, rsync, and many other backends, making it ideal for managing research datasets, media archives, and any large file collections.

# CONFIGURATION

**.git/annex/**
> Local annex storage directory containing file content and metadata.

**.git/config**
> Repository configuration including remote repository settings and annex preferences.

# CAVEATS

Learning curve for concepts. Some special remotes need setup. Windows support limited.

# HISTORY

git-annex was created by **Joey Hess** in **2010** to solve the problem of managing large files in git repositories.

# SEE ALSO

[git](/man/git)(1), [git-lfs](/man/git-lfs)(1)
