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

**--recursive**
> Apply recursively.

**--depth** _depth_
> Operation depth.

# DESCRIPTION

**svn changelist** organizes working copy files into named groups. Enables selective commits and operations on file subsets. Part of Subversion version control.

# SEE ALSO

[svn](/man/svn)(1), [svn-commit](/man/svn-commit)(1)

