# TAGLINE

Remove file from entire history

# TLDR

**Remove file from entire history**

```git obliterate [filename]```

**Remove multiple files**

```git obliterate [file1] [file2]```

**Limit the rewrite to a revision range**

```git obliterate [filename] -- [since]..[until]```

# SYNOPSIS

**git** **obliterate** _filename_... [_--_ _rev-list-args_]

# DESCRIPTION

**git obliterate** completely removes one or more files from Git history. This git-extras command runs `git filter-branch --index-filter 'git rm -r --cached <files> --ignore-unmatch' --prune-empty --tag-name-filter cat` over `--all` refs (or over a revision range given after `--`), erasing the files from every rewritten commit while keeping tags pointed at their (now rewritten) commits.

It is useful for removing accidentally committed secrets, credentials, or large files that should never have been tracked. It does not repack the repository afterward; old objects remain until you run garbage collection.

# CAVEATS

This rewrites history and changes all commit hashes. Coordinate with collaborators before using on shared branches. Run `git reflog expire --expire=now --all && git gc --prune=now --aggressive` afterward to actually reclaim disk space and drop the old blobs.

# SEE ALSO

[git-filter-branch](/man/git-filter-branch)(1), [git-gc](/man/git-gc)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-obliterate)```

<!-- verified: 2026-07-17 -->
