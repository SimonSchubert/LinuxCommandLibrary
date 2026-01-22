# TLDR

**Brute force SSH**

```hydra -l [user] -P [passwords.txt] ssh://[target]```

**HTTP form brute force**

```hydra -l [admin] -P [pass.txt] [target] http-post-form "/login:user=^USER^&pass=^PASS^:Invalid"```

**FTP brute force**

```hydra -L [users.txt] -P [pass.txt] ftp://[target]```

**Specify threads**

```hydra -t [4] -l [user] -P [pass.txt] [target] [service]```

**Verbose output**

```hydra -v -l [user] -P [pass.txt] [target] ssh```

# SYNOPSIS

**hydra** [_options_] _target_ _service_

# PARAMETERS

_TARGET_
> Target host.

_SERVICE_
> Service to attack (ssh, ftp, http-post-form).

**-l** _LOGIN_
> Single username.

**-L** _FILE_
> Username list.

**-p** _PASS_
> Single password.

**-P** _FILE_
> Password list.

**-t** _NUM_
> Parallel connections.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**Hydra** is a fast network login cracker supporting many protocols. It performs brute force attacks against remote authentication services.

The tool supports SSH, FTP, HTTP, SMB, databases, and many more protocols. It's used for authorized penetration testing and security auditing.

Hydra brute forces network logins.

# CAVEATS

Authorized testing only. May trigger lockouts. Use responsibly.

# HISTORY

Hydra was developed by **THC** (The Hacker's Choice) as a comprehensive network authentication testing tool.

# SEE ALSO

[ncrack](/man/ncrack)(1), [medusa](/man/medusa)(1), [john](/man/john)(1)
