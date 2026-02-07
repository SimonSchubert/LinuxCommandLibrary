# TAGLINE

penetration testing shell for WinRM

# TLDR

**Connect to target**

```evil-winrm -i [target_ip] -u [username] -p [password]```

**Connect with hash**

```evil-winrm -i [target_ip] -u [username] -H [NTLM_hash]```

**Use SSL**

```evil-winrm -i [target_ip] -u [user] -p [pass] -S```

**Upload file**

```upload [local_file] [remote_path]```

**Download file**

```download [remote_file] [local_path]```

**Load PowerShell** script

```evil-winrm -i [ip] -u [user] -p [pass] -s [scripts/]```

# SYNOPSIS

**evil-winrm** [_options_]

# PARAMETERS

**-i** _IP_
> Target IP address.

**-u** _USER_
> Username.

**-p** _PASSWORD_
> Password.

**-H** _HASH_
> NTLM hash for pass-the-hash.

**-S**
> Use SSL.

**-s** _PATH_
> PowerShell scripts directory.

**-e** _PATH_
> Executables directory.

**-P** _PORT_
> Custom port.

**--help**
> Display help information.

# DESCRIPTION

**Evil-WinRM** is a penetration testing shell for Windows Remote Management (WinRM). It provides an interactive PowerShell session with additional features for pentest activities.

The tool supports pass-the-hash authentication, file upload/download, and loading custom PowerShell scripts. It's designed for red team operations and authorized security testing.

Evil-WinRM provides better functionality than basic WinRM clients for security assessment workflows.

# CAVEATS

Only use with authorization. WinRM must be enabled on target. May trigger security alerts. AMSI bypass needed for some scripts.

# HISTORY

Evil-WinRM was created by **Hackplayers** for the security research community, providing a feature-rich alternative to standard WinRM tools for penetration testing.

# SEE ALSO

[winrm](/man/winrm)(1), [psexec](/man/psexec)(1), [impacket](/man/impacket)(1)
