# TAGLINE

Reload network interface configuration from ifupdown2

# TLDR

Reload every interface marked **auto**

```ifreload -a```

Reload interfaces that are **already up**, including ones without an **auto** stanza

```ifreload -c```

Reload a single **allow class**

```ifreload --allow=[mgmt]```

Print the planned changes and **do not apply** them

```ifreload -n -a```

**Parse** the interfaces file and stop

```ifreload -s -a```

Print each step while reloading

```ifreload -v -a```

Leave one interface **out** of the reload

```ifreload -a -X [eth0]```

# SYNOPSIS

**ifreload** [**-h**] (**-a** | **-c** | **--allow**=_CLASS_) [**-n**] [**-v**] [**-d**] [**-f**] [**-s**] [**-X** _PATTERN_] [options]

# PARAMETERS

**-a**, **--all**
> Process every interface marked **auto**. Required unless **-c** or **--allow** is given. Mutually exclusive with those two options.

**-c**, **--currently-up**
> Reload every interface that is currently up, whether or not it has an **auto** stanza. Runs **up** on those interfaces and does not run **down** on interfaces that were removed.

**--allow** _CLASS_
> Act only on interfaces listed in an **allow-CLASS** line (for example **allow-mgmt**). Mutually exclusive with **-a** and **-c**.

**-n**, **--no-act**
> Print what would be brought up or down, and do not change the system.

**-s**, **--syntax-check**
> Parse the interfaces file and run addon syntax checks, then exit. Still requires **-a**, **-c**, or **--allow**.

**-v**, **--verbose**
> Print each operation as it runs.

**-d**, **--debug**
> Print debug output.

**-f**, **--force**
> Force every operation, including ones ifupdown2 would otherwise skip.

**-X** _PATTERN_, **--exclude** _PATTERN_
> Skip interfaces matching _PATTERN_. Repeat the flag to skip more than one. If the skipped interface has dependents (a bridge or bond and its members), list each dependent as well or they stay in the run.

**-u**, **--use-current-config**
> Decide what to bring down from the current interfaces file. The default reads the saved state. Use this when that state file is missing or stale.

**-V**, **--version**
> Print the installed ifupdown2 version.

**-h**, **--help**
> Show the option summary.

# DESCRIPTION

**ifreload** is the ifupdown2 command that makes a running Linux system match **/etc/network/interfaces**. It reads the interfaces file (or the path set in **ifupdown2.conf**), brings down interfaces that were removed, and brings the selected interfaces up so their address, bridge, bond, VLAN, and similar settings match the file.

The reload is meant to be non-disruptive: attributes that Linux can change on a live interface are applied in place. A few changes still flap the link because the kernel requires the interface to be down, including a MAC address change and some bond attributes.

One of **-a**, **-c**, or **--allow** is mandatory. A bare interface name is not accepted. On systems that install the ifupdown2 init integration, **service networking reload** runs the same reload.

When an **iface** stanza is deleted or renamed, every reference to the old name (bridge ports, bond members, VLAN parents) has to change in the same edit. A rename is a down of the old name and an up of the new one.

# CAVEATS

Part of **ifupdown2** (Cumulus Networks / NVIDIA). The classic **ifupdown** package and **ifupdown-ng** do not ship this binary. Changing interface state normally requires root. Hosts that configure the network with NetworkManager or systemd-networkd often have no **/etc/network/interfaces** for this command to read. Addon syntax checks warn on attributes that are implemented by shell scripts rather than Python modules when **addon_syntax_check** is left off.

# CONFIGURATION

ifupdown2 reads **/etc/network/ifupdown2/ifupdown2.conf**. Interface stanzas stay in the file named by **default_interfaces_configfile** (**/etc/network/interfaces** in the upstream sample).

**ifreload_down_changed**
> **0** (the value in the upstream sample) runs **down** only for interfaces deleted from the file. **1** also runs **down** on interfaces whose configuration changed before bringing them back up.

**state_dir**
> Directory for the saved interface state used on the next reload. The packaged config sets **/var/tmp/network/**.

# INSTALL

```apt: sudo apt install ifupdown2```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[ifup](/man/ifup)(8), [ifdown](/man/ifdown)(8), [ifquery](/man/ifquery)(8), [ip](/man/ip)(8)

# RESOURCES

```[Source code](https://github.com/CumulusNetworks/ifupdown2)```

```[Documentation](https://cumulusnetworks.github.io/ifupdown2/)```

<!-- verified: 2026-09-28 -->
