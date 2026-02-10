# TAGLINE

command-line tool for managing ISCSI initiator connections

# TLDR

Show **active sessions**

```sudo iscsiadm -m session```

List all **known nodes**

```sudo iscsiadm -m node```

**Discover** iSCSI targets on a portal

```sudo iscsiadm -m discovery -t sendtargets -p [ip_address]```

**Log in** to an iSCSI target

```sudo iscsiadm -m node -T [iqn] -p [ip_address]:3260 -l```

**Log out** from an iSCSI target

```sudo iscsiadm -m node -T [iqn] -p [ip_address]:3260 -u```

**Create** a node manually (for CHAP authentication)

```sudo iscsiadm -m node -o new -T [iqn] -p [ip_address]:3260```

Configure **CHAP authentication**

```sudo iscsiadm -m node -T [iqn] -p [ip_address]:3260 -o update -n node.session.auth.authmethod -v CHAP```

# SYNOPSIS

**iscsiadm** **-m** _mode_ [_options_]

# PARAMETERS

**-m**, **--mode** _MODE_
> Operation mode: discovery, node, session, iface

**-t**, **--type** _TYPE_
> Discovery type: sendtargets, isns

**-p**, **--portal** _IP:PORT_
> Target portal address

**-T**, **--targetname** _IQN_
> Target iSCSI Qualified Name

**-l**, **--login**
> Log in to target

**-u**, **--logout**
> Log out from target

**-o**, **--op** _OP_
> Operation: new, delete, update, show

**-n**, **--name** _NAME_
> Parameter name

**-v**, **--value** _VALUE_
> Parameter value

# DESCRIPTION

**iscsiadm** is the command-line tool for managing iSCSI initiator connections. It handles discovery of iSCSI targets, authentication configuration, and session management.

iSCSI allows block storage to be accessed over IP networks, presenting remote storage as local SCSI devices. The initiator (client) connects to targets (storage) using IQNs (iSCSI Qualified Names) for identification.

# CAVEATS

Requires root privileges. The iscsid daemon must be running. CHAP credentials must be configured before login for authenticated targets. Changes to node configuration require logout/login to take effect.

# HISTORY

iscsiadm is part of the Open-iSCSI project, which provides the standard iSCSI implementation for Linux. iSCSI was standardized in RFC 3720 in **2004**.

# SEE ALSO

[iscsid](/man/iscsid)(8), [targetcli](/man/targetcli)(8), [lsblk](/man/lsblk)(8)
