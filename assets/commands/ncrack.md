# TLDR

**Crack SSH login**

```ncrack -p [22] --user [root] -P [wordlist.txt] [192.168.1.1]```

**Crack multiple services**

```ncrack [ssh://192.168.1.1,ftp://192.168.1.2]```

**Use username list**

```ncrack -U [users.txt] -P [passwords.txt] [ssh://target]```

**Set timing template**

```ncrack -T[4] [ssh://target]```

**Read targets from file**

```ncrack -iL [hosts.txt] -p [22] --user [admin]```

**Save results to file**

```ncrack -oN [results.txt] [ssh://target] -U [users.txt] -P [passwords.txt]```

# SYNOPSIS

**ncrack** [_options_] [_target_...]

# PARAMETERS

**-p** _ports_
> Target ports.

**--user** _user_
> Single username.

**-U** _file_
> Username list.

**-P** _file_
> Password list.

**-T** _0-5_
> Timing template.

**-iL** _file_
> Input target list.

**-oN** _file_
> Normal output.

**-oX** _file_
> XML output.

**-v**
> Verbose.

# DESCRIPTION

**Ncrack** is a high-speed network authentication cracking tool. It supports multiple protocols including SSH, RDP, FTP, Telnet, HTTP, and more.

Designed by Nmap developers, ncrack uses a modular architecture allowing new protocol modules.

# SUPPORTED PROTOCOLS

```
ssh, rdp, ftp, telnet
http, https, pop3, imap
smb, vnc, sip, redis
mongodb, cassandra, mssql
```

# CAVEATS

Use only with authorization. May trigger security alerts. Account lockouts possible. Rate limiting recommended.

# HISTORY

Ncrack was developed by the **Nmap Project** team, initially released in **2009** as a network authentication cracking tool complementing Nmap.

# SEE ALSO

[hydra](/man/hydra)(1), [medusa](/man/medusa)(1), [nmap](/man/nmap)(1), [john](/man/john)(1)
