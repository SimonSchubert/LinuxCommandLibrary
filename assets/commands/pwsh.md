# TAGLINE

Cross-platform PowerShell shell

# TLDR

**Start PowerShell**

```pwsh```

**Execute a command**

```pwsh -Command "[Get-Process]"```

**Run a script file**

```pwsh -File [script.ps1]```

**Run without loading the profile**

```pwsh -NoProfile -Command "[command]"```

**Run non-interactively for automation**

```pwsh -NonInteractive -Command "[command]"```

**Run a base64-encoded command**

```pwsh -EncodedCommand [base64_string]```

**Start in a specific working directory**

```pwsh -WorkingDirectory [/path/to/dir]```

**Show version**

```pwsh -Version```

# SYNOPSIS

**pwsh** [_options_] [-File _file_ [_args_]] [-Command { - | _script-block_ | _string_ }]

# PARAMETERS

**-Command** | **-c** _CMD_
> Execute a command string or script block.

**-File** | **-f** _FILE_
> Execute a script file. Must be the last parameter.

**-NonInteractive** | **-noni**
> Disable interactive prompts; useful for automation.

**-NoProfile** | **-nop**
> Don't load the PowerShell profile.

**-NoLogo** | **-nol**
> Hide the banner at startup of interactive sessions.

**-NoExit** | **-noe**
> Don't exit after running startup commands.

**-Login** | **-l**
> Start as a login shell (Linux/macOS only). Must be first parameter.

**-EncodedCommand** | **-e** _BASE64_
> Accept a base64-encoded UTF-16LE command string.

**-ExecutionPolicy** | **-ep** _POLICY_
> Set the execution policy for the session (Windows only).

**-WorkingDirectory** | **-wd** _DIR_
> Set the initial working directory.

**-CommandWithArgs** | **-cwa** _CMD_ [_args_]
> Execute a command with arguments populating $args.

**-ConfigurationFile** _FILE_
> Specify a session configuration (.pssc) file path.

**-OutputFormat** | **-o** {Text | XML}
> Format of output. Default is Text.

**-InputFormat** | **-if** {Text | XML}
> Format of data sent to PowerShell.

**-SettingsFile** _FILE_
> Override the system-wide powershell.config.json for the session.

**-Interactive** | **-i**
> Present an interactive prompt. Inverse of -NonInteractive.

**-Version** | **-v**
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

Requires separate installation on Linux/macOS. Different from Windows PowerShell 5.1 (powershell.exe). All parameters are case-insensitive.

# HISTORY

PowerShell Core was released by **Microsoft** as cross-platform shell.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [sh](/man/sh)(1), [fish](/man/fish)(1)

