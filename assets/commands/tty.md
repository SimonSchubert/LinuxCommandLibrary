# TAGLINE

Print terminal device file name

# TLDR

**Print the terminal device** name

```tty```

**Check silently** if stdin is a terminal (exit status only)

```tty -s```

**Use in a script** to check for interactive mode

```if tty -s; then echo "Interactive"; fi```

**Show version**

```tty --version```

# SYNOPSIS

**tty** [_options_]

# PARAMETERS

**-s**, **--silent**, **--quiet**
> Print nothing; only return exit status

**--help**
> Display help and exit

**--version**
> Output version information and exit

# DESCRIPTION

**tty** prints the file name of the terminal connected to standard input. The output is typically a device path like **/dev/pts/0** (pseudo-terminal) or **/dev/tty1** (virtual console).

If standard input is not connected to a terminal (e.g., when input is piped or redirected from a file), tty prints "not a tty" and exits with status 1.

The **-s** option suppresses output entirely, making it useful in scripts where only the exit status matters. This allows testing whether a script is running interactively or in a batch/piped context.

# EXIT STATUS

**0**
> Standard input is a terminal

**1**
> Standard input is not a terminal

**2**
> Invalid option specified

# EXAMPLES

**Check if running interactively**
```
if tty -s; then
    echo "Running in terminal"
else
    echo "Running non-interactively"
fi
```

**Get the terminal device path**
```
MYTERM=$(tty)
echo "Connected to: $MYTERM"
```

# CAVEATS

The tty command only checks standard input. If stdin is redirected but stdout/stderr are still connected to a terminal, tty will report "not a tty". For more detailed terminal checks, consider using **test -t** or examining **/proc/self/fd/**.

# HISTORY

The **tty** command dates back to the earliest versions of Unix at Bell Labs in the **1970s**. The name comes from "teletypewriter," the original terminal devices. The GNU coreutils version was written by **David MacKenzie**. The command is specified in POSIX.

# SEE ALSO

[stty](/man/stty)(1), [who](/man/who)(1), [mesg](/man/mesg)(1), [write](/man/write)(1)
