# TAGLINE

Prepare patches for email submission

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

**git format-patch** generates patch files from commits in a format suitable for email-based code review and submission workflows. Each commit is formatted as a separate .patch file containing the diff, commit metadata, and message in mbox format.

This command is fundamental to email-based development workflows used by projects like the Linux kernel and Git itself. The generated patches can be sent using git send-email or standard email clients, and applied with git am while preserving full commit information including author and date.

Cover letters (--cover-letter) provide a way to introduce patch series with context. Version numbering with -v supports iterative review cycles. The signoff option adds Signed-off-by trailers for Developer Certificate of Origin compliance.

# SEE ALSO

[git-am](/man/git-am)(1), [git-send-email](/man/git-send-email)(1)
