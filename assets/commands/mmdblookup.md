# TAGLINE

Look up an IP address in a MaxMind DB file

# TLDR

**Look up** an IPv4 address in a GeoLite2 City database

```mmdblookup --file [path/to/GeoLite2-City.mmdb] --ip [8.8.8.8]```

Look up only the **country ISO code**

```mmdblookup --file [path/to/GeoLite2-Country.mmdb] --ip [8.8.8.8] country iso_code```

Look up the **English city name** via a nested map path

```mmdblookup --file [path/to/GeoLite2-City.mmdb] --ip [1.1.1.1] city names en```

Look up an **IPv6** address

```mmdblookup --file [path/to/GeoLite2-City.mmdb] --ip [2001:4860:4860::8888]```

Print **database metadata** along with the record

```mmdblookup --verbose --file [path/to/GeoLite2-City.mmdb] --ip [8.8.8.8]```

# SYNOPSIS

**mmdblookup** **--file** _FILE_ **--ip** _ADDRESS_ [_DATA_PATH_...]

# PARAMETERS

**-f**, **--file** _FILE_
> Path to the MaxMind DB (`.mmdb`) file. Required.

**-i**, **--ip** _ADDRESS_
> IPv4 or IPv6 address to look up. Required.

_DATA_PATH_
> Optional key path into the record. Map keys are strings; array indexes are 0-based integers.

**-v**, **--verbose**
> Also print the database metadata.

**--version**
> Print the program version and exit.

**-h**, **-?**, **--help**
> Show usage information.

# DESCRIPTION

**mmdblookup** is the command-line lookup tool shipped with **libmaxminddb**. It opens a MaxMind DB file, finds the record for an IP address, and prints that record in a type-annotated, JSON-like structure. Maps are shown with `{}` and arrays with `[]`. Each value is followed by a type annotation.

If the record is a map or array, extra arguments after **--ip** form a lookup path into that structure. For example, `country iso_code` selects the `iso_code` field inside the `country` map, and `cities 1` selects the second element of the `cities` array. With no path, the entire record is printed.

The tool does not download databases. Typical inputs are GeoIP2 or GeoLite2 `.mmdb` files obtained from MaxMind (or another MMDB producer) and stored locally.

# CAVEATS

Output is **not JSON** and is not meant to be parsed as JSON. Type annotations and the `{}` / `[]` wrappers make it human-readable only. For machine-readable JSON, MaxMind documents **mmdbinspect** instead.

**--file** and **--ip** are both required. A missing database, a path that does not exist in the record, or an address that is not present yields little or no data rather than a GeoIP2-specific error. The command knows nothing about GeoIP2 field names; those keys come from the database you point it at.

# HISTORY

**mmdblookup** was written by **Boris Zentner** and **Dave Rolsky** at **MaxMind** as part of **libmaxminddb**, the C library for the MaxMind DB format used by GeoIP2 and GeoLite2. The library and this utility first appeared around **2013-2014**, when MaxMind replaced the legacy GeoIP format. The project is licensed under **Apache 2.0**.

# INSTALL

```apt: sudo apt install mmdb-bin```

```dnf: sudo dnf install libmaxminddb```

```pacman: sudo pacman -S libmaxminddb```

```apk: sudo apk add libmaxminddb```

```zypper: sudo zypper install mmdblookup```

```brew: brew install libmaxminddb```

```nix: nix profile install nixpkgs#libmaxminddb```

<!-- packages: 2026-08-19 -->

# SEE ALSO

[ipinfo](/man/ipinfo)(1), [whois](/man/whois)(1), [dig](/man/dig)(1), [host](/man/host)(1)

# RESOURCES

```[Source code](https://github.com/maxmind/libmaxminddb)```

```[Documentation](https://maxmind.github.io/libmaxminddb/mmdblookup.html)```

<!-- verified: 2026-08-19 -->
