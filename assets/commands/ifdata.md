# TAGLINE

retrieves network interface information in a script-friendly format

# TLDR

**Get IP address**

```ifdata -pa [eth0]```

**Get netmask**

```ifdata -pn [eth0]```

**Get broadcast address**

```ifdata -pb [eth0]```

**Get MAC address**

```ifdata -ph [eth0]```

**Get MTU**

```ifdata -pm [eth0]```

**Check if interface exists**

```ifdata -e [eth0]```

**Get network address**

```ifdata -pN [eth0]```

# SYNOPSIS

**ifdata** [_options_] _interface_

# PARAMETERS

**-e**
> Test if interface exists (exit code).

**-pa**
> Print IP address.

**-pn**
> Print netmask.

**-pN**
> Print network address.

**-pb**
> Print broadcast address.

**-pm**
> Print MTU.

**-ph**
> Print hardware (MAC) address.

**-pf**
> Print flags.

# DESCRIPTION

**ifdata** retrieves network interface information in a script-friendly format. Part of the moreutils package. Unlike ifconfig or ip, it returns single clean values without parsing. Exit codes indicate success/failure for conditional testing in scripts.

# SEE ALSO

[ip](/man/ip)(1), [ifconfig](/man/ifconfig)(1)

