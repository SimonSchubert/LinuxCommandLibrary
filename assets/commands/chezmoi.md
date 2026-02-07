# TAGLINE

cross-platform dotfile manager with templating

# TLDR

**Initialize** dotfiles

```chezmoi init```

**Add** file to dotfiles

```chezmoi add [~/.bashrc]```

**Apply** changes

```chezmoi apply```

**Edit** dotfile

```chezmoi edit [~/.bashrc]```

**Update** from remote

```chezmoi update```

**Show** differences

```chezmoi diff```

# SYNOPSIS

**chezmoi** _command_ [_options_]

# DESCRIPTION

**chezmoi** manages dotfiles across multiple machines. It uses a source directory (typically a git repository at **~/.local/share/chezmoi**) to store the desired state of dotfiles, then applies that state to the home directory.

The tool supports Go templates for machine-specific configurations, allowing a single source repository to produce different files on different machines based on hostname, OS, or custom data. Secrets can be managed through integrations with password managers like 1Password, Bitwarden, and pass, or via encrypted files using age or gpg.

Unlike symlink-based managers like GNU Stow, chezmoi copies files to their destinations, meaning the target files are ordinary files that work with any tool.

# PARAMETERS

**init** [_repo_]
> Initialize chezmoi

**add** _target_
> Add file to source state

**apply** [_target_]
> Apply changes to destination

**edit** _target_
> Edit source state

**update**
> Pull and apply changes

**diff** [_target_]
> Show differences

**cd**
> Open shell in source directory

**data**
> Show template data

# FEATURES

- Git integration
- Templating (Go templates)
- Machine-specific configurations
- Secret management (encrypted files)
- Cross-platform support
- Automatic initialization
- Dry-run mode
- Script execution

# WORKFLOW

```bash
# Initialize with GitHub repo
chezmoi init https://github.com/username/dotfiles.git

# Add files to manage
chezmoi add ~/.bashrc
chezmoi add ~/.vimrc

# Edit managed file
chezmoi edit ~/.bashrc

# See what would change
chezmoi diff

# Apply changes
chezmoi apply

# Commit and push
chezmoi cd
git add .
git commit -m "Update dotfiles"
git push

# On new machine
chezmoi init --apply https://github.com/username/dotfiles.git
```

# TEMPLATING

Use templates for machine-specific configs:
```
# .chezmoi.toml.tmpl
{{- if eq .chezmoi.hostname "work-laptop" }}
[data]
    email = "work@example.com"
{{- else }}
[data]
    email = "personal@example.com"
{{- end }}
```

# CONFIGURATION

**~/.config/chezmoi/chezmoi.toml**
> Main configuration file. Sets source directory, merge tool, diff settings, encryption method, and secret manager integrations.

# CAVEATS

Learning curve for templates. Git repo public by default (use private for secrets). Template syntax can be complex. Large binary files not ideal. Requires understanding of Go templates.

# HISTORY

**chezmoi** was created by Tom Payne in **2018** to provide a modern, flexible dotfile manager with templating and cross-platform support.

# SEE ALSO

[dotfiles](/man/dotfiles)(1), [git](/man/git)(1), [stow](/man/stow)(1)
