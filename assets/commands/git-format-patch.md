# TLDR

**Create patches for last N commits**

```git format-patch -[n]```

**Create patch since commit**

```git format-patch [commit]```

**Create patch for range**

```git format-patch [commit1]..[commit2]```

**Output to directory**

```git format-patch -o [patches/] [commit]```

**Create single combined patch**

```git format-patch --stdout [commit] > [combined.patch]```

**Include cover letter**

```git format-patch --cover-letter [commit]```

# SYNOPSIS

**git** **format-patch** [_options_] [_since_] | [_revision-range_]

# PARAMETERS

**-n**
> Number of commits.

**-o**, **--output-directory** _dir_
> Output directory.

**--stdout**
> Output to stdout.

**--cover-letter**
> Generate cover letter.

**-s**, **--signoff**
> Add Signed-off-by.

**--subject-prefix** _prefix_
> Subject prefix.

**-v**, **--reroll-count** _n_
> Version number.

# DESCRIPTION

**git format-patch** prepares patches for email submission. Creates one file per commit in mbox format, suitable for git am.

# SEE ALSO

[git-am](/man/git-am)(1), [git-send-email](/man/git-send-email)(1)

