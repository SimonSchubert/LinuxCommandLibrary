# TAGLINE

displays the revision history

# TLDR

**Show log**

```jj log```

**Show with diff**

```jj log -p```

**Limit entries**

```jj log -n [10]```

**Filter revisions**

```jj log -r "[revset]"```

**Show all commits**

```jj log -r "all()"```

**Compact format**

```jj log --template builtin_log_oneline```

# SYNOPSIS

**jj log** [_options_]

# PARAMETERS

**-r** _REVSET_
> Revision set to show.

**-p**, **--patch**
> Show diff.

**-n** _LIMIT_
> Maximum entries.

**--template** _TEMPLATE_
> Output template.

**--no-graph**
> Disable graph display.

**--help**
> Display help information.

# DESCRIPTION

**jj log** displays the revision history. It shows a graph of changes with descriptions and metadata.

The command supports revsets for filtering. It visualizes branches and merges in the history graph.

# CAVEATS

Subcommand of jj. Revset syntax differs from Git. Shows working copy by default.

# HISTORY

jj log is part of **Jujutsu**, providing revision history viewing with its unique change-based model.

# SEE ALSO

[jj](/man/jj)(1), [jj-show](/man/jj-show)(1), [jj-evolog](/man/jj-evolog)(1)
