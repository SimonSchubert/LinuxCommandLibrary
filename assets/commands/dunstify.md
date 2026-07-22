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

**Print the notification ID** so it can be replaced later

```dunstify -p "[message]"```

**Close a notification** by ID

```dunstify -C [id]```

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

**-h**, **--hints** _TYPE:NAME:VALUE_
> Set a hint, e.g. `int:value:50` for a progress bar.

**-p**, **--printid**
> Print the notification ID (use it later with **-r** or **-C**).

**-a**, **--appname** _name_
> Name of the sending application.

**-I**, **--raw_icon** _path_
> Send the icon as raw image data instead of a name or path.

**-b**, **--block**
> Block until the notification is closed; exit code reports how it was closed.

**-c**, **--capabilities**
> Print the notification server capabilities and exit.

**-s**, **--serverinfo**
> Print notification server information and exit.

**-v**, **--version**
> Print version and exit.

# DESCRIPTION

**dunstify** is a notification client specifically designed for dunst, offering extended features beyond the standard notify-send utility. It implements the freedesktop.org notification specification with dunst-specific enhancements.

The tool's key advantage is notification replacement: by storing the notification ID from a previous call (via --printid), subsequent notifications can update the existing one rather than creating duplicates. This is essential for progress indicators, status updates, and volume/brightness notifications.

Additional features include action buttons that can trigger commands when clicked, custom hints for advanced styling, and the ability to close notifications programmatically. The tool integrates seamlessly with dunst's configuration for consistent appearance and behavior.

# INSTALL

```apt: sudo apt install dunst```

```dnf: sudo dnf install dunst```

```pacman: sudo pacman -S dunst```

```apk: sudo apk add dunstify```

```zypper: sudo zypper install dunst```

```nix: nix profile install nixpkgs#dunst```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dunst](/man/dunst)(1), [dunstctl](/man/dunstctl)(1), [notify-send](/man/notify-send)(1)

# RESOURCES

```[Source code](https://github.com/dunst-project/dunst)```

```[Homepage](https://dunst-project.org/)```

```[Documentation](https://dunst-project.org/documentation/)```

<!-- verified: 2026-07-14 -->

