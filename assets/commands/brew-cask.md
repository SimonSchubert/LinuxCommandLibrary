# TAGLINE

Install and manage macOS GUI applications via Homebrew

# TLDR

**Install an application**

```brew install --cask [firefox]```

**List installed casks**

```brew list --cask```

**Search for a cask**

```brew search --cask [application-name]```

**Get information** about a cask

```brew info --cask [firefox]```

**Upgrade a cask**

```brew upgrade --cask [firefox]```

**Upgrade all casks** including self-updating apps

```brew upgrade --cask --greedy```

**Uninstall a cask**

```brew uninstall --cask [firefox]```

**Uninstall and remove** all associated files

```brew uninstall --cask --zap [firefox]```

**Take over an app** that was installed manually

```brew install --cask --adopt [firefox]```

**Install to custom directory**

```brew install --cask --appdir=[~/Applications] [firefox]```

# SYNOPSIS

**brew** _command_ **--cask** [_options_] _cask_ [...]

# DESCRIPTION

The **--cask** switch (formerly the separate **brew cask** command) makes Homebrew manage macOS applications distributed as binary packages (.dmg, .pkg, .zip, .app), as well as fonts, plugins and other artifacts. It automates downloading, installing to /Applications, and removing GUI applications. Cask definitions live in the **homebrew/cask** tap and are fetched from the Homebrew JSON API by default.

Cask extends Homebrew's command-line workflow to desktop applications like browsers, editors, and utilities that would normally require manual drag-and-drop installation.

# COMMANDS

**install --cask**
> Install a cask application

**uninstall --cask**
> Remove a cask application

**upgrade --cask**
> Upgrade installed casks

**list --cask**
> List installed casks

**info --cask**
> Show information about a cask

**search --cask**
> Search available casks

**outdated --cask**
> List casks with available updates

# PARAMETERS

**--appdir** _path_
> Install applications to specified directory (default: /Applications)

**--fontdir** _path_
> Install fonts to specified directory

**-g**, **--greedy**
> Include casks with **auto_updates true** or **version :latest** in upgrade and outdated

**--greedy-latest**
> Only additionally include casks with **version :latest**

**--greedy-auto-updates**
> Only additionally include casks with **auto_updates true**

**--adopt**
> Adopt existing identical artifacts in the destination instead of failing

**--zap**
> With uninstall or reinstall: remove all files associated with the cask (including preferences and caches)

**-f**, **--force**
> Install or uninstall even if already installed or not installed, overwriting existing files

**--skip-cask-deps**
> Skip installing cask dependencies

# CAVEATS

Many applications auto-update and are excluded from **brew upgrade** by default; use **--greedy** to include them. The **--zap** option may remove files shared with other applications. Some casks require administrator privileges for installation. Default options can be set via **HOMEBREW_CASK_OPTS** (e.g. **--appdir=~/Applications**). The former **--no-quarantine** option is no longer available in current Homebrew.

# HISTORY

Homebrew Cask was created as a separate project in **2012** by **Paul Hinze** (phinze) to extend Homebrew to macOS GUI applications. Its code was later merged into Homebrew itself, and Homebrew **2.6.0** (December 2020) deprecated the **brew cask** subcommands in favour of **brew** _command_ **--cask**, e.g. **brew install --cask** instead of **brew cask install**.

# SEE ALSO

[brew](/man/brew)(1), [brew-bundle](/man/brew-bundle)(1)

# RESOURCES

```[Source code](https://github.com/Homebrew/homebrew-cask)```

```[Homepage](https://formulae.brew.sh/cask/)```

```[Documentation](https://docs.brew.sh/Manpage)```

<!-- verified: 2026-11-23 -->
