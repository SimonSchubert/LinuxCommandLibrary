# TAGLINE

Run a command repeatedly over groups of arguments.

# TLDR

**Apply a command to each argument**

```apply [command] [arg1] [arg2] [arg3]```

**Apply a command using placeholders**

```apply "diff %1 %2" [file1] [file2] [file3] [file4]```

**Apply with a specific number of arguments per invocation**

```apply -2 diff [file1] [file2] [file3] [file4]```

**Apply echo to each file**

```apply echo *```

**Apply rm to files matching pattern**

```apply rm [file1] [file2] [file3]```

# SYNOPSIS

**apply** [**-a** _char_] [**-n** _num_] _command_ _arguments_...

# PARAMETERS

**-a** _char_
> Use _char_ as the placeholder character instead of the default **%**.

**-n** _num_
> Pass _num_ arguments to each command invocation. The default is 1.

**%n**
> In the command string, **%1**, **%2**, etc. refer to the 1st, 2nd, etc. arguments in each group.

# DESCRIPTION

**apply** runs a command repeatedly, passing a specified number of arguments to each invocation. It provides a simple alternative to **xargs** or shell loops for applying a command across multiple arguments.

By default, apply passes one argument at a time to the command. With **-n 2**, it groups arguments in pairs, useful for commands like **diff** or **cmp** that take two files. The **%n** placeholders allow flexible positioning of arguments within the command string.

When the command contains spaces or special characters, it should be quoted. Without placeholders, arguments are appended to the end of the command.

# CAVEATS

This command is primarily available on BSD systems and macOS; it is not part of GNU coreutils. Linux users typically use **xargs** or shell loops instead. The argument count must divide evenly into the total arguments when using **-n**.

# HISTORY

The **apply** command originated in BSD Unix in the **1980s**. It provided a simple mechanism for command iteration before more sophisticated tools like **xargs** and **find -exec** became common. The command remains available in FreeBSD, OpenBSD, and macOS but was never widely adopted on Linux systems.

# SEE ALSO

[xargs](/man/xargs)(1), [parallel](/man/parallel)(1), [find](/man/find)(1)
