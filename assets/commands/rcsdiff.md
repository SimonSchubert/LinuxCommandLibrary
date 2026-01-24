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

**rcsdiff** compares RCS revisions. It shows differences between versions.

Without revision, compares working file. Against latest checked in.

Two revisions compare those versions. Historical comparison.

Supports standard diff formats. Unified, context, normal.

Part of RCS version control. File-based versioning.

# CAVEATS

RCS is legacy system. Consider Git instead. File-level versioning only.

# HISTORY

**rcsdiff** is part of **RCS** (Revision Control System), created by **Walter Tichy** in 1982 at Purdue University.

# SEE ALSO

[rcs](/man/rcs)(1), [ci](/man/ci)(1), [co](/man/co)(1), [diff](/man/diff)(1)
