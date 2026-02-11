# TAGLINE

Merge RCS file revisions

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

**rcsmerge** performs a three-way merge of RCS file revisions, incorporating changes made between two specified revisions into the current working file. It identifies a common ancestor revision and applies the differences to produce a merged result, similar to how modern version control systems handle branch merging.

By default the merge modifies the working file in place, but the **-p** flag prints the merged result to stdout instead. When conflicting changes are detected, conflict markers are inserted into the output and must be resolved manually before the file can be checked back in.

# CAVEATS

RCS is legacy system. Conflicts need manual fix. Consider Git for new projects.

# HISTORY

**rcsmerge** is part of **RCS** (Revision Control System), created by **Walter Tichy** in 1982 at Purdue University.

# SEE ALSO

[rcs](/man/rcs)(1), [rcsdiff](/man/rcsdiff)(1), [merge](/man/merge)(1), [ci](/man/ci)(1)
