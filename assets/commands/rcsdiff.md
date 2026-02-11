# TAGLINE

Compare RCS file revisions

# TLDR

**Compare working file with latest revision**

```rcsdiff [file]```

**Compare specific revisions**

```rcsdiff -r[1.1] -r[1.2] [file]```

**Unified diff format**

```rcsdiff -u [file]```

**Context diff format**

```rcsdiff -c [file]```

**Compare with specific revision**

```rcsdiff -r[1.5] [file]```

**Side by side**

```rcsdiff -y [file]```

# SYNOPSIS

**rcsdiff** [_-r rev1_] [_-r rev2_] [_-u_] [_-c_] _file_

# PARAMETERS

**-r** _REV_
> Revision to compare.

**-u**
> Unified diff output.

**-c**
> Context diff output.

**-y**
> Side by side.

**-q**
> Quiet mode.

**-n**
> RCS format output.

# DESCRIPTION

**rcsdiff** compares revisions of files managed by the Revision Control System (RCS). Without a **-r** flag, it compares the current working file against the latest checked-in revision, showing local modifications. With one **-r** flag it compares the working file against a specific revision, and with two **-r** flags it compares two historical revisions directly.

The tool supports all standard diff output formats including unified (**-u**), context (**-c**), side-by-side (**-y**), and normal diff. It passes through options to the underlying diff command, making it a convenient wrapper for comparing version-controlled file histories.

# CAVEATS

RCS is legacy system. Consider Git instead. File-level versioning only.

# HISTORY

**rcsdiff** is part of **RCS** (Revision Control System), created by **Walter Tichy** in 1982 at Purdue University.

# SEE ALSO

[rcs](/man/rcs)(1), [ci](/man/ci)(1), [co](/man/co)(1), [diff](/man/diff)(1)
