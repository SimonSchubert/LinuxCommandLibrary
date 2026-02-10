# TAGLINE

fast, parallel, modular login brute-forcer for network services

# TLDR

**Brute-force SSH login** with a password list

```medusa -h [192.168.1.1] -u [admin] -P [passwords.txt] -M ssh```

**Test multiple hosts** from a file

```medusa -H [hosts.txt] -u [admin] -P [passwords.txt] -M ssh```

**Brute-force with username and password lists**

```medusa -h [target] -U [users.txt] -P [passwords.txt] -M ftp```

**Use combo file** (host:user:password format)

```medusa -C [combos.txt] -M ssh```

**Stop after first valid credential found**

```medusa -h [target] -u [admin] -P [passwords.txt] -M ssh -f```

**Specify non-default port** and increase threads

```medusa -h [target] -n [2222] -u [root] -P [passwords.txt] -M ssh -t [20]```

**List available modules**

```medusa -d```

**Test null password and username as password**

```medusa -h [target] -u [admin] -P [passwords.txt] -M ssh -e ns```

# SYNOPSIS

**medusa** [-h _host_|-H _file_] [-u _user_|-U _file_] [-p _pass_|-P _file_] -M _module_ [_options_]

# PARAMETERS

**-h** _HOST_
> Target hostname or IP address

**-H** _FILE_
> File containing target hosts

**-u** _USER_
> Username to test

**-U** _FILE_
> File containing usernames

**-p** _PASS_
> Password to test

**-P** _FILE_
> File containing passwords

**-C** _FILE_
> Combo file (host:user:password format)

**-M** _MODULE_
> Authentication module (ssh, ftp, http, smb, telnet, etc.)

**-m** _PARAM_
> Module-specific parameters

**-n** _PORT_
> Non-default port number

**-s**
> Enable SSL

**-t** _NUM_
> Total concurrent threads (default: 10)

**-T** _NUM_
> Concurrent hosts to test

**-L**
> Parallelize logins per username

**-f**
> Stop after first valid credential per host

**-F**
> Stop after first valid credential overall

**-e** _[n/s/ns]_
> Additional checks: n=no password, s=password equals username

**-g** _SECS_
> Connection timeout (default: 3)

**-r** _SECS_
> Retry delay (default: 3)

**-R** _NUM_
> Number of retries

**-O** _FILE_
> Log output to file

**-v** _NUM_
> Verbose level (0-6, default: 5)

**-d**
> List all available modules

**-q**
> Display module usage information

**-Z** _MAP_
> Resume previous scan

# DESCRIPTION

**medusa** is a fast, parallel, modular login brute-forcer for network services. It is designed to perform rapid credential testing against multiple hosts, users, or passwords concurrently using a thread-based architecture.

Each service is supported through independent modules (.mod files), allowing the tool to be extended without modifying the core application. Supported protocols include SSH, FTP, HTTP, IMAP, SMB, MySQL, PostgreSQL, Telnet, VNC, and many others.

Medusa can test credentials from files, combo lists, or command-line arguments. It supports SSL connections, custom ports, and can save valid credentials to a log file. The resume feature allows interrupted scans to continue from where they stopped.

# CAVEATS

Brute-force attacks generate significant network traffic and log entries on target systems. Many services implement account lockout after failed attempts. Only use on systems you own or have explicit authorization to test. Some modules may require specific parameters for proper operation. SSL support depends on the module.

# HISTORY

Medusa was developed by **Joe Mondloch** (JoMo-Kun) and first released around **2005**. The name references the mythological creature with multiple snake heads, symbolizing the tool's ability to attack multiple targets simultaneously. It was designed as an alternative to Hydra, focusing on modularity and parallel testing capabilities. The project remains popular for network security assessments and penetration testing.

# SEE ALSO

[hydra](/man/hydra)(1), [ncrack](/man/ncrack)(1), [john](/man/john)(1), [hashcat](/man/hashcat)(1)
