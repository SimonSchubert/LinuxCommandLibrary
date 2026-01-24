# TLDR

**Brute-force FTP login**

```patator ftp_login host=[target] user=FILE0 password=FILE1 0=[users.txt] 1=[passwords.txt]```

**Brute-force SSH login**

```patator ssh_login host=[target] user=[admin] password=FILE0 0=[passwords.txt]```

**HTTP form brute-force**

```patator http_fuzz url=[http://target/login] method=POST body='user=admin&pass=FILE0' 0=[passwords.txt]```

**Brute-force MySQL**

```patator mysql_login host=[target] user=[root] password=FILE0 0=[passwords.txt]```

**Show available modules**

```patator```

**Set concurrency level**

```patator [module] ... -t [10]```

# SYNOPSIS

**patator** _module_ [_options_] _host=target_ _param=value_...

# PARAMETERS

**-t** _N_
> Number of threads.

**-x** _ACTION:CONDITION_
> Actions on conditions.

**-l** _DIR_
> Log directory.

**--timeout** _SECS_
> Connection timeout.

**--retries** _N_
> Retry count.

**FILE0**, **FILE1**, etc.
> File placeholders.

**0=**, **1=**, etc.
> File assignments.

**RANGE0**
> Numeric range.

**COMBO00**
> Combo file.

# MODULES

**ssh_login** - SSH authentication
**ftp_login** - FTP authentication
**http_fuzz** - HTTP requests
**mysql_login** - MySQL authentication
**smtp_login** - SMTP authentication
**pop_login** - POP3 authentication
**dns_forward** - DNS queries

# DESCRIPTION

**patator** is a multi-purpose brute-forcer with modular design. It supports numerous protocols and services.

Modules handle specific protocols like SSH, FTP, HTTP, and databases. Each module has protocol-specific options.

File placeholders enable wordlist combinations. Multiple files can be combined for user/password pairs.

Conditional actions filter responses. Ignore successful logins, log specific errors, or stop on match.

Rate limiting and threading control resource usage. Proxy support enables anonymized testing.

# CAVEATS

For authorized penetration testing only. Aggressive testing may trigger lockouts. Network monitoring may detect attacks.

# HISTORY

**patator** was created by **Sebastien Macke** (lanjelot) as an alternative to Hydra and Medusa. It emphasizes flexibility and scriptability for security testing.

# SEE ALSO

[hydra](/man/hydra)(1), [medusa](/man/medusa)(1), [ncrack](/man/ncrack)(1)
