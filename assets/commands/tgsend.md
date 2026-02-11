# TAGLINE

Send Telegram messages via bot API

# TLDR

**Send message**

```tgsend "[message]"```

**Send to specific chat**

```tgsend -c [chat_id] "[message]"```

**Send file**

```tgsend -f [document.pdf]```

**Send image**

```tgsend -p [image.jpg]```

**Send with caption**

```tgsend -p [image.jpg] -m "[caption]"```

**Silent message**

```tgsend -s "[message]"```

# SYNOPSIS

**tgsend** [_-c chat_id_] [_-f file_] [_-p photo_] [_options_] [_message_]

# PARAMETERS

**-c** _ID_
> Chat ID.

**-f** _FILE_
> Send file.

**-p** _FILE_
> Send photo.

**-m** _TEXT_
> Caption text.

**-s**
> Silent mode.

**-t** _TOKEN_
> Bot token.

# DESCRIPTION

**tgsend** sends messages, files, and photos to Telegram chats using the Telegram Bot API. It is designed for automation and scripting, enabling notifications, alerts, and file delivery from the command line or cron jobs.

Messages can be sent to specific chats using their ID, and media attachments can include captions via the **-m** flag. The **-s** flag sends messages silently without triggering a notification on the recipient's device. A bot token is required and can be passed via the **-t** flag or environment configuration.

# CAVEATS

Bot token required. Chat ID needed. Rate limits apply.

# HISTORY

**tgsend** sends messages via Telegram Bot API, useful for notifications and automation.

# SEE ALSO

[telegram-desktop](/man/telegram-desktop)(1), [curl](/man/curl)(1)
