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
> Only keep the given path (repeatable); combine with **--invert-paths** to remove it instead.

**--path-glob** _GLOB_
> Filter paths matching a glob pattern.

**--path-regex** _REGEX_
> Filter paths matching a regex.

**--invert-paths**
> Invert path selection, excluding rather than including matches.

**--path-rename** _OLD:NEW_
> Rename paths throughout history.

**--replace-text** _FILE_
> Replace text matching expressions listed in _FILE_ throughout history (for scrubbing secrets).

**--strip-blobs-bigger-than** _SIZE_
> Remove blobs larger than _SIZE_ (e.g. 10M).

**--mailmap** _FILE_
> Rewrite author/committer names and emails using a mailmap file.

**--tag-rename** _OLD:NEW_
> Rename tags matching a pattern.

**--analyze**
> Generate an analysis report instead of rewriting anything.

**--subdirectory-filter** _DIR_
> Make _DIR_ the new repository root, discarding everything else.

**--dry-run**
> Show what would change without rewriting the repo.

**--partial**
> Do a partial rewrite, leaving history mixed with unrewritten refs (skips some safety checks).

**-f**, **--force**
> Skip the fresh-clone safety check.

**--help**
> Display help information.

# DESCRIPTION

**git filter-repo** rewrites Git history with powerful filtering capabilities. It is the officially recommended replacement for the deprecated git filter-branch, offering significantly faster and safer history manipulation.

The tool can remove files, rename paths, strip sensitive data, change authors, and restructure repositories. It prevents common mistakes that git filter-branch was prone to and operates much faster on large repositories.

# CAVEATS

**History rewriting destroys old commits.** By default requires a fresh clone (no other work in progress) as a safety check; override with **--force** only when you understand the risk. Collaborators must reclone or hard-reset onto the new history. Cannot be undone.

# HISTORY

git filter-repo was created by **Elijah Newren** as the official replacement for git filter-branch, recommended by the git project itself since Git 2.24's release notes.

# SEE ALSO

[git](/man/git)(1), [git-rebase](/man/git-rebase)(1), [git-filter-branch](/man/git-filter-branch)(1)

# RESOURCES

```[Source code](https://github.com/newren/git-filter-repo)```

```[Documentation](https://htmlpreview.github.io/?https://github.com/newren/git-filter-repo/blob/docs/html/git-filter-repo.html)```

<!-- verified: 2026-07-17 -->
