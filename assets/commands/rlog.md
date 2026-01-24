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

**-L**
> Ignore locked revisions.

**-l**
> Locked revisions only.

# DESCRIPTION

**rlog** displays RCS (Revision Control System) file history. It shows revision metadata and log messages.

Header information includes filename, working file, and head revision. Access list and locks shown.

Revision listings show author, date, and state. Log messages describe changes.

Date filtering finds revisions in time ranges. Useful for release history.

Author filtering shows one person's contributions. Tracks individual changes.

# CAVEATS

RCS is largely superseded by Git. File-level versioning only. Less common in modern development.

# HISTORY

**rlog** is part of **RCS** (Revision Control System), created by **Walter Tichy** at Purdue in the **1980s**. RCS was one of the first version control systems.

# SEE ALSO

[rcs](/man/rcs)(1), [ci](/man/ci)(1), [co](/man/co)(1), [rcsdiff](/man/rcsdiff)(1), [git](/man/git)(1)
