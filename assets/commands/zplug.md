# TLDR

**Load a plugin from GitHub**

```zplug "[user/repo]"```

**Load Oh My Zsh plugin**

```zplug "plugins/[git]", from:oh-my-zsh```

**Load with specific command**

```zplug "[user/repo]", as:command```

**Load theme**

```zplug "[user/repo]", as:theme```

**Install plugins**

```zplug install```

**Update all plugins**

```zplug update```

**Load all plugins**

```zplug load```

# SYNOPSIS

**zplug** "_repo_" [, _tag_:_value_...]

**zplug** _command_

# TAGS

**from:**_source_
> Plugin source (github, oh-my-zsh, local, etc.)

**as:**_type_
> Type: plugin, command, or theme

**use:**_pattern_
> Glob pattern for files to source

**at:**_branch/tag_
> Branch, tag, or commit to use

**rename-to:**_name_
> Rename command

**frozen:**_bool_
> Don't update this plugin

**defer:**_level_
> Defer loading (0-3, higher loads later)

**if:**_condition_
> Conditional loading

**hook-build:**_command_
> Command to run after install

# SUBCOMMANDS

**install**
> Install plugins not yet installed

**update**
> Update all plugins

**load**
> Source plugins

**list**
> List installed plugins

**clean**
> Remove unused plugins

**status**
> Check plugin update status

**check**
> Check if plugin is installed

# DESCRIPTION

**zplug** is a next-generation Zsh plugin manager featuring parallel installation, lazy loading, and dependency management. It supports loading from GitHub, Oh My Zsh, Prezto, local files, and gists.

A typical .zshrc setup:
```
source ~/.zplug/init.zsh
zplug "zsh-users/zsh-autosuggestions"
zplug "zsh-users/zsh-syntax-highlighting", defer:2
if ! zplug check; then zplug install; fi
zplug load
```

zplug can manage not just Zsh plugins but also commands and binaries, installing them to a managed directory.

# CAVEATS

zplug development has slowed. Consider **zinit** or **sheldon** for actively maintained alternatives.

First run may be slow while plugins install. Subsequent loads are fast.

Complex configurations with many deferred plugins can make debugging difficult.

# SEE ALSO

[zsh](/man/zsh)(1), [zgen](/man/zgen)(1), [antigen](/man/antigen)(1), [zinit](/man/zinit)(1)
