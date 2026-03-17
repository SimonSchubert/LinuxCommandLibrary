# TAGLINE

Write a message to all logged-in users

# TLDR

**Send a message to all logged-in users**

```wall [message]```

**Send a message to a specific group**

```wall -g [group_name] [message]```

**Send the contents of a file to all logged-in users**

```wall [file]```

**Send a message with a write timeout**

```wall -t [seconds] [message]```

**Send a message without the banner**

```wall -n [message]```

# SYNOPSIS

**wall** [_options_] [_message_ | _file_]

# PARAMETERS

**-g**, **--group** _group_
> Send only to members of the specified group.

**-n**, **--nobanner**
> Suppress the banner that normally precedes each message showing the sender and timestamp.

**-t**, **--timeout** _seconds_
> Timeout in seconds for writing to each terminal. Default is 300 seconds.

# DESCRIPTION

**wall** (write all) displays a message, the contents of a file, or its standard input on the terminals of all currently logged-in users. This is typically used by system administrators for system-wide announcements like pending shutdowns.

Messages are preceded by a banner showing the sender and timestamp. Lines longer than 79 characters are wrapped, and short lines are padded with whitespace to 79 characters. Only the superuser can write on terminals of users who have denied messages with **mesg**(1).

# CAVEATS

Users can block wall messages with **mesg n**. Only root can override this restriction. Some sessions (e.g. display managers) with a ':' at the beginning of their utmp ut_type data will not receive messages. Users running graphical desktop environments without an open terminal will not see messages.

# HISTORY

The **wall** command has been part of Unix since early versions and is included in the **util-linux** package on Linux systems.

# SEE ALSO

[write](/man/write)(1), [mesg](/man/mesg)(1), [talk](/man/talk)(1), [shutdown](/man/shutdown)(8)
