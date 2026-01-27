# TLDR

**Start slapd** with default configuration

```sudo slapd```

**Start with a specific configuration file**

```sudo slapd -f [/etc/openldap/slapd.conf]```

**Start with debug output** (stays in foreground)

```sudo slapd -d [1]```

**Listen on specific URLs**

```sudo slapd -h "ldap://127.0.0.1:389/ ldaps:///"```

**Run in tool mode** as slapcat

```slapd -T cat```

**Display version information** and exit

```slapd -VV```

**Test configuration** without starting

```slapd -T test```

# SYNOPSIS

**slapd** [**-4**|**-6**] [**-d** _debug-level_] [**-f** _config-file_] [**-F** _config-dir_] [**-h** _URLs_] [**-T** _tool_] [**-V**[**V**[**V**]]]

# PARAMETERS

**-f** _config-file_
> Specify the slapd configuration file. Default: **/etc/openldap/slapd.conf**.

**-F** _config-dir_
> Specify the slapd configuration directory. Default: **/etc/openldap/slapd.d**.

**-d** _debug-level_
> Enable debugging. slapd will not fork and remains attached to the terminal. Debug level is a bit string where each bit enables different debugging information.

**-h** _URLs_
> Specify LDAP URLs to listen on. Examples: **ldap://**, **ldaps://**, **ldapi:///** for LDAP over IPC.

**-4**
> Listen on IPv4 addresses only.

**-6**
> Listen on IPv6 addresses only.

**-T** _tool_
> Run in tool mode. Tools: **add** (slapadd), **cat** (slapcat), **dn** (slapdn), **index** (slapindex), **modify** (slapmodify), **passwd** (slappasswd), **schema** (slapschema), **test** (slaptest).

**-V**[**V**[**V**]]
> Print version information. **-VV** prints and exits. **-VVV** includes static overlays and backends info.

**-u**
> Run as a specific user.

**-g**
> Run as a specific group.

**-r** _directory_
> Chroot to the specified directory.

**-n** _service-name_
> Specify the service name for logging.

# DESCRIPTION

**slapd** is the Stand-alone LDAP Daemon, the core server component of OpenLDAP. It listens for LDAP connections on configured ports (default 389 for LDAP, 636 for LDAPS) and responds to LDAP operations such as bind, search, add, modify, and delete.

slapd supports multiple backends for data storage (including MDB, HDB, BDB, and LDAP proxy), overlays for extending functionality (like access logging, password policies, and replication), and various authentication mechanisms including SASL.

Configuration can be provided via the traditional **slapd.conf** file or the newer **cn=config** LDAP-based configuration in **slapd.d/**. The daemon typically starts at boot and runs as a background service.

# CAVEATS

Running with **-d** flag prevents daemonization and is intended for debugging only. The configuration directory (**-F**) takes precedence over the configuration file (**-f**) if both exist. LDAPS requires properly configured TLS certificates. Write operations require appropriate ACLs to be configured.

# HISTORY

**slapd** is part of the OpenLDAP project, an open-source implementation of the Lightweight Directory Access Protocol. OpenLDAP development began at the University of Michigan in **1998** as a continuation of the original U-M LDAP project. The software has evolved to become one of the most widely deployed LDAP servers, used for user authentication, address books, and directory services. The project continues active development with regular releases.

# SEE ALSO

[ldapsearch](/man/ldapsearch)(1), [ldapadd](/man/ldapadd)(1), [ldapmodify](/man/ldapmodify)(1), [slapcat](/man/slapcat)(8), [slapadd](/man/slapadd)(8), [slappasswd](/man/slappasswd)(8)
