# TAGLINE

Run a command repeatedly over groups of arguments.

# TLDR

**Apply a command to each argument**

```apply [command] [arg1] [arg2] [arg3]```

**Apply a command using placeholders**

```apply "diff %1 %2" [file1] [file2] [file3] [file4]```

**Apply with a specific number of arguments per invocation**

```apply -2 diff [file1] [file2] [file3] [file4]```

**Apply echo to each file** (acts like ls)

```apply echo *```

**Dry-run**: show the commands that would run without executing them

```apply -d echo *```

**Run a command once per argument with no arguments passed**

```apply -0 who [a] [b] [c]```

# SYNOPSIS

**apply** [**-a** _char_] [**-d**] [**-#**] _command_ _argument_...

# PARAMETERS

**-a** _char_
> Use _char_ as the placeholder (magic) character instead of the default **%**.

**-#**
> A numeric flag (e.g. **-2**) sets how many arguments to pass per invocation. The default is **-1** (one argument at a time). With **-0** the command runs once per argument with no arguments passed. Ignored if **%d** sequences appear in the command.

**-d**
> Dry-run: print the commands that would be executed without running them.

**%n**
> In the command string, **%1**, **%2**, ... **%9** are replaced by the 1st, 2nd, ... following unused argument.

# DESCRIPTION

**apply** runs a command repeatedly, passing a specified number of arguments to each invocation. It provides a simple alternative to **xargs** or shell loops for applying a command across multiple arguments.

By default, apply passes one argument at a time to the command. With **-2**, it groups arguments in pairs, useful for commands like **diff** or **cmp** that take two files. The **%n** placeholders allow flexible positioning of arguments within the command string.

When the command contains spaces or special characters, it should be quoted. Without placeholders, arguments are appended to the end of the command.

# CAVEATS

This command is primarily available on BSD systems and macOS; it is not part of GNU coreutils. Linux users typically use **xargs** or shell loops instead. The argument count must divide evenly into the total arguments when using **-n**.

# HISTORY

The **apply** command originated in BSD Unix in the **1980s**. It provided a simple mechanism for command iteration before more sophisticated tools like **xargs** and **find -exec** became common. The command remains available in FreeBSD, OpenBSD, and macOS but was never widely adopted on Linux systems.

# INSTALL

```aur: yay -S outils-apply```

```apk: sudo apk add outils-apply```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[xargs](/man/xargs)(1), [parallel](/man/parallel)(1), [find](/man/find)(1)

# RESOURCES

```[Source code](https://github.com/freebsd/freebsd-src)```

```[Documentation](https://man.freebsd.org/cgi/man.cgi?apply)```

<!-- verified: 2026-06-11 -->
