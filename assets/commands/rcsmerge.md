# TLDR

**Merge revisions into working file**

```rcsmerge -r[1.1] -r[1.2] [file]```

**Merge specific revision**

```rcsmerge -r[1.3] [file]```

**Print to stdout**

```rcsmerge -p -r[1.1] -r[1.2] [file]```

**Quiet mode**

```rcsmerge -q -r[1.1] -r[1.2] [file]```

# SYNOPSIS

**rcsmerge** [_-p_] [_-r rev1_] [_-r rev2_] [_options_] _file_

# PARAMETERS

**-r** _REV_
> Revision to merge.

**-p**
> Print to stdout.

**-q**
> Quiet operation.

**-k** _SUBST_
> Keyword substitution.

**-V** _N_
> RCS version emulation.

# DESCRIPTION

**rcsmerge** merges RCS revisions. It combines changes between versions.

Three-way merge operation. Common ancestor and two descendants.

Modifies working file. Or prints merged result.

Conflict markers inserted. Manual resolution needed.

Part of RCS version control. File-based versioning.

# CAVEATS

RCS is legacy system. Conflicts need manual fix. Consider Git for new projects.

# HISTORY

**rcsmerge** is part of **RCS** (Revision Control System), created by **Walter Tichy** in 1982 at Purdue University.

# SEE ALSO

[rcs](/man/rcs)(1), [rcsdiff](/man/rcsdiff)(1), [merge](/man/merge)(1), [ci](/man/ci)(1)
