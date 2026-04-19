# TAGLINE

automate interactive applications with scripted responses

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

The tool uses Tcl scripting language with expect-specific commands like spawn, expect, and send. Scripts can handle multiple response patterns, timeouts, and conditional logic. This enables automation of programs that require interactive input like passwords, confirmations, or menu selections.

Commonly used for automating SSH logins, FTP sessions, database setup scripts, and other interactive programs. While powerful, modern alternatives like SSH keys, API tokens, and configuration management tools are often preferred for security.

# PARAMETERS

**-c** _commands_
> Execute the given Tcl/Expect commands before the script runs.

**-i**
> Interactive mode (REPL). Also implied when stdin is a terminal.

**-f** _FILE_
> Read the command script from FILE.

**-b** _FILE_
> Read the script line-by-line (buffered mode) — useful for very long scripts.

**-d**
> Enable diagnostic output (command tracing).

**-D** [_N_]
> Enter the interactive debugger (on first prompt or after N expect calls).

**-v**
> Print Expect version and exit.

**--** 
> End of options; following arguments are passed to the script in `$argv`.

# CAVEATS

Uses Tcl scripting language. Sending passwords in scripts has security implications. Consider SSH keys or other authentication methods when possible.

# SEE ALSO

[autoexpect](/man/autoexpect)(1), [tcl](/man/tcl)(1), [ssh](/man/ssh)(1)
