# TAGLINE

Print the directory where ps-nvm installs Node.js versions

# TLDR

**Print the install directory** used by ps-nvm

```Get-NodeInstallLocation```

**Change the install directory**, then confirm it

```Set-NodeInstallLocation -Path [C:\nodejs]; Get-NodeInstallLocation```

# SYNOPSIS

**Get-NodeInstallLocation**

# DESCRIPTION

**Get-NodeInstallLocation** is a PowerShell cmdlet from the **ps-nvm** module. It returns the root directory into which **Install-NodeVersion** downloads and unpacks Node.js versions. It takes no parameters.

The value is read from the **InstallPath** entry of the module's **settings.json**. If no setting exists, the default is the **vs** folder inside the ps-nvm module directory. **Set-NodeInstallLocation -Path** _DIR_ changes it to _DIR_**\\.nvm**, which is commonly used on Windows to avoid long-path problems with deep module trees.

# CAVEATS

Part of ps-nvm and only available inside PowerShell (**pwsh** or Windows PowerShell) after importing the module. It reports where versions are stored, not the path of the currently active **node** binary; use **(Get-Command node).Source** or **node -p "process.execPath"** for that.

# SEE ALSO

[ps-nvm](/man/ps-nvm)(1), [get-nodeversions](/man/get-nodeversions)(1), [pwsh](/man/pwsh)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/aaronpowell/ps-nvm)```

```[Documentation](https://github.com/aaronpowell/ps-nvm/blob/master/.docs/reference.md)```

<!-- verified: 2026-11-23 -->
