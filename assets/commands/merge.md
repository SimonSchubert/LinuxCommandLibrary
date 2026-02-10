# TAGLINE

performs three-way file merge

# TLDR

**Three-way merge**

```merge [file] [base] [other]```

**Output to different file**

```merge -p [file] [base] [other] > [merged]```

**Quiet mode**

```merge -q [file] [base] [other]```

**Show conflict markers**

```merge -A [file] [base] [other]```

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
> Use diff3 markers.

**--help**
> Display help information.

# DESCRIPTION

**merge** performs three-way file merge. It combines changes from two files based on a common ancestor.

The tool is part of RCS. It writes conflicts with markers for manual resolution.

# CAVEATS

Part of RCS. Conflicts need manual resolution. Exit code indicates conflicts.

# HISTORY

merge is part of **RCS** (Revision Control System), providing three-way file merging capability.

# SEE ALSO

[diff3](/man/diff3)(1), [diff](/man/diff)(1), [patch](/man/patch)(1), [rcs](/man/rcs)(1)

