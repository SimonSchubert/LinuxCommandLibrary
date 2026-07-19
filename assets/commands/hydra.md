# TAGLINE

fast network login cracker supporting many protocols

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
> Load several usernames from a file.

**-p** _PASS_
> Single password.

**-P** _FILE_
> Load several passwords from a file.

**-C** _FILE_
> Colon-separated `login:pass` list, instead of **-L**/**-P**.

**-e** _nsr_
> Also try a null password (**n**), the login as password (**s**), and/or the reversed login (**r**).

**-x** _MIN:MAX:CHARSET_
> Generate passwords via brute force instead of a wordlist (e.g. `1:8:a` for lowercase letters, length 1-8).

**-M** _FILE_
> Attack a list of targets read from a file, one per line (`host[:port]`).

**-o** _FILE_
> Write found login/password pairs to a file instead of stdout.

**-b** _FORMAT_
> Output format for **-o**: `text` (default), `json`, or `jsonv1`.

**-f** / **-F**
> Exit as soon as a valid pair is found: per host (**-f**), or globally across all targets (**-F**, requires **-M**).

**-t** _TASKS_
> Parallel connections to run per target (default: 16).

**-T** _TASKS_
> Parallel connections overall when using **-M** (default: 64).

**-s** _PORT_
> Use a non-default port for the service.

**-S**
> Perform the connection over SSL/TLS.

**-4** / **-6**
> Use IPv4 (default) or IPv6 addresses.

**-R**
> Restore a previous aborted or crashed session from `hydra.restore`.

**-v** / **-V**
> Verbose mode / show the login+pass combination being tried for every attempt.

**-h**
> Display help information.

# DESCRIPTION

**Hydra** is a parallelized network login cracker used in authorized penetration testing and security auditing. It systematically attempts username and password combinations against remote authentication services, drawing credentials from user-supplied wordlists, single values, or a brute-force character-set generator (**-x**). Multiple connection threads run in parallel (configurable with **-t**), allowing it to test a large number of combinations efficiently.

Hydra supports over 50 protocols and services out of the box, including SSH, FTP, Telnet, HTTP/HTTPS (basic auth, form-based, and digest), SMB, RDP, MySQL, PostgreSQL, SMTP, IMAP, LDAP, VNC, and many more. For web applications, its `http-post-form` and `http-get-form` modules accept custom request templates with `^USER^`/`^PASS^` placeholder markers for injecting credentials. Results can be saved to a file (**-o**) for later analysis, and interrupted sessions can be resumed with **-R**.

# CAVEATS

For use only against systems you're authorized to test - unauthorized use is illegal in most jurisdictions. Aggressive attacks can trigger account lockouts, IPS/WAF bans, or degrade the target service. `-h` (not `--help`) prints the short option summary; `hydra -U <service>` prints module-specific options.

# HISTORY

Hydra was created in **2000** by **van Hauser** of **THC** (The Hacker's Choice), billed as the first parallelized network login cracker. Development continues on GitHub with contributions from David Maciejak and others.

# SEE ALSO

[ncrack](/man/ncrack)(1), [medusa](/man/medusa)(1), [john](/man/john)(1)

# RESOURCES

```[Source code](https://github.com/vanhauser-thc/thc-hydra)```

<!-- verified: 2026-07-19 -->
