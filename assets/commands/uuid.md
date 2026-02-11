# TLDR

# TAGLINE

Generate universally unique identifiers

# TLDR

Generate **UUIDv1**

```uuid```

Generate **UUIDv4**

```uuid -v 4```

Generate **multiple** UUIDs

```uuid -v 4 -n [number_of_uuids]```

Specify output **format**

```uuid -v 4 -F [BIN|STR|SIV]```

Write to **file**

```uuid -v 4 -o [path/to/file]```

Generate **UUIDv5** with namespace

```uuid -v 5 ns:[DNS|URL|OID|X500] [object_name]```

**Decode** UUID

```uuid -d [uuid]```

# SYNOPSIS

**uuid** [_OPTIONS_]

# PARAMETERS

**-v** _VERSION_
> UUID version (1, 3, 4, or 5)

**-n** _COUNT_
> Generate multiple UUIDs

**-F** _FORMAT_
> Output format (BIN, STR, or SIV)

**-o** _FILE_
> Write output to file

**ns:** _NAMESPACE_
> Namespace prefix for v3/v5

**-d**
> Decode UUID

# DESCRIPTION

**uuid** generates and decodes Universally Unique Identifiers. It supports multiple UUID versions: v1 (time-based), v3 (MD5 hash), v4 (random), and v5 (SHA-1 hash).

UUIDs are 128-bit identifiers used for uniquely identifying information across distributed systems.

# CAVEATS

UUIDv1 may expose system information. UUIDv4 requires good random source. Namespace UUIDs require object name specification.

# SEE ALSO

[uuidgen](/man/uuidgen)(1), [uuidparse](/man/uuidparse)(1)
