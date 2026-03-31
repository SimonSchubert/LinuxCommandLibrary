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

**Load PowerShell** scripts from directory

```evil-winrm -i [ip] -u [user] -p [pass] -s [scripts/]```

**Connect with SSL** and custom **port**

```evil-winrm -i [target_ip] -u [user] -p [pass] -S -P [5986]```

**Connect using Kerberos** authentication

```evil-winrm -i [target_ip] -u [user] -p [pass] -r [DOMAIN.LOCAL]```

**Connect with certificate-based** authentication

```evil-winrm -i [target_ip] -c [cert.pem] -k [key.pem] -S```

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

**-S**, **--ssl**
> Enable SSL encrypted connection.

**-c** _PATH_, **--pub-key** _PATH_
> Local path to public key certificate.

**-k** _PATH_, **--priv-key** _PATH_
> Local path to private key certificate.

**-s** _PATH_, **--scripts** _PATH_
> PowerShell scripts local path.

**-e** _PATH_, **--executables** _PATH_
> C# executables local path.

**-P** _PORT_, **--port** _PORT_
> Remote host port (default 5985).

**-U** _URL_, **--url** _URL_
> Remote URL endpoint (default /wsman).

**-r** _DOMAIN_, **--realm** _DOMAIN_
> Kerberos auth realm/domain.

**--spn** _PREFIX_
> SPN prefix for Kerberos auth (default HTTP).

**-l**, **--log**
> Log the WinRM session.

**-n**, **--no-colors**
> Disable colored output.

**-N**, **--no-rpath-completion**
> Disable remote path completion.

**-a** _USERAGENT_, **--user-agent** _USERAGENT_
> Specify connection user-agent (default Microsoft WinRM Client).

**-V**, **--version**
> Show version.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**Evil-WinRM** is a penetration testing shell for Windows Remote Management (WinRM). It provides an interactive PowerShell session with additional features for pentest activities.

The tool supports pass-the-hash authentication, Kerberos authentication, certificate-based authentication, file upload/download, and loading custom PowerShell scripts and C# executables. It is designed for red team operations and authorized security testing.

Built-in commands available within the shell include **upload** and **download** for file transfer, **Invoke-Binary** for executing C# assemblies in memory, and **Dll-Loader** for loading DLLs. The **menu** command lists all available built-in commands.

# CAVEATS

Only use with explicit authorization. WinRM must be enabled on the target (ports 5985 for HTTP, 5986 for HTTPS). May trigger security alerts and endpoint detection. AMSI bypass may be needed for some PowerShell scripts. Kerberos authentication requires proper /etc/krb5.conf configuration.

# HISTORY

Evil-WinRM was created by **Hackplayers** for the security research community, providing a feature-rich alternative to standard WinRM tools for penetration testing.

# SEE ALSO

[winrm](/man/winrm)(1), [impacket](/man/impacket)(1), [sshpass](/man/sshpass)(1)
