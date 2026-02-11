# TAGLINE

SICStus Prolog development system

# TLDR

**Start SICStus Prolog** interactive interpreter

```sicstus```

**Load a Prolog file** on startup

```sicstus -l [path/to/file.pl]```

**Restore a saved state** on startup

```sicstus -r [path/to/saved.sav]```

**Start in forced interactive mode** even with redirected input

```sicstus -i```

**Start without the banner**

```sicstus --nologo```

**Execute a goal** on startup

```sicstus -e "[goal]"```

**Start with additional arguments** passed to Prolog

```sicstus -- [arg1] [arg2]```

# SYNOPSIS

**sicstus** [_options_] [**--**] [_prolog-arguments_]

# PARAMETERS

**-l** _file_
> Load a Prolog file on startup. This is done before any initialization file is loaded. Only one **-l** argument is allowed.

**-r** _file_
> Restore a saved state on startup.

**-i**
> Force interactive mode. Prompts for user input even if standard input is redirected.

**-e** _goal_
> Execute the specified goal on startup.

**--nologo**
> Suppress the startup banner and version information.

**--iso**
> Start in ISO Prolog mode.

**--sicstus**
> Start in SICStus Prolog mode (default).

**--**
> End of flags. Remaining arguments are passed as Prolog arguments.

# DESCRIPTION

**sicstus** is the command-line interface for SICStus Prolog, a commercial Prolog development system developed by the Swedish Institute of Computer Science (SICS). It provides an interactive interpreter for running Prolog programs and supports both ISO Prolog and SICStus-specific extensions.

After startup, the interpreter displays a prompt (**| ?-**) where you can enter queries. After each answer, pressing Return terminates the query, while **;** followed by Return requests the next solution. Execution can be interrupted with **^C**, and the interpreter is exited with **^D** or the **halt.** goal.

SICStus Prolog includes features for constraint solving, interfacing with C and Java, and developing robust applications. It requires a valid license to run the development system.

# CAVEATS

SICStus Prolog is commercial software requiring a valid license. When executing saved states, all command-line arguments are treated as Prolog arguments, so flags like **-l** and **-r** are not available. The **-l** option only accepts one file; use the interpreter to load additional files after startup.

# HISTORY

**SICStus Prolog** was developed by the Intelligent Systems Laboratory at SICS (Swedish Institute of Computer Science), now part of RISE SICS. Development began in the **1980s**, making it one of the oldest continuously developed Prolog systems. SICStus became known for its robust constraint solving capabilities and efficient execution. The system continues active development with version 4.x series, maintaining compatibility while adding modern features.

# SEE ALSO

[swipl](/man/swipl)(1), [gprolog](/man/gprolog)(1), [prolog](/man/prolog)(1)
