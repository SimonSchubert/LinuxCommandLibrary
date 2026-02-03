# TLDR

**Make revisions parallel**

```jj parallelize [rev1]::[rev2]```

**Parallelize range of commits**

```jj parallelize [start]::[end]```

# SYNOPSIS

**jj** **parallelize** _revisions_

# DESCRIPTION

**jj parallelize** restructures a series of sequential commits to be parallel siblings. Takes commits that were children of each other and makes them all children of a common parent. Useful for reorganizing history when changes are independent.

# SEE ALSO

[jj](/man/jj)(1), [jj-rebase](/man/jj-rebase)(1)

