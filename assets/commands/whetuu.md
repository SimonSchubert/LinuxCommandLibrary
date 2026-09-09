# TAGLINE

Zero-config status line and history picker for fish, bash, and zsh

# TLDR

**Initialize for fish**

```whetuu init fish | source```

**Initialize for bash** (bash 5 or newer)

```eval "$(whetuu init bash)"```

**Initialize for zsh**

```eval "$(whetuu init zsh)"```

Print the **version**

```whetuu --version```

Open the **history picker**

```whetuu history```

Show where the **history store and caches** live

```whetuu paths```

**Upgrade** to the newest release and print the changelog

```whetuu upgrade```

Check for a newer release **without installing**

```whetuu upgrade --check```

# SYNOPSIS

**whetuu** [_init_ _shell_ | _render_ | _history_ | _paths_ | _upgrade_] [_options_]

# PARAMETERS

**init** _shell_
> Print the integration script for **fish**, **bash**, or **zsh**. Meant to be sourced or eval'd. Run straight into a terminal and it prints the setup line instead.

**render**
> Render one status line. Called by the shell hook, not by you. The hook passes exit status, duration, and terminal width.

**history**
> Open the interactive history picker (also bound to the up arrow by the integrations).

**history add --** _command_
> Record a finished command. Called by the shell hook.

**paths**
> Print the history store and version-cache locations, and whether each file exists yet.

**upgrade**
> Replace the running binary with the newest GitHub release after checking **SHA256SUMS**. Prints changelog entries between the two versions.

**upgrade --check**
> Name the waiting release and print its changelog. Writes the tag so the status line can show an update glyph. Installs nothing. whetuu runs this for itself at most once a day.

**--version**
> Print the version.

With no arguments, print the command list.

# DESCRIPTION

**whetuu** (Māori *whetū*, "star"; pronounced feh-TOO) is a single Zig binary that draws a curated status line and puts command history on the up arrow. There is nothing to configure: one binary, one status line, the same for everyone.

The status line shows, left to right and only when relevant: **user@host** over SSH or as root, the current directory, git branch and operation state, git status, a language/toolchain logo and version (39 languages and tools), last-command duration when it ran 2 s or more, a cloud glyph when a newer release is known, and a star prompt character that turns red after a failed command.

The history picker is whetuu's own store, not your shell's. Failed commands are never stored. A leading space keeps a command out of the store. The up arrow opens on this directory's history (**Ctrl+G** switches to all history). **Enter** runs the selection, **Tab** drops it on the command line to edit, **Esc** cancels. Your **~/.bash_history**, **~/.zsh_history**, and fish history are never read or rewritten.

Needs a Nerd Font for the git, language, and star glyphs.

# CONFIGURATION

whetuu has **no config file**. Data locations follow the XDG spec:

**~/.local/share/whetuu/history**
> History store (**0600**), or under **$XDG_DATA_HOME**. Shared by fish, bash, and zsh. Commands are stored in plaintext with the directory they ran in.

**~/.cache/whetuu/versions**, **~/.cache/whetuu/release**
> Toolchain version cache and newest-release tag, or under **$XDG_CACHE_HOME**. Safe to delete.

**WHETUU_NO_MODIFY=1**
> Installer prints the shell-config lines instead of writing them.

**WHETUU_INSTALL_DIR**
> Installer puts the binary somewhere other than **~/.local/bin**, and then leaves the shell config alone.

# CAVEATS

Requires a Nerd Font; missing glyphs render as empty boxes. Bash command timing needs bash 5 or newer. The up arrow is rebound to the picker in all three shells; **Ctrl+R** and the rest of the shell's history keep working. On bash, **ignorespace** is added to **HISTCONTROL**. History is plaintext — prefix secrets with a space, or keep them in the environment. Entering an untrusted repository can make whetuu run the detected toolchain's **--version** from **PATH** (never a binary from the repo). **whetuu upgrade** will not overwrite a binary you cannot write (package-manager installs) or a source build that reports **dev**.

# HISTORY

**whetuu** is a Zig status line and history picker by **yamafaktory**, first published as a public GitHub project in **2026**. The ASCII name doubles the **u** to write the long Māori vowel in *whetū*.

# SEE ALSO

[starship](/man/starship)(1), [oh-my-posh](/man/oh-my-posh)(1), [atuin](/man/atuin)(1), [mcfly](/man/mcfly)(1), [fzf](/man/fzf)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1)

# RESOURCES

```[Source code](https://github.com/yamafaktory/whetuu)```

```[Homepage](https://yamafaktory.github.io/whetuu/)```

<!-- verified: 2026-09-09 -->
