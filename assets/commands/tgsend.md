# TAGLINE

Send Telegram messages via bot API

# TLDR

**Send message** using the configured bot and chat

```tgsend "[message]"```

Send to a **specific chat**

```tgsend --id [chat_id] "[message]"```

Send a **file** with a caption

```tgsend --doc [document.pdf] "[caption]"```

Send an **image** with a caption

```tgsend --photo [image.jpg] "[caption]"```

Send with a **title** and Markdown formatting

```tgsend -t "[Title]" --format markdown "[*bold* text]"```

Send **silently** (no notification)

```tgsend --silent "[message]"```

Read the message from **stdin**

```[command] | tgsend -```

Use a **named bot profile** from the config file

```tgsend -c [AltConfig] "[message]"```

# SYNOPSIS

**tgsend** [_options_] [_text_]

# PARAMETERS

_text_
> Message text or media caption. Use **-** to read from stdin.

**-c, --config** _SECTION_
> Bot configuration section to load.

**-l, --load** _FILE_
> Use a different configuration file.

**--id** _CHAT_ID_
> Override the chat ID from the loaded configuration.

**-t, --title** _TEXT_
> Message title.

**--icon** _CHAR_
> Unicode icon placed beside the title.

**--lvl** _LEVEL_
> Log level icon: success, info, warn, error, alert, or no (default).

**--format** _FORMAT_
> Text formatting: html, markdown, markdownV2 (default), or none.

**--fixed**
> Format message as fixed-width text.

**--no-preview**
> Disable link previews.

**--silent**
> Send without a notification.

**-p, --photo** _FILE_
> Send a picture.

**-d, --doc** _FILE_
> Send a document.

**--audio**, **--video**, **--anim**, **--voice**, **--sticker** _FILE_
> Send that type of media file. Mutually exclusive with each other and with **--photo** and **--doc**.

**--loc** _LAT,LON_
> Send a location.

**--thumb** _FILE_
> Thumbnail image for audio or video messages.

**-v, --verbose**
> Always print the return message.

**--version**
> Show version.

# CONFIGURATION

The bot token and chat ID come from the **TGSEND_TOKEN** and **TGSEND_CHATID** environment variables, or else from **~/tgsend.conf** or **/etc/tgsend.conf**:

```
[Default]
BotToken = your_bot_token
ChatID = your_chat_id
```

Additional sections define alternate profiles, selected with **-c**.

# DESCRIPTION

**tgsend** sends messages, photos, documents and other media to Telegram chats using the Telegram Bot API. It is designed for automation and scripting, enabling notifications, alerts, and file delivery from the command line or cron jobs. It can also be imported as a Python 3 module.

# CAVEATS

A bot created with @BotFather is required, and the bot must first receive a message in the target chat. Bot API rate limits apply. Environment variables must be exported to be visible to tgsend. Several unrelated tools share this name; this page documents the Python tool by alxnull, which has not been updated since 2021.

# HISTORY

**tgsend** is a small Python tool first published in **2018** for sending messages via the Telegram Bot API.

# SEE ALSO

[telegram-desktop](/man/telegram-desktop)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/alxnull/tgsend)```

<!-- verified: 2026-11-09 -->
