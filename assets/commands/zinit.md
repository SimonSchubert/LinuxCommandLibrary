# TAGLINE

Fast Zsh plugin manager with Turbo mode

# TLDR

**Load a plugin** from GitHub

```zinit light [username/repository]```

**Load a plugin with reporting** (slower but provides info)

```zinit load [username/repository]```

**Install and load Oh-My-Zsh plugin**

```zinit snippet OMZ::plugins/[plugin]/[plugin].plugin.zsh```

**Load with Turbo mode** (async, delayed loading)

```zinit ice wait lucid; zinit light [username/repository]```

**Load a completion** from a repository

```zinit ice as"completion"; zinit snippet [url]```

**Update all plugins**

```zinit update --all```

**Update a specific plugin**

```zinit update [username/repository]```

**List installed plugins**

```zinit list```

# SYNOPSIS

**zinit** [_light_|_load_|_snippet_|_ice_|_update_|_delete_|_list_|_self-update_|_compile_|_uncompile_|_report_] [_arguments_]

# PARAMETERS

**light** _plugin_
> Load a plugin in light mode without tracking/reporting (fast).

**load** _plugin_
> Load a plugin with full tracking and reporting.

**snippet** _url_
> Load a single file or snippet from a URL or Oh-My-Zsh/Prezto.

**ice** _modifiers..._
> Set modifiers for the next zinit command (compile, wait, pick, etc.).

**update** [_plugin_|_--all_]
> Update specified plugin or all plugins.

**delete** _plugin_
> Remove a plugin.

**list**
> List all loaded plugins.

**loaded**
> Show currently loaded plugins.

**self-update**
> Update zinit itself.

**compile** _plugin_
> Compile plugin scripts for faster loading.

**uncompile** _plugin_
> Remove compiled files.

**report** _plugin_
> Show report for a loaded plugin.

**times**
> Show loading times for plugins.

# ICE MODIFIERS

**wait**
> Turbo mode: delay loading (can specify time like wait"1").

**lucid**
> Skip "Loaded plugin" message.

**as"program"**
> Add plugin directory to PATH.

**as"completion"**
> Load as completion script.

**pick"file"**
> Select specific file to source.

**from"gitlab"**
> Clone from GitLab instead of GitHub.

**depth"1"**
> Shallow clone with depth 1.

**atload"command"**
> Run command after loading.

**atinit"command"**
> Run command before loading.

# DESCRIPTION

**Zinit** (formerly Zplugin) is a flexible and fast Zsh plugin manager that supports Oh-My-Zsh and Prezto plugins, Turbo mode for deferred loading, and multiple installation methods. It compiles plugins to bytecode for faster shell startup times.

The key feature is Turbo mode, which loads plugins asynchronously after Zsh starts, dramatically reducing shell initialization time. Ice modifiers provide fine-grained control over how plugins are downloaded, compiled, and sourced.

Zinit supports loading from GitHub, GitLab, Bitbucket, or arbitrary URLs. It can handle plugins, completions, scripts, and binary programs. The **light** command provides fast loading without tracking, while **load** enables full reporting capabilities.

Configuration is typically placed in **.zshrc** after sourcing zinit. Plugins are stored in **~/.zinit/plugins/** by default, with compiled versions cached for performance.

# CAVEATS

Requires Zsh 5.1 or later. Turbo mode may cause race conditions with plugins that depend on each other. Some Oh-My-Zsh plugins require specific OMZ infrastructure to work correctly. Heavy use of ice modifiers can make configuration complex and hard to debug.

# HISTORY

Zinit was created by Sebastian Gniazdowski, originally released as **Zplugin** in **2016**. It was renamed to Zinit in 2019 to avoid confusion with other tools. The project pioneered Turbo mode for asynchronous plugin loading in Zsh. The original repository was archived in 2021, and community forks continue maintenance under **zdharma-continuum/zinit**.

# SEE ALSO

[zsh](/man/zsh)(1), [oh-my-zsh](/man/oh-my-zsh)(1), [antibody](/man/antibody)(1), [zplug](/man/zplug)(1), [antigen](/man/antigen)(1)
