# TAGLINE

sends push notifications via ntfy

# TLDR

**Send notification**

```ntfy send "[message]"```

**Publish to topic**

```ntfy publish [topic] "[message]"```

**Subscribe to topic**

```ntfy subscribe [topic]```

**Send with priority**

```ntfy publish --priority high [topic] "[message]"```

**Send with title**

```ntfy publish --title "[title]" [topic] "[message]"```

# SYNOPSIS

**ntfy** [_command_] [_options_]

# PARAMETERS

**publish** _TOPIC_ _MESSAGE_
> Send notification to topic.

**subscribe** _TOPIC_
> Subscribe to notifications.

**send** _MESSAGE_
> Send quick notification.

**--priority** _LEVEL_
> Set priority (min, low, default, high, max).

**--title** _TITLE_
> Set notification title.

**--tags** _TAGS_
> Add emoji tags.

**--help**
> Display help information.

# DESCRIPTION

**ntfy** sends push notifications via ntfy.sh service. Simple pub-sub messaging.

The tool enables notifications to phones and desktops. Uses HTTP-based protocol.

# CAVEATS

Requires ntfy.sh or self-hosted server. Topics are public by default. Free tier limits apply.

# HISTORY

ntfy was created as a **simple notification service** with HTTP-based pub-sub model.

# SEE ALSO

[curl](/man/curl)(1), [notify-send](/man/notify-send)(1)

