# TAGLINE

Display VirtualBox VM configuration details

# TLDR

**Show VM info**

```vboxmanage showvminfo [vmname]```

**Show as machine-readable**

```vboxmanage showvminfo [vmname] --machinereadable```

**Show specific details**

```vboxmanage showvminfo [vmname] --details```

**Print the VM log (VBox.log)**

```vboxmanage showvminfo [vmname] --log=0```

# SYNOPSIS

**vboxmanage** **showvminfo** _vmname_|_uuid_ [**--details**] [**--machinereadable**] [**--password-id** _id_] [**--password** _file_|**-**]

**vboxmanage** **showvminfo** _vmname_|_uuid_ **--log**=_index_ [**--password-id** _id_] [**--password** _file_|**-**]

# PARAMETERS

**--machinereadable**
> Output as _property_=_value_ lines for scripting.

**--details**
> Include detailed information about the VM.

**--log**=_index_
> Print a log file: **0** is **VBox.log**, **1** is **VBoxHardening.log**, **2** and up are other logs such as **VBox.log.1**.

**--password-id** _id_
> Password ID of an encrypted VM.

**--password** _file_|**-**
> Password of an encrypted VM, from a file or prompted with **-**.

# DESCRIPTION

**vboxmanage showvminfo** displays detailed VM configuration or the contents of its log files. Shows hardware settings, state, snapshots, and shared folders. Use --machinereadable for scripting.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-list](/man/vboxmanage-list)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-showvminfo)```

<!-- verified: 2026-11-09 -->
