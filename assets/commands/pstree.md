# TAGLINE

Display running processes as a tree

# TLDR

Display a **tree of all processes**

```pstree```

Display a tree with **PIDs**

```pstree -p```

Display processes owned by a **specific user**

```pstree username```

Display **command line arguments**

```pstree -a```

Display **children** of a specific process

```pstree 1234```

Display **parents** of a specific process

```pstree -s 1234```

**Highlight** current process and ancestors

```pstree -h```

# SYNOPSIS

**pstree** [_-a_] [_-c_] [_-h_] [_-p_] [_-s_] [_-u_] [_pid_|_user_]

# DESCRIPTION

**pstree** shows running processes as a tree. The tree is rooted at either pid or init if pid is omitted. It visually compacts identical branches using square brackets and counts, and displays child threads under parent processes in curly braces.

# PARAMETERS

**-a, --arguments**
> Display command line arguments

**-c, --compact-not**
> Disable compaction of identical subtrees

**-C, --color**
> Color process names by attribute (e.g., age)

**-g, --show-pgids**
> Show process group IDs

**-h, --highlight-all**
> Highlight current process and its ancestors

**-H pid, --highlight-pid**
> Highlight specified process and its ancestors

**-l, --long**
> Display full-length lines without truncation

**-n, --numeric-sort**
> Sort processes by PID instead of name

**-N, --ns-sort**
> Show individual trees per namespace type

**-p, --show-pids**
> Display process IDs

**-s, --show-parents**
> Show parent processes of the specified process

**-t, --thread-names**
> Show full thread names

**-T, --hide-threads**
> Hide threads; show only processes

**-u, --uid-changes**
> Show uid transitions

**-Z, --security-context**
> Display SELinux security context

**-A**
> Use ASCII line-drawing characters

**-G**
> Use VT100 line-drawing characters

**-U**
> Use UTF-8 line-drawing characters

# CAVEATS

Some values shown (like command arguments) are read from /proc and may be modified by processes. Child threads are shown in curly braces {} and repeated identical branches are shown in square brackets [] with a count.

# HISTORY

**pstree** is part of the **psmisc** package. It provides a hierarchical view of processes that complements the flat list provided by ps.

# SEE ALSO

[ps](/man/ps)(1), [top](/man/top)(1), [htop](/man/htop)(1), [proc](/man/proc)(5)
