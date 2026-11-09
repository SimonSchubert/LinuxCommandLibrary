# TAGLINE

Send messages to logged-in users

# TLDR

**Send** a message to a user, letting write pick the terminal

```write [username]```

**Send** a message to a user on a specific terminal

```write [username] [terminal_id]```

**Send** message to user on tty5

```write [username] tty5```

**Send** message to user on pseudo terminal

```write [username] pts/5```

**Send** a one-line message from a pipe

```echo "[message]" | write [username]```

# SYNOPSIS

**write** _user_ [_ttyname_]

# PARAMETERS

**-h**, **--help**
> Display help text and exit.

**-V**, **--version**
> Display version and exit.

# DESCRIPTION

**write** allows you to communicate with other users by copying lines from your terminal to theirs. When you run write, the user receives a message indicating who is writing. You can then type your message, line by line, which appears on their terminal.

Press Ctrl+D (EOF) or Ctrl+C to end the message session. The other user sees EOF when the conversation is over and must run write as well to reply. Use the **who** command to find terminal IDs of logged-in users.

By tradition, **-o** at the end of a line means it is the other person's turn to talk, and **oo** means the conversation is over.

# CAVEATS

The recipient must have their terminal writable (use **mesg y**), although the superuser can write regardless. If the user is logged in on multiple terminals and ttyname is not specified, write picks the terminal with the shortest idle time. Only works for users on the same system.

# SEE ALSO

[mesg](/man/mesg)(1), [wall](/man/wall)(1), [talk](/man/talk)(1), [who](/man/who)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://man7.org/linux/man-pages/man1/write.1.html)```

<!-- verified: 2026-11-09 -->
