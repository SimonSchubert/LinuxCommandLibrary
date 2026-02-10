# TAGLINE

displays details of a change

# TLDR

**Show current change**

```jj show```

**Show specific revision**

```jj show [rev]```

**Show with diff stats**

```jj show --stat```

**Show without diff**

```jj show --no-patch```

**Custom output format**

```jj show --template "[template]"```

# SYNOPSIS

**jj show** [_options_] [_revision_]

# PARAMETERS

_REVISION_
> Revision to show (default: @).

**--stat**
> Show diffstat summary.

**--no-patch**
> Hide diff output.

**--template** _TEMPLATE_
> Output template.

**-s**, **--summary**
> Summary of changed files.

**--help**
> Display help information.

# DESCRIPTION

**jj show** displays details of a change. It shows the description, author, and diff.

The command provides comprehensive change information. Templates customize output format.

# CAVEATS

Subcommand of jj. @ refers to working copy. Template syntax is specific.

# HISTORY

jj show is part of **Jujutsu**, providing detailed inspection of individual changes in the repository.

# SEE ALSO

[jj](/man/jj)(1), [jj-log](/man/jj-log)(1), [jj-diff](/man/jj-diff)(1)
