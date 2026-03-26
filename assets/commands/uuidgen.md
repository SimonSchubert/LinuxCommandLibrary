# TAGLINE

Generate new UUID values

# TLDR

**Generate** a random UUID (v4)

```uuidgen -r```

**Generate** a time-based UUID (v1)

```uuidgen -t```

**Generate** a time-based sortable UUID (v7)

```uuidgen -7```

**Generate** a SHA1-based UUID (v5) from a namespace and name

```uuidgen -s -n @dns -N [example.com]```

**Generate** a MD5-based UUID (v3) from a namespace and name

```uuidgen -m -n @url -N [https://example.com]```

**Generate** multiple time-based UUIDs at once

```uuidgen -t -C [5]```

# SYNOPSIS

**uuidgen** [_options_]

# PARAMETERS

**-r, --random**
> Generate random UUID (version 4)

**-t, --time**
> Generate time-based UUID (version 1)

**-7, --time-v7**
> Generate time-based UUID (version 7), lexicographically sortable by timestamp

**-s, --sha1**
> Generate SHA1-based UUID (version 5)

**-m, --md5**
> Generate MD5-based UUID (version 3)

**-n, --namespace _ns_**
> Namespace for name-based UUIDs (@dns, @url, @oid, @x500)

**-N, --name _name_**
> Name for name-based UUIDs

**-x, --hex**
> Interpret name as a hexadecimal string

**-C, --count _num_**
> Generate multiple UUIDs

**-h, --help**
> Display help text and exit

**-V, --version**
> Print version and exit

# DESCRIPTION

**uuidgen** creates a new universally unique identifier (UUID). By default it generates a random UUID (version 4). Time-based (v1) UUIDs include timestamp and MAC address. Name-based UUIDs (v3/v5) are deterministic, generating the same UUID for the same namespace and name combination.

UUIDs are 128-bit identifiers commonly used for unique identification in databases, distributed systems, and file systems.

# UUID VERSIONS

**v1**: Time and MAC address based
**v3**: MD5 hash of namespace and name
**v4**: Random
**v5**: SHA1 hash of namespace and name
**v7**: Time-based, lexicographically sortable (RFC 9562)

# CAVEATS

Time-based UUIDs expose the MAC address of the generating machine. For privacy, prefer random UUIDs. Part of the util-linux package.

# SEE ALSO

[uuid](/man/uuid)(1)
