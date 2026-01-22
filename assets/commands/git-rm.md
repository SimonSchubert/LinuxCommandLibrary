# TLDR

**Remove file from tracking**

```git rm [file.txt]```

**Remove directory**

```git rm -r [directory/]```

**Remove from index only**

```git rm --cached [file.txt]```

**Force remove**

```git rm -f [file.txt]```

**Dry run**

```git rm -n [file.txt]```

# SYNOPSIS

**git rm** [_options_] _files_

# PARAMETERS

_FILES_
> Files to remove.

**--cached**
> Remove from index only, keep file.

**-r**
> Recursive removal.

**-f**, **--force**
> Force removal.

**-n**, **--dry-run**
> Show what would be removed.

**--ignore-unmatch**
> Exit successfully even if no match.

**--help**
> Display help information.

# DESCRIPTION

**git rm** removes files from the working tree and index. It stages the removal for the next commit. The --cached option removes from tracking while keeping the file on disk.

The command is used to stop tracking files or delete tracked files. For untracking files that should have been ignored, use --cached combined with adding to .gitignore.

git rm provides controlled file removal from version control.

# CAVEATS

Without --cached, deletes file from disk. Removal needs to be committed. Use --cached to untrack without deleting.

# HISTORY

git rm is a core **Git** command for removing files from version control, complementing git add.

# SEE ALSO

[git-add](/man/git-add)(1), [git-mv](/man/git-mv)(1), [rm](/man/rm)(1)
