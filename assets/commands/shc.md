# TLDR

**Compile shell script**

```shc -f [script.sh]```

**Set expiration date**

```shc -e [31/12/2025] -f [script.sh]```

**Set expiration message**

```shc -m "[Script expired]" -f [script.sh]```

**Custom output name**

```shc -o [binary] -f [script.sh]```

**Relaxed security**

```shc -r -f [script.sh]```

**Verbose output**

```shc -v -f [script.sh]```

# SYNOPSIS

**shc** [_-f script_] [_-o output_] [_-e date_] [_-m message_] [_options_]

# PARAMETERS

**-f** _SCRIPT_
> Input script.

**-o** _FILE_
> Output binary.

**-e** _DATE_
> Expiration date.

**-m** _MESSAGE_
> Expiration message.

**-r**
> Relaxed security.

**-v**
> Verbose.

**-T**
> Allow tracing.

**-U**
> Untraceable mode.

# DESCRIPTION

**shc** compiles shell scripts to binaries. It provides basic source code protection.

The script is encrypted and wrapped in C code. Compilation produces an executable.

Expiration dates limit script lifetime. Useful for time-limited distribution.

Relaxed mode allows running on different systems. Strict mode binds to current host.

The .x.c intermediate file contains C source. Can be inspected or modified.

# CAVEATS

Not true compilation - script is recoverable. Security is obfuscation, not encryption. Requires C compiler.

# HISTORY

**shc** (Shell Compiler) was created by **Francisco Javier Rosales Garcia**. It's used for basic shell script protection and distribution.

# SEE ALSO

[bash](/man/bash)(1), [gcc](/man/gcc)(1)
