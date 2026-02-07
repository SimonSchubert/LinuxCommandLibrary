# TAGLINE

desktop notification sender for dunst

# TLDR

**Send a notification**

```dunstify "[message]"```

**Notification with title**

```dunstify "[title]" "[body]"```

**Set urgency level**

```dunstify -u [critical] "[message]"```

**Set timeout**

```dunstify -t [5000] "[message]"```

**Add action button**

```dunstify -A "[action,label]" "[message]"```

**Replace notification**

```dunstify -r [id] "[updated message]"```

**Set icon**

```dunstify -i [icon_name] "[message]"```

# SYNOPSIS

**dunstify** [_options_] _summary_ [_body_]

# PARAMETERS

**-u**, **--urgency** _level_
> Urgency (low, normal, critical).

**-t**, **--timeout** _ms_
> Timeout in milliseconds.

**-i**, **--icon** _icon_
> Icon name or path.

**-r**, **--replace** _id_
> Replace notification with ID.

**-A**, **--action** _action,label_
> Add action button.

**-C**, **--close** _id_
> Close notification by ID.

**-h**, **--hints** _hint_
> Set hints.

**-p**, **--printid**
> Print notification ID.

# DESCRIPTION

**dunstify** is a notification client specifically designed for dunst, offering extended features beyond the standard notify-send utility. It implements the freedesktop.org notification specification with dunst-specific enhancements.

The tool's key advantage is notification replacement: by storing the notification ID from a previous call (via --printid), subsequent notifications can update the existing one rather than creating duplicates. This is essential for progress indicators, status updates, and volume/brightness notifications.

Additional features include action buttons that can trigger commands when clicked, custom hints for advanced styling, and the ability to close notifications programmatically. The tool integrates seamlessly with dunst's configuration for consistent appearance and behavior.

# SEE ALSO

[dunst](/man/dunst)(1), [dunstctl](/man/dunstctl)(1), [notify-send](/man/notify-send)(1)

