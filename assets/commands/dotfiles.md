# TAGLINE

hidden configuration files in Unix systems

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

Dotfiles often hold secrets: API tokens in `~/.netrc` or `~/.aws/credentials`, private keys in `~/.ssh/`, and shell history in `~/.bash_history`. Check carefully before pushing a dotfiles repository to a public host, and prefer keeping secrets outside the repository entirely rather than trying to scrub them later, since git history keeps what you removed.

Hiding is purely a display convention enforced by `ls` and file managers, not a permission: anything that can read your home directory can read them. Many programs also generate dotfiles and dot-directories automatically, including caches and state that should never be version controlled. The **XDG Base Directory** specification exists to curb the clutter by moving configuration to `~/.config/`, cached data to `~/.cache/`, and state to `~/.local/state/`, but adoption is uneven and a typical home directory still mixes both conventions.

# HISTORY

Hidden dotfiles are a famous accident. Early Unix directories contained the entries `.` and `..`, and to keep them out of listings someone added a test to `ls` that skipped any name beginning with a dot, rather than the two-line check that would have skipped exactly those two entries. The side effect, that *any* file starting with `.` disappears from listings, was never designed; it was simply noticed and then used. **Rob Pike** has recounted this as a cautionary tale, arguing that a shortcut in one program grew into a convention that every subsequent program had to know about and that today litters home directories with hundreds of entries.

Treating dotfiles as a version-controlled, portable artifact came much later, alongside the spread of Git and of engineers working across many machines. The **bare repository** trick, where `~` itself is the work tree, and symlink managers such as **GNU Stow**, **dotbot**, **chezmoi**, and **yadm** are all responses to the same problem: configuration that took years to accumulate and takes minutes to lose.

# INSTALL

```nix: nix profile install nixpkgs#dotfiles```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[stow](/man/stow)(1), [dotbot](/man/dotbot)(1), [chezmoi](/man/chezmoi)(1), [yadm](/man/yadm)(1), [ls](/man/ls)(1), [git](/man/git)(1)
