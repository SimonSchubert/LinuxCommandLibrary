# TAGLINE

Directory navigation with aliases

# TLDR

**Register** current directory

```goto -r [alias-name]```

**Navigate** to aliased directory

```goto [alias-name]```

**List** all aliases

```goto -l```

**Unregister** an alias

```goto -u [alias-name]```

# SYNOPSIS

**goto** [_options_] [_alias_]

# PARAMETERS

**-r, --register** _ALIAS_
> Register current directory as alias

**-u, --unregister** _ALIAS_
> Unregister alias

**-l, --list**
> List all registered aliases

**-c, --clean**
> Remove non-existent directory aliases

**-x, --expand** _ALIAS_
> Print alias path

**-p, --push**
> Use pushd instead of cd

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**goto** is a directory navigation tool that allows users to create aliases for frequently accessed directories. It provides tab completion and quick jumping between projects.

The tool integrates with the shell (bash, zsh, fish) and provides fast navigation without typing long paths.

# SHELL INTEGRATION

Add to shell configuration:

**Bash/Zsh:**
```bash
eval "$(goto -r)"
```

**Fish:**
```fish
goto -r | source
```

# EXAMPLES

```bash
goto -r proj      # Register current dir as 'proj'
goto proj         # Jump to ~/projects/myproject
goto -l           # List: proj -> ~/projects/myproject
goto -u proj      # Remove alias
```

# CAVEATS

Requires shell integration. Aliases are stored in user's home directory. Tab completion requires shell setup.

# HISTORY

**goto** was inspired by similar tools like z.lua and autojump, focusing on simplicity and alias-based navigation.

# SEE ALSO

[z.lua](https://github.com/skywind3000/z.lua), [autojump](https://github.com/wting/autojump), [zoxide](https://github.com/ajeetdsouza/zoxide)