# TLDR

**Create named pipe**

```mkfifo [pipe_name]```

**Create with permissions**

```mkfifo -m [600] [pipe_name]```

**Create multiple pipes**

```mkfifo [pipe1] [pipe2] [pipe3]```

**Verbose output**

```mkfifo -v [pipe_name]```

# SYNOPSIS

**mkfifo** [_options_] _name_

# PARAMETERS

_NAME_
> Named pipe name.

**-m** _MODE_
> Set permissions.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mkfifo** creates named pipes (FIFOs). Named pipes allow inter-process communication.

The tool creates special files for piping between processes. Data flows first-in-first-out.

mkfifo creates named pipes.

# CAVEATS

Blocking by default. Removed manually. Different from anonymous pipes.

# HISTORY

mkfifo is a **POSIX** utility for creating named pipes for inter-process communication.

# SEE ALSO

[mknod](/man/mknod)(1), [pipe](/man/pipe)(7), [fifo](/man/fifo)(7)

