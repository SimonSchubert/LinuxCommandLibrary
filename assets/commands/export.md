# TAGLINE

shell builtin to mark variables for child processes

# TLDR

**Set** a variable and export it in one step

```export [VARIABLE]=[value]```

**Export** an already existing shell variable

```export [VARIABLE]```

**Append** a directory to PATH

```export PATH="$PATH:[/path/to/append]"```

**Remove** the export attribute, keeping the variable in the current shell

```export -n [VARIABLE]```

**Export** a shell function to child processes (bash)

```export -f [function_name]```

**Print** all exported variables in a re-readable form

```export -p```

**Export** several variables at once

```export [EDITOR]=[vim] [PAGER]=[less]```

# SYNOPSIS

**export** _name_[=_value_] ...

**export** **-p**

**export** [**-fn**] _name_[=_value_] ...

# DESCRIPTION

**export** marks shell variables so they are placed in the environment of subsequently executed commands. An exported variable becomes an environment variable that every child process inherits; a variable set without **export** stays private to the current shell.

This is how configuration reaches programs you run: **PATH** tells the shell where to find executables, **EDITOR** tells tools which editor to open, and application-specific variables like **JAVA_HOME** are read by the processes that need them. Assignment and export can be combined (**export FOO=bar**) or split across two statements (**FOO=bar** then **export FOO**), which is the more portable form for very old shells.

The export attribute belongs to the variable, not to its value: once a name is exported, later assignments to it are exported too, without repeating **export**. **export -n** removes that attribute while leaving the variable defined in the current shell, which is not the same as deleting it; use **unset** for that.

With no operands, or with **-p**, **export** prints the names and values of all exported variables in a format that can be re-read as shell input.

# PARAMETERS

**-p**
> Print all exported variables in a form that can be reused as shell input.

**-n**
> Remove the export attribute from each _name_. The variable stays set in the current shell but is no longer passed to children. Not POSIX; a bash, ksh and zsh extension.

**-f**
> Treat each _name_ as a shell function rather than a variable. Bash-specific and rarely portable.

**--**
> End of options; treat the rest as names, even if they start with a dash.

# CAVEATS

**export** only affects the current shell and the processes it starts afterwards. It cannot change the environment of the parent shell or of processes that are already running, which is why a script must be sourced (**. script.sh**) rather than executed if you want its exports to persist in your session.

**export -n** does not unset the variable. The value remains visible to the current shell and to anything using it directly; only inheritance stops. Use **unset** _name_ to remove it entirely.

Exported functions (**export -f**) are passed to children through specially encoded environment variables and only work when the child is also bash. This mechanism was the vector for the **Shellshock** vulnerabilities in 2014, and its encoding changed as part of the fix.

Only **-p** is specified by POSIX. **-f** and **-n** are extensions, so scripts targeting **/bin/sh** should avoid them.

# HISTORY

**export** dates to the **Bourne shell** in the late **1970s** and is standardized by POSIX. It is implemented as a shell builtin in every major shell, because an external program could not modify the shell's own environment. Some systems also ship a **/usr/bin/export** stub for standards compliance, but it has no useful effect.

# SEE ALSO

[unset](/man/unset)(1), [env](/man/env)(1), [printenv](/man/printenv)(1), [set](/man/set)(1), [declare](/man/declare)(1), [readonly](/man/readonly)(1), [typeset](/man/typeset)(1), [bash](/man/bash)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#index-export)```

<!-- verified: 2026-07-16 -->
