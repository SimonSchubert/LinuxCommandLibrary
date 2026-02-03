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

**dunstify** sends desktop notifications through the dunst daemon. Provides more features than notify-send including actions and notification replacement.

# SEE ALSO

[dunst](/man/dunst)(1), [dunstctl](/man/dunstctl)(1), [notify-send](/man/notify-send)(1)

