# TAGLINE

Compile shell scripts to binary executables

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

**shc** converts shell scripts into compiled binary executables by encrypting the script content and wrapping it in auto-generated C code. The resulting C source is compiled with the system's C compiler to produce a standalone binary that decrypts and executes the original script at runtime.

The tool provides basic source code obfuscation rather than true security, since the script can be recovered from the binary with sufficient effort. Optional features include expiration dates that make the binary refuse to run after a specified date, and strict mode that binds the binary to the current host to prevent redistribution. Relaxed mode (**-r**) allows the binary to run on different systems.

An intermediate **.x.c** file containing the generated C source is produced alongside the binary and can be inspected, modified, or compiled manually with different options.

# CAVEATS

Not true compilation - script is recoverable. Security is obfuscation, not encryption. Requires C compiler.

# HISTORY

**shc** (Shell Compiler) was created by **Francisco Javier Rosales Garcia**. It's used for basic shell script protection and distribution.

# SEE ALSO

[bash](/man/bash)(1), [gcc](/man/gcc)(1)
