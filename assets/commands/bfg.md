# TLDR

**Remove** file from history

```bfg --delete-files [secrets.txt] [repo.git]```

**Remove** large files

```bfg --strip-blobs-bigger-than [100M] [repo.git]```

**Replace** text in history

```bfg --replace-text [passwords.txt] [repo.git]```

**Delete** folders

```bfg --delete-folders [.svn] [repo.git]```

# SYNOPSIS

**bfg** [_options_] _repository_

# DESCRIPTION

**bfg** (BFG Repo-Cleaner) is a faster, simpler alternative to git-filter-branch for removing unwanted data from Git repositories. It's designed for cleaning up accidentally committed passwords, large files, or other sensitive data from repository history.

The tool is significantly faster than git-filter-branch and easier to use for common cleaning tasks.

# PARAMETERS

**--delete-files** _pattern_
> Delete files matching pattern

**--strip-blobs-bigger-than** _size_
> Remove large blobs (e.g., 100M, 1G)

**--replace-text** _file_
> Replace text patterns (one per line)

**--delete-folders** _name_
> Delete folders by name

**--no-blob-protection**
> Allow deletion in current commit

**--private**
> Treat repo as private (no warnings)

# WORKFLOW

```bash
# Clone a mirror
git clone --mirror https://github.com/user/repo.git

# Run BFG
bfg --delete-files passwords.txt repo.git

# Clean up and push
cd repo.git
git reflog expire --expire=now --all
git gc --prune=now --aggressive
git push --force
```

# REPLACE TEXT FORMAT

File with patterns (passwords.txt):
```
PASSWORD1==>***REMOVED***
secret_key==>***REMOVED***
```

# FEATURES

- 10-1000x faster than git-filter-branch
- Simple pattern-based deletion
- Protects current commit by default
- Batch text replacement
- Large file cleanup
- Folder deletion

# CAVEATS

Rewrites history (force push required). Protects HEAD by default (use --no-blob-protection to override). Collaborators must rebase/re-clone. May not handle complex cases (use git-filter-repo for advanced needs). Requires Java runtime.

# HISTORY

**BFG Repo-Cleaner** was created by Roberto Tyley in **2012** to provide a faster, user-friendly alternative to git-filter-branch for repository cleaning.

# SEE ALSO

[git-filter-branch](/man/git-filter-branch)(1), [git-filter-repo](/man/git-filter-repo)(1), [git](/man/git)(1)
