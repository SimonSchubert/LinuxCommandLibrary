# TAGLINE

per-directory environment variable manager

# TLDR

**Enable direnv** in your shell (add to shell config)

```eval "$(direnv hook bash)"```

**Create a new .envrc file**

```direnv edit .```

**Allow the current directory's .envrc**

```direnv allow```

**Deny/revoke an .envrc**

```direnv deny```

**Reload the current environment**

```direnv reload```

**Export current environment** as shell commands

```direnv export bash```

**Show environment diff** when changing directories

```direnv status```

**Print the current .envrc** being used

```direnv show```

# SYNOPSIS

**direnv** [_command_] [_arguments_]

# PARAMETERS

**allow** [_path_]
> Approve an .envrc file to be loaded. Security measure to prevent executing arbitrary code.

**deny** [_path_]
> Revoke approval for an .envrc file.

**edit** [_path_]
> Open .envrc in $EDITOR and allow it after editing.

**reload**
> Manually reload the current directory's environment.

**status**
> Show direnv's current status and active .envrc.

**export** _shell_
> Export the current environment for the specified shell (bash, zsh, fish, etc.).

**hook** _shell_
> Print the shell hook code to enable direnv.

**show**
> Display the currently loaded .envrc file.

**version**
> Print direnv version.

**prune**
> Remove old allowed file entries.

**fetchurl** _url_ [_integrity_]
> Fetch a URL with caching and optional integrity check.

**stdlib**
> Print the stdlib functions available in .envrc.

# CONFIGURATION

**.envrc**
> Per-directory environment configuration script loaded when entering the directory.

**~/.config/direnv/direnv.toml**
> Global direnv configuration for whitelist and settings.

**~/.config/direnv/direnvrc**
> Global shared functions and settings available to all .envrc files.

# DESCRIPTION

**direnv** is an environment switcher that loads and unloads environment variables based on the current directory. When you enter a directory containing an **.envrc** file, direnv automatically exports its variables into your shell. When you leave, it unloads them.

The .envrc file is a bash script that typically sets environment variables using **export**. Direnv provides a standard library of functions for common tasks like setting PATH, loading .env files, using nix-shell, or activating Python virtual environments.

For security, .envrc files must be explicitly allowed before they're executed. This prevents malicious code from running when entering untrusted directories. The **allow** command whitelists a file based on its content hash; any change requires re-approval.

Integration requires adding a shell hook to your configuration (e.g., **~/.bashrc**). The hook modifies the prompt to show when direnv is active and handles automatic loading/unloading. Direnv supports bash, zsh, fish, tcsh, elvish, and other shells.

Common use cases include project-specific environment variables, automatic virtual environment activation, and development environment configuration.

# CAVEATS

Shell hook must be added to config for automatic operation. .envrc files must be explicitly allowed (security feature). Changes to .envrc require re-allowing. Some shell features may not work identically in .envrc. Large environments may cause slight delay when changing directories.

# HISTORY

**direnv** was created by Jonas Pfenniger (zimbatm) around **2013** to solve the problem of managing per-project environment configurations. It was inspired by the need to switch between different development environments without manually sourcing files. The tool has become popular in the DevOps and development communities, especially with nix integration.

# SEE ALSO

[source](/man/source)(1), [env](/man/env)(1), [export](/man/export)(1), [nix-shell](/man/nix-shell)(1), [virtualenv](/man/virtualenv)(1)
