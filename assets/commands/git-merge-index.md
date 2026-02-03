# TLDR

**Run merge for unmerged files**

```git merge-index [merge-program] -a```

**Merge specific file**

```git merge-index [merge-program] [file]```

# SYNOPSIS

**git** **merge-index** [_options_] _merge-program_ _files_...

# PARAMETERS

**-a**
> Run on all unmerged entries.

**-o**
> Don't stop on error.

**-q**
> Quiet mode.

# DESCRIPTION

**git merge-index** runs a merge program for files needing merging. A low-level command used during three-way merge operations.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-mergetool](/man/git-mergetool)(1)

