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

# SYNOPSIS

**chatuino** [_flags_] [_command_]

# PARAMETERS

**account**
> Open the account manager to add, remove, or switch Twitch accounts.

**cache**
> Query current cache size. Use **cache clear --emotes**, **--database**, or **--badges** to clear specific caches.

**--help**
> Display help information.

# DESCRIPTION

**chatuino** is a cross-platform terminal user interface client for Twitch chat, written in Go. It allows users to manage multiple Twitch accounts and participate in multiple chat rooms simultaneously from the terminal. It supports rendering emotes graphically in Kitty and Ghostty terminals, integrates with third-party emote providers (7TV, BTTV, FFZ), and includes moderation tools, local chat logging via SQLite, custom commands with Go template syntax, and full theme and keybinding customization.

Key features include tab completion for emotes and usernames, per-user chat history inspection, mention notifications and live alerts, local message search, and moderator tools with timeout shortcuts.

# CONFIGURATION

Settings stored at **~/.config/chatuino/settings.yaml**. Keybindings at **~/.config/chatuino/keymap.yaml**. Press **?** inside the application to view keybindings.

Notable options include **vertical_tab_list**, **smooth_scroll**, **graphic_emotes** (requires Kitty/Ghostty), **graphic_badges**, **time_format**, **store_chat_logs** (SQLite), **check_links**, **block_settings** (users/words), and **custom_commands**. Set **NO_COLOR=1** to disable color rendering.

# CAVEATS

Graphical emote rendering only works in Kitty and Ghostty terminals. Authentication requires going through the chatuino.net auth page and pasting a token. The **logs_channel_include** and **logs_channel_exclude** settings are mutually exclusive.

# HISTORY

**chatuino** was created by **julez-dev** and first released in December 2023. Inspired by **Chatterino** (a popular GUI Twitch chat client) and **twitch-tui** (a Rust-based terminal client). The name is a blend of "chat" and the "-uino" suffix from Chatterino. The latest version is v1.1.0 (February 2026), written in Go under the MIT license.

# SEE ALSO

[weechat](/man/weechat)(1), [irssi](/man/irssi)(1)
