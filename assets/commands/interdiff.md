# TAGLINE

compares two unified diff files and generates a diff representing the changes

# TLDR

**Show differences between two patches**

```interdiff [old.patch] [new.patch]```

**Create a patch to convert** from one version to another

```interdiff [version1.patch] [version2.patch] > [upgrade.patch]```

**Strip leading path components** from patch filenames

```interdiff -p 1 [old.patch] [new.patch]```

**Display additional lines of context**

```interdiff -U [3] [old.patch] [new.patch]```

**Compare gzip/bzip2 compressed patches**

```interdiff -z [old.patch.gz] [new.patch.gz]```

# SYNOPSIS

**interdiff** [_-U N_] [_-p N_] [_-d PAT_] [_-q_] [_-i_] [_-w_] [_-b_] [_-B_] [_-z_] _patch1_ _patch2_

# PARAMETERS

**-U** _N_, **--unified=**_N_
> Display N lines of context (default: 3).

**-p** _N_, **--strip-match=**_N_
> Ignore N leading pathname components when matching filenames.

**-d** _PAT_, **--drop-context=**_PAT_
> Exclude context for files whose names match pattern PAT.

**-i**, **--ignore-case**
> Treat upper and lower case as identical when comparing.

**-w**, **--ignore-all-space**
> Ignore all whitespace when comparing.

**-b**, **--ignore-space-change**
> Ignore changes in the amount of whitespace.

**-B**, **--ignore-blank-lines**
> Ignore changes that consist only of blank-line additions/removals.

**-z**, **--decompress**
> Automatically decompress .gz and .bz2 patches.

**-q**, **--quiet**
> Reduce warnings in output.

**--no-revert-omitted**
> Do not revert portions of the first patch that are omitted from the second.

**--help**
> Display usage information.

**--version**
> Show version number.

# DESCRIPTION

**interdiff** compares two unified diff files (patches) and generates a diff representing the changes between them. This is useful for understanding what changed between two versions of a patch or for creating incremental patches.

Given patch1 that transforms A to B, and patch2 that transforms A to C, interdiff produces a patch that transforms B to C. This helps when reviewing patch revisions or creating upgrade paths between software versions.

# CAVEATS

Both input patches must be in unified diff format. Context diffs are not supported. The patches must apply to the same base files for meaningful results. Complex patches with significant structural changes may produce confusing output.

# HISTORY

**interdiff** is part of the **patchutils** package, written by Tim Waugh and first released around **2001**. The patchutils suite provides tools for manipulating patch files, addressing common needs in software development and distribution workflows.

# SEE ALSO

[combinediff](/man/combinediff)(1), [diff](/man/diff)(1), [patch](/man/patch)(1)
