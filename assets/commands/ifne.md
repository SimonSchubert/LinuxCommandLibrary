# TLDR

**Run command if input**

```command1 | ifne command2```

**Delete file if results**

```find . -empty | ifne xargs rm```

**Invert condition**

```command | ifne -n echo "no output"```

**Mail if errors**

```make 2>&1 | ifne mail -s "errors" [admin]```

# SYNOPSIS

**ifne** [_options_] _command_ [_args_]

# PARAMETERS

_COMMAND_
> Command to run.

_ARGS_
> Command arguments.

**-n**
> Run if NO input.

**--help**
> Display help information.

# DESCRIPTION

**ifne** runs a command only if there is input. It reads stdin and passes it to the command if non-empty.

The tool is useful in pipelines where subsequent commands should only run when there's data. The -n flag inverts the behavior.

ifne conditionally runs commands.

# CAVEATS

Part of moreutils. Buffers input. Stdin passed to command.

# HISTORY

ifne is part of **moreutils**, a collection of Unix tools by **Joey Hess**.

# SEE ALSO

[xargs](/man/xargs)(1), [moreutils](/man/moreutils)(7), [test](/man/test)(1)
