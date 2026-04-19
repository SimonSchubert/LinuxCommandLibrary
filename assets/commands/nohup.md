# TAGLINE

Run a command immune to hangups

# TLDR

**Run command immune to hangups**

```nohup [command] &```

**Run with output to file**

```nohup [command] > [output.log] 2>&1 &```

**Run script in background**

```nohup [./script.sh] &```

**Run with custom output**

```nohup [command] > [custom.out] &```

# SYNOPSIS

**nohup** _command_ [_arguments_]

**nohup** _option_

# PARAMETERS

_COMMAND_
> Command to run.

_ARGUMENTS_
> Command arguments.

**--help**
> Display help information.

**--version**
> Output version information.

# DESCRIPTION

**nohup** runs _command_ while ignoring the SIGHUP signal, so the process keeps running after the controlling terminal is closed or the user logs out.

If standard output is a terminal, it is appended to **nohup.out** in the current directory, or to **$HOME/nohup.out** if that is not writable. If standard error is a terminal, it is redirected to standard output. If standard input is a terminal, it is redirected from an unreadable file.

Note: **nohup** does not itself put the process in the background; combine with **&** (or a shell job-control facility) to detach.

# EXIT STATUS

**125** nohup itself failed. **126** command found but could not be invoked. **127** command not found. Otherwise the exit status of _command_.

# CAVEATS

Combine with **&** to run in the background. Output is appended (not overwritten) to **nohup.out**. Many shells provide a built-in **nohup** that may differ from the GNU coreutils version. To fully detach a process from the shell, consider **disown** or **setsid**.

# HISTORY

nohup is a classic **Unix** command for running processes that survive terminal disconnection.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1), [disown](/man/disown)(1), [setsid](/man/setsid)(1)

