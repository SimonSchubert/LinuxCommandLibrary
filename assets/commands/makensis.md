# TAGLINE

compiles NSIS installer scripts

# TLDR

**Compile installer script**

```makensis [script.nsi]```

**Compile with maximum verbosity**

```makensis /V4 [script.nsi]```

**Define a symbol**

```makensis /D[NAME=value] [script.nsi]```

**Add include path**

```makensis /I[/path/to/includes] [script.nsi]```

**Log compiler output to file**

```makensis /O[logfile.txt] [script.nsi]```

**Treat warnings as errors**

```makensis /WX [script.nsi]```

**Show help for a command**

```makensis /CMDHELP [command]```

# SYNOPSIS

**makensis** [_options_] _script_

# PARAMETERS

_SCRIPT_
> NSIS script file (.nsi). Use **-** for stdin.

**/V** _LEVEL_
> Verbosity level: 0=none, 1=errors, 2=warnings, 3=info, 4=all.

**/D** _NAME[=VALUE]_
> Define a symbol for the script preprocessor.

**/I** _DIR_
> Add an include path for !include directives.

**/O** _FILE_
> Log compiler output to file.

**/X** _"command param"_
> Execute NSIS command inline.

**/NOCONFIG**
> Disable inclusion of nsisconf.nsh.

**/NOCD**
> Disable changing directory to the .nsi file location.

**/WX**
> Treat warnings as errors.

**/P** _LEVEL_
> Compiler priority: 0=idle, 1=below normal, 2=normal, 3=above normal, 4=high, 5=realtime.

**/CMDHELP** [_command_]
> Print help for a specific command, or all commands.

**/HDRINFO**
> Print makensis compile-time options.

**/PPO**
> Run preprocessor only, print result to stdout.

# DESCRIPTION

**makensis** compiles NSIS (Nullsoft Scriptable Install System) scripts into Windows installer executables. It runs natively on Linux, macOS, and Windows, making it useful for cross-platform build pipelines.

# CAVEATS

Generates Windows-format installers. NSIS script syntax must be learned separately. On Linux, options use / prefix (e.g., /V4) not - prefix.

# HISTORY

NSIS (Nullsoft Scriptable Install System) was created by **Nullsoft**, makers of Winamp.

# SEE ALSO

[wine](/man/wine)(1)

