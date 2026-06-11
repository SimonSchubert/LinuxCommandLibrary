# TAGLINE

Interactive configuration tool for TeX Live

# TLDR

Launch the interactive TeX Live configuration menu

```texconfig```

Show current TeX Live configuration

```texconfig conf```

# SYNOPSIS

**texconfig** [_option_] [_command_]

# DESCRIPTION

**texconfig** provides an interactive curses-based interface (and a non-interactive command-line interface) for configuring a TeX Live installation. It lets you change paper size, default modes, hyphenation patterns, and many other TeX engine and format settings without manually editing `texmf.cnf` or format files.

Common tasks include:

- Switching between A4 and letter paper
- Enabling or disabling certain hyphenation languages
- Rebuilding format files after configuration changes
- Viewing and editing the main TeX Live configuration file

# PARAMETERS

**conf**  
> Print the current configuration (non-interactive)

**paper**  
> Set default paper size (a4 or letter)

**formats**  
> Rebuild format files

**hyphen**  
> Manage hyphenation patterns

Running `texconfig` with no arguments starts the full-screen interactive configurator.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [tex](/man/tex)(1)
