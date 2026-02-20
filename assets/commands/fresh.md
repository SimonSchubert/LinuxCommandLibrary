# TAGLINE

Dotfiles manager that sources shell configuration from multiple repos

# TLDR

**Build shell configuration** and symlinks from freshrc

```fresh```

**Update all sources** from remote repositories and rebuild

```fresh update```

**Update only local dotfiles** repository

```fresh update --local```

**Update a specific GitHub user's** repositories

```fresh update [username]```

**Search the fresh directory** for configuration examples

```fresh search [keyword]```

**Edit your freshrc** configuration file

```fresh edit```

**Remove dead symlinks** and unused source repos

```fresh clean```

**Show source references** for freshrc lines

```fresh show```

# SYNOPSIS

**fresh** [_command_] [_options_]

# PARAMETERS

**install**
> Build shell configuration and create symlinks. This is the default when no command is given.

**update** [_filter_]
> Fetch latest changes from source repositories and rebuild. Optionally filter by **--local**, a GitHub _username_, or _username/repo_.

**clean**
> Remove dead symlinks and unused source repositories.

**search** _keyword_
> Query the fresh directory wiki for configuration examples matching _keyword_.

**edit**
> Open **~/.freshrc** in your default **$EDITOR**.

**show**
> Display freshrc lines with their matching source files.

**help**
> Show usage documentation.

# DESCRIPTION

**fresh** is a dotfiles manager that works like Bundler for your shell configuration. It aggregates aliases, functions, completions, and configuration files from your own dotfiles and from other users' GitHub repositories into a single built shell script and a set of symlinks.

Configuration is defined in **~/.freshrc** using a simple DSL. Each line specifies a source file to include, optionally from a GitHub repository. When **fresh** runs, it concatenates all shell sources into **~/.fresh/build/shell.sh** and creates symlinks for non-shell config files. You source the built file from your shell rc to activate everything.

Fresh supports three types of sourced content: **shell files** (concatenated into the build script), **config files** (symlinked via **--file**), and **bin files** (made executable via **--bin**).

# FRESHRC OPTIONS

**--file**[**=**_path_]
> Link or build a configuration file. With a path like **--file=~/.vimrc**, the file is symlinked to that location. Without a path, files are concatenated into **~/.fresh/build/** using their original name.

**--bin**[**=**_path_]
> Create an executable symlink in **~/bin/** (or a custom path). The source file is made executable automatically.

**--ref=**_ref_
> Lock a source to a specific git branch, tag, or commit hash.

**--filter=**_command_
> Pipe the source file through a shell command before including it (e.g. **--filter="gpg -d"**).

**--marker=**_string_
> Add comment markers around sourced content for identification in built files.

**--ignore-missing**
> Suppress errors when a source file is not available.

# CONFIGURATION

Fresh uses **~/.freshrc** as its configuration file. Sources are specified as:

```
# Local file from ~/.dotfiles/
fresh aliases.sh

# File from a GitHub repository
fresh jasoncodes/dotfiles shell/aliases/git.sh

# Non-GitHub git URL
fresh git://example.com/repo.git file.conf --file=~/.config/app.conf

# Executable script
fresh freshshell/fresh contrib/completion/fresh-completion.bash --bin
```

Use **fresh-options** blocks to apply consistent flags to multiple lines:

```
fresh-options --file=~/.vimrc --marker='"'
  fresh vim/mappings.vim
  fresh vim/plugins.vim
fresh-options
```

Environment variables for customization:

**FRESH_RCFILE** — configuration file path (default: **~/.freshrc**)
**FRESH_PATH** — installation directory (default: **~/.fresh**)
**FRESH_LOCAL** — local dotfiles repository (default: **~/.dotfiles**)
**FRESH_BIN_PATH** — binary installation directory (default: **~/bin**)
**FRESH_NO_LOCAL_CHECK** — disable local sourcing warnings
**FRESH_NO_PATH_EXPORT** — skip automatic PATH modification
**FRESH_NO_BIN_CONFLICT_CHECK** — suppress multi-source binary warnings

# CAVEATS

Fresh requires **git** and **bash** to be installed. All shell sources are concatenated into a single file, so naming conflicts between sourced functions or aliases from different repositories must be managed manually. The built shell script must be explicitly sourced from your **.bashrc** or **.zshrc** — fresh does not modify these files automatically.

# HISTORY

**fresh** was created by **Jason Weathered** (jasoncodes) and **Scott Barron** (twe4ked) as an open-source shell tool released under the **MIT license**. It was inspired by the concept of Bundler for Ruby, applying the same dependency-sourcing philosophy to dotfiles management across the shell ecosystem.

# SEE ALSO

[git](/man/git)(1), [bash](/man/bash)(1), [stow](/man/stow)(8), [dotbot](/man/dotbot)(1)
