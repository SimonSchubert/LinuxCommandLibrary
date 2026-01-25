# TLDR

**Show hidden files in current directory**

```ls -a```

**List only dotfiles**

```ls -d .[!.]*```

**Find all dotfiles recursively**

```find . -name ".*" -type f```

**Copy dotfiles to backup**

```cp ~/.[!.]* [backup_dir/]```

**Sync dotfiles with rsync**

```rsync -av ~/.[!.]* [remote:~/]```

# DESCRIPTION

**Dotfiles** are configuration files in Unix-like systems that begin with a dot (.) and are hidden by default. They store user preferences and settings for various applications and shells.

Common dotfiles include **.bashrc** (Bash configuration), **.vimrc** (Vim settings), **.gitconfig** (Git settings), and **.ssh/** (SSH keys and config). Managing dotfiles typically involves version control and symlink strategies.

# COMMON DOTFILES

```
~/.bashrc          # Bash configuration
~/.bash_profile    # Bash login shell
~/.zshrc           # Zsh configuration
~/.vimrc           # Vim settings
~/.gitconfig       # Git configuration
~/.ssh/config      # SSH settings
~/.tmux.conf       # Tmux configuration
~/.config/         # XDG config directory
```

# MANAGEMENT STRATEGIES

**Git bare repository**: Track dotfiles with git using a bare repo and work tree alias.

**Symlink managers**: Tools like stow, dotbot, or chezmoi create symlinks from a central repository.

**Version control**: Keep dotfiles in a git repository for history and synchronization across machines.

# CAVEATS

Dotfiles may contain sensitive information (API keys, passwords). Be careful when sharing or publishing. Some applications create dotfiles automatically; avoid committing generated files. XDG Base Directory specification encourages using ~/.config/ instead of home directory clutter.

# SEE ALSO

[stow](/man/stow)(1), [dotbot](/man/dotbot)(1), [chezmoi](/man/chezmoi)(1), [git](/man/git)(1)
