# TAGLINE

Initialize Starship prompt for shells

# TLDR

**Initialize for bash**

```eval "$(starship init bash)"```

**Initialize for zsh**

```eval "$(starship init zsh)"```

**Initialize for fish**

```starship init fish | source```

**Initialize for PowerShell**

```Invoke-Expression (&starship init powershell)```

# SYNOPSIS

**starship** **init** _shell_

# PARAMETERS

**bash**
> Bash shell.

**zsh**
> Zsh shell.

**fish**
> Fish shell.

**powershell**
> PowerShell.

**--print-full-init**
> Print full initialization script.

# DESCRIPTION

**starship init** generates shell initialization for Starship prompt. Outputs script to be evaluated by shell. Add to shell config for persistent prompt customization.

# SEE ALSO

[starship](/man/starship)(1)

