# TLDR

Dismiss **most recent** notification

```makoctl dismiss```

Dismiss by **ID**

```makoctl dismiss -n [notification_id]```

Dismiss **all** notifications

```makoctl dismiss --all```

Dismiss **first group**

```makoctl dismiss --group```

Dismiss **without history**

```makoctl dismiss --no-history```

# SYNOPSIS

**makoctl dismiss** [_options_]

# DESCRIPTION

**makoctl dismiss** removes notifications from the mako notification daemon. It can dismiss individual, grouped, or all notifications, optionally without adding them to history.

# PARAMETERS

**-n ID**
> Dismiss specific notification by ID

**-a, --all**
> Dismiss all notifications

**-g, --group**
> Dismiss all notifications in first group

**-h, --no-history**
> Don't add dismissed notifications to history

# SEE ALSO

[makoctl](/man/makoctl)(1), [mako](/man/mako)(1)
