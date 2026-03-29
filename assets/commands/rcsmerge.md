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
> Revision to merge. An empty rev stands for the latest revision on the default branch.

**-p**
> Send result to stdout instead of overwriting the working file.

**-q**
> Quiet mode; do not print diagnostics.

**-A**
> Output conflicts using the -A style of diff3(1).

**-E**
> Output conflicts using the -E style of diff3(1) (default).

**-e**
> Output conflicts using the -e style of diff3(1). Does not warn about conflicts.

**-k** _SUBST_
> Keyword substitution mode (e.g., -kk ignores keyword value differences).

**-V** _N_
> RCS version emulation.

# DESCRIPTION

**rcsmerge** performs a three-way merge of RCS file revisions, incorporating changes made between two specified revisions into the current working file. It identifies a common ancestor revision and applies the differences to produce a merged result, similar to how modern version control systems handle branch merging.

By default the merge modifies the working file in place, but the **-p** flag prints the merged result to stdout instead. When conflicting changes are detected, conflict markers are inserted into the output and must be resolved manually before the file can be checked back in.

# CAVEATS

RCS is a legacy version control system. Conflicts are marked inline and must be resolved manually. Exit status is 0 for no overlaps, 1 for overlaps, and 2 for errors. Consider Git for new projects.

# HISTORY

**rcsmerge** is part of **RCS** (Revision Control System), created by **Walter Tichy** in 1982 at Purdue University.

# SEE ALSO

[rcs](/man/rcs)(1), [rcsdiff](/man/rcsdiff)(1), [merge](/man/merge)(1), [ci](/man/ci)(1), [co](/man/co)(1), [rlog](/man/rlog)(1)
