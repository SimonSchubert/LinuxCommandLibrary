# TAGLINE

Line printer control program

# TLDR

**Show status of all printers**

```lpc status all```

**Show status of a specific printer**

```lpc status [printer]```

**Enter interactive mode**

```lpc```

# SYNOPSIS

**lpc** [_command_] [_printer_]

# PARAMETERS

_COMMAND_
> Control command to execute.

_PRINTER_
> Printer name or "all" to apply to all printers.

**status**
> Show printer and queue status.

**exit**, **quit**
> Exit the lpc command interpreter.

**help**
> Display a short help message.

# DESCRIPTION

**lpc** provides limited control over printer and class queues provided by CUPS. It can also be used to query the state of queues. If no command is specified on the command line, lpc displays a prompt and accepts commands from standard input.

The CUPS version of lpc implements only a subset of the commands from the original Berkeley lpc program. It cannot be used to configure printer queues -- use **lpadmin** for configuration tasks.

# CAVEATS

This command is **deprecated** and will be removed in a future release of CUPS. The CUPS implementation only supports the **status** command for non-root users. Use **lpstat** for queue status and **lpadmin** for administration instead.

# HISTORY

lpc originated in **BSD Unix** as part of the Berkeley Line Printer system for controlling print queues. CUPS provides a compatibility implementation with limited functionality.

# SEE ALSO

[lp](/man/lp)(1), [lpq](/man/lpq)(1), [lpr](/man/lpr)(1), [lpstat](/man/lpstat)(1), [lpadmin](/man/lpadmin)(8)

