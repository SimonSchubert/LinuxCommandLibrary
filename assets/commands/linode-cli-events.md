# TAGLINE

manages Linode account events

# TLDR

**List events**

```linode-cli events list```

**View specific event**

```linode-cli events view [event_id]```

**Mark event as read**

```linode-cli events mark-read [event_id]```

**Mark event as seen**

```linode-cli events mark-seen [event_id]```

**Filter by action**

```linode-cli events list --action [linode_boot]```

# SYNOPSIS

**linode-cli events** _subcommand_ [_options_]

# PARAMETERS

_SUBCOMMAND_
> Events operation.

**list**
> List all events.

**view** _ID_
> View specific event.

**mark-read** _ID_
> Mark event as read.

**mark-seen** _ID_
> Mark event as seen.

**--action** _TYPE_
> Filter by event action.

**--help**
> Display help information.

# DESCRIPTION

**linode-cli events** manages Linode account events. Events track actions and changes in your infrastructure.

The tool shows notifications about instance creation, reboots, resizes, and other activities.

# CAVEATS

Requires authentication. Events have retention limits. Part of linode-cli.

# HISTORY

linode-cli events is part of the **Linode CLI** for monitoring account activity and audit trails.

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [linode-cli-linodes](/man/linode-cli-linodes)(1)

