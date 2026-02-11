# TAGLINE

Extensible terminal-based chat client

# TLDR

**Start WeeChat**

```weechat```

**Connect to IRC server**

```/connect [irc.libera.chat]```

**Join channel**

```/join [#channel]```

**Send private message**

```/msg [nickname] [message]```

**Start with specific config directory**

```weechat -d [~/.config/weechat]```

**Run command on startup**

```weechat -r "/connect libera"```

**Set nickname**

```/set irc.server.libera.nicks "[mynick]"```

**Quit WeeChat**

```/quit```

# SYNOPSIS

**weechat** [_-d directory_] [_-r command_] [_-p_] [_options_]

# PARAMETERS

**-a**, **--no-connect**
> Disable auto-connect to servers.

**-c**, **--colors**
> Display colors in terminal.

**-d**, **--dir** _DIR_
> Set configuration directory.

**-p**, **--no-plugin**
> Don't load plugins.

**-P**, **--plugins** _LIST_
> Load only specified plugins.

**-r**, **--run-command** _CMD_
> Run commands after startup.

**-s**, **--no-script**
> Don't load scripts.

**-t**, **--temp-dir**
> Use temporary directory.

**-u**, **--upgrade**
> Upgrade from previous session.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Show help.

# COMMANDS

**/connect** _SERVER_
> Connect to server.

**/disconnect**
> Disconnect from server.

**/join** _CHANNEL_
> Join channel.

**/part** [_CHANNEL_]
> Leave channel.

**/msg** _TARGET_ _MESSAGE_
> Send message.

**/query** _NICK_
> Open private conversation.

**/nick** _NEWNICK_
> Change nickname.

**/set** _OPTION_ [_VALUE_]
> Set configuration option.

**/save**
> Save configuration.

**/quit**
> Exit WeeChat.

**/help** [_COMMAND_]
> Show help.

# DESCRIPTION

**WeeChat** (Wee Enhanced Environment for Chat) is an extensible terminal-based chat client. While primarily an IRC client, plugins extend it to Matrix, Slack, Discord, and other protocols.

The interface uses multiple buffers for channels, private messages, and server consoles. Navigation uses Alt+arrow keys or buffer numbers. Windows can split horizontally or vertically.

Configuration through /set covers everything: colors, keybindings, network settings, and plugin options. Changes apply immediately; /save persists them.

Scripts extend functionality in Python, Perl, Ruby, Lua, and other languages. Popular scripts add features: notifications, auto-join, URL handling, and protocol bridges. The scripts repository provides community contributions.

Relay plugin enables remote access from other clients or mobile apps. This provides a persistent connection that mobile devices can disconnect/reconnect to.

Security features include SASL authentication, SSL/TLS, and proxy support. Password handling integrates with system keyrings.

# CAVEATS

Learning curve for commands and configuration. Some features require plugins/scripts. Mobile use requires relay setup. Default colors may not suit all terminals. IRC-centric despite multi-protocol support.

# HISTORY

**WeeChat** was created by **Sébastien Helleu** (FlashCode) in **2003**. The name references "wee" (small) and evolved to mean "extensible environment." Written in C for performance with extensive scripting support, it became a popular alternative to irssi for terminal chat.

# SEE ALSO

[irssi](/man/irssi)(1), [hexchat](/man/hexchat)(1), [matrix-commander](/man/matrix-commander)(1)
