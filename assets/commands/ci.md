# TAGLINE

Check in RCS revisions

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

**Check in with a specific state**

```ci -s[Exp] [path/to/file]```

# SYNOPSIS

**ci** [_options_] _file_...

# PARAMETERS

**-l**[_rev_]
> Check in and immediately check out locked for continued editing.

**-u**[_rev_]
> Check in and leave a read-only (unlocked) working copy.

**-r**_rev_
> Assign specific revision number to the new revision.

**-f**[_rev_]
> Force check-in even if file is unchanged from the previous revision.

**-m**_msg_
> Use msg as the log message instead of prompting interactively.

**-n**_name_
> Assign a symbolic name to the checked-in revision.

**-N**_name_
> Same as **-n**, but overrides any existing assignment of the name.

**-s**_state_
> Set the state of the checked-in revision (e.g. Exp, Stab, Rel).

**-d**_date_
> Use the specified date as the check-in date instead of the current time.

**-w**_login_
> Use login as the author field of the deposited revision.

**-k**[_rev_]
> Search working file for RCS keyword values to determine the revision number, date, author, and state.

**-q**[_rev_]
> Quiet mode; suppress diagnostic output.

**-T**
> Set the RCS file's modification time to the new revision's time only if the former precedes the latter. Preserves make dependencies.

**-M**[_rev_]
> Set the modification time of the working file (with **-l** or **-u**) to the date of the retrieved revision.

# DESCRIPTION

**ci** (check in) deposits the contents of a working file into an RCS (Revision Control System) archive file. RCS files store all revisions of a file, enabling version tracking and history management.

By default, ci removes the working file after check-in, leaving only the RCS archive. Use **-u** to keep a read-only copy or **-l** to keep a locked (editable) copy.

The command prompts for a log message describing the changes. This message is stored with the revision for future reference.

# CAVEATS

Requires the caller's login to be on the RCS access list (unless the list is empty, or the caller is the superuser or file owner). To add a revision to an existing branch, the tip must be locked by the caller.

If the revision is unchanged from the previous one, ci reverts to that revision unless **-f** is specified.

# HISTORY

**RCS** (Revision Control System) was developed by Walter Tichy at Purdue University and first released in **1982**. It was one of the earliest version control systems and influenced later systems like CVS. While largely superseded by Git and other distributed systems, RCS remains useful for simple single-file versioning.

# SEE ALSO

[co](/man/co)(1), [rcs](/man/rcs)(1), [rcsdiff](/man/rcsdiff)(1), [rlog](/man/rlog)(1)
