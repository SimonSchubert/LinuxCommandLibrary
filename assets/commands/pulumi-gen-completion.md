# TAGLINE

Generate shell completion scripts for Pulumi

# TLDR

**Generate bash completions**

```pulumi gen-completion bash```

**Generate zsh completions**

```pulumi gen-completion zsh```

**Generate fish completions**

```pulumi gen-completion fish```

**Generate PowerShell completions**

```pulumi gen-completion powershell```

**Install bash completions**

```pulumi gen-completion bash > /etc/bash_completion.d/pulumi```

**Install zsh completions** to fpath directory

```pulumi gen-completion zsh > "${fpath[1]}/_pulumi"```

# SYNOPSIS

**pulumi** **gen-completion** _shell_

# PARAMETERS

**bash**
> Generate bash completions.

**zsh**
> Generate zsh completions.

**fish**
> Generate fish completions.

**powershell**
> Generate PowerShell completions.

# DESCRIPTION

**pulumi gen-completion** generates shell completion scripts for Pulumi commands. Outputs completion code to stdout for installation in shell configuration.

# SEE ALSO

[pulumi](/man/pulumi)(1)

