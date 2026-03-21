# TAGLINE

performs three-way file merge

# TLDR

**Three-way merge**

```merge [file] [base] [other]```

**Output to different file**

```merge -p [file] [base] [other] > [merged]```

**Quiet mode**

```merge -q [file] [base] [other]```

**Show conflict markers** using diff3 style

```merge -A [file] [base] [other]```

**Merge with custom labels** for conflict markers

```merge -L [mine] -L [base] -L [theirs] [file] [base] [other]```

# SYNOPSIS

**merge** [_options_] _file1_ _file2_ _file3_

# PARAMETERS

_FILE1_
> File to receive changes.

_FILE2_
> Common ancestor file.

_FILE3_
> File with changes.

**-p**
> Print to stdout.

**-q**
> Quiet mode.

**-A**
> Output conflicts using diff3 -A style (most verbose).

**-E**
> Output conflicts using diff3 -E style (default).

**-e**
> Like -E, but does not warn about conflicts.

**-L** _LABEL_
> Use label instead of filename in conflict markers. May be given up to three times.

**-V**
> Print RCS version number.

# DESCRIPTION

**merge** performs three-way file merge. It incorporates changes from _file3_ (relative to _file2_) into _file1_. The common ancestor _file2_ is used to determine which changes were made in each version.

The tool is part of the RCS (Revision Control System) suite. When conflicts occur, merge writes conflict markers into _file1_ for manual resolution. The exit status is 0 for no conflicts, 1 if conflicts were found, or 2 for trouble.

# CAVEATS

Part of RCS. Conflicts need manual resolution. Exit code indicates conflicts.

# HISTORY

merge is part of **RCS** (Revision Control System), providing three-way file merging capability.

# SEE ALSO

[diff3](/man/diff3)(1), [diff](/man/diff)(1), [patch](/man/patch)(1), [rcs](/man/rcs)(1), [sdiff](/man/sdiff)(1), [git-merge](/man/git-merge)(1)

