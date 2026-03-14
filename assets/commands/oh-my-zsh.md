# TAGLINE

framework for managing Zsh configuration

# TLDR

**Install Oh My Zsh**

```sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"```

**Update Oh My Zsh**

```omz update```

**Change theme**

```omz theme set [robbyrussell]```

**List installed plugins**

```omz plugin list```

**Enable plugin**

```omz plugin enable [git]```

**Disable a plugin**

```omz plugin disable [git]```

**List available themes**

```omz theme list```

**Reload Oh My Zsh configuration**

```omz reload```

# SYNOPSIS

**omz** _command_ [_args_]

# PARAMETERS

**update**
> Update Oh My Zsh.

**theme set** _name_
> Set theme.

**theme list**
> List themes.

**plugin enable** _name_
> Enable plugin.

**plugin disable** _name_
> Disable plugin.

**plugin list**
> List plugins.

**plugin info** _name_
> Show information about a plugin.

**reload**
> Reload Oh My Zsh configuration.

**changelog**
> Show the changelog.

**version**
> Show the current version.

**doctor**
> Diagnose common issues.

# DESCRIPTION

**Oh My Zsh** is a framework for managing Zsh configuration. It provides themes, plugins, and helper functions to enhance the Zsh shell experience.

Configuration is in ~/.zshrc, with plugins and themes in ~/.oh-my-zsh.

# CONFIGURATION

```bash
# ~/.zshrc
ZSH_THEME="robbyrussell"
plugins=(git docker kubectl node)
ZSH_CUSTOM="$ZSH/custom"
HIST_STAMPS="yyyy-mm-dd"
COMPLETION_WAITING_DOTS="true"
source $ZSH/oh-my-zsh.sh
```

# CAVEATS

Can slow shell startup with many plugins. Requires Zsh as default shell. Custom themes in ~/.oh-my-zsh/custom/themes.

# HISTORY

Oh My Zsh was created by **Robby Russell** in **2009** and has become the most popular Zsh framework with thousands of contributors.

# SEE ALSO

[zsh](/man/zsh)(1), [bash](/man/bash)(1), [p10k](/man/p10k)(1), [starship](/man/starship)(1), [antigen](/man/antigen)(1), [zinit](/man/zinit)(1), [fish](/man/fish)(1)
