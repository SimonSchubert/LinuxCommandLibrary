# TAGLINE

triggers actions on notifications displayed by the mako notification daemon

# TLDR

Invoke the **default action** on the most recent notification

```makoctl invoke```

Invoke a **specific action** on a notification

```makoctl invoke -n [notification_id] [action_name]```

# SYNOPSIS

**makoctl invoke** [_-n id_] [_action_]

# PARAMETERS

**-n _id_**
> Specify the notification ID to act upon

**_action_**
> The action name to invoke (uses default action if not specified)

# DESCRIPTION

**makoctl invoke** triggers actions on notifications displayed by the mako notification daemon. Notifications can define multiple actions (like "Reply", "Mark as Read", "Open"), and this command invokes them programmatically.

Without arguments, it invokes the default action on the most recent notification—typically equivalent to clicking the notification. With **-n**, a specific notification can be targeted by its ID.

This is useful for keyboard-driven workflows where mouse interaction with notifications is undesirable, or for scripting notification responses.

# CAVEATS

The notification must still be visible for its actions to be invokable. Notification IDs can be obtained from **makoctl list**. Actions depend on what the sending application defined; not all notifications have actions beyond dismissal.

# SEE ALSO

[makoctl](/man/makoctl)(1), [makoctl-mode](/man/makoctl-mode)(1), [mako](/man/mako)(1)
