# TAGLINE

Three-way file merging

# TLDR

**Three-way merge files**

```git merge-file [current] [base] [other]```

**Merge with diff3 style**

```git merge-file --diff3 [current] [base] [other]```

**Output to stdout**

```git merge-file -p [current] [base] [other]```

**Quiet mode**

```git merge-file -q [current] [base] [other]```

# SYNOPSIS

**git merge-file** [_options_] _current_ _base_ _other_

# PARAMETERS

_CURRENT_
> Current version file.

_BASE_
> Common ancestor file.

_OTHER_
> Other version to merge.

**-p**, **--stdout**
> Output to stdout.

**--diff3**
> Include base in conflicts.

**-q**, **--quiet**
> Suppress warnings.

**--ours**
> Resolve conflicts with ours.

**--theirs**
> Resolve conflicts with theirs.

**--help**
> Display help information.

# DESCRIPTION

**git merge-file** performs a three-way merge on individual files. Given the current version, common ancestor, and other version, it produces a merged result with conflict markers where automatic resolution is not possible.

The command operates on files outside of Git's normal merge workflow, making it useful for custom merge scenarios or merging files independently. The first file is modified in place with the merge result, and the exit code indicates whether conflicts occurred.

# CAVEATS

Plumbing command. Modifies first file in place. Exit code indicates conflicts.

# HISTORY

git merge-file is a core **Git** plumbing command implementing the three-way merge algorithm used internally by git merge.

# SEE ALSO

[git-merge](/man/git-merge)(1), [diff3](/man/diff3)(1)
