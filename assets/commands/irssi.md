# TLDR

**Start irssi**

```irssi```

**Connect to a server**

```irssi -c [irc.libera.chat]```

**Connect with a specific nickname**

```irssi -c [irc.libera.chat] -n [nickname]```

**Connect to a server with SSL**

```irssi -c [irc.libera.chat] -p [6697] --ssl```

**Use a specific configuration file**

```irssi --config=[path/to/config]```

**Run a command on startup**

```irssi -c [server] -e "/join #[channel]"```

# SYNOPSIS

**irssi** [_-c server_] [_-p port_] [_-n nick_] [_--ssl_] [_--config file_] [_-e command_]

# PARAMETERS

**-c**, **--connect** _server_
> Connect to server on startup.

**-p**, **--port** _port_
> Server port number.

**-n**, **--nick** _nick_
> Nickname to use.

**-w**, **--password** _password_
> Server password.

**--ssl**
> Use SSL/TLS connection.

**--ssl-verify**
> Verify SSL certificate.

**--config** _file_
> Use alternate configuration file.

**--home** _dir_
> Use alternate irssi home directory.

**-e**, **--exec** _command_
> Execute irssi command on startup.

**--noconnect**
> Don't connect to any servers on startup.

# IRSSI COMMANDS

**/connect** _server_
> Connect to a server.

**/disconnect**
> Disconnect from current server.

**/join** _#channel_
> Join a channel.

**/part** [_#channel_]
> Leave a channel.

**/msg** _nick message_
> Send private message.

**/query** _nick_
> Open private query window.

**/quit** [_message_]
> Quit irssi.

**/window** _number_
> Switch to window number.

**/wc**
> Close current window.

**/names**
> List users in channel.

**/whois** _nick_
> Get user information.

**/set** _option value_
> Change settings.

**/save**
> Save configuration.

**/script load** _name_
> Load a Perl script.

# DESCRIPTION

**irssi** is a terminal-based IRC client known for its scriptability, themability, and efficiency. It runs entirely in the terminal, supporting multiple simultaneous connections, windows, and channels.

The interface uses a multi-window system: pressing Alt+number (or Ctrl+N/P) switches between windows. Each channel, query, and server status gets its own window. The status bar shows window activity with color-coded highlights.

Configuration is stored in **~/.irssi/config** and modified via /set commands or direct file editing. Settings include nick, alternate nicks, quit messages, highlighting rules, and server configurations. Networks and servers can be predefined for easy connection.

Irssi's Perl scripting interface enables extensive customization. Scripts can add commands, modify behavior, integrate with external services, or implement bots. A large library of community scripts exists for common needs.

For persistent connections, irssi is commonly run in a terminal multiplexer (screen, tmux) on a server, allowing disconnection without losing chat sessions.

# CAVEATS

Learning curve for keyboard navigation. Default keybindings may conflict with terminal/screen. Some scripts require additional Perl modules. No built-in GUI - purely terminal-based. UTF-8 support may need explicit configuration on older systems.

# HISTORY

**irssi** was created by Timo Sirainen around **1999** as a modular, scriptable IRC client. The name comes from IRC written with the Finnish "ii" ending. It became one of the most popular terminal IRC clients, praised for its stability and extensibility. Development continues with regular maintenance releases.

# SEE ALSO

[weechat](/man/weechat)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1), [hexchat](/man/hexchat)(1)
