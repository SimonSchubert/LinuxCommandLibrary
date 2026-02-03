# TLDR

**Start bisect session**

```jj bisect start```

**Mark current revision as good**

```jj bisect good```

**Mark current revision as bad**

```jj bisect bad```

**Reset bisect session**

```jj bisect reset```

# SYNOPSIS

**jj** **bisect** _subcommand_ [_options_]

# PARAMETERS

**start**
> Begin bisect session.

**good** [_revision_]
> Mark revision as good.

**bad** [_revision_]
> Mark revision as bad.

**reset**
> End bisect session.

**skip**
> Skip current revision.

# DESCRIPTION

**jj bisect** performs binary search through commit history to find which commit introduced a bug. Marks commits as good or bad to narrow down the problematic change. Similar to git bisect but integrated with Jujutsu's revision model.

# SEE ALSO

[jj](/man/jj)(1), [jj-log](/man/jj-log)(1)

