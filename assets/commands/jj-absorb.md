# TLDR

**Absorb changes into ancestor commits**

```jj absorb```

**Absorb specific paths**

```jj absorb [file1] [file2]```

**Absorb from specific revision**

```jj absorb --from [revision]```

# SYNOPSIS

**jj** **absorb** [_options_] [_paths_...]

# PARAMETERS

**--from** _revision_
> Source revision for changes.

**-r**, **--revision** _rev_
> Destination revisions to absorb into.

# DESCRIPTION

**jj absorb** automatically moves changes from the working copy into the appropriate ancestor commits. It analyzes which lines were modified and distributes them to the commits that last touched those lines. Useful for fixing up a series of commits.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1)

