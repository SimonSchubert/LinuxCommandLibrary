# TLDR

**Find all IPP printers** on the network

```ippfind```

**Find printers matching a name pattern**

```ippfind --name '[*HP*]'```

**Find printers and print their URIs**

```ippfind --print```

**Find printers and execute a command** for each

```ippfind --exec [ipptool] -t '{}' [get-printer-attributes.test] \;```

**Search for a specific time** then exit

```ippfind -T [5]```

**Find printers with specific capabilities**

```ippfind --txt-key '[pdl]' --txt-value '[*pdf*]'```

# SYNOPSIS

**ippfind** [_options_] [_regtype_[,_subtype_]] [_expressions_]

# PARAMETERS

**--name** _PATTERN_
> Match printer names against pattern (supports wildcards)

**--txt-key** _KEY_
> Match DNS-SD TXT record key

**--txt-value** _VALUE_
> Match DNS-SD TXT record value

**--print**
> Print the URI of each found printer

**--exec** _command_ \;
> Execute command for each printer ({} is replaced with URI)

**-T** _seconds_
> Search for specified number of seconds then exit

**-P** _number_
> Stop after finding specified number of printers

**--quiet**
> Suppress output except for matched URIs

**--version**
> Show version information

# DESCRIPTION

**ippfind** discovers IPP (Internet Printing Protocol) printers and services on the local network using DNS-SD (Bonjour/mDNS). It can find printers, filter results by various criteria, and execute commands for each discovered printer.

This tool is essential for driverless printing environments where printers are discovered automatically rather than configured manually. It supports searching by name, capabilities, and DNS-SD TXT record attributes.

# CAVEATS

Requires mDNS/DNS-SD support on the network (typically provided by Avahi on Linux or mDNSResponder on macOS). Discovery may miss printers on different subnets unless mDNS reflection is configured. Results depend on printers properly advertising their capabilities.

# HISTORY

Part of **CUPS** and the IPP tooling suite developed by Michael Sweet. Created to support the IPP Everywhere initiative for driverless printing, leveraging DNS-SD for automatic printer discovery as standardized by the PWG.

# SEE ALSO

[ipptool](/man/ipptool)(1), [ippeveprinter](/man/ippeveprinter)(1), [lpstat](/man/lpstat)(1), [avahi-browse](/man/avahi-browse)(1)
