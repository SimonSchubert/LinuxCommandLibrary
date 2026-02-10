# TAGLINE

controls the mako notification daemon

# TLDR

**List** current notifications

```makoctl list```

Show notification **history**

```makoctl history```

**Reload** configuration

```makoctl reload```

**Restore** last expired notification

```makoctl restore```

Display **help**

```makoctl help```

# SYNOPSIS

**makoctl** _command_ [_options_]

# DESCRIPTION

**makoctl** controls the mako notification daemon. It can list, dismiss, and manage notifications, as well as reload configuration and switch modes.

# PARAMETERS

**list**
> List current notifications

**history**
> List notification history

**reload**
> Reload configuration file

**restore**
> Restore most recent expired notification

**dismiss**
> Dismiss notifications (see makoctl-dismiss)

**invoke**
> Invoke notification action

**mode**
> Manage notification modes

**help**
> Display help information

# SEE ALSO

[mako](/man/mako)(1), [makoctl-dismiss](/man/makoctl-dismiss)(1)
