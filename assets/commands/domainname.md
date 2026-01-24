# TLDR

**Show current NIS domain name**

```domainname```

**Set NIS domain name**

```sudo domainname [example.com]```

**Clear domain name**

```sudo domainname ""```

# SYNOPSIS

**domainname** [_name_]

# DESCRIPTION

**domainname** displays or sets the system's NIS (Network Information Service) domain name. This is different from the DNS domain name and is used for NIS/YP services.

Without arguments, it shows the current NIS domain. With an argument, it sets the domain name (requires root privileges). The setting is typically not persistent across reboots without additional configuration.

# PARAMETERS

**-v**, **--verbose**
> Be verbose about actions.

**-F** _file_
> Read domain name from file.

**--help**
> Display help.

**--version**
> Show version.

# CAVEATS

Different from DNS domain name. Setting is not persistent by default. NIS is deprecated in favor of LDAP. Rarely used on modern systems.

# HISTORY

**domainname** dates back to the early days of **NIS** (originally Yellow Pages, YP), developed at **Sun Microsystems** in the **1980s**. NIS provided centralized authentication and configuration for Unix networks. While largely replaced by LDAP and Kerberos, the command remains for compatibility.

# SEE ALSO

[hostname](/man/hostname)(1), [dnsdomainname](/man/dnsdomainname)(1), [nisdomainname](/man/nisdomainname)(1), [ypbind](/man/ypbind)(1)
