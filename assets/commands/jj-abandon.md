# TLDR

**Abandon current change**

```jj abandon```

**Abandon specific revision**

```jj abandon [revision]```

**Abandon multiple revisions**

```jj abandon [rev1] [rev2]```

# SYNOPSIS

**jj** **abandon** [_revisions_...]

# DESCRIPTION

**jj abandon** marks revisions as abandoned in Jujutsu. Abandoned commits are hidden from default log output but remain in history. Their changes are rebased onto their parents. Useful for discarding work or empty commits after squashing.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1)

