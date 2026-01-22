# TLDR

**Send** a message to a user on a specific terminal

```write [username] [terminal_id]```

**Send** message to user on tty5

```write [username] tty/5```

**Send** message to user on pseudo terminal

```write [username] pts/5```

# SYNOPSIS

**write** _user_ [_ttyname_]

# DESCRIPTION

**write** allows you to communicate with other users by copying lines from your terminal to theirs. When you run write, the user receives a message indicating who is writing. You can then type your message, line by line, which appears on their terminal.

Press Ctrl+C to end the message session. Use the **who** command to find terminal IDs of logged-in users.

# CAVEATS

The recipient must have their terminal writable (use **mesg y**). If the user is logged in on multiple terminals and ttyname is not specified, the first writable terminal is used. Only works for users on the same system.

# SEE ALSO

[mesg](/man/mesg)(1), [wall](/man/wall)(1), [talk](/man/talk)(1), [who](/man/who)(1)
