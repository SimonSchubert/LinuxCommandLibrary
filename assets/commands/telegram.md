# TAGLINE

Send Telegram messages and files from the shell

# TLDR

**Send a text message**

```telegram "Hello, World."```

**Send** with explicit token and chat id

```telegram -t [BOT_TOKEN] -c [CHAT_ID] "Hello, World."```

**Send** multi-line text via stdin (monospace)

```ls -l | telegram -```

**Send Markdown**

```telegram -M "To *boldly* go, where _no man_ has gone before."```

**Send a file** with a caption

```telegram -f [results.txt] "Here are the results."```

**Send an image**

```telegram -i [photo.png]```

**Send a video**

```telegram -V [video.mp4]```

**List known chats** (needs **jq** for pretty output)

```telegram -t [BOT_TOKEN] -l```

**Read last received message**

```telegram -m```

# SYNOPSIS

**telegram** [**-t** *token*] [**-c** *chat_id*]... [**-f** *file* | **-i** *image* | **-V** *video*] [**-M** | **-H**] [*message* | **-**]

# DESCRIPTION

**telegram** (script from the **telegram.sh** project) sends messages, files, images, and videos through the Telegram Bot API using **bash** and **curl**. Typical uses are cron notifications, shipping small server files past awkward network paths, and piping command output to yourself.

Create a bot with **@BotFather**, message the bot once from your client, then discover your **chat_id** with **telegram -t** *token* **-l**. Token and chat id can come from flags, environment variables (**TELEGRAM_TOKEN**, **TELEGRAM_CHAT**), or config files (see CONFIGURATION). Multiple **-c** values send to several chats.

# PARAMETERS

**-t** *token*

> Bot API token from BotFather.

**-c** *chat_id*

> Destination chat id; repeatable for multiple chats.

**-f** *file*

> Send a document/file.

**-i** *image*

> Send a photo with preview.

**-V** *video*

> Send a video file.

**-M**

> Parse message as Markdown.

**-H**

> Parse message as HTML (when supported by your script version).

**-l**

> List known chats for the bot (**jq** improves formatting).

**-m**

> Print the last received message: message id, sender id, chat id, text.

**-**

> Read the message body from stdin (sent as monospace when piped).

*message*

> Text to send; may include shell newlines.

Proxy: set **HTTPS_PROXY** (or put it in a config file) for curl-supported proxies such as **socks5://127.0.0.1:1234**.

# CONFIGURATION

Settings are loaded in order (later wins):

1. **/etc/telegram.sh.conf**
2. **~/.telegram.sh**
3. **~/.telegram.sh.conf**
4. **./telegram.sh.conf** (beside the script)
5. Environment **TELEGRAM_TOKEN** / **TELEGRAM_CHAT**
6. Command-line flags

Example file:

```
TELEGRAM_TOKEN="123456:AbcDefGhi-JlkMno"
TELEGRAM_CHAT="12345678"
```

Multiple chats can be defined as a bash array **CHATS=(...)**. Keep the bot token secret.

# CAVEATS

Only **bash** and **curl** are required; **-l** pretty-print needs **jq**. Message size and media types follow Telegram Bot API limits. Misconfigured tokens or chat ids fail at the API. This is not the official Telegram Desktop client (**telegram-desktop**).

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1), [notify-send](/man/notify-send)(1)

# RESOURCES

```[Source code](https://github.com/fabianonline/telegram.sh)```

<!-- verified: 2026-07-19 -->
