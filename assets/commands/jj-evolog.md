# TLDR

**Show evolution log**

```jj evolog```

**Evolog for specific revision**

```jj evolog -r [rev]```

**Show with diff**

```jj evolog -p```

**Limit entries**

```jj evolog -n [10]```

# SYNOPSIS

**jj evolog** [_options_]

# PARAMETERS

**-r** _REV_
> Revision to show evolution for.

**-p**, **--patch**
> Show diff for each version.

**-n** _LIMIT_
> Number of entries to show.

**--help**
> Display help information.

# DESCRIPTION

**jj evolog** shows the evolution history of a change. It displays how a change has been modified over time.

The command reveals rewriting, rebasing, and amendment history. It helps understand how changes evolved.

jj evolog shows change evolution.

# CAVEATS

Subcommand of jj. Shows internal evolution. Unique to Jujutsu model.

# HISTORY

jj evolog is part of **Jujutsu**, leveraging its first-class support for change evolution tracking.

# SEE ALSO

[jj](/man/jj)(1), [jj-log](/man/jj-log)(1), [jj-show](/man/jj-show)(1)
