# TLDR

**Go back** to parent directory by name

```bd [dirname]```

**List** parent directories

```bd -l```

# SYNOPSIS

**bd** _directory-name_

# DESCRIPTION

**bd** (back directory) is a bash utility for quickly navigating to parent directories by name instead of using multiple `cd ../../../` commands. It searches upward in the directory tree for a matching directory name.

The tool simplifies navigation in deep directory structures.

# PARAMETERS

**-l**, **--list**
> List all parent directories

**-h**, **--help**
> Show help

# WORKFLOW

```bash
# Current path: /home/user/projects/myapp/src/components
# Jump to 'myapp' directory
bd myapp
# Now in: /home/user/projects/myapp

# List available parent directories
bd -l
```

# FEATURES

- Fuzzy matching on directory names
- Tab completion support
- Fast parent directory navigation
- Integration with bash/zsh

# CAVEATS

Requires installation and sourcing in shell config. Only works upward (not sideways). Name must be unique in path. Not available by default on most systems.

# HISTORY

**bd** was created by Vignesh Warar around **2013** to simplify navigating up directory trees by name.

# SEE ALSO

[cd](/man/cd)(1), [pushd](/man/pushd)(1), [z](/man/z)(1)
