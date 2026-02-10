# TAGLINE

sends desktop notifications

# TLDR

**Send notification**

```notify-send "[Title]" "[Message body]"```

**Set urgency level**

```notify-send -u [critical] "[Alert]" "[System error]"```

**Set expiration time**

```notify-send -t [5000] "[Title]" "[Message]"```

**Add icon**

```notify-send -i [dialog-information] "[Info]" "[Details]"```

**Set category**

```notify-send -c [email] "[New Email]" "[Subject]"```

**Set app name**

```notify-send -a "[MyApp]" "[Title]" "[Message]"```

# SYNOPSIS

**notify-send** [_options_] _summary_ [_body_]

# PARAMETERS

_SUMMARY_
> Notification title.

_BODY_
> Notification message.

**-u** _LEVEL_
> Urgency (low, normal, critical).

**-t** _MS_
> Timeout in milliseconds.

**-i** _ICON_
> Icon name or path.

**-c** _CATEGORY_
> Notification category.

**--help**
> Display help information.

# DESCRIPTION

**notify-send** sends desktop notifications. Uses the desktop notification system.

The tool displays popup messages. Part of libnotify for GNOME and other desktops.

# CAVEATS

Requires notification daemon. Desktop environment dependent. Part of libnotify.

# HISTORY

notify-send is part of **libnotify**, implementing the freedesktop.org Desktop Notifications spec.

# SEE ALSO

[noti](/man/noti)(1), [dunst](/man/dunst)(1), [zenity](/man/zenity)(1)

