# TAGLINE

Compile shell scripts to binary executables

# TLDR

**Compile shell script**

```shc -f [script.sh]```

**Set expiration date**

```shc -e [31/12/2026] -f [script.sh]```

**Set expiration message**

```shc -m "[Script expired]" -f [script.sh]```

**Custom output name**

```shc -o [binary] -f [script.sh]```

**Relaxed security**

```shc -r -f [script.sh]```

**Hardened untraceable** binary

```shc -U -H -f [script.sh]```

**Verbose output**

```shc -v -f [script.sh]```

# SYNOPSIS

**shc** [**-f** _script_] [**-o** _output_] [**-e** _date_] [**-m** _message_] [**-r**] [**-U**] [**-H**] [**-v**]

# PARAMETERS

**-f** _SCRIPT_
> Input shell script to compile

**-o** _FILE_
> Output binary filename

**-e** _DATE_
> Expiration date in dd/mm/yyyy format

**-m** _MESSAGE_
> Message to display upon expiration (default: "Please contact your provider")

**-r**
> Relaxed security, allow redistributable binary across systems

**-v**
> Verbose compilation output

**-U**
> Make binary untraceable (blocks truss, strace, ltrace, etc.)

**-H**
> Hardening: extra protection against dumping, code injection, and ptrace

**-S**
> Switch on setuid for root callable programs

**-B**
> Compile for BusyBox

**-D**
> Switch on debug exec calls

**-i** _inline_option_
> Inline option for the shell interpreter

**-x** _command_
> Exec command, as a printf format

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
