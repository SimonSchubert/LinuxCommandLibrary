# TAGLINE

Revision Control System for file versioning

# TLDR

**Initialize RCS for a file** (check in initial version)

```ci [filename]```

**Check out a file for editing** (locked)

```co -l [filename]```

**Check out a read-only copy**

```co [filename]```

**Check in changes** with a log message

```ci -m "[message]" [filename]```

**View revision history**

```rlog [filename]```

**Show differences** between working file and latest revision

```rcsdiff [filename]```

**Check out a specific revision**

```co -r[1.2] [filename]```

# SYNOPSIS

**rcs** [_options_] _file_...

**ci** [_options_] _file_...

**co** [_options_] _file_...

# PARAMETERS

**ci** (check-in)
> Store a new revision in the RCS file

**co** (check-out)
> Retrieve a revision from the RCS file

**rcs**
> Change RCS file attributes

**rcsdiff**
> Compare RCS revisions

**rcsmerge**
> Merge RCS revisions

**rlog**
> Print revision log messages

**-l**
> Lock the revision for exclusive editing (with co)

**-u**
> Unlock after check-in (with ci)

**-r**_rev_
> Specify revision number

**-m**_msg_
> Specify log message

**-q**
> Quiet mode, suppress diagnostics

# DESCRIPTION

**RCS** (Revision Control System) manages multiple revisions of files, providing version control for individual files. It automates storing, retrieving, logging, and merging revisions, making it useful for source code, documentation, and configuration files.

The workflow centers on **ci** (check-in) and **co** (check-out). Check-in stores a new revision and removes the working file by default. Check-out retrieves a revision; use **-l** to lock the file for exclusive editing.

RCS stores revisions efficiently using reverse deltas—the latest revision is stored complete, while older revisions are stored as differences. This makes retrieving the current version fast.

Revisions are numbered hierarchically (1.1, 1.2, 1.3, etc.). The first number is the release, the second is the level. Branches create additional number fields (1.2.1.1).

# CAVEATS

RCS operates on individual files, not directories or projects. For multi-file version control, modern tools like Git are more appropriate.

The default check-in behavior removes the working file. Use **ci -u** to keep an unlocked copy or **ci -l** to keep a locked copy for continued editing.

RCS files (ending in **,v**) are stored in the same directory or in an **RCS/** subdirectory. Ensure proper permissions for collaborative use.

# HISTORY

RCS was developed by **Walter F. Tichy** at Purdue University, first released in **1982**. It was one of the earliest version control systems and influenced later tools like CVS (which added network support) and eventually Git. RCS is part of the GNU project and continues to be available on most Unix-like systems.

# SEE ALSO

[cvs](/man/cvs)(1), [git](/man/git)(1), [svn](/man/svn)(1), [diff](/man/diff)(1)
