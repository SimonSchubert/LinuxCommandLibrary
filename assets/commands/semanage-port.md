# TLDR

**List** all port labeling rules

```sudo semanage port -l```

**List** all user-defined port labeling rules without headings

```sudo semanage port -l -C -n```

**Add** a user-defined rule that assigns a label to a port

```sudo semanage port -a -t [ssh_port_t] -p [tcp] [22000]```

**Add** a user-defined rule for a port range

```sudo semanage port -a -t [http_port_t] -p [tcp] [80-88]```

**Delete** a user-defined rule by protocol and port

```sudo semanage port -d -p [udp] [11940]```

# SYNOPSIS

**semanage port** [**-l**|**-a**|**-d**|**-m**] [_options_] _port_

# PARAMETERS

**-l, --list**
> List all port labeling rules

**-a, --add**
> Add a new port rule

**-d, --delete**
> Delete a port rule

**-m, --modify**
> Modify an existing port rule

**-t, --type _type_**
> SELinux type to assign to the port

**-p, --proto _protocol_**
> Protocol (tcp or udp)

**-C, --locallist**
> Show only locally customized rules

**-n, --noheading**
> Omit column headings from output

# DESCRIPTION

**semanage port** manages SELinux port type definitions. Port labels control which confined domains can bind to or connect to specific network ports.

When running a service on a non-standard port, you must add a port rule so SELinux allows the service to use that port. For example, running SSH on port 22000 requires adding that port to **ssh_port_t**.

# CAVEATS

Requires root privileges. Port ranges are specified as **start-end** (e.g., 8080-8090). Changes take effect immediately. Use **semanage port -l | grep** to find existing port types for services.

# SEE ALSO

[semanage](/man/semanage)(8), [ss](/man/ss)(8), [netstat](/man/netstat)(8), [selinux](/man/selinux)(8)
