# TAGLINE

runs a command only if there is input

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

**ifne** ("if not empty") reads from standard input and runs the given command only if that input is non-empty. The buffered input is then re-emitted on the command's stdin, so the consumer sees the original stream unchanged. With **-n**, the behavior is inverted: the command runs only if standard input is empty (useful for handling "nothing to do" branches in scripts).

This makes **ifne** the natural complement to filters that may produce no output: pipelines like **find ... -print0 | ifne xargs -0 rm** or **make 2>&1 | ifne mail -s "errors" admin** stay silent when there is nothing to do.

# CAVEATS

Part of **moreutils**. Input must fit in memory or in the pipe buffer; the entire stream is read before the command is started, so very large inputs may be slow or memory-hungry. Stdin is only forwarded to the wrapped command when input was non-empty; in the **-n** case the wrapped command inherits an empty stdin.

# HISTORY

ifne is part of **moreutils**, a collection of Unix tools by **Joey Hess**.

# SEE ALSO

[xargs](/man/xargs)(1), [moreutils](/man/moreutils)(7), [test](/man/test)(1)
