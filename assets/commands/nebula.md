# TLDR

**Generate CA certificate**

```nebula-cert ca -name "[My Organization]"```

**Sign a host certificate**

```nebula-cert sign -name "[server1]" -ip "[10.0.0.1/24]"```

**Sign with groups**

```nebula-cert sign -name "[web1]" -ip "[10.0.0.2/24]" -groups "[servers,web]"```

**Start Nebula**

```nebula -config [/etc/nebula/config.yaml]```

**Print certificate details**

```nebula-cert print -path [host.crt]```

**Verify certificate**

```nebula-cert verify -ca [ca.crt] -crt [host.crt]```

**Generate example config**

```nebula -print-default```

# SYNOPSIS

**nebula** [_options_]

**nebula-cert** _command_ [_options_]

# NEBULA OPTIONS

**-config** _path_
> Configuration file path.

**-test**
> Test configuration and exit.

**-print-default**
> Print default configuration.

**-version**
> Show version information.

# NEBULA-CERT COMMANDS

**ca**
> Generate CA certificate and key.

**sign**
> Sign a host certificate.

**print**
> Print certificate details.

**verify**
> Verify certificate against CA.

# CA OPTIONS

**-name** _name_
> CA name.

**-duration** _duration_
> Validity duration. Default: 1 year.

**-out-crt** _path_
> CA certificate output.

**-out-key** _path_
> CA key output.

# SIGN OPTIONS

**-name** _name_
> Host name.

**-ip** _cidr_
> Nebula IP address with subnet.

**-groups** _list_
> Comma-separated group names.

**-ca-crt** _path_
> CA certificate path.

**-ca-key** _path_
> CA key path.

**-out-crt** _path_
> Host certificate output.

**-out-key** _path_
> Host key output.

**-duration** _duration_
> Certificate validity.

# DESCRIPTION

**nebula** is a scalable overlay networking tool for connecting hosts across networks. It uses certificate-based authentication and peer-to-peer connectivity.

Each Nebula network has a CA that signs host certificates. Certificates define the host's Nebula IP address and group memberships for access control.

**Lighthouses** are known nodes that help other nodes discover each other. At least one lighthouse with a public IP is needed. Other nodes connect peer-to-peer once discovered.

Configuration (YAML) defines the CA, host cert/key, lighthouses, firewall rules, and network settings. Firewall rules use groups from certificates for access control.

Nebula punches through NAT using UDP hole punching. Nodes behind NAT can communicate directly without routing through central servers.

# CAVEATS

Requires UDP port (default 4242) accessible on lighthouses. Clock sync important for certificate validation. Certificate revocation requires redistribution. Some NAT types may prevent hole punching.

# HISTORY

Nebula was created at **Slack** and open-sourced in **November 2019**. It was developed to connect Slack's global infrastructure securely. The project was designed for simplicity and scale, using modern cryptography and mesh networking principles. Nebula is used by organizations needing software-defined networks across cloud providers and on-premise infrastructure.

# SEE ALSO

[wireguard](/man/wireguard)(1), [headscale](/man/headscale)(1), [tailscale](/man/tailscale)(1), [zerotier-one](/man/zerotier-one)(1)
