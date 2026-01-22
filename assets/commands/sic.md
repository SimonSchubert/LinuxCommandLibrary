# TLDR

Connect to **default server** with username from $USER

```sic```

Connect to a **specific host** with nickname

```sic -h [host] -n [nickname]```

Connect with **password** authentication

```sic -h [host] -n [nickname] -k [password]```

Connect to a specific **port**

```sic -h [host] -p [port] -n [nickname]```

# SYNOPSIS

**sic** [**-h** _host_] [**-p** _port_] [**-n** _nick_] [**-k** _keyword_] [**-v**]

# PARAMETERS

**-h** _host_
> Server hostname (default: irc6.oftc.net)

**-p** _port_
> Server port (default: 6667)

**-n** _nickname_
> Client nickname (default: $USER environment variable)

**-k** _keyword_
> Password for nick registration/authentication

**-v**
> Display version information and exit

# COMMANDS

**:j #channel**
> Join a channel

**:l #channel**
> Leave (part) a channel

**:m #channel|user message**
> Send message to channel or user

**:s #channel|user**
> Set default active channel/user for messages

**text without colon**
> Send raw IRC command directly to server

# DESCRIPTION

**sic** (simple IRC client) is a minimalist IRC client from the suckless project. It reads commands from standard input and outputs all server responses to standard output. All channel traffic is multiplexed into a single stream rather than using separate buffers per channel.

The client follows the suckless philosophy of simplicity and minimalism, providing only essential IRC functionality. It is designed to be combined with other Unix tools via pipes and shell scripts for extended functionality.

# CAVEATS

No built-in channel separation; all messages appear in one stream. No scrollback or history buffer. No color support or formatting. Intended for advanced users comfortable with command-line interfaces and Unix pipelines. Consider using with tools like **tmux** or **screen** for better session management.

# HISTORY

**sic** is developed by the **suckless.org** community, known for minimalist software including **dwm** and **st**. The suckless philosophy emphasizes simplicity, clarity, and frugality, creating tools that do one thing well and integrate via Unix pipelines. The project has been active since the mid-**2000s**.

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1), [ii](/man/ii)(1)
