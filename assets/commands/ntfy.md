# TAGLINE

simple pub-sub push notification service

# TLDR

**Publish a message to a topic**

```ntfy publish [topic] "[message]"```

**Publish with title and priority**

```ntfy publish --title "[title]" --priority [high] [topic] "[message]"```

**Publish with emoji tags**

```ntfy publish --tags "[warning,skull]" [topic] "[message]"```

**Subscribe to a topic**

```ntfy subscribe [topic]```

**Subscribe and execute command on message**

```ntfy subscribe [topic] "[command]"```

**Run the ntfy server**

```ntfy serve```

# SYNOPSIS

**ntfy** _command_ [_options_]

# PARAMETERS

**publish** _TOPIC_ [_MESSAGE_]
> Send notification to a topic. Aliases: send, trigger, pub.

**subscribe** _TOPIC_ [_COMMAND_]
> Subscribe to topic notifications. Optionally run command on message arrival.

**serve**
> Run the ntfy server (self-hosted).

**--priority** _LEVEL_
> Set priority: min, low, default, high, max (or 1-5).

**--title** _TITLE_
> Set notification title.

**--tags** _TAGS_
> Add emoji tags (comma-separated).

**--attach** _URL_
> Attach a file via URL.

**--server** _URL_
> Specify ntfy server URL (default: ntfy.sh).

**--user** _USER_
> Username for authentication.

**--since** _TIME_
> Receive messages since time or message ID (with subscribe).

**--help**
> Display help information.

# DESCRIPTION

**ntfy** is a simple HTTP-based pub-sub notification service. It allows sending push notifications to phones and desktops via topics. The same binary serves as both the client (publish/subscribe) and the server.

Messages can be published from the CLI, via curl, or any HTTP client. Subscribers receive real-time push notifications on mobile apps, the web interface, or the command line.

# CAVEATS

Requires ntfy.sh or a self-hosted server. Topics are public by default unless access control is configured. Free tier on ntfy.sh has rate limits.

# CONFIGURATION

**~/.config/ntfy/client.yml**
> Client configuration including default-host for self-hosted servers.

# HISTORY

ntfy was created by **Philipp C. Heckel** as a simple HTTP-based pub-sub notification service.

# SEE ALSO

[curl](/man/curl)(1), [notify-send](/man/notify-send)(1)

