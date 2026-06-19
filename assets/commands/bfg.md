# TAGLINE

Remove unwanted data from Git repository history

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

**--delete-files** _pattern_ (**-D**)
> Delete files with the specified names (e.g. '*.class', '*.{txt,log}')

**--delete-folders** _name_
> Delete folders with the specified names (e.g. '.svn', '*-tmp')

**--strip-blobs-bigger-than** _size_ (**-b**)
> Strip blobs bigger than the given size (e.g. 128K, 1M, 100M)

**--strip-biggest-blobs** _num_ (**-B**)
> Strip the top NUM biggest blobs

**--strip-blobs-with-ids** _file_ (**-bi**)
> Strip blobs with the Git object ids listed in the file

**--replace-text** _file_ (**-rt**)
> Filter file content, replacing matched text (patterns one per line)

**--convert-to-git-lfs** _pattern_
> Extract files with the specified names (e.g. '*.zip') into Git LFS

**--no-blob-protection**
> Allow the BFG to modify even your latest commit

**--private**
> Treat this rewrite as removing private data (suppresses the public-data hint)

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

Rewrites history (force push required). Protects HEAD by default (use --no-blob-protection to override). Collaborators must rebase/re-clone. BFG operates on filenames and sizes, not paths: it cannot delete a file only in one directory. For path-specific or otherwise complex rewrites, use git-filter-repo. Requires a Java 11+ runtime (v1.14.0 was the last release to support Java 8).

# HISTORY

**BFG Repo-Cleaner** was created by Roberto Tyley in **2012** to provide a faster, user-friendly alternative to git-filter-branch for repository cleaning.

# SEE ALSO

[git-filter-branch](/man/git-filter-branch)(1), [git-filter-repo](/man/git-filter-repo)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/rtyley/bfg-repo-cleaner)```

```[Homepage](https://rtyley.github.io/bfg-repo-cleaner/)```

<!-- verified: 2026-06-19 -->
