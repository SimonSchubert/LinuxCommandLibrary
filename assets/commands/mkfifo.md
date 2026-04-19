# TAGLINE

creates named pipes

# TLDR

**Create named pipe**

```mkfifo [pipe_name]```

**Create with permissions**

```mkfifo -m [600] [pipe_name]```

**Create multiple pipes**

```mkfifo [pipe1] [pipe2] [pipe3]```

**Create FIFO with default SELinux context**

```mkfifo -Z [pipe_name]```

# SYNOPSIS

**mkfifo** [_options_] _name_

# PARAMETERS

_NAME_
> Path of the FIFO to create.

**-m** _MODE_, **--mode**=_MODE_
> Set file permission bits to MODE (as with chmod), not a=rw minus umask.

**-Z**
> Set the SELinux security context to the default type.

**--context**[=_CTX_]
> Set the SELinux or SMACK security context to the specified value.

**--help**
> Display help information.

**--version**
> Output version information.

# DESCRIPTION

**mkfifo** creates named pipes (FIFOs). Named pipes allow inter-process communication.

The tool creates special files for piping between processes. Data flows first-in-first-out.

# CAVEATS

Blocking by default. Removed manually. Different from anonymous pipes.

# HISTORY

mkfifo is a **POSIX** utility for creating named pipes for inter-process communication.

# SEE ALSO

[mknod](/man/mknod)(1)

