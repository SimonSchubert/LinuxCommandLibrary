# TLDR

**Unlink global package**

```npm unlink -g [package]```

**Unlink local package**

```npm unlink [package]```

**Unlink current package globally**

```npm unlink```

# SYNOPSIS

**npm unlink** [_options_] [_packages_...]

# PARAMETERS

**-g**, **--global**
> Unlink globally.

**--no-save**
> Don't update package.json.

# DESCRIPTION

**npm unlink** removes a linked package. It's the opposite of npm link, removing the symlink between packages or removing a globally linked package.

This is an alias for "npm uninstall" but is semantically used to undo npm link operations.

# WORKFLOW

```bash
# In library directory (linked globally)
cd my-library
npm link        # Creates global link

# In project (using linked library)
cd my-project
npm link my-library  # Uses linked version

# To unlink
cd my-project
npm unlink my-library  # Remove local link

cd my-library
npm unlink -g  # Remove global link
```

# CAVEATS

Same as npm uninstall. Use -g for globally linked packages. May need to reinstall package normally afterward.

# HISTORY

npm unlink was added as a semantic alias for npm uninstall, specifically for undoing npm link operations.

# SEE ALSO

[npm](/man/npm)(1), [npm-link](/man/npm-link)(1), [npm-uninstall](/man/npm-uninstall)(1)
