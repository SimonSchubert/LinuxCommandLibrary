# TLDR

**Parse** UUIDs

```uuidparse [uuid1] [uuid2]```

Parse from **stdin**

```[command] | uuidparse```

**JSON** output

```uuidparse -J [uuid1] [uuid2]```

**No header** line

```uuidparse -n [uuid1] [uuid2]```

**Raw** output

```uuidparse -r [uuid1] [uuid2]```

Select output **columns**

```uuidparse -o [UUID,VARIANT,TYPE,TIME]```

# SYNOPSIS

**uuidparse** [_OPTIONS_] [_UUID_...]

# PARAMETERS

**-J, --json**
> JSON output format

**-n, --noheadings**
> Don't print header line

**-r, --raw**
> Raw output format

**-o, --output** _COLUMNS_
> Select output columns

**-h, --help**
> Display help information

# DESCRIPTION

**uuidparse** parses and displays information about UUIDs. It shows the variant (e.g., DCE), type (e.g., random, time-based), and embedded timestamp for time-based UUIDs.

The tool can parse UUIDs from command-line arguments or standard input.

# CAVEATS

Only parses standard UUID formats. Time extraction only works for time-based (v1) UUIDs. Part of util-linux package.

# SEE ALSO

[uuidgen](/man/uuidgen)(1), [uuid](/man/uuid)(1), [uuidd](/man/uuidd)(8)
