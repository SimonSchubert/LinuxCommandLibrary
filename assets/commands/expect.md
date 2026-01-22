# TLDR

**Execute** an expect script from file

```expect [path/to/file]```

Execute a **specified** expect script

```expect -c "[commands]"```

Enter **interactive** REPL

```expect -i```

# SYNOPSIS

**expect** [_options_] [_script_] [_arguments_]

# DESCRIPTION

**expect** automates interactive applications by scripting responses to expected prompts. It spawns processes and responds to their output based on pattern matching.

Commonly used for automating SSH logins, FTP sessions, and other interactive programs.

# PARAMETERS

**-c** _commands_
> Execute commands directly

**-i**
> Interactive mode (REPL)

**-f** _file_
> Read commands from file

**-d**
> Debug mode

# CAVEATS

Uses Tcl scripting language. Sending passwords in scripts has security implications. Consider SSH keys or other authentication methods when possible.

# SEE ALSO

[autoexpect](/man/autoexpect)(1), [tcl](/man/tcl)(1), [ssh](/man/ssh)(1)
