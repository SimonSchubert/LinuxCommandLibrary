# TAGLINE

Cross-platform PowerShell shell

# TLDR

**Start PowerShell**

```pwsh```

**Execute command**

```pwsh -Command "[Get-Process]"```

**Run script**

```pwsh -File [script.ps1]```

**Non-interactive mode**

```pwsh -NonInteractive -Command "[command]"```

**Specific version**

```pwsh -Version```

# SYNOPSIS

**pwsh** [_options_] [_file_]

# PARAMETERS

_FILE_
> Script file to execute.

**-Command** _CMD_
> Execute command.

**-File** _FILE_
> Execute script file.

**-NonInteractive**
> No interactive prompt.

**-NoProfile**
> Don't load profile.

**-Version**
> Show version.

# DESCRIPTION

**pwsh** is the executable for PowerShell, Microsoft's cross-platform shell and scripting language that runs on Linux, macOS, and Windows. It provides an object-oriented pipeline where commands output structured .NET objects rather than plain text, enabling rich data manipulation without parsing.

PowerShell includes a comprehensive set of cmdlets for system administration, file management, and process control. Scripts use the **.ps1** extension and support advanced features like modules, remoting, and error handling. The **-Command** flag executes inline commands while **-File** runs script files, and **-NonInteractive** mode is useful for automation and CI/CD pipelines.

# CONFIGURATION

**~/.config/powershell/profile.ps1**
> User profile script executed on startup, used to define aliases, functions, and environment customizations.

**~/.config/powershell/Microsoft.PowerShell_profile.ps1**
> Host-specific profile loaded only in the default PowerShell host.

**$PROFILE**
> Built-in variable pointing to the current user's profile path for the active host.

# CAVEATS

Requires installation. Different from Windows PowerShell.

# HISTORY

PowerShell Core was released by **Microsoft** as cross-platform shell.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [sh](/man/sh)(1)

