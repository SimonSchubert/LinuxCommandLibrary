# TAGLINE

Cross-platform shell and scripting language

# TLDR

**Start PowerShell**

```pwsh```

**Execute a command**

```pwsh -Command "[Get-Process]"```

**Run a script file**

```pwsh -File [script.ps1]```

**Run without profile**

```pwsh -NoProfile```

**Execute and exit**

```pwsh -Command "[command]" -NoExit```

**Run in non-interactive mode**

```pwsh -NonInteractive -Command "[command]"```

**Output in specific format**

```pwsh -Command "[Get-Process | ConvertTo-Json]"```

**Check version**

```pwsh -Version```

# SYNOPSIS

**pwsh** [_-Command command_] [_-File script_] [_-NoProfile_] [_-NonInteractive_] [_options_]

# PARAMETERS

**-Command**, **-c** _COMMAND_
> Execute specified command string.

**-File**, **-f** _FILE_
> Run script file.

**-NoProfile**, **-nop**
> Don't load profile scripts.

**-NoLogo**, **-nol**
> Hide startup banner.

**-NonInteractive**, **-noni**
> Don't prompt for input.

**-NoExit**, **-noe**
> Don't exit after running command.

**-InputFormat** _FORMAT_
> Input format: Text, XML.

**-OutputFormat** _FORMAT_
> Output format: Text, XML.

**-EncodedCommand** _BASE64_
> Run base64-encoded command.

**-ExecutionPolicy** _POLICY_
> Set execution policy for session.

**-ConfigurationName** _NAME_
> Use specific configuration.

**-WorkingDirectory** _PATH_
> Set initial working directory.

**-Login**, **-l**
> Run as login shell.

**-Version**, **-v**
> Show version.

**-Help**, **-?**
> Show help.

# DESCRIPTION

**PowerShell** (pwsh) is Microsoft's cross-platform shell and scripting language. It uses object-oriented pipelines rather than text streams, making data manipulation more structured.

Commands (cmdlets) follow Verb-Noun naming: Get-Process, Set-Location, Remove-Item. Objects passed through pipelines retain properties and methods, enabling rich querying without text parsing.

PowerShell integrates with .NET, providing access to its entire library. Variables are typed, parameters are named, and error handling uses try/catch/finally constructs.

Profiles (~/.config/powershell/profile.ps1 on Linux) customize the environment. Functions, aliases, and variables defined in profiles persist across sessions.

The language supports advanced features: classes, modules, remoting, jobs (background tasks), and workflows. It's equally capable as an interactive shell and for automation scripting.

# CONFIGURATION

**~/.config/powershell/profile.ps1** (Linux/macOS), **$HOME\Documents\PowerShell\profile.ps1** (Windows)
> User profile script executed on every session start. Defines functions, aliases, variables, and prompt customizations.

**$PROFILE.AllUsersAllHosts**
> System-wide profile for all users, typically in the PowerShell installation directory.

**PSModulePath**
> Environment variable listing directories where PowerShell searches for modules.

# CAVEATS

PowerShell 7+ (pwsh) differs from Windows PowerShell 5.1. Not all Windows modules work on Linux. Case-insensitive by default (unlike bash). Different quoting rules than POSIX shells. .NET dependency adds startup overhead.

# HISTORY

**PowerShell** was created by **Jeffrey Snover** at Microsoft, released in **2006** for Windows. Open-source cross-platform PowerShell Core was released in **2016**, later renamed to PowerShell 7 in **2020**. It brought modern shell capabilities to Windows and extended to Linux/macOS.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [dotnet](/man/dotnet)(1)
