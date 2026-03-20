# TAGLINE

Display RCS file revision history

# TLDR

**Show file history**

```rlog [file.c]```

**Show specific revision**

```rlog -r[1.5] [file.c]```

**Show revision range**

```rlog -r[1.1:1.5] [file.c]```

**Show by date**

```rlog -d"[>2024-01-01]" [file.c]```

**Show header only**

```rlog -h [file.c]```

**Show states**

```rlog -s[Exp] [file.c]```

**Show by author**

```rlog -w[username] [file.c]```

# SYNOPSIS

**rlog** [_-r revisions_] [_-d dates_] [_-h_] [_options_] _files_

# PARAMETERS

**-r** _REV_
> Specific revision(s).

**-d** _DATE_
> Date selection.

**-h**
> Header only.

**-t**
> Header and description.

**-s** _STATE_
> By state.

**-w** _AUTHOR_
> By author.

**-b**
> Default branch only.

**-R**
> Print RCS file name only.

**-N**
> Do not print symbolic names.

**-L**
> Ignore RCS files with no locks set.

**-l**
> Locked revisions only.

**-V**
> Print RCS version number.

**-z** _zone_
> Specify date output format and default time zone.

# DESCRIPTION

**rlog** prints information about RCS files. Without options, rlog prints the complete log: header information (RCS file name, working file, head revision, default branch, access list, locks, symbolic names, comment leader, total revisions) followed by entries for each revision (number, date, author, state, number of lines added/deleted, and log message).

Options **-d**, **-l**, **-s**, and **-w** select revisions by their intersection, while **-b** and **-r** select by their union. Only revisions matching all specified criteria are printed.

# CAVEATS

RCS is largely superseded by Git. File-level versioning only. Less common in modern development.

# HISTORY

**rlog** is part of **RCS** (Revision Control System), created by **Walter Tichy** at Purdue in the **1980s**. RCS was one of the first version control systems.

# SEE ALSO

[rcs](/man/rcs)(1), [ci](/man/ci)(1), [co](/man/co)(1), [rcsdiff](/man/rcsdiff)(1), [git](/man/git)(1)
