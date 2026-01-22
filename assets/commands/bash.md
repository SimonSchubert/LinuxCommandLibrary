# TLDR

**Run** script

```bash [script.sh]```

**Execute** command

```bash -c ["echo hello"]```

**Interactive** login shell

```bash -l```

**Read** from stdin

```echo "ls -la" | bash```

**Debug** script

```bash -x [script.sh]```

Check **syntax** only

```bash -n [script.sh]```

# SYNOPSIS

**bash** [_options_] [_file_] [_arguments_]

# DESCRIPTION

**bash** (Bourne Again SHell) is a Unix shell and command language interpreter. It's the default shell on most Linux distributions and macOS, providing command execution, scripting, job control, and extensive programming features.

Bash is backward-compatible with the original Bourne shell (sh) while adding numerous improvements and modern features.

# PARAMETERS

**-c** _string_
> Execute command from string

**-l**, **--login**
> Login shell (sources profile files)

**-i**
> Interactive mode

**-x**
> Print commands before execution (debug mode)

**-n**
> Syntax check only (no execution)

**-e**
> Exit on first error

**-u**
> Error on undefined variables

**-v**
> Verbose mode (print input lines)

**--noprofile**
> Don't read profile files

**--norc**
> Don't read ~/.bashrc

# FEATURES

- Command history (readline)
- Tab completion
- Job control (fg, bg, jobs)
- Arithmetic evaluation
- Arrays and associative arrays
- Functions
- Pattern matching and globbing
- Process substitution
- Here documents
- Conditional execution
- Loops and flow control

# STARTUP FILES

**Login shell**
> /etc/profile, ~/.bash_profile, ~/.bash_login, ~/.profile

**Interactive non-login**
> ~/.bashrc

**Non-interactive**
> $BASH_ENV

# SPECIAL VARIABLES

**$0** - Script name
**$1, $2, ...** - Positional parameters
**$@** - All parameters
**$#** - Parameter count
**$?** - Exit status of last command
**$$** - Process ID
**$!** - PID of last background job

# CAVEATS

Bash-specific features not portable to POSIX sh. Scripts should use `#!/bin/bash` not `#!/bin/sh`. Unquoted variables can cause word splitting. Use `shellcheck` to validate scripts.

# HISTORY

**Bash** was created by Brian Fox for the GNU Project in **1989** as a free replacement for the Bourne shell, first released as version 0.99. Version 5.0 was released in **2019**.

# SEE ALSO

[sh](/man/sh)(1), [zsh](/man/zsh)(1), [shellcheck](/man/shellcheck)(1)
