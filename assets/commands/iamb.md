# TAGLINE

Matrix chat client for Vim addicts

# TLDR

**Start iamb**

```iamb```

**Start with a specific profile**

```iamb -P [profile_name]```

# SYNOPSIS

**iamb** [**-P** _profile_] [_options_]

# DESCRIPTION

**iamb** is a terminal-based **Matrix** chat client with **Vim** keybindings. It supports threads, spaces, end-to-end encryption (E2EE), image previews (in terminals supporting sixels, Kitty, or iTerm2 protocols), and full room management including creating, joining, leaving rooms, and handling invitations.

The client provides message editing, redaction, reactions, and room navigation using familiar Vim motions and commands. Custom keybindings and multiple profiles are supported.

# CAVEATS

Requires a Matrix homeserver account. End-to-end encryption key management can be complex. Image preview quality depends on terminal capabilities.

# HISTORY

**iamb** was created by **Ulyssa** and is written in **Rust** using the **matrix-rust-sdk**. It was designed for users who prefer modal editing and want a keyboard-driven Matrix client without leaving the terminal.

# SEE ALSO

[weechat](/man/weechat)(1), [gurk](/man/gurk)(1)
