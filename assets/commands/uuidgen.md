# TLDR

**Create** a random UUID (v4)

```uuidgen -r```

**Create** a time-based UUID (v1)

```uuidgen -t```

**Create** a SHA1-based UUID (v5)

```uuidgen -s -n @dns -N [name]```

**Create** a MD5-based UUID (v3)

```uuidgen -m -n @dns -N [name]```

# SYNOPSIS

**uuidgen** [_options_]

# PARAMETERS

**-r, --random**
> Generate random UUID (version 4)

**-t, --time**
> Generate time-based UUID (version 1)

**-s, --sha1**
> Generate SHA1-based UUID (version 5)

**-m, --md5**
> Generate MD5-based UUID (version 3)

**-n, --namespace _ns_**
> Namespace for name-based UUIDs (@dns, @url, @oid, @x500)

**-N, --name _name_**
> Name for name-based UUIDs

**-x, --hex**
> Output UUID without hyphens

**-c**
> Output in C struct initialization format

# DESCRIPTION

**uuidgen** creates a new universally unique identifier (UUID). By default it generates a random UUID (version 4). Time-based (v1) UUIDs include timestamp and MAC address. Name-based UUIDs (v3/v5) are deterministic, generating the same UUID for the same namespace and name combination.

UUIDs are 128-bit identifiers commonly used for unique identification in databases, distributed systems, and file systems.

# UUID VERSIONS

**v1**: Time and MAC address based
**v3**: MD5 hash of namespace and name
**v4**: Random
**v5**: SHA1 hash of namespace and name

# CAVEATS

Time-based UUIDs expose the MAC address of the generating machine. For privacy, prefer random UUIDs. Part of the util-linux package.

# SEE ALSO

[uuid](/man/uuid)(1)
