# TAGLINE

Git-based dotfiles manager

# TLDR

**Initialize a new dotfiles repository**

```yadm init```

**Clone an existing dotfiles repository**

```yadm clone [https://github.com/user/dotfiles.git]```

**Add a file** to be tracked

```yadm add [~/.bashrc]```

**Commit changes**

```yadm commit -m "[message]"```

**Push to remote**

```yadm push```

**Pull updates** from remote

```yadm pull```

**List managed files**

```yadm list -a```

**Encrypt sensitive files**

```yadm encrypt```

**Decrypt files**

```yadm decrypt```

# SYNOPSIS

**yadm** _command_ [_options_]

# COMMANDS

**init**
> Initialize a new dotfiles repository

**clone** _url_
> Clone a remote dotfiles repository

**add** _file_...
> Add files to the repository

**commit**
> Record changes to the repository

**push**
> Upload changes to remote repository

**pull**
> Download changes from remote repository

**list** [**-a**]
> List managed files (-a for all)

**encrypt**
> Encrypt files matching patterns in ~/.config/yadm/encrypt

**decrypt**
> Decrypt files from the encrypted archive

**alt**
> Create symbolic links and process templates for alternate files

**enter**
> Run a sub-shell with Git variables set

**config**
> Manage yadm configuration (works like git config)

**bootstrap**
> Run the bootstrap script if it exists

# DESCRIPTION

**yadm** (Yet Another Dotfiles Manager) manages dotfiles using Git while keeping them in their natural locations in **$HOME**. Any Git command works with yadm, making it easy to learn for Git users.

The repository is stored in **~/.local/share/yadm/repo.git** with **$HOME** as the working tree. Files stay in place; yadm tracks them without requiring symlinks or copying.

Key features include **alternate files** (system-specific configurations based on hostname, OS, or user), **templates** using Jinja2 or envtpl for dynamic configuration, and **encryption** for sensitive data using GPG, OpenSSL, transcrypt, or git-crypt.

The **bootstrap** command runs **~/.config/yadm/bootstrap** after cloning, enabling automated setup of new machines.

# CAVEATS

yadm requires Git; encryption features require GPG or another supported tool. The working tree is $HOME by default, so be careful with destructive Git operations. Alternate files and templates may need manual **yadm alt** after changes.

# HISTORY

**yadm** was created by **Tim Byrne** as a simple dotfiles manager that leverages Git directly without complex abstractions. First released around **2015**, it gained popularity for its philosophy that managing dotfiles should be as simple as using Git, while adding features like encryption and system-specific alternates.

# SEE ALSO

[git](/man/git)(1), [stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1), [dotbot](/man/dotbot)(1)
