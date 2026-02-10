# TAGLINE

compares two unified diff files and generates a diff representing the changes

# TLDR

**Show differences between two patches**

```interdiff [old.patch] [new.patch]```

**Create a patch to convert** from one version to another

```interdiff [version1.patch] [version2.patch] > [upgrade.patch]```

**Compare patches with different strip levels**

```interdiff -p1 [old.patch] -p2 [new.patch]```

**Show differences in unified format**

```interdiff -U [old.patch] [new.patch]```

# SYNOPSIS

**interdiff** [_-p NUM_] [_-U_] [_-d PAT_] [_-q_] _patch1_ _patch2_

# PARAMETERS

**-p** _NUM_
> Strip NUM leading path components (like patch -p)

**-U**
> Output in unified diff format

**-d** _PAT_
> Only compare files matching pattern PAT

**-q**
> Quiet mode; suppress warnings

**--interpolate**
> Run as \"interdiff\", showing changes between patches

**--combine**
> Run as \"combinediff\", combining two patches

**--flip**
> Run as \"flipdiff\", exchanging the order of two patches

# DESCRIPTION

**interdiff** compares two unified diff files (patches) and generates a diff representing the changes between them. This is useful for understanding what changed between two versions of a patch or for creating incremental patches.

Given patch1 that transforms A to B, and patch2 that transforms A to C, interdiff produces a patch that transforms B to C. This helps when reviewing patch revisions or creating upgrade paths between software versions.

# CAVEATS

Both input patches must be in unified diff format. Context diffs are not supported. The patches must apply to the same base files for meaningful results. Complex patches with significant structural changes may produce confusing output.

# HISTORY

**interdiff** is part of the **patchutils** package, written by Tim Waugh and first released around **2001**. The patchutils suite provides tools for manipulating patch files, addressing common needs in software development and distribution workflows.

# SEE ALSO

[combinediff](/man/combinediff)(1), [flipdiff](/man/flipdiff)(1), [filterdiff](/man/filterdiff)(1), [diff](/man/diff)(1), [patch](/man/patch)(1)
