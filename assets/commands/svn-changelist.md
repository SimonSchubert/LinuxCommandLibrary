# TAGLINE

Group Subversion working copy files

# TLDR

**Add files to changelist**

```svn changelist [mychangelist] [file1] [file2]```

**Remove files from changelist**

```svn changelist --remove [file1]```

**List files in changelist**

```svn status --changelist [mychangelist]```

**Commit specific changelist**

```svn commit --changelist [mychangelist]```

# SYNOPSIS

**svn changelist** _name_ _targets_...

# PARAMETERS

_name_
> Changelist name.

_targets_
> Files to add to changelist.

**--remove**
> Remove from changelist.

**--depth** _depth_
> Operation depth: empty, files, immediates, infinity.

**--targets** _file_
> Read target paths from file, one per line.

**--quiet**, **-q**
> Suppress normal output.

# DESCRIPTION

**svn changelist** (alias: **cl**) organizes working copy files into named groups called changelists. This enables selective commits and other operations on file subsets without affecting other modified files. A file can belong to only one changelist at a time.

Changelists are purely a client-side organizational mechanism and do not affect the repository. They persist across working copy operations until explicitly removed.

# CAVEATS

Changelists apply only to files, not directories. A file can belong to at most one changelist. Changelists are local to the working copy and not shared with other users.

# SEE ALSO

[svn](/man/svn)(1), [svnadmin](/man/svnadmin)(1)

