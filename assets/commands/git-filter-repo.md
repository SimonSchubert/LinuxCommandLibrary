# TAGLINE

Fast, safe tool for rewriting Git repository history

# TLDR

**Remove file from history**

```git filter-repo --path [file.txt] --invert-paths```

**Rename paths**

```git filter-repo --path-rename [old/path:new/path]```

**Remove large files**

```git filter-repo --strip-blobs-bigger-than [10M]```

**Analyze repository**

```git filter-repo --analyze```

**Subdirectory to root**

```git filter-repo --subdirectory-filter [dir/]```

# SYNOPSIS

**git filter-repo** [_options_]

# PARAMETERS

**--path** _PATH_
> Filter specific paths.

**--invert-paths**
> Invert path selection.

**--path-rename** _OLD:NEW_
> Rename paths in history.

**--strip-blobs-bigger-than** _SIZE_
> Remove large blobs.

**--analyze**
> Generate analysis reports.

**--subdirectory-filter** _DIR_
> Make subdirectory the root.

**--force**
> Skip freshness checks.

**--help**
> Display help information.

# DESCRIPTION

**git filter-repo** rewrites Git history with powerful filtering capabilities. It is the officially recommended replacement for the deprecated git filter-branch, offering significantly faster and safer history manipulation.

The tool can remove files, rename paths, strip sensitive data, change authors, and restructure repositories. It prevents common mistakes that git filter-branch was prone to and operates much faster on large repositories.

# CAVEATS

**History rewriting destroys old commits.** Requires fresh clone. Collaborators must reclone. Cannot be undone.

# HISTORY

git filter-repo was created by **Elijah Newren** as the official replacement for git filter-branch, recommended by the git project.

# SEE ALSO

[git](/man/git)(1), [git-rebase](/man/git-rebase)(1)
