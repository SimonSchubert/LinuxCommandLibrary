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

**pwsh** is PowerShell Core. Cross-platform shell and scripting.

The tool runs on Linux/macOS/Windows. Microsoft's modern shell.

pwsh runs PowerShell.

# CAVEATS

Requires installation. Different from Windows PowerShell.

# HISTORY

PowerShell Core was released by **Microsoft** as cross-platform shell.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [sh](/man/sh)(1)

