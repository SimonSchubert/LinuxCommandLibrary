# TLDR

**Check in a file to RCS (removes working file)**

```ci [path/to/file]```

**Check in and keep a read-only working copy**

```ci -u [path/to/file]```

**Check in and immediately check out locked for editing**

```ci -l [path/to/file]```

**Check in with a specific revision number**

```ci -r[2.0] [path/to/file]```

**Force check-in even if no changes were made**

```ci -f [path/to/file]```

**Check in with a log message on the command line**

```ci -m"[Log message]" [path/to/file]```

# SYNOPSIS

**ci** [_options_] _file..._

# DESCRIPTION

**ci** (check in) deposits the contents of a working file into an RCS (Revision Control System) archive file. RCS files store all revisions of a file, enabling version tracking and history management.

By default, ci removes the working file after check-in, leaving only the RCS archive. Use **-u** to keep a read-only copy or **-l** to keep a locked (editable) copy.

The command prompts for a log message describing the changes. This message is stored with the revision for future reference.

# PARAMETERS

**-l**
> Check in and immediately check out locked for continued editing

**-u**
> Check in and leave a read-only working copy

**-r**_rev_
> Assign specific revision number to the new revision

**-f**
> Force check-in even if file unchanged from previous revision

**-m**_msg_
> Use msg as the log message instead of prompting

**-n**_name_
> Assign symbolic name to the checked-in revision

**-d**_date_
> Use specified date as check-in date

**-k**
> Search working file for keyword values to determine revision

# CAVEATS

Requires the caller's login to be on the RCS access list (unless empty, or caller is superuser/owner). To add a revision to an existing branch, the tip must be locked by the caller.

If the revision is unchanged from the previous one, ci reverts to that revision unless **-f** is specified.

# HISTORY

**RCS** (Revision Control System) was developed by Walter Tichy at Purdue University and first released in **1982**. It was one of the earliest version control systems and influenced later systems like CVS. While largely superseded by Git and other distributed systems, RCS remains useful for simple single-file versioning.

# SEE ALSO

[co](/man/co)(1), [rcs](/man/rcs)(1), [rcsdiff](/man/rcsdiff)(1), [rlog](/man/rlog)(1)
