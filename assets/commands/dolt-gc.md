# TAGLINE

cleanup and optimize repository storage

# TLDR

**Run garbage collection**

```dolt gc```

**Run shallow garbage** collection

```dolt gc --shallow```

# SYNOPSIS

**dolt gc** [_options_]

# PARAMETERS

**--shallow**
> Perform shallow (faster) garbage collection.

**--help**
> Display help information.

# DESCRIPTION

**dolt gc** performs garbage collection on the Dolt repository, removing unreachable objects and optimizing storage. This reclaims space from deleted branches, reset commits, and other orphaned data.

Garbage collection consolidates the database storage, potentially reducing disk usage and improving query performance. It's particularly useful after operations that create orphaned data like branch deletions or hard resets.

The shallow option performs a quicker, less thorough collection suitable for regular maintenance, while full gc provides complete cleanup.

# CAVEATS

May take significant time on large repositories. Should not be interrupted. Backup recommended before running on important data. Cannot recover deleted data after gc.

# HISTORY

dolt gc implements garbage collection similar to **git gc**, adapted for Dolt's database storage format. It maintains repository health and optimizes storage utilization.

# SEE ALSO

[dolt](/man/dolt)(1), [git-gc](/man/git-gc)(1)
