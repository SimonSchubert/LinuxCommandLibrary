# TLDR

**Run** built-in command

```builtin cd [/path]```

**Check** if command is built-in

```type cd```

# SYNOPSIS

**builtin** _command_ [_args_]

# DESCRIPTION

**builtin** forces the shell to run a built-in command even if a function or alias with the same name exists. It's a bash built-in command used to bypass shell functions and aliases to access the original built-in implementation.

The command is useful when functions or aliases shadow built-in commands.

# USAGE

```bash
# Function shadows cd
cd() {
    echo "Going to $1"
    builtin cd "$1"
}

# Now 'cd' runs the function, but function uses builtin cd

# Direct builtin usage
builtin cd /tmp  # Bypasses any cd function
```

# COMMON BUILT-INS

- **cd** - Change directory
- **echo** - Print text
- **read** - Read input
- **test** - Conditional evaluation
- **export** - Set environment variables
- **source** - Execute script
- **alias** - Create aliases
- **set** - Set shell options

# WORKFLOW

```bash
# Create function that wraps cd
cd() {
    echo "Changing to $1"
    builtin cd "$1" && ls
}

# Use the function
cd /tmp  # Prints message and lists directory

# Use built-in directly
builtin cd /tmp  # Just changes directory
```

# CAVEATS

Only works with shell built-in commands. No effect on external commands. Behavior varies between shells (bash, zsh, etc.). Not needed unless functions/aliases shadow built-ins.

# HISTORY

**builtin** has been part of bash and other shells since the late **1980s** to provide access to built-in commands when shadowed.

# SEE ALSO

[command](/man/command)(1), [type](/man/type)(1), [enable](/man/enable)(1)
