# TLDR

**Display the current hostname**

```hostname```

**Display the fully qualified domain name** (FQDN)

```hostname -f```

**Display the short hostname** (without domain)

```hostname -s```

**Display all IP addresses** of the host

```hostname -I```

**Display the DNS domain name**

```hostname -d```

**Set the hostname** (temporary, until reboot)

```sudo hostname [new_hostname]```

**Set hostname from a file**

```sudo hostname -F [/etc/hostname]```

**Display the NIS/YP domain name**

```hostname -y```

# SYNOPSIS

**hostname** [_options_] [_name_]

**hostname** [-f|--fqdn]

**hostname** [-I|--all-ip-addresses]

# PARAMETERS

**-a**, **--alias**
> Display the alias name of the host

**-d**, **--domain**
> Display the DNS domain name

**-f**, **--fqdn**, **--long**
> Display the Fully Qualified Domain Name (FQDN)

**-A**, **--all-fqdns**
> Display all FQDNs of the machine

**-i**, **--ip-address**
> Display the IP address for the hostname

**-I**, **--all-ip-addresses**
> Display all network addresses of the host (excludes loopback and IPv6 link-local)

**-s**, **--short**
> Display the short hostname (up to the first dot)

**-y**, **--yp**, **--nis**
> Display or set the NIS/YP domain name

**-F**, **--file** _FILE_
> Read hostname from the specified file

**-b**, **--boot**
> Always set a hostname; if none specified, use default

**-v**, **--verbose**
> Be verbose about actions taken

**-h**, **--help**
> Display help message

**-V**, **--version**
> Display version information

# DESCRIPTION

**hostname** displays or sets the system's host name. The host name is used by many network programs to identify the machine. The command can show various name components including the short name, FQDN, domain name, and IP addresses.

When called without arguments, it displays the current hostname as returned by the gethostname system call. When called with an argument, it sets the hostname (requires root privileges). Related commands **domainname**, **dnsdomainname**, and **nisdomainname** are often symbolic links to hostname.

The **-I** option is particularly useful for scripts as it lists all configured IP addresses without relying on DNS resolution. The FQDN (**-f**) combines the short hostname with the DNS domain.

# CAVEATS

Setting the hostname with this command is temporary and does not persist across reboots. For permanent changes, edit **/etc/hostname** or use **hostnamectl** on systemd-based systems. The **-i** option depends on DNS resolution and may fail if the hostname cannot be resolved. Changes require root privileges.

# HISTORY

The hostname command has been part of Unix systems since the early BSD releases in the 1980s. It evolved from simple hostname display to include domain name handling as TCP/IP networking became standard. On modern Linux systems, **hostnamectl** from systemd provides additional functionality for persistent hostname configuration including static, transient, and pretty hostnames.

# SEE ALSO

[hostnamectl](/man/hostnamectl)(1), [domainname](/man/domainname)(1), [hosts](/man/hosts)(5), [gethostname](/man/gethostname)(2)
