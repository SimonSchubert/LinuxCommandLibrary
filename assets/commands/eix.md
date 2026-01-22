# TLDR

**Search** for a package

```eix [query]```

Search for **installed** packages

```eix --installed [query]```

Search in package **descriptions**

```eix --description "[description]"```

Search by package **license**

```eix --license [license]```

**Exclude** results from search

```eix --not --license [license]```

# SYNOPSIS

**eix** [_options_] [_query_]

# DESCRIPTION

**eix** searches local Gentoo packages quickly using a pre-built cache. It provides fast package lookups with detailed version and USE flag information.

Run `eix-update` to update the local package cache before searching.

# PARAMETERS

**--installed**
> Only show installed packages

**--description** _text_
> Search in package descriptions

**--license** _license_
> Search by license

**--not**
> Negate the following condition

**-c, --compact**
> Compact output format

**-e, --exact**
> Exact name match

# CAVEATS

Gentoo Linux specific. Requires running eix-update to build cache. Cache must be updated after emerge --sync.

# SEE ALSO

[emerge](/man/emerge)(1), [equery](/man/equery)(1), [eix-update](/man/eix-update)(1)
