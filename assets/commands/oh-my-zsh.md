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

**Reload configuration**

```source ~/.zshrc```

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

# DESCRIPTION

**Oh My Zsh** is a framework for managing Zsh configuration. It provides themes, plugins, and helper functions to enhance the Zsh shell experience.

Configuration is in ~/.zshrc, with plugins and themes in ~/.oh-my-zsh.

# CONFIGURATION

```bash
# ~/.zshrc
ZSH_THEME="robbyrussell"
plugins=(git docker kubectl node)
source $ZSH/oh-my-zsh.sh
```

# POPULAR PLUGINS

```
git, docker, kubectl
node, npm, python
zsh-autosuggestions
zsh-syntax-highlighting
```

# CAVEATS

Can slow shell startup with many plugins. Requires Zsh as default shell. Custom themes in ~/.oh-my-zsh/custom/themes.

# HISTORY

Oh My Zsh was created by **Robby Russell** in **2009** and has become the most popular Zsh framework with thousands of contributors.

# SEE ALSO

[zsh](/man/zsh)(1), [bash](/man/bash)(1), [starship](/man/starship)(1)
