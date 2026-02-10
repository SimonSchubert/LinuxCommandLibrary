# TAGLINE

main configuration file for BIND, the most widely used DNS server software

# TLDR

**Basic options block**

```options { directory "/var/named"; };```

**Define zone**

```zone "example.com" { type master; file "example.com.zone"; };```

**Forward-only resolver**

```options { forwarders { 8.8.8.8; }; forward only; };```

**Allow queries from network**

```options { allow-query { 192.168.1.0/24; }; };```

# SYNOPSIS

**/etc/named.conf** or **/etc/bind/named.conf**

# PARAMETERS

**options**
> Global server options.

**zone**
> Zone definition block.

**acl**
> Access control list.

**logging**
> Logging configuration.

**view**
> View definition.

**include**
> Include external file.

# DESCRIPTION

**named.conf** is the main configuration file for BIND (Berkeley Internet Name Domain), the most widely used DNS server software. It defines zones, options, and access controls.

The configuration uses a C-like syntax with blocks and statements.

# EXAMPLE CONFIG

```
acl internal { 192.168.0.0/16; localhost; };

options {
    directory "/var/named";
    allow-query { internal; };
    recursion yes;
    forwarders { 8.8.8.8; 8.8.4.4; };
};

zone "example.com" {
    type master;
    file "zones/example.com.zone";
};
```

# CAVEATS

Syntax errors prevent BIND from starting. Use named-checkconf to validate. Permissions on zone files matter.

# SEE ALSO

[named](/man/named)(8), [named-checkconf](/man/named-checkconf)(8), [rndc](/man/rndc)(8), [dig](/man/dig)(1)
