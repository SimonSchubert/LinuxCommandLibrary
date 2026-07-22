# TAGLINE

cleanup and optimize repository storage

# TLDR

**Run garbage collection** on the new generation

```dolt gc```

**Run a fast, incomplete** collection pass

```dolt gc --shallow```

**Run a full collection**, including the old generation

```dolt gc --full```

**Collect without archive compression**

```dolt gc --archive-level [0]```

# SYNOPSIS

**dolt gc** [**--shallow**|**--full**]

# PARAMETERS

**-s**, **--shallow**
> Perform a fast, but incomplete, garbage collection pass.

**-f**, **--full**
> Perform a full garbage collection, including the old generation.

**--archive-level** _N_
> Archive compression level. Defaults to 1; pass 0 to disable archiving.

**--incremental-file-size** _BYTES_
> Maximum size in bytes of the table files written by an incremental collection.

# DESCRIPTION

**dolt gc** reclaims disk space by removing chunks that are no longer reachable from any branch, tag, or working set. Deleted branches, hard resets, and abandoned merges all leave data behind that only garbage collection can free.

Dolt splits its storage into a *new generation* holding recent writes and an *old generation* holding data that has survived a previous collection. The default run only sweeps the new generation, which is fast and is what routine maintenance needs. **--full** also rewrites the old generation, which recovers much more space but reads and rewrites the whole database.

Modern versions of Dolt also run garbage collection automatically in the background for `dolt sql-server`, so an explicit **dolt gc** is mostly needed after bulk imports, large deletions, or when a database has been through heavy branch churn.

# CAVEATS

Collection is destructive: once chunks are swept there is no way to recover data that was only reachable from a deleted branch or a discarded working set, so take a backup before a **--full** run on anything important. A full collection on a large database can take a long time and needs roughly as much free disk as the database itself while it rewrites storage. Do not interrupt a run, and note that automatic background GC can be turned off per query with `dolt sql --disable-auto-gc`.

# HISTORY

dolt gc plays the same role as **git gc**, but works on Dolt's Noms-derived, content-addressed chunk store rather than on Git objects and packfiles. The generational split and the archive format were added later to keep collections affordable on multi-gigabyte databases, and automatic background collection followed so that long-running SQL servers no longer need a maintenance window.

# INSTALL

```pacman: sudo pacman -S dolt```

```brew: brew install dolt```

```nix: nix profile install nixpkgs#dolt```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-sql](/man/dolt-sql)(1), [git-gc](/man/git-gc)(1)

# RESOURCES

```[Source code](https://github.com/dolthub/dolt)```

```[Documentation](https://www.dolthub.com/docs/cli-reference/cli/)```

<!-- verified: 2026-07-14 -->

