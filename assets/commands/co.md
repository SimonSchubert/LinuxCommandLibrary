# TAGLINE

RCS revision checkout

# TLDR

**Check out the latest revision** of a file (read-only)

```co [file.txt]```

**Check out a file for editing** (with lock)

```co -l [file.txt]```

**Check out a specific revision**

```co -r[1.2] [file.txt]```

**Check out and unlock** a file

```co -u [file.txt]```

**Check out a revision by date**

```co -d"[2024-01-15]" [file.txt]```

**Check out quietly** without printing diagnostics

```co -q [file.txt]```

**Force checkout** even if working file exists

```co -f [file.txt]```

# SYNOPSIS

**co** [_options_] _file_...

# PARAMETERS

**-l**
> Lock the checked-out revision to prevent others from editing.

**-u**
> Unlock the revision; check out without locking.

**-r**_REV_
> Check out specific revision REV.

**-d**_DATE_
> Check out the latest revision at or before DATE.

**-f**
> Force overwrite of the working file if it exists.

**-q**
> Quiet mode; suppress diagnostic output.

**-p**
> Print the revision to stdout instead of creating a working file.

**-k**_SUBST_
> Set keyword substitution mode (kv, kvl, k, o, b, v).

**-s**_STATE_
> Check out the latest revision with the given state.

**-w**_LOGIN_
> Check out the latest revision checked in by LOGIN.

# DESCRIPTION

**co** is the checkout command for RCS (Revision Control System), a legacy version control system for managing file revisions. It retrieves revisions from RCS files and places them in the working directory for viewing or editing.

By default, co retrieves the latest revision in read-only mode. The **-l** flag locks the revision for exclusive editing, preventing others from checking out the same revision for modification. After editing, the file is checked back in with **ci**.

RCS stores revision history in special files (typically ending in **,v**) and co reconstructs working files from this delta-based storage. While largely superseded by distributed version control systems, RCS remains useful for simple single-file versioning.

# CAVEATS

RCS operates on individual files rather than repositories. Locks are advisory and depend on user cooperation. The working file's timestamp is set to the revision's check-in time by default. Checking out an already-locked file requires the lock owner to release it.

# HISTORY

RCS was created by Walter Tichy at Purdue University and first released in **1982**. It pioneered the concept of delta storage for version control. While CVS and later systems built upon RCS concepts, the standalone co/ci workflow remains available on most Unix-like systems.

# SEE ALSO

[ci](/man/ci)(1), [rcs](/man/rcs)(1), [rlog](/man/rlog)(1), [rcsdiff](/man/rcsdiff)(1), [git](/man/git)(1)
