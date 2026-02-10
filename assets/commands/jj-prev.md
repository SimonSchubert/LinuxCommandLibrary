# TAGLINE

moves the working copy to the parent revision

# TLDR

**Move to parent revision**

```jj prev```

**Move multiple steps back**

```jj prev [2]```

**Move and edit the revision**

```jj prev --edit```

# SYNOPSIS

**jj** **prev** [_options_] [_count_]

# PARAMETERS

**--edit**
> Edit the destination revision.

# DESCRIPTION

**jj prev** moves the working copy to the parent revision. Optionally specify a count to move multiple generations back. A convenient shorthand for navigating commit history.

# SEE ALSO

[jj](/man/jj)(1), [jj-next](/man/jj-next)(1)

