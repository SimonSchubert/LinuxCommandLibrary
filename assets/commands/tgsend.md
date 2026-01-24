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

**tgsend** sends Telegram messages. It uses Bot API.

Bot messaging. Automated sends.

File attachments. Documents, photos.

Caption support. Media with text.

Silent messages. No notification.

# CAVEATS

Bot token required. Chat ID needed. Rate limits apply.

# HISTORY

**tgsend** sends messages via Telegram Bot API, useful for notifications and automation.

# SEE ALSO

[telegram-desktop](/man/telegram-desktop)(1), [curl](/man/curl)(1)
