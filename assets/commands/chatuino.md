# TAGLINE

TUI Twitch chat client

# TLDR

**Launch** the Twitch chat TUI client

```chatuino```

**Manage** linked Twitch accounts

```chatuino account```

**Show** current cache size

```chatuino cache```

**Clear** cached emotes

```chatuino cache clear --emotes```

**Open specific channels** without restoring saved tabs

```chatuino --tab [channel1] --tab [channel2]```

**Start with a theme** without changing the saved one

```chatuino --theme [nord]```

**Store tokens in plain text** when no keyring is available

```chatuino --plain-auth-storage```

# SYNOPSIS

**chatuino** [_flags_] [_command_]

# PARAMETERS

**account**
> Open the account manager to add, remove, or switch Twitch accounts.

**cache**
> Query current cache size. Use **cache clear --emotes**, **--database**, or **--badges** to clear specific caches.

**version**, **v**
> Print the version.

**contributors**
> List contributors to the project.

**server**
> Start the self-hostable Chatuino server.

**--tab** _name_
> Tab to open on startup: a channel name, _user@channel_, **notification** or **mention**. Repeatable. When set, state is not loaded from or saved to disk.

**--theme** _id_
> Theme to start with, overriding settings.yaml without changing it. Also read from **CHATUINO_THEME**.

**--api-host** _url_
> Host of the Chatuino API (default: https://chatuino.net). Also read from **CHATUINO_API_HOST**.

**--client-id** _id_
> OAuth client ID. Also read from **CHATUINO_CLIENT_ID**.

**--plain-auth-storage**
> Store Twitch tokens in plain text, for systems without a keyring. Also read from **CHATUINO_PLAIN_AUTH_STORAGE**.

**--log**, **--log-to-file**, **--human-readable**
> Enable logging, write it to a log file instead of stderr, and make it human readable.

**--enable-profiling**, **--profiling-host** _host_
> Run a profiling HTTP server (default host: 127.0.0.1:6060).

**--help**
> Display help information.

# DESCRIPTION

**chatuino** is a cross-platform terminal user interface client for Twitch chat, written in Go. It allows users to manage multiple Twitch accounts and participate in multiple chat rooms simultaneously from the terminal. It supports rendering emotes graphically in terminals that implement Kitty graphics Unicode placeholders, integrates with third-party emote providers (7TV, BTTV, FFZ), and includes moderation tools, local chat logging via SQLite, custom commands with Go template syntax, and full theme and keybinding customization.

Key features include tab completion for emotes and usernames, per-user chat history inspection, mention notifications and live alerts, local message search, and moderator tools with timeout shortcuts.

# CONFIGURATION

Settings stored at **~/.config/chatuino/settings.yaml**. Keybindings at **~/.config/chatuino/keymap.yaml**. Press **?** inside the application to view keybindings.

Notable options include **vertical_tab_list**, **smooth_scroll**, **graphic_emotes** (requires kitty, Ghostty or iTerm2), **graphic_badges**, **time_format**, **store_chat_logs** (SQLite), **check_links**, **block_settings** (users/words), and **custom_commands**. Set **NO_COLOR=1** to disable color rendering.

# CAVEATS

Graphical emotes need kitty 0.28 or later, Ghostty, or iTerm2 3.6.7 or later, and Chatuino refuses to start if **graphic_emotes** or **graphic_badges** is enabled on a setup that cannot display them. Authentication requires going through the chatuino.net auth page (or your own server) and pasting a token. The **logs_channel_include** and **logs_channel_exclude** settings are mutually exclusive.

# HISTORY

**chatuino** was created by **julez-dev** and first released in December 2023. Inspired by **Chatterino** (a popular GUI Twitch chat client) and **twitch-tui** (a Rust-based terminal client). The name is a blend of "chat" and the "-uino" suffix from Chatterino. Written in Go under the MIT license.

# SEE ALSO

[twitch-tui](/man/twitch-tui)(1), [weechat](/man/weechat)(1), [irssi](/man/irssi)(1)

# RESOURCES

```[Homepage](https://chatuino.net/)```

```[Source code](https://github.com/julez-dev/chatuino)```

<!-- verified: 2026-11-09 -->
