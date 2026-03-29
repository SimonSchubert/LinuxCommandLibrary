# TAGLINE

Control the mako notification daemon for Wayland

# TLDR

**List** current notifications

```makoctl list```

Show notification **history**

```makoctl history```

**Reload** configuration

```makoctl reload```

**Restore** last expired notification

```makoctl restore```

**Dismiss all** notifications

```makoctl dismiss -a```

**Dismiss** a notification by ID

```makoctl dismiss -n [id]```

**Toggle** do-not-disturb mode

```makoctl mode -t do-not-disturb```

Use an external **menu** program to select a notification action

```makoctl menu [dmenu] -p 'Select action'```

# SYNOPSIS

**makoctl** _command_ [_options_]

# DESCRIPTION

**makoctl** sends IPC commands to the running mako(1) notification daemon via D-Bus. It can list, dismiss, and manage notifications, as well as reload configuration and switch modes.

# PARAMETERS

**list**
> Retrieve a list of current notifications.

**history**
> Retrieve a list of dismissed notifications.

**reload**
> Reload the configuration file.

**restore**
> Restore the most recently expired notification from the history buffer.

**dismiss** [**-a**|**--all**] [**-g**|**--group**] [**-h**|**--no-history**] [**-n** _id_]
> Dismiss notifications. By default dismisses the first notification. Use **-a** to dismiss all, **-g** to dismiss the first notification group, **-n** to dismiss by id, and **-h** to dismiss without adding to history.

**invoke** [**-n** _id_] [_action_]
> Invoke an action on a notification. If no action is specified, invokes the default action. Use **-n** to specify a notification by id.

**menu** [**-n** _id_] _program_ [_argument_...]
> Use an external program (e.g., dmenu, wofi) to select an action on a notification. Actions are passed to the program on newlines.

**mode** [**-s** _mode_...] [**-a** _mode_...] [**-r** _mode_...] [**-t** _mode_...]
> Manage notification modes. Without options, lists current modes. Use **-s** to set modes, **-a** to add, **-r** to remove, **-t** to toggle.

**-h**, **--help**
> Show help message and quit.

# SEE ALSO

[mako](/man/mako)(1), [makoctl-dismiss](/man/makoctl-dismiss)(1), [notify-send](/man/notify-send)(1), [dunstctl](/man/dunstctl)(1)
