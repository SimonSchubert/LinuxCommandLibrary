# TAGLINE

Generate shell completions for rustup

# TLDR

**Generate bash completions**

```rustup completions bash```

**Generate zsh completions**

```rustup completions zsh```

**Generate fish completions**

```rustup completions fish```

**Generate cargo completions**

```rustup completions bash cargo```

# SYNOPSIS

**rustup** **completions** _shell_ [_command_]

# PARAMETERS

**bash**
> Bash completions.

**zsh**
> Zsh completions.

**fish**
> Fish completions.

**powershell**
> PowerShell completions.

**elvish**
> Elvish completions.

**rustup** | **cargo**
> Tool to generate completions for (default rustup).

# DESCRIPTION

**rustup completions** generates shell completion scripts. The script is written to stdout, so redirect it to the location your shell loads completions from.

# SEE ALSO

[rustup](/man/rustup)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/rust-lang/rustup)```

```[Documentation](https://rust-lang.github.io/rustup/)```

<!-- verified: 2026-11-08 -->
