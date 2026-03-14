# TAGLINE

TUI to browse UNIX users and groups

# TLDR

**Launch the user and group browser**

```ugm```

# SYNOPSIS

**ugm**

# DESCRIPTION

**ugm** provides a terminal-based interface for viewing information about UNIX users and groups. It lets you browse user lists, user details, and group memberships using keyboard navigation. Use **Tab** to switch between users and groups views, **/** to search, and **q** to quit. Particularly useful for system administrators who need quick visual access to user and group data.

# CAVEATS

Reads user and group information from system databases (/etc/passwd and /etc/group). Does not support modifying users or groups; it is read-only.

# HISTORY

**ugm** was created by **ariasmn** and is written in **Go** using the Bubble Tea TUI framework.

# SEE ALSO

[id](/man/id)(1), [groups](/man/groups)(1), [getent](/man/getent)(1)
