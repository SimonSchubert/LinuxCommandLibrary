# TLDR

**Show printer status**

```lpc status```

**Show all printers**

```lpc status all```

**Enable printer**

```lpc enable [printer]```

**Disable printer**

```lpc disable [printer]```

**Start printer**

```lpc start [printer]```

**Stop printer**

```lpc stop [printer]```

# SYNOPSIS

**lpc** [_command_] [_printer_]

# PARAMETERS

_COMMAND_
> Control command.

_PRINTER_
> Printer name or "all".

**status**
> Show printer status.

**enable**
> Enable queuing.

**disable**
> Disable queuing.

**start**
> Start printing.

**stop**
> Stop printing.

**--help**
> Display help information.

# DESCRIPTION

**lpc** controls line printers. It shows status and controls printer queues.

The tool is the line printer control program from BSD, now implemented by CUPS.

lpc controls printer queues.

# CAVEATS

Limited functionality in CUPS. Administrative access needed. Legacy BSD interface.

# HISTORY

lpc originated in **BSD Unix** for printer control, now provided by CUPS with limited functionality.

# SEE ALSO

[lp](/man/lp)(1), [lpadmin](/man/lpadmin)(8), [lpq](/man/lpq)(1)

