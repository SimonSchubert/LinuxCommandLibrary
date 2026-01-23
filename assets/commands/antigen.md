# TLDR

**Load oh-my-zsh** framework

```antigen use oh-my-zsh```

**Install and load a plugin** bundle

```antigen bundle [git]```

**Load a plugin** from a GitHub repository

```antigen bundle [zsh-users/zsh-autosuggestions]```

**Load a theme** from oh-my-zsh

```antigen theme [robbyrussell]```

**Apply all changes** (required at end of .zshrc)

```antigen apply```

**Update all plugins**

```antigen update```

**List loaded bundles**

```antigen list```

**Clear the cache** and reload configuration

```antigen reset```

# SYNOPSIS

**antigen** _command_ [_arguments_]

# PARAMETERS

**bundle** _spec_
> Install (if needed) and load a plugin; accepts GitHub shorthand (user/repo) or full URLs

**bundles**
> Bulk load multiple plugins via heredoc syntax (one per line)

**use** _framework_
> Load a pre-packaged framework like oh-my-zsh or prezto

**theme** _name_
> Load and activate a zsh theme (call after antigen use)

**apply**
> Commit the configuration; must be called at the end of bundle declarations

**update** [_bundle-name_]
> Update specified bundle or all bundles if no name given

**list** [**--long**]
> Display currently loaded bundles; --long shows detailed information

**revert**
> Revert all plugins to their state before the last update

**reset**
> Clear the generated cache to reload configuration changes

**selfupdate**
> Update Antigen itself to the latest version

**cleanup**
> Remove plugins that are no longer loaded in configuration

**purge** _bundle_
> Remove a specific bundle from the system

# DESCRIPTION

**Antigen** is a plugin manager for zsh, inspired by Vundle for vim and Pathogen. It simplifies managing shell plugins (called bundles) by handling installation, loading, and updates automatically.

Bundles can be loaded from oh-my-zsh, prezto, or any Git repository. The typical workflow involves sourcing antigen.zsh, declaring bundles with **antigen bundle**, optionally loading a theme, and calling **antigen apply** to activate everything.

Example **.zshrc** configuration:
```
source ~/antigen.zsh
antigen use oh-my-zsh
antigen bundle git
antigen bundle zsh-users/zsh-syntax-highlighting
antigen theme robbyrussell
antigen apply
```

Antigen caches compiled configurations for faster shell startup. After modifying bundle declarations, use **antigen reset** to clear the cache and reload changes.

# CAVEATS

Requires zsh version 4.3.11 or higher. Themes from oh-my-zsh may depend on framework functions, so **antigen use oh-my-zsh** should be called before **antigen theme**. Updates downloaded via **antigen update** require opening a new shell to take effect.

# HISTORY

Antigen was created by **Shrikant Sharat Kandula** around **2012** to bring Vundle-style plugin management to zsh. It became one of the first popular zsh plugin managers and helped popularize modular shell configuration. The project continues to be maintained by the zsh-users community on GitHub.

# SEE ALSO

[oh-my-zsh](/man/oh-my-zsh)(1), [zsh](/man/zsh)(1), [zinit](/man/zinit)(1), [zplug](/man/zplug)(1)
