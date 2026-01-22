# TLDR

**Show** all environment variables

```env```

**Run** command with environment

```env VAR=value [command]```

**Clear** environment

```env -i [command]```

**Unset** variable

```env -u [VAR] [command]```

# SYNOPSIS

**env** [_options_] [_VAR=value_]... [_command_]

# DESCRIPTION

**env** runs a program in a modified environment. It can display current environment variables, set new ones, unset existing ones, or run commands with a clean environment.

The command is useful for setting variables temporarily or debugging environment issues.

# PARAMETERS

**-i**, **--ignore-environment**
> Start with empty environment

**-u** _var_, **--unset=**_var_
> Remove variable from environment

**-0**, **--null**
> End lines with NUL, not newline

**-C** _dir_, **--chdir=**_dir_
> Change directory before running command

**-S** _string_
> Process and split string into arguments

# WORKFLOW

```bash
# Display all environment variables
env

# Set variable for one command
env DEBUG=1 ./program

# Multiple variables
env VAR1=value1 VAR2=value2 command

# Clear environment
env -i command

# Clean environment with specific variables
env -i PATH=/usr/bin HOME=/home/user command

# Unset variable
env -u DISPLAY command

# Change directory first
env -C /tmp ls

# In shebang for portability
#!/usr/bin/env python3
```

# COMMON USES

**Shebang lines:**
```bash
#!/usr/bin/env bash
#!/usr/bin/env python3
#!/usr/bin/env node
```

**Temporary variables:**
```bash
env NODE_ENV=production npm start
env DATABASE_URL=postgres://... rails console
```

**Clean environment:**
```bash
env -i PATH="$PATH" command
```

**Debugging:**
```bash
env | grep PATH
env | sort
```

# VARIABLE FORMAT

Variables shown as:
```
NAME=value
PATH=/usr/bin:/bin
HOME=/home/user
```

# COMPARISON WITH EXPORT

**env**
> Runs command with modified environment

**export**
> Sets variables for current shell and children

```bash
# env (one command only)
env VAR=value command

# export (persistent)
export VAR=value
command  # VAR is available
```

# CAVEATS

Variables set with env don't persist after command exits. Shell built-ins may not be accessible with env. PATH must be set for clean environment. Quotes needed for values with spaces. Different from the export shell built-in.

# HISTORY

**env** has been part of Unix since the early days, included in POSIX standards for environment manipulation.

# SEE ALSO

[export](/man/export)(1), [printenv](/man/printenv)(1), [set](/man/set)(1)
