# TAGLINE

SSH-based chat platform for the terminal

# TLDR

**Connect** to the devzat chat server

```devzat [server_address]```

**Join** a specific channel

```devzat [server_address] -c [channel_name]```

**Start** a private message with a user

```devzat [server_address] -u [username]```

**Set** your display name

```devzat [server_address] -n [nickname]```

# SYNOPSIS

**devzat** [_options_] [_server_]

# PARAMETERS

**-c, --channel** _CHANNEL_
> Join a specific channel on connection

**-u, --user** _USER_
> Start a private conversation with user

**-n, --name** _NAME_
> Set display name/nickname

**-k, --key** _FILE_
> Path to SSH private key for authentication

**-h, --help**
> Display help and exit

**-v, --version**
> Display version and exit

# DESCRIPTION

**devzat** is an SSH-based chat platform that allows users to communicate through the terminal using SSH connections. It provides a real-time chat experience without requiring any special client software - just SSH into a devzat server and start chatting.

The platform supports public channels, private messaging, and user presence indicators. Authentication is handled via SSH keys, making it secure and convenient for developers already familiar with SSH workflows.

# COMMANDS

Once connected:

**/join** _CHANNEL_
> Join a different channel

**/msg** _USER_ _MESSAGE_
> Send a private message to a user

**/list**
> List available channels

**/users**
> List users in current channel

**/nick** _NAME_
> Change your nickname

**/quit**
> Disconnect from the server

# CAVEATS

Requires SSH client and valid SSH key pair for authentication. Server address must be running a devzat instance. Connection is encrypted via SSH but messages are visible to server operators. File sharing capabilities may be limited.

# HISTORY

**devzat** was created as a fun project to enable chat directly through SSH, leveraging the security and ubiquity of SSH infrastructure. It gained popularity in developer communities as a lightweight alternative to traditional chat applications.

# SEE ALSO

[ssh](/man/ssh)(1), [weechat](/man/weechat)(1), [irssi](/man/irssi)(1)