# TAGLINE

command-line tool for Chef infrastructure automation

# TLDR

**Bootstrap node**

```knife bootstrap [host] -x [user] -P [password]```

**List nodes**

```knife node list```

**Show node info**

```knife node show [node_name]```

**Upload cookbook**

```knife cookbook upload [cookbook]```

**Search nodes**

```knife search node "role:[webserver]"```

**SSH to nodes**

```knife ssh "role:[webserver]" "[command]"```

# SYNOPSIS

**knife** _command_ [_subcommand_] [_options_]

# PARAMETERS

**bootstrap** _HOST_
> Bootstrap Chef on node.

**node** _CMD_
> Node management.

**cookbook** _CMD_
> Cookbook operations.

**search** _TYPE_ _QUERY_
> Search Chef server.

**ssh** _QUERY_ _CMD_
> Run command via SSH.

**-x** _USER_
> SSH username.

**--help**
> Display help information.

# DESCRIPTION

**knife** is the command-line tool for Chef infrastructure automation. It manages nodes, cookbooks, and Chef server.

The tool bootstraps nodes for configuration management. It uploads recipes and queries infrastructure.

# CAVEATS

Requires Chef Workstation. Chef server access needed. Ruby-based.

# HISTORY

knife is part of **Chef**, the infrastructure automation platform created by **Opscode** (now Progress Chef).

# SEE ALSO

[chef](/man/chef)(1), [chef-client](/man/chef-client)(8), [berkshelf](/man/berks)(1)
